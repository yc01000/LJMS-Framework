//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>GroupQuoteCommentsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GroupQuoteCommentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CommentTypeCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentCode_Type"/&gt;
 *         &lt;element name="CommentSubTypeCode" type="{http://www.ibsplc.com/iRes/simpleTypes/}CommentSubTypeCode"/&gt;
 *         &lt;element name="CommentText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CommentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CommentAddedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CommentAddedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommentFirstReadBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupQuoteCommentsType", propOrder = {
    "action",
    "commentTypeCode",
    "commentSubTypeCode",
    "commentText",
    "commentId",
    "commentAddedTime",
    "commentAddedUser",
    "commentFirstReadBy"
})
public class GroupQuoteCommentsType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "Action", required = true)
    protected String action;
    @XmlElement(name = "CommentTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected CommentCodeType commentTypeCode;
    @XmlElement(name = "CommentSubTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected CommentSubTypeCode commentSubTypeCode;
    @XmlElement(name = "CommentText", required = true)
    protected String commentText;
    @XmlElement(name = "CommentId", required = true)
    protected String commentId;
    @XmlElement(name = "CommentAddedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentAddedTime;
    @XmlElement(name = "CommentAddedUser")
    protected String commentAddedUser;
    @XmlElement(name = "CommentFirstReadBy")
    protected String commentFirstReadBy;

    /**
     * action 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * action 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * commentTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CommentCodeType }
     *     
     */
    public CommentCodeType getCommentTypeCode() {
        return commentTypeCode;
    }

    /**
     * commentTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentCodeType }
     *     
     */
    public void setCommentTypeCode(CommentCodeType value) {
        this.commentTypeCode = value;
    }

    /**
     * commentSubTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CommentSubTypeCode }
     *     
     */
    public CommentSubTypeCode getCommentSubTypeCode() {
        return commentSubTypeCode;
    }

    /**
     * commentSubTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentSubTypeCode }
     *     
     */
    public void setCommentSubTypeCode(CommentSubTypeCode value) {
        this.commentSubTypeCode = value;
    }

    /**
     * commentText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * commentText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
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
     * commentFirstReadBy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentFirstReadBy() {
        return commentFirstReadBy;
    }

    /**
     * commentFirstReadBy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentFirstReadBy(String value) {
        this.commentFirstReadBy = value;
    }

}
