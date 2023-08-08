package com.lj.core.mail.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * <B>lj.pss.support</B>
 *     |_ MailInfoVO.java
 * </pre>
 *
 * @author : jhbang
 * @since : 2017. 10. 10. 오전 10:31:43
 * @version : 1.0
 * @desc : 메일 정보를 저장하는 vo 클래스
 */
public class MailInfoVO implements Serializable {

	public enum MailContentType {
		URL, CONTENTS
	}

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7648901543735307262L;

	/**
	 * 메일 ID (입력 안함)
	 */
	private long mailId;

	/**
	 * 업무 ID
	 */
	private int taskId;

	/**
	 * 수신자 이메일
	 */
	private String receiverEmail;

	/**
	 * 수신자 명
	 */
	private String receiverName;

	/**
	 * 수신자 ID
	 */
	private String receiverId;

	/**
	 * 메일 제목
	 */
	private String mailTitle;

	/**
	 * 메일 내용
	 */
	private String mailContents;

	/**
	 * 메일 내용 유형
	 */
	private MailContentType mailContentsType = MailContentType.URL;

	/**
	 * 등록 일시
	 */
	private Date registDateTime;

	/**
	 * 발신자 이메일
	 */
	private String senderEmail = "help@jinair.com";

	/**
	 * 발신자 명
	 */
	private String senderName = "Jinair";

	/**
	 * 발신자 ID
	 */
	private String senderId;

	private String pnr;

	private String urlid;

	public long getMailId() {
		return mailId;
	}

	public void setMailId(long mailId) {
		this.mailId = mailId;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getReceiverEmail() {
		return receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getMailTitle() {
		return mailTitle;
	}

	public void setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle;
	}

	public String getMailContents() {
		return mailContents;
	}

	public void setMailContents(String mailContents) {
		this.mailContents = mailContents;
	}

	public MailContentType getMailContentsType() {
		return mailContentsType;
	}

	public void setMailContentsType(MailContentType mailContentsType) {
		this.mailContentsType = mailContentsType;
	}

	public Date getRegistDateTime() {
		return registDateTime;
	}

	public void setRegistDateTime(Date registDateTime) {
		this.registDateTime = registDateTime;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getUrlid() {
		return urlid;
	}

	public void setUrlid(String urlid) {
		this.urlid = urlid;
	}
}
