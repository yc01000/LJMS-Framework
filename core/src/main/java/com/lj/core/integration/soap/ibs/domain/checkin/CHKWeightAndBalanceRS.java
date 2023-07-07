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
 *         &lt;element name="ErrInd" type="{http://www.ibsplc.com/iRes/simpleTypes/}ErrInd" minOccurs="0"/&gt;
 *         &lt;element name="STD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CkinDepCty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CkinFltStat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CkinInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}CkinInfo" minOccurs="0"/&gt;
 *         &lt;element name="WtSum" type="{http://www.ibsplc.com/iRes/simpleTypes/}WtSum" minOccurs="0"/&gt;
 *         &lt;element name="SeatMap" type="{http://www.ibsplc.com/iRes/simpleTypes/}SeatMap" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "errInd",
    "std",
    "ckinDepCty",
    "ckinFltStat",
    "ckinInfo",
    "wtSum",
    "seatMap"
})
@XmlRootElement(name = "CHK_WeightAndBalanceRS")
public class CHKWeightAndBalanceRS
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ErrInd")
    protected ErrInd errInd;
    @XmlElement(name = "STD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar std;
    @XmlElement(name = "CkinDepCty")
    protected String ckinDepCty;
    @XmlElement(name = "CkinFltStat")
    protected String ckinFltStat;
    @XmlElement(name = "CkinInfo")
    protected CkinInfo ckinInfo;
    @XmlElement(name = "WtSum")
    protected WtSum wtSum;
    @XmlElement(name = "SeatMap")
    protected List<SeatMap> seatMap;

    /**
     * errInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ErrInd }
     *     
     */
    public ErrInd getErrInd() {
        return errInd;
    }

    /**
     * errInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrInd }
     *     
     */
    public void setErrInd(ErrInd value) {
        this.errInd = value;
    }

    /**
     * std 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTD() {
        return std;
    }

    /**
     * std 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTD(XMLGregorianCalendar value) {
        this.std = value;
    }

    /**
     * ckinDepCty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCkinDepCty() {
        return ckinDepCty;
    }

    /**
     * ckinDepCty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCkinDepCty(String value) {
        this.ckinDepCty = value;
    }

    /**
     * ckinFltStat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCkinFltStat() {
        return ckinFltStat;
    }

    /**
     * ckinFltStat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCkinFltStat(String value) {
        this.ckinFltStat = value;
    }

    /**
     * ckinInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CkinInfo }
     *     
     */
    public CkinInfo getCkinInfo() {
        return ckinInfo;
    }

    /**
     * ckinInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CkinInfo }
     *     
     */
    public void setCkinInfo(CkinInfo value) {
        this.ckinInfo = value;
    }

    /**
     * wtSum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WtSum }
     *     
     */
    public WtSum getWtSum() {
        return wtSum;
    }

    /**
     * wtSum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WtSum }
     *     
     */
    public void setWtSum(WtSum value) {
        this.wtSum = value;
    }

    /**
     * Gets the value of the seatMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMap }
     * 
     * 
     */
    public List<SeatMap> getSeatMap() {
        if (seatMap == null) {
            seatMap = new ArrayList<SeatMap>();
        }
        return this.seatMap;
    }

}
