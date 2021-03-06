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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MashStepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="MashStepType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="type">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="infusion"/>
 *               <enumeration value="temperature"/>
 *               <enumeration value="decoction"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="infuse_amount" type="{urn:beerxml:unit:v2}VolumeType" minOccurs="0"/>
 *         <element name="step_temperature" type="{urn:beerxml:unit:v2}TemperatureType"/>
 *         <element name="step_time" type="{urn:beerxml:unit:v2}TimeType"/>
 *         <element name="ramp_time" type="{urn:beerxml:unit:v2}TimeType" minOccurs="0"/>
 *         <element name="end_temperature" type="{urn:beerxml:unit:v2}TemperatureType" minOccurs="0"/>
 *         <element name="description" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="water_grain_ratio" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="decoction_amount" type="{urn:beerxml:unit:v2}VolumeType" minOccurs="0"/>
 *         <element name="infuse_temperature" type="{urn:beerxml:unit:v2}TemperatureType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MashStepType", namespace = "urn:beerxml:mash:step:v2", propOrder = {
    "name",
    "type",
    "infuseAmount",
    "stepTemperature",
    "stepTime",
    "rampTime",
    "endTemperature",
    "description",
    "waterGrainRatio",
    "decoctionAmount",
    "infuseTemperature"
})
public class MashStepType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "infuse_amount")
    protected VolumeType infuseAmount;
    @XmlElement(name = "step_temperature", required = true)
    protected TemperatureType stepTemperature;
    @XmlElement(name = "step_time", required = true)
    protected TimeType stepTime;
    @XmlElement(name = "ramp_time")
    protected TimeType rampTime;
    @XmlElement(name = "end_temperature")
    protected TemperatureType endTemperature;
    protected String description;
    @XmlElement(name = "water_grain_ratio")
    protected BigDecimal waterGrainRatio;
    @XmlElement(name = "decoction_amount")
    protected VolumeType decoctionAmount;
    @XmlElement(name = "infuse_temperature")
    protected TemperatureType infuseTemperature;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the infuseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getInfuseAmount() {
        return infuseAmount;
    }

    /**
     * Sets the value of the infuseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setInfuseAmount(VolumeType value) {
        this.infuseAmount = value;
    }

    /**
     * Gets the value of the stepTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getStepTemperature() {
        return stepTemperature;
    }

    /**
     * Sets the value of the stepTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setStepTemperature(TemperatureType value) {
        this.stepTemperature = value;
    }

    /**
     * Gets the value of the stepTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getStepTime() {
        return stepTime;
    }

    /**
     * Sets the value of the stepTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setStepTime(TimeType value) {
        this.stepTime = value;
    }

    /**
     * Gets the value of the rampTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getRampTime() {
        return rampTime;
    }

    /**
     * Sets the value of the rampTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setRampTime(TimeType value) {
        this.rampTime = value;
    }

    /**
     * Gets the value of the endTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getEndTemperature() {
        return endTemperature;
    }

    /**
     * Sets the value of the endTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setEndTemperature(TemperatureType value) {
        this.endTemperature = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the waterGrainRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWaterGrainRatio() {
        return waterGrainRatio;
    }

    /**
     * Sets the value of the waterGrainRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWaterGrainRatio(BigDecimal value) {
        this.waterGrainRatio = value;
    }

    /**
     * Gets the value of the decoctionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getDecoctionAmount() {
        return decoctionAmount;
    }

    /**
     * Sets the value of the decoctionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setDecoctionAmount(VolumeType value) {
        this.decoctionAmount = value;
    }

    /**
     * Gets the value of the infuseTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getInfuseTemperature() {
        return infuseTemperature;
    }

    /**
     * Sets the value of the infuseTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setInfuseTemperature(TemperatureType value) {
        this.infuseTemperature = value;
    }

}
