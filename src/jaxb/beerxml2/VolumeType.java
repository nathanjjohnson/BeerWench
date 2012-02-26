//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.19 at 02:00:16 PM MDT 
//


package jaxb.beerxml2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for VolumeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="VolumeType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
 *       <attribute name="volume" use="required" type="{urn:beerxml:unit:v2}VolumeUnitType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    jaxb.beerxml2.CultureInformation.Inventory.Culture.class
})
public class VolumeType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(required = true)
    protected VolumeUnitType volume;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeUnitType }
     *     
     */
    public VolumeUnitType getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeUnitType }
     *     
     */
    public void setVolume(VolumeUnitType value) {
        this.volume = value;
    }

}
