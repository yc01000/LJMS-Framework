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
 * Weight Summary
 * 
 * <p>WtSum complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="WtSum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxMFCI" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxMFCI" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PaxBags" type="{http://www.ibsplc.com/iRes/simpleTypes/}PaxBags" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ZnInfo" type="{http://www.ibsplc.com/iRes/simpleTypes/}ZnInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WtSum", propOrder = {
    "paxMFCI",
    "paxBags",
    "znInfo"
})
public class WtSum
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "PaxMFCI", required = true)
    protected List<PaxMFCI> paxMFCI;
    @XmlElement(name = "PaxBags", required = true)
    protected List<PaxBags> paxBags;
    @XmlElement(name = "ZnInfo", required = true)
    protected List<ZnInfo> znInfo;

    /**
     * Gets the value of the paxMFCI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxMFCI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxMFCI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxMFCI }
     * 
     * 
     */
    public List<PaxMFCI> getPaxMFCI() {
        if (paxMFCI == null) {
            paxMFCI = new ArrayList<PaxMFCI>();
        }
        return this.paxMFCI;
    }

    /**
     * Gets the value of the paxBags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxBags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxBags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxBags }
     * 
     * 
     */
    public List<PaxBags> getPaxBags() {
        if (paxBags == null) {
            paxBags = new ArrayList<PaxBags>();
        }
        return this.paxBags;
    }

    /**
     * Gets the value of the znInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the znInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZnInfo }
     * 
     * 
     */
    public List<ZnInfo> getZnInfo() {
        if (znInfo == null) {
            znInfo = new ArrayList<ZnInfo>();
        }
        return this.znInfo;
    }

}
