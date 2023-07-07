//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}AirlineCode"/&gt;
 *         &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelKey" type="{http://www.ibsplc.com/iRes/simpleTypes/}ChannelKeyType"/&gt;
 *         &lt;element name="MessageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MessageSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageSendTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TelexSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageSenderAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessagePriority" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageMemo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airlineCode",
    "channelType",
    "channelKey",
    "messageDateTime",
    "messageSender",
    "messageSendTo",
    "messageSubject",
    "messageText",
    "telexSignature",
    "messageSenderAddress",
    "messagePriority",
    "messageMemo"
})
@XmlRootElement(name = "CHK_RouteWeightAndBalanceMessagesRQ")
public class CHKRouteWeightAndBalanceMessagesRQ
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "AirlineCode", required = true)
    protected AirlineCode airlineCode;
    @XmlElement(name = "ChannelType")
    protected String channelType;
    @XmlElement(name = "ChannelKey", required = true)
    protected ChannelKeyType channelKey;
    @XmlElement(name = "MessageDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageDateTime;
    @XmlElement(name = "MessageSender")
    protected String messageSender;
    @XmlElement(name = "MessageSendTo", required = true)
    protected String messageSendTo;
    @XmlElement(name = "MessageSubject")
    protected String messageSubject;
    @XmlElement(name = "MessageText", required = true)
    protected String messageText;
    @XmlElement(name = "TelexSignature")
    protected String telexSignature;
    @XmlElement(name = "MessageSenderAddress", required = true)
    protected String messageSenderAddress;
    @XmlElement(name = "MessagePriority", required = true)
    protected String messagePriority;
    @XmlElement(name = "MessageMemo", required = true)
    protected String messageMemo;

    /**
     * airlineCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AirlineCode }
     *     
     */
    public AirlineCode getAirlineCode() {
        return airlineCode;
    }

    /**
     * airlineCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineCode }
     *     
     */
    public void setAirlineCode(AirlineCode value) {
        this.airlineCode = value;
    }

    /**
     * channelType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * channelType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

    /**
     * channelKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ChannelKeyType }
     *     
     */
    public ChannelKeyType getChannelKey() {
        return channelKey;
    }

    /**
     * channelKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelKeyType }
     *     
     */
    public void setChannelKey(ChannelKeyType value) {
        this.channelKey = value;
    }

    /**
     * messageDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDateTime() {
        return messageDateTime;
    }

    /**
     * messageDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageDateTime(XMLGregorianCalendar value) {
        this.messageDateTime = value;
    }

    /**
     * messageSender 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSender() {
        return messageSender;
    }

    /**
     * messageSender 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSender(String value) {
        this.messageSender = value;
    }

    /**
     * messageSendTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSendTo() {
        return messageSendTo;
    }

    /**
     * messageSendTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSendTo(String value) {
        this.messageSendTo = value;
    }

    /**
     * messageSubject 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSubject() {
        return messageSubject;
    }

    /**
     * messageSubject 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSubject(String value) {
        this.messageSubject = value;
    }

    /**
     * messageText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * messageText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

    /**
     * telexSignature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelexSignature() {
        return telexSignature;
    }

    /**
     * telexSignature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelexSignature(String value) {
        this.telexSignature = value;
    }

    /**
     * messageSenderAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSenderAddress() {
        return messageSenderAddress;
    }

    /**
     * messageSenderAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSenderAddress(String value) {
        this.messageSenderAddress = value;
    }

    /**
     * messagePriority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagePriority() {
        return messagePriority;
    }

    /**
     * messagePriority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagePriority(String value) {
        this.messagePriority = value;
    }

    /**
     * messageMemo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageMemo() {
        return messageMemo;
    }

    /**
     * messageMemo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageMemo(String value) {
        this.messageMemo = value;
    }

}
