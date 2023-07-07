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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Gate Event Information of the flight.
 * 
 * <p>GateEventInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GateEventInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GateControllerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpeditorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastGuestOffTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FlightPreboardTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FlightAttendantReportTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FirstPreboardGuestBoardTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastPreboardGuestBoardTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TotalPreboardGuestBoardCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FirstGuestBoardTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastGuestBoardTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CrewChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestsOff" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="GuestsOn" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="InboundWS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OutBoundWS" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="InBoundWW" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OutBoundWW" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="InBoundWC" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OutBoundWC" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="InBoundUM" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OutBoundUM" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="InBoundM" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OutBoundM" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="InBoundInf" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OutBoundInf" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GateEventInformation", propOrder = {
    "gate",
    "gateControllerId",
    "expeditorId",
    "lastGuestOffTime",
    "flightPreboardTime",
    "flightAttendantReportTime",
    "firstPreboardGuestBoardTime",
    "lastPreboardGuestBoardTime",
    "totalPreboardGuestBoardCount",
    "firstGuestBoardTime",
    "lastGuestBoardTime",
    "crewChangeIndicator",
    "remarks",
    "guestsOff",
    "guestsOn",
    "inboundWS",
    "outBoundWS",
    "inBoundWW",
    "outBoundWW",
    "inBoundWC",
    "outBoundWC",
    "inBoundUM",
    "outBoundUM",
    "inBoundM",
    "outBoundM",
    "inBoundInf",
    "outBoundInf"
})
public class GateEventInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Gate")
    protected String gate;
    @XmlElement(name = "GateControllerId")
    protected String gateControllerId;
    @XmlElement(name = "ExpeditorId")
    protected String expeditorId;
    @XmlElement(name = "LastGuestOffTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastGuestOffTime;
    @XmlElement(name = "FlightPreboardTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightPreboardTime;
    @XmlElement(name = "FlightAttendantReportTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightAttendantReportTime;
    @XmlElement(name = "FirstPreboardGuestBoardTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstPreboardGuestBoardTime;
    @XmlElement(name = "LastPreboardGuestBoardTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPreboardGuestBoardTime;
    @XmlElement(name = "TotalPreboardGuestBoardCount", required = true)
    protected BigInteger totalPreboardGuestBoardCount;
    @XmlElement(name = "FirstGuestBoardTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstGuestBoardTime;
    @XmlElement(name = "LastGuestBoardTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastGuestBoardTime;
    @XmlElement(name = "CrewChangeIndicator")
    protected String crewChangeIndicator;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "GuestsOff", required = true)
    protected BigInteger guestsOff;
    @XmlElement(name = "GuestsOn", required = true)
    protected BigInteger guestsOn;
    @XmlElement(name = "InboundWS", required = true)
    protected BigInteger inboundWS;
    @XmlElement(name = "OutBoundWS", required = true)
    protected BigInteger outBoundWS;
    @XmlElement(name = "InBoundWW", required = true)
    protected BigInteger inBoundWW;
    @XmlElement(name = "OutBoundWW", required = true)
    protected BigInteger outBoundWW;
    @XmlElement(name = "InBoundWC", required = true)
    protected BigInteger inBoundWC;
    @XmlElement(name = "OutBoundWC", required = true)
    protected BigInteger outBoundWC;
    @XmlElement(name = "InBoundUM", required = true)
    protected BigInteger inBoundUM;
    @XmlElement(name = "OutBoundUM", required = true)
    protected BigInteger outBoundUM;
    @XmlElement(name = "InBoundM", required = true)
    protected BigInteger inBoundM;
    @XmlElement(name = "OutBoundM", required = true)
    protected BigInteger outBoundM;
    @XmlElement(name = "InBoundInf", required = true)
    protected BigInteger inBoundInf;
    @XmlElement(name = "OutBoundInf", required = true)
    protected BigInteger outBoundInf;

    /**
     * gate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGate() {
        return gate;
    }

    /**
     * gate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGate(String value) {
        this.gate = value;
    }

    /**
     * gateControllerId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateControllerId() {
        return gateControllerId;
    }

    /**
     * gateControllerId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateControllerId(String value) {
        this.gateControllerId = value;
    }

    /**
     * expeditorId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeditorId() {
        return expeditorId;
    }

    /**
     * expeditorId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeditorId(String value) {
        this.expeditorId = value;
    }

    /**
     * lastGuestOffTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastGuestOffTime() {
        return lastGuestOffTime;
    }

    /**
     * lastGuestOffTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastGuestOffTime(XMLGregorianCalendar value) {
        this.lastGuestOffTime = value;
    }

    /**
     * flightPreboardTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightPreboardTime() {
        return flightPreboardTime;
    }

    /**
     * flightPreboardTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightPreboardTime(XMLGregorianCalendar value) {
        this.flightPreboardTime = value;
    }

    /**
     * flightAttendantReportTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightAttendantReportTime() {
        return flightAttendantReportTime;
    }

    /**
     * flightAttendantReportTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightAttendantReportTime(XMLGregorianCalendar value) {
        this.flightAttendantReportTime = value;
    }

    /**
     * firstPreboardGuestBoardTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPreboardGuestBoardTime() {
        return firstPreboardGuestBoardTime;
    }

    /**
     * firstPreboardGuestBoardTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPreboardGuestBoardTime(XMLGregorianCalendar value) {
        this.firstPreboardGuestBoardTime = value;
    }

    /**
     * lastPreboardGuestBoardTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPreboardGuestBoardTime() {
        return lastPreboardGuestBoardTime;
    }

    /**
     * lastPreboardGuestBoardTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPreboardGuestBoardTime(XMLGregorianCalendar value) {
        this.lastPreboardGuestBoardTime = value;
    }

    /**
     * totalPreboardGuestBoardCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPreboardGuestBoardCount() {
        return totalPreboardGuestBoardCount;
    }

    /**
     * totalPreboardGuestBoardCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPreboardGuestBoardCount(BigInteger value) {
        this.totalPreboardGuestBoardCount = value;
    }

    /**
     * firstGuestBoardTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstGuestBoardTime() {
        return firstGuestBoardTime;
    }

    /**
     * firstGuestBoardTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstGuestBoardTime(XMLGregorianCalendar value) {
        this.firstGuestBoardTime = value;
    }

    /**
     * lastGuestBoardTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastGuestBoardTime() {
        return lastGuestBoardTime;
    }

    /**
     * lastGuestBoardTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastGuestBoardTime(XMLGregorianCalendar value) {
        this.lastGuestBoardTime = value;
    }

    /**
     * crewChangeIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewChangeIndicator() {
        return crewChangeIndicator;
    }

    /**
     * crewChangeIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewChangeIndicator(String value) {
        this.crewChangeIndicator = value;
    }

    /**
     * remarks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * remarks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * guestsOff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGuestsOff() {
        return guestsOff;
    }

    /**
     * guestsOff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGuestsOff(BigInteger value) {
        this.guestsOff = value;
    }

    /**
     * guestsOn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGuestsOn() {
        return guestsOn;
    }

    /**
     * guestsOn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGuestsOn(BigInteger value) {
        this.guestsOn = value;
    }

    /**
     * inboundWS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInboundWS() {
        return inboundWS;
    }

    /**
     * inboundWS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInboundWS(BigInteger value) {
        this.inboundWS = value;
    }

    /**
     * outBoundWS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutBoundWS() {
        return outBoundWS;
    }

    /**
     * outBoundWS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutBoundWS(BigInteger value) {
        this.outBoundWS = value;
    }

    /**
     * inBoundWW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInBoundWW() {
        return inBoundWW;
    }

    /**
     * inBoundWW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInBoundWW(BigInteger value) {
        this.inBoundWW = value;
    }

    /**
     * outBoundWW 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutBoundWW() {
        return outBoundWW;
    }

    /**
     * outBoundWW 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutBoundWW(BigInteger value) {
        this.outBoundWW = value;
    }

    /**
     * inBoundWC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInBoundWC() {
        return inBoundWC;
    }

    /**
     * inBoundWC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInBoundWC(BigInteger value) {
        this.inBoundWC = value;
    }

    /**
     * outBoundWC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutBoundWC() {
        return outBoundWC;
    }

    /**
     * outBoundWC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutBoundWC(BigInteger value) {
        this.outBoundWC = value;
    }

    /**
     * inBoundUM 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInBoundUM() {
        return inBoundUM;
    }

    /**
     * inBoundUM 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInBoundUM(BigInteger value) {
        this.inBoundUM = value;
    }

    /**
     * outBoundUM 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutBoundUM() {
        return outBoundUM;
    }

    /**
     * outBoundUM 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutBoundUM(BigInteger value) {
        this.outBoundUM = value;
    }

    /**
     * inBoundM 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInBoundM() {
        return inBoundM;
    }

    /**
     * inBoundM 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInBoundM(BigInteger value) {
        this.inBoundM = value;
    }

    /**
     * outBoundM 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutBoundM() {
        return outBoundM;
    }

    /**
     * outBoundM 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutBoundM(BigInteger value) {
        this.outBoundM = value;
    }

    /**
     * inBoundInf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInBoundInf() {
        return inBoundInf;
    }

    /**
     * inBoundInf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInBoundInf(BigInteger value) {
        this.inBoundInf = value;
    }

    /**
     * outBoundInf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutBoundInf() {
        return outBoundInf;
    }

    /**
     * outBoundInf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutBoundInf(BigInteger value) {
        this.outBoundInf = value;
    }

}
