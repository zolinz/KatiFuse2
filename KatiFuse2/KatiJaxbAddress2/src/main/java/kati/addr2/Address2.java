//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.18 at 09:39:59 AM AEDT 
//


package kati.addr2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfStreet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nameOfStreet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="residenceCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "numberOfStreet",
    "nameOfStreet",
    "postCode",
    "residenceCountry"
})
@XmlRootElement(name = "address2")
public class Address2 {

    @XmlElement(required = true)
    protected String numberOfStreet;
    @XmlElement(required = true)
    protected String nameOfStreet;
    @XmlElement(required = true)
    protected String postCode;
    @XmlElement(required = true)
    protected String residenceCountry;

    /**
     * Gets the value of the numberOfStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfStreet() {
        return numberOfStreet;
    }

    /**
     * Sets the value of the numberOfStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfStreet(String value) {
        this.numberOfStreet = value;
    }

    /**
     * Gets the value of the nameOfStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfStreet() {
        return nameOfStreet;
    }

    /**
     * Sets the value of the nameOfStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfStreet(String value) {
        this.nameOfStreet = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the residenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountry() {
        return residenceCountry;
    }

    /**
     * Sets the value of the residenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountry(String value) {
        this.residenceCountry = value;
    }

}