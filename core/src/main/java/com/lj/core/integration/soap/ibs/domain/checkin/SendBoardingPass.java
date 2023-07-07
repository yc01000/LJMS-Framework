//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Holds BP send request details for  the passengers and mode of communication.
 * 
 * <p>SendBoardingPass complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SendBoardingPass"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.ibsplc.com/iRes/simpleTypes/}NameType"/&gt;
 *         &lt;element name="SendMode" type="{http://www.ibsplc.com/iRes/simpleTypes/}SendMode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SendStatus" type="{http://www.ibsplc.com/iRes/simpleTypes/}SendStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendBoardingPass", propOrder = {
    "name",
    "sendMode",
    "sendStatus"
})
public class SendBoardingPass
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Name", required = true)
    protected NameType name;
    @XmlElement(name = "SendMode")
    protected List<SendMode> sendMode;
    @XmlElement(name = "SendStatus")
    protected List<SendStatus> sendStatus;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the sendMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SendMode }
     * 
     * 
     */
    public List<SendMode> getSendMode() {
        if (sendMode == null) {
            sendMode = new ArrayList<SendMode>();
        }
        return this.sendMode;
    }

    /**
     * Gets the value of the sendStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SendStatus }
     * 
     * 
     */
    public List<SendStatus> getSendStatus() {
        if (sendStatus == null) {
            sendStatus = new ArrayList<SendStatus>();
        }
        return this.sendStatus;
    }

}
