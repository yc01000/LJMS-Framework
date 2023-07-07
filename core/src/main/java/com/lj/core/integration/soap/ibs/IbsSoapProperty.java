package com.lj.core.integration.soap.ibs;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Value;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ IbsSoapProperty.java
 * </pre>
 *
 *  @author  : sryu
 *  @date    : 2017. 8. 4. 오후 4:33:59
 *  @version : 1.0
 *  @desc    : IBS 통신중 HTTP 헤더에 설정 필요한 데이터들의 모음
 */
//@Component("IbsSoapProperty")
public class IbsSoapProperty {

	@Value("#{IbsBookingProperties['general.airline.user']}")
	private String username;

	@Value("#{IbsBookingProperties['general.airline.bmno']}")
	private String password;

	private String accept_endcoding = "gzip";

	private String clientSessionId;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccept_endcoding() {
		return accept_endcoding;
	}
	public void setAccept_endcoding(String accept_endcoding) {
		this.accept_endcoding = accept_endcoding;
	}
	public String getClientSessionId() {
		return clientSessionId;
	}

	public void setClientSessionId(String clientSessionId) {
		this.clientSessionId = clientSessionId;
	}

	public IbsSoapProperty(HttpSession session) {
		super();
		if( session != null )
			this.clientSessionId = session.getId();
	}

	/**
	 * @param session	: Session
	 * @param ibeSoap	: IBE soap 여부
	 * @desc			: IBE, Support, IBS, GPS간의 key연결을 위한 IbsSoapProperty<br/>
	 * 기본SessionId + 구분자 + IBE에서 생성한 UID를 연결하여 Support로 전달한다.
	 */
	public IbsSoapProperty(HttpSession session, Boolean ibeSoap) {
		super();
		if( session != null ) {

			String sessionId = session.getId();

			if (ibeSoap == true) {

				Object ibeUid = session.getAttribute("IBE_UID");
				if (ibeUid != null) {
					sessionId = ibeUid.toString();
				}
			}

			this.clientSessionId = sessionId;
		}
	}

	/**
	 * 세션 아이디를 강제 할당
	 *
	 * @param sessionId
	 */
	public IbsSoapProperty(String sessionId) {
		if (null != sessionId) {
			this.clientSessionId	= sessionId;
		}
	}
}