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
 * <p>PayableEntityBreakdownType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PayableEntityBreakdownType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fare" type="{http://www.ibsplc.com/iRes/simpleTypes/}FareEntityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{http://www.ibsplc.com/iRes/simpleTypes/}TaxEntityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Surcharge" type="{http://www.ibsplc.com/iRes/simpleTypes/}SurchargeEntityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.ibsplc.com/iRes/simpleTypes/}FeeEntityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayableEntityBreakdownType", propOrder = {
    "fare",
    "tax",
    "surcharge",
    "fee"
})
public class PayableEntityBreakdownType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Fare")
    protected List<FareEntityType> fare;
    @XmlElement(name = "Tax")
    protected List<TaxEntityType> tax;
    @XmlElement(name = "Surcharge")
    protected List<SurchargeEntityType> surcharge;
    @XmlElement(name = "Fee")
    protected List<FeeEntityType> fee;

    /**
     * Gets the value of the fare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareEntityType }
     * 
     * 
     */
    public List<FareEntityType> getFare() {
        if (fare == null) {
            fare = new ArrayList<FareEntityType>();
        }
        return this.fare;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxEntityType }
     * 
     * 
     */
    public List<TaxEntityType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxEntityType>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeEntityType }
     * 
     * 
     */
    public List<SurchargeEntityType> getSurcharge() {
        if (surcharge == null) {
            surcharge = new ArrayList<SurchargeEntityType>();
        }
        return this.surcharge;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeEntityType }
     * 
     * 
     */
    public List<FeeEntityType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeEntityType>();
        }
        return this.fee;
    }

}
