//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.10.23 시간 01:41:16 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.checkin;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Check-in information
 * 
 * <p>CkinInfo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CkinInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrdgGate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CkinCFG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BlkSeat" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BkdNbr" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinPaxCountInfo" maxOccurs="unbounded"/&gt;
 *         &lt;element name="CkinNbr" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinPaxCountInfo" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AvblNbr" type="{http://www.ibsplc.com/iRes/simpleTypes/}CabinPaxCountInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CkinInfo", propOrder = {
    "brdgGate",
    "ckinCFG",
    "blkSeat",
    "bkdNbr",
    "ckinNbr",
    "avblNbr"
})
public class CkinInfo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "BrdgGate", required = true)
    protected String brdgGate;
    @XmlElement(name = "CkinCFG", required = true)
    protected String ckinCFG;
    @XmlElement(name = "BlkSeat", required = true)
    protected BigInteger blkSeat;
    @XmlElement(name = "BkdNbr", required = true)
    protected List<CabinPaxCountInfo> bkdNbr;
    @XmlElement(name = "CkinNbr", required = true)
    protected List<CabinPaxCountInfo> ckinNbr;
    @XmlElement(name = "AvblNbr", required = true)
    protected List<CabinPaxCountInfo> avblNbr;

    /**
     * brdgGate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrdgGate() {
        return brdgGate;
    }

    /**
     * brdgGate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrdgGate(String value) {
        this.brdgGate = value;
    }

    /**
     * ckinCFG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCkinCFG() {
        return ckinCFG;
    }

    /**
     * ckinCFG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCkinCFG(String value) {
        this.ckinCFG = value;
    }

    /**
     * blkSeat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBlkSeat() {
        return blkSeat;
    }

    /**
     * blkSeat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBlkSeat(BigInteger value) {
        this.blkSeat = value;
    }

    /**
     * Gets the value of the bkdNbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bkdNbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkdNbr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinPaxCountInfo }
     * 
     * 
     */
    public List<CabinPaxCountInfo> getBkdNbr() {
        if (bkdNbr == null) {
            bkdNbr = new ArrayList<CabinPaxCountInfo>();
        }
        return this.bkdNbr;
    }

    /**
     * Gets the value of the ckinNbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ckinNbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCkinNbr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinPaxCountInfo }
     * 
     * 
     */
    public List<CabinPaxCountInfo> getCkinNbr() {
        if (ckinNbr == null) {
            ckinNbr = new ArrayList<CabinPaxCountInfo>();
        }
        return this.ckinNbr;
    }

    /**
     * Gets the value of the avblNbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avblNbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvblNbr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinPaxCountInfo }
     * 
     * 
     */
    public List<CabinPaxCountInfo> getAvblNbr() {
        if (avblNbr == null) {
            avblNbr = new ArrayList<CabinPaxCountInfo>();
        }
        return this.avblNbr;
    }

}
