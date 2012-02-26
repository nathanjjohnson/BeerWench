//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.19 at 02:00:16 PM MDT 
//


package jaxb.beerxml2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Yeast Culture Record Information
 * 
 * <p>Java class for CultureInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="CultureInformation">
 *   <complexContent>
 *     <extension base="{urn:beerxml:yeast:v2}CultureBase">
 *       <sequence>
 *         <element name="temperature_range" type="{urn:beerxml:unit:v2}TemperatureRangeType" minOccurs="0"/>
 *         <element name="flocculation" type="{urn:beerxml:unit:v2}QualitativeRangeType" minOccurs="0"/>
 *         <element name="attenuation" type="{urn:beerxml:unit:v2}PercentType" minOccurs="0"/>
 *         <element name="alcohol_tolerance" type="{urn:beerxml:unit:v2}PercentRangeType" minOccurs="0"/>
 *         <element name="notes" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="best_for" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="max_reuse" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="inventory" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="liquid" type="{urn:beerxml:unit:v2}VolumeType" minOccurs="0"/>
 *                   <element name="dry" type="{urn:beerxml:unit:v2}MassType" minOccurs="0"/>
 *                   <element name="slant" type="{urn:beerxml:unit:v2}VolumeType" minOccurs="0"/>
 *                   <element name="culture" minOccurs="0">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<urn:beerxml:unit:v2>VolumeType">
 *                           <attribute name="date" type="{urn:beerxml:unit:v2}DateType" />
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CultureInformation", namespace = "urn:beerxml:yeast:v2", propOrder = {
    "temperatureRange",
    "flocculation",
    "attenuation",
    "alcoholTolerance",
    "notes",
    "bestFor",
    "maxReuse",
    "inventory"
})
public class CultureInformation
    extends CultureBase
{

    @XmlElement(name = "temperature_range")
    protected TemperatureRangeType temperatureRange;
    protected QualitativeRangeType flocculation;
    protected BigDecimal attenuation;
    @XmlElement(name = "alcohol_tolerance")
    protected PercentRangeType alcoholTolerance;
    protected String notes;
    @XmlElement(name = "best_for")
    protected String bestFor;
    @XmlElement(name = "max_reuse")
    protected BigInteger maxReuse;
    protected CultureInformation.Inventory inventory;

    /**
     * Gets the value of the temperatureRange property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureRangeType }
     *     
     */
    public TemperatureRangeType getTemperatureRange() {
        return temperatureRange;
    }

    /**
     * Sets the value of the temperatureRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureRangeType }
     *     
     */
    public void setTemperatureRange(TemperatureRangeType value) {
        this.temperatureRange = value;
    }

    /**
     * Gets the value of the flocculation property.
     * 
     * @return
     *     possible object is
     *     {@link QualitativeRangeType }
     *     
     */
    public QualitativeRangeType getFlocculation() {
        return flocculation;
    }

    /**
     * Sets the value of the flocculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitativeRangeType }
     *     
     */
    public void setFlocculation(QualitativeRangeType value) {
        this.flocculation = value;
    }

    /**
     * Gets the value of the attenuation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttenuation() {
        return attenuation;
    }

    /**
     * Sets the value of the attenuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAttenuation(BigDecimal value) {
        this.attenuation = value;
    }

    /**
     * Gets the value of the alcoholTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link PercentRangeType }
     *     
     */
    public PercentRangeType getAlcoholTolerance() {
        return alcoholTolerance;
    }

    /**
     * Sets the value of the alcoholTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentRangeType }
     *     
     */
    public void setAlcoholTolerance(PercentRangeType value) {
        this.alcoholTolerance = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the bestFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestFor() {
        return bestFor;
    }

    /**
     * Sets the value of the bestFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestFor(String value) {
        this.bestFor = value;
    }

    /**
     * Gets the value of the maxReuse property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxReuse() {
        return maxReuse;
    }

    /**
     * Sets the value of the maxReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxReuse(BigInteger value) {
        this.maxReuse = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link CultureInformation.Inventory }
     *     
     */
    public CultureInformation.Inventory getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CultureInformation.Inventory }
     *     
     */
    public void setInventory(CultureInformation.Inventory value) {
        this.inventory = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="liquid" type="{urn:beerxml:unit:v2}VolumeType" minOccurs="0"/>
     *         <element name="dry" type="{urn:beerxml:unit:v2}MassType" minOccurs="0"/>
     *         <element name="slant" type="{urn:beerxml:unit:v2}VolumeType" minOccurs="0"/>
     *         <element name="culture" minOccurs="0">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<urn:beerxml:unit:v2>VolumeType">
     *                 <attribute name="date" type="{urn:beerxml:unit:v2}DateType" />
     *               </extension>
     *             </simpleContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "liquid",
        "dry",
        "slant",
        "culture"
    })
    public static class Inventory {

        @XmlElement(namespace = "urn:beerxml:yeast:v2")
        protected VolumeType liquid;
        @XmlElement(namespace = "urn:beerxml:yeast:v2")
        protected MassType dry;
        @XmlElement(namespace = "urn:beerxml:yeast:v2")
        protected VolumeType slant;
        @XmlElement(namespace = "urn:beerxml:yeast:v2")
        protected CultureInformation.Inventory.Culture culture;

        /**
         * Gets the value of the liquid property.
         * 
         * @return
         *     possible object is
         *     {@link VolumeType }
         *     
         */
        public VolumeType getLiquid() {
            return liquid;
        }

        /**
         * Sets the value of the liquid property.
         * 
         * @param value
         *     allowed object is
         *     {@link VolumeType }
         *     
         */
        public void setLiquid(VolumeType value) {
            this.liquid = value;
        }

        /**
         * Gets the value of the dry property.
         * 
         * @return
         *     possible object is
         *     {@link MassType }
         *     
         */
        public MassType getDry() {
            return dry;
        }

        /**
         * Sets the value of the dry property.
         * 
         * @param value
         *     allowed object is
         *     {@link MassType }
         *     
         */
        public void setDry(MassType value) {
            this.dry = value;
        }

        /**
         * Gets the value of the slant property.
         * 
         * @return
         *     possible object is
         *     {@link VolumeType }
         *     
         */
        public VolumeType getSlant() {
            return slant;
        }

        /**
         * Sets the value of the slant property.
         * 
         * @param value
         *     allowed object is
         *     {@link VolumeType }
         *     
         */
        public void setSlant(VolumeType value) {
            this.slant = value;
        }

        /**
         * Gets the value of the culture property.
         * 
         * @return
         *     possible object is
         *     {@link CultureInformation.Inventory.Culture }
         *     
         */
        public CultureInformation.Inventory.Culture getCulture() {
            return culture;
        }

        /**
         * Sets the value of the culture property.
         * 
         * @param value
         *     allowed object is
         *     {@link CultureInformation.Inventory.Culture }
         *     
         */
        public void setCulture(CultureInformation.Inventory.Culture value) {
            this.culture = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * <complexType>
         *   <simpleContent>
         *     <extension base="<urn:beerxml:unit:v2>VolumeType">
         *       <attribute name="date" type="{urn:beerxml:unit:v2}DateType" />
         *     </extension>
         *   </simpleContent>
         * </complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Culture
            extends VolumeType
        {

            @XmlAttribute
            protected String date;

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
            }

        }

    }

}
