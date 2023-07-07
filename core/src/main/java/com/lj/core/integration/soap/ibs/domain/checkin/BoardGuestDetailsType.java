//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This is used for providing boarded guest details.
 * 
 * <p>BoardGuestDetailsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BoardGuestDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestName" type="{http://www.ibsplc.com/iRes/simpleTypes/}GuestNameInfo"/&gt;
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="infantIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="seatNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="boardStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GuestErrorType" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrorType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardGuestDetailsType", propOrder = {
    "guestName",
    "sequenceNumber",
    "infantIndicator",
    "barCode",
    "seatNumber",
    "boardStatus",
    "guestErrorType"
})
public class BoardGuestDetailsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "GuestName", required = true)
    protected GuestNameInfo guestName;
    @XmlElement(required = true)
    protected BigInteger sequenceNumber;
    protected boolean infantIndicator;
    @XmlElement(required = true)
    protected String barCode;
    @XmlElement(required = true)
    protected String seatNumber;
    @XmlElement(required = true)
    protected String boardStatus;
    @XmlElement(name = "GuestErrorType", required = true)
    protected ErrorType guestErrorType;

    /**
     * guestName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GuestNameInfo }
     *     
     */
    public GuestNameInfo getGuestName() {
        return guestName;
    }

    /**
     * guestName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestNameInfo }
     *     
     */
    public void setGuestName(GuestNameInfo value) {
        this.guestName = value;
    }

    /**
     * sequenceNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * sequenceNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * infantIndicator 속성의 값을 가져옵니다.
     * 
     */
    public boolean isInfantIndicator() {
        return infantIndicator;
    }

    /**
     * infantIndicator 속성의 값을 설정합니다.
     * 
     */
    public void setInfantIndicator(boolean value) {
        this.infantIndicator = value;
    }

    /**
     * barCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * barCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * seatNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * seatNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * boardStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardStatus() {
        return boardStatus;
    }

    /**
     * boardStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardStatus(String value) {
        this.boardStatus = value;
    }

    /**
     * guestErrorType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getGuestErrorType() {
        return guestErrorType;
    }

    /**
     * guestErrorType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setGuestErrorType(ErrorType value) {
        this.guestErrorType = value;
    }

}
