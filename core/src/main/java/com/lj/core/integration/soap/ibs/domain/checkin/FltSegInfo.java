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
 * Flight Information of each segment of a flight.
 * 
 * <p>FltSegInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FltSegInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}FlightInformation" maxOccurs="unbounded"/&gt;
 *         &lt;element name="GateEventInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}GateEventInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ManifestInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}ManifestInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FltSegInfo", propOrder = {
    "flightInformation",
    "gateEventInfo",
    "manifestInfo"
})
public class FltSegInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "FlightInformation", required = true)
    protected List<FlightInformation> flightInformation;
    @XmlElement(name = "GateEventInfo")
    protected List<GateEventInformation> gateEventInfo;
    @XmlElement(name = "ManifestInfo")
    protected List<ManifestInformation> manifestInfo;

    /**
     * Gets the value of the flightInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInformation }
     * 
     * 
     */
    public List<FlightInformation> getFlightInformation() {
        if (flightInformation == null) {
            flightInformation = new ArrayList<FlightInformation>();
        }
        return this.flightInformation;
    }

    /**
     * Gets the value of the gateEventInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gateEventInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGateEventInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GateEventInformation }
     * 
     * 
     */
    public List<GateEventInformation> getGateEventInfo() {
        if (gateEventInfo == null) {
            gateEventInfo = new ArrayList<GateEventInformation>();
        }
        return this.gateEventInfo;
    }

    /**
     * Gets the value of the manifestInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manifestInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManifestInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManifestInformation }
     * 
     * 
     */
    public List<ManifestInformation> getManifestInfo() {
        if (manifestInfo == null) {
            manifestInfo = new ArrayList<ManifestInformation>();
        }
        return this.manifestInfo;
    }

}
