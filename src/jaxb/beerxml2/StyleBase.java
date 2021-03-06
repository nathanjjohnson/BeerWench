//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.19 at 02:00:16 PM MDT 
//


package jaxb.beerxml2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The descriptive base type for both beer style guideline records and recipe style provisions.
 * 
 * <p>Java class for StyleBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="StyleBase">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="category">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="category_number">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="style_letter">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="1"/>
 *               <pattern value="[A-Z ]"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="style_guide">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="type" type="{urn:beerxml:style:v2}StyleCategories"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleBase", namespace = "urn:beerxml:style:v2", propOrder = {
    "name",
    "category",
    "categoryNumber",
    "styleLetter",
    "styleGuide",
    "type"
})
@XmlSeeAlso({
    RecipeStyleType.class,
    StyleType.class
})
public class StyleBase {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(name = "category_number", required = true)
    protected BigInteger categoryNumber;
    @XmlElement(name = "style_letter", required = true)
    protected String styleLetter;
    @XmlElement(name = "style_guide", required = true)
    protected String styleGuide;
    @XmlElement(required = true)
    protected StyleCategories type;

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoryNumber() {
        return categoryNumber;
    }

    /**
     * Sets the value of the categoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoryNumber(BigInteger value) {
        this.categoryNumber = value;
    }

    /**
     * Gets the value of the styleLetter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleLetter() {
        return styleLetter;
    }

    /**
     * Sets the value of the styleLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleLetter(String value) {
        this.styleLetter = value;
    }

    /**
     * Gets the value of the styleGuide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleGuide() {
        return styleGuide;
    }

    /**
     * Sets the value of the styleGuide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleGuide(String value) {
        this.styleGuide = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StyleCategories }
     *     
     */
    public StyleCategories getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleCategories }
     *     
     */
    public void setType(StyleCategories value) {
        this.type = value;
    }

}
