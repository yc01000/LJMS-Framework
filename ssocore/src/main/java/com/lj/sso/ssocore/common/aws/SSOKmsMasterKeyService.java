package com.lj.sso.ssocore.common.aws;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.AWSKMSClientBuilder;
import com.amazonaws.services.kms.model.DecryptRequest;
import com.amazonaws.services.kms.model.EncryptRequest;
import com.amazonaws.util.Base64;

/**
 * <Encrypt> :
 * 1. AWS API를 사용하여 데이터 키를 생성하라는 요청을 보냅니다.
 * 2. AWS는 데이터 키를 일반 텍스트와 암호화 된 형식으로 반환합니다.
 * 3. 일반 텍스트를 사용하여 메시지를 암호화하십시오.
 * 4. Base64는 암호화 된 메시지를 인코딩합니다.
 * 5. 암호화 된 메시지와 암호화 된 데이터 키를 모두 저장하십시오.
 *
 * <Decrypt> :
 * 1. 암호화 된 데이터 키를 봉투에서 추출하십시오.
 * 2. AWS API를 사용하여 데이터 키를 해독합니다.
 * 3. Base64는 메시지를 디코딩합니다.
 * 4. 2 단계에서 얻은 일반 텍스트 키를 사용하여 3 단계의 메시지를 해독합니다.
 *
 * <Encrypt> Example :
 * KmsEnvelopeService test = new KmsEnvelopeService();
 * EnvelopeEncryptedMessage message = test.encrypt("TEST");
 * LOGGER.debug("CipherText = " + message.getCiphertext());
 *
 * <Decrypt> Example :
 * String decryptMessage = test.decrypt(message);
 * LOGGER.debug("PlainText = " + decryptMessage);
 */
@Component("SSOKmsMasterKeyService")
public class SSOKmsMasterKeyService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SSOKmsMasterKeyService.class);

	@Value("#{SSOAwsProperties['aws.sso.kms.region.name']}")
	private String region;

	@Value("#{SSOAwsProperties['aws.sso.kms.key.id']}")
	private String key;

	private static String regionName;
	private static String keyId;

	private static AWSKMS AWSKMS_CLIENT;

	public SSOKmsMasterKeyService() {}

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("[KmsMasterKeyService.init] Initializing Data [region = {}, key = {}]", region, key);
		}

		this.regionName = "ap-northeast-2"; //region;
		this.keyId = "e4303df7-fd91-4c6b-a9a5-1413343bac0e";//key;
		this.AWSKMS_CLIENT = AWSKMSClientBuilder.standard().withRegion(Regions.fromName(regionName)).build();

	}

	public static String encrypt(String message) {
		LOGGER.debug("KmsMasterKeyService encrypt called ......");

		ByteBuffer plaintext = null;

		try {
			plaintext = ByteBuffer.wrap(message.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			plaintext = null;

			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("[KmsMasterKeyService.encrypt] {}", e.getMessage());
			}
		}

		if (null == plaintext) {
			return null;
		}

        EncryptRequest req = new EncryptRequest().withKeyId(keyId).withPlaintext(plaintext);
        ByteBuffer ciphertext = AWSKMS_CLIENT.encrypt(req).getCiphertextBlob();

        byte[] base64EncodedValue = Base64.encode(ciphertext.array());

        return new String(base64EncodedValue, Charset.forName("UTF-8"));
    }

    public static String decrypt(String message) {
    	//LOGGER.debug("KmsMasterKeyService decrypt called ......");

    	ByteBuffer buffer = null;

    	try {
			buffer = ByteBuffer.wrap(Base64.decode(message.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			buffer = null;

			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("[KmsMasterKeyService.encrypt] {}", e.getMessage());
			}
		}

		if (null == buffer) {
			return null;
		}

        DecryptRequest req = new DecryptRequest().withCiphertextBlob(buffer);
        ByteBuffer text = AWSKMS_CLIENT.decrypt(req).getPlaintext();

        byte[] byteArray = new byte[text.remaining()];
        text.get(byteArray);

        return new String(byteArray, Charset.forName("UTF-8"));
    }
}
