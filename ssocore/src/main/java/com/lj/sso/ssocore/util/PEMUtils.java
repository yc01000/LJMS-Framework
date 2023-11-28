package com.lj.sso.ssocore.util;

import com.amazonaws.util.IOUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.regex.Pattern;

public class PEMUtils {

	private static final String CERTIFICATE_TYPE_X509 = "X.509";

	private static final String ALGORITHM_RSA = "RSA";

	public static Certificate certificate(String pathname) {
		try {
			//String pemString = new String(Files.readAllBytes(Paths.get(pathname)), StandardCharsets.UTF_8);
			CertificateFactory factory = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509);
			return factory.generateCertificate(new ByteArrayInputStream(fromPEM(pathname)));
		} catch(CertificateException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Key privateKey(File file) {
		try {
			KeyFactory factory = KeyFactory.getInstance(ALGORITHM_RSA);
			return factory.generatePrivate(new PKCS8EncodedKeySpec(fromPEM(file)));
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch(InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Key privateKey(String pathname) {
		try {
			KeyFactory factory = KeyFactory.getInstance(ALGORITHM_RSA);
			return factory.generatePrivate(new PKCS8EncodedKeySpec(fromPEM(pathname)));
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch(InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static PrivateKey privateKey(InputStream in) {
		try {
			KeyFactory factory = KeyFactory.getInstance(ALGORITHM_RSA);
			return factory.generatePrivate(new PKCS8EncodedKeySpec(fromPEM(in)));
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch(InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Key publicKey(String pathname) {
		try {
			KeyFactory factory = KeyFactory.getInstance(ALGORITHM_RSA);
			return factory.generatePublic(new X509EncodedKeySpec(fromPEM(pathname)));
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch(InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Key publicKey(File file) {
		try {
			KeyFactory factory = KeyFactory.getInstance(ALGORITHM_RSA);
			return factory.generatePublic(new X509EncodedKeySpec(fromPEM(file)));
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch(InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Key publicKey(InputStream in) {
		try {
			KeyFactory factory = KeyFactory.getInstance(ALGORITHM_RSA);
			return factory.generatePublic(new X509EncodedKeySpec(fromPEM(in)));
		} catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch(InvalidKeySpecException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static byte[] fromPEM(String relativePath) {
		try {
			return fromPEM(new ClassPathResource(relativePath).getInputStream());
		} catch (IOException e) {
			return null;
		}
	}

	private static byte[] fromPEM(File file) {
		String pemString;
		try {
			pemString = new String(FileUtils.readFileToByteArray(file), StandardCharsets.UTF_8);
		} catch(IOException e) {
			return null;
		}
		
		Pattern pattern = Pattern.compile("(?m)(?s)^---*BEGIN.*---*$(.*)^---*END.*---*$.*");
		String encoded = pattern.matcher(pemString).replaceFirst("$1");
		return Base64.getMimeDecoder().decode(encoded);
	}

	private static byte[] fromPEM(InputStream in) {
		String pemString;
		try {
			pemString = new String(IOUtils.toByteArray(in), StandardCharsets.UTF_8);
		} catch(IOException e) {
			return null;
		}
		
		Pattern pattern = Pattern.compile("(?m)(?s)^---*BEGIN.*---*$(.*)^---*END.*---*$.*");
		String encoded = pattern.matcher(pemString).replaceFirst("$1");
		return Base64.getMimeDecoder().decode(encoded);
	}
}
