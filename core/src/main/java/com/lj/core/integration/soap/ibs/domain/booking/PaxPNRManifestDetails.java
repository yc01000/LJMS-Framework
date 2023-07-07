//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PaxPNRManifestDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PaxPNRManifestDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PNRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassengerManifestDetails" type="{http://www.ibsplc.com/iRes/simpleTypes/}PassengerManifestDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ContactInformation" type="{http://www.ibsplc.com/iRes/simpleTypes/}ContactInfoPaxManifest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelDocuments" type="{http://www.ibsplc.com/iRes/simpleTypes/}TravelDocumentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxPNRManifestDetails", propOrder = {
    "pnrNumber",
    "passengerManifestDetails",
    "contactInformation",
    "travelDocuments"
})
public class PaxPNRManifestDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PNRNumber", required = true)
    protected String pnrNumber;
    @XmlElement(name = "PassengerManifestDetails", required = true)
    protected List<PassengerManifestDetails> passengerManifestDetails;
    @XmlElement(name = "ContactInformation")
    protected List<ContactInfoPaxManifest> contactInformation;
    @XmlElement(name = "TravelDocuments")
    protected List<TravelDocumentsType> travelDocuments;

    /**
     * pnrNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRNumber() {
        return pnrNumber;
    }

    /**
     * pnrNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRNumber(String value) {
        this.pnrNumber = value;
    }

    /**
     * Gets the value of the passengerManifestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerManifestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerManifestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerManifestDetails }
     * 
     * 
     */
    public List<PassengerManifestDetails> getPassengerManifestDetails() {
        if (passengerManifestDetails == null) {
            passengerManifestDetails = new ArrayList<PassengerManifestDetails>();
        }
        return this.passengerManifestDetails;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoPaxManifest }
     * 
     * 
     */
    public List<ContactInfoPaxManifest> getContactInformation() {
        if (contactInformation == null) {
            contactInformation = new ArrayList<ContactInfoPaxManifest>();
        }
        return this.contactInformation;
    }

    /**
     * Gets the value of the travelDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocumentsType }
     * 
     * 
     */
    public List<TravelDocumentsType> getTravelDocuments() {
        if (travelDocuments == null) {
            travelDocuments = new ArrayList<TravelDocumentsType>();
        }
        return this.travelDocuments;
    }

}
