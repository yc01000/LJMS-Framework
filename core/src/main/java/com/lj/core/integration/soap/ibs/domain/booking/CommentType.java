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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CommentType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CommentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommentTypeCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentTypeCode"/&gt;
 *         &lt;element name="CommentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CommentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommentAddedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CommentAddedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegmentIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentType", propOrder = {
    "commentTypeCode",
    "commentValue",
    "commentId",
    "commentAddedTime",
    "commentAddedUser",
    "segmentIds"
})
public class CommentType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "CommentTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected CommentTypeCode commentTypeCode;
    @XmlElement(name = "CommentValue", required = true)
    protected String commentValue;
    @XmlElement(name = "CommentId")
    protected String commentId;
    @XmlElement(name = "CommentAddedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentAddedTime;
    @XmlElement(name = "CommentAddedUser")
    protected String commentAddedUser;
    @XmlElement(name = "SegmentIds", type = Long.class)
    protected List<Long> segmentIds;

    /**
     * commentTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CommentTypeCode }
     *     
     */
    public CommentTypeCode getCommentTypeCode() {
        return commentTypeCode;
    }

    /**
     * commentTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentTypeCode }
     *     
     */
    public void setCommentTypeCode(CommentTypeCode value) {
        this.commentTypeCode = value;
    }

    /**
     * commentValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentValue() {
        return commentValue;
    }

    /**
     * commentValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentValue(String value) {
        this.commentValue = value;
    }

    /**
     * commentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * commentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentId(String value) {
        this.commentId = value;
    }

    /**
     * commentAddedTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommentAddedTime() {
        return commentAddedTime;
    }

    /**
     * commentAddedTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommentAddedTime(XMLGregorianCalendar value) {
        this.commentAddedTime = value;
    }

    /**
     * commentAddedUser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentAddedUser() {
        return commentAddedUser;
    }

    /**
     * commentAddedUser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentAddedUser(String value) {
        this.commentAddedUser = value;
    }

    /**
     * Gets the value of the segmentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSegmentIds() {
        if (segmentIds == null) {
            segmentIds = new ArrayList<Long>();
        }
        return this.segmentIds;
    }

}
