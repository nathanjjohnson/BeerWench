//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.19 at 02:00:16 PM MDT 
//


package jaxb.beerxml2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="version" type="{urn:beerxml:unit:v2}VersionType"/>
 *         <choice>
 *           <element name="fermentables">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="fermentable" type="{urn:beerxml:fermentable:v2}FermentableType" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="miscellaneous_ingredients">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="miscellaneous" type="{urn:beerxml:miscellaneous:v2}MiscellaneousType" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="hop_varieties">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="hop" type="{urn:beerxml:hop:v2}VarietyInformation" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="cultures">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="yeast" type="{urn:beerxml:yeast:v2}CultureInformation" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="profiles">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="water" type="{urn:beerxml:water:v2}WaterType" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="styles">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="style" type="{urn:beerxml:style:v2}StyleType" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="procedure">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="mash" type="{urn:beerxml:mash:v2}MashProcedureType" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="recipes">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="recipe" type="{urn:beerxml:recipe:v2}RecipeType" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
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
    "version",
    "fermentables",
    "miscellaneousIngredients",
    "hopVarieties",
    "cultures",
    "profiles",
    "styles",
    "procedure",
    "recipes"
})
@XmlRootElement(name = "beer_xml", namespace = "urn:beerxml:v2")
public class BeerXml {

    @XmlElement(namespace = "urn:beerxml:v2", required = true)
    protected BigDecimal version;
    @XmlElement(namespace = "urn:beerxml:v2")
    protected BeerXml.Fermentables fermentables;
    @XmlElement(name = "miscellaneous_ingredients", namespace = "urn:beerxml:v2")
    protected BeerXml.MiscellaneousIngredients miscellaneousIngredients;
    @XmlElement(name = "hop_varieties", namespace = "urn:beerxml:v2")
    protected BeerXml.HopVarieties hopVarieties;
    @XmlElement(namespace = "urn:beerxml:v2")
    protected BeerXml.Cultures cultures;
    @XmlElement(namespace = "urn:beerxml:v2")
    protected BeerXml.Profiles profiles;
    @XmlElement(namespace = "urn:beerxml:v2")
    protected BeerXml.Styles styles;
    @XmlElement(namespace = "urn:beerxml:v2")
    protected BeerXml.Procedure procedure;
    @XmlElement(namespace = "urn:beerxml:v2")
    protected BeerXml.Recipes recipes;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the fermentables property.
     * 
     * @return
     *     possible object is
     *     {@link BeerXml.Fermentables }
     *     
     */
    public BeerXml.Fermentables getFermentables() {
        return fermentables;
    }

    /**
     * Sets the value of the fermentables property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeerXml.Fermentables }
     *     
     */
    public void setFermentables(BeerXml.Fermentables value) {
        this.fermentables = value;
    }

    /**
     * Gets the value of the miscellaneousIngredients property.
     * 
     * @return
     *     possible object is
     *     {@link BeerXml.MiscellaneousIngredients }
     *     
     */
    public BeerXml.MiscellaneousIngredients getMiscellaneousIngredients() {
        return miscellaneousIngredients;
    }

    /**
     * Sets the value of the miscellaneousIngredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeerXml.MiscellaneousIngredients }
     *     
     */
    public void setMiscellaneousIngredients(BeerXml.MiscellaneousIngredients value) {
        this.miscellaneousIngredients = value;
    }

    /**
     * Gets the value of the hopVarieties property.
     * 
     * @return
     *     possible object is
     *     {@link BeerXml.HopVarieties }
     *     
     */
    public BeerXml.HopVarieties getHopVarieties() {
        return hopVarieties;
    }

    /**
     * Sets the value of the hopVarieties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeerXml.HopVarieties }
     *     
     */
    public void setHopVarieties(BeerXml.HopVarieties value) {
        this.hopVarieties = value;
    }

    /**
     * Gets the value of the cultures property.
     * 
     * @return
     *     possible object is
     *     {@link BeerXml.Cultures }
     *     
     */
    public BeerXml.Cultures getCultures() {
        return cultures;
    }

    /**
     * Sets the value of the cultures property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeerXml.Cultures }
     *     
     */
    public void setCultures(BeerXml.Cultures value) {
        this.cultures = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link BeerXml.Profiles }
     *     
     */
    public BeerXml.Profiles getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeerXml.Profiles }
     *     
     */
    public void setProfiles(BeerXml.Profiles value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the styles property.
     * 
     * @return
     *     possible object is
     *     {@link BeerXml.Styles }
     *     
     */
    public BeerXml.Styles getStyles() {
        return styles;
    }

    /**
     * Sets the value of the styles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeerXml.Styles }
     *     
     */
    public void setStyles(BeerXml.Styles value) {
        this.styles = value;
    }

    /**
     * Gets the value of the procedure property.
     * 
     * @return
     *     possible object is
     *     {@link BeerXml.Procedure }
     *     
     */
    public BeerXml.Procedure getProcedure() {
        return procedure;
    }

    /**
     * Sets the value of the procedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeerXml.Procedure }
     *     
     */
    public void setProcedure(BeerXml.Procedure value) {
        this.procedure = value;
    }

    /**
     * Gets the value of the recipes property.
     * 
     * @return
     *     possible object is
     *     {@link BeerXml.Recipes }
     *     
     */
    public BeerXml.Recipes getRecipes() {
        return recipes;
    }

    /**
     * Sets the value of the recipes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeerXml.Recipes }
     *     
     */
    public void setRecipes(BeerXml.Recipes value) {
        this.recipes = value;
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
     *         <element name="yeast" type="{urn:beerxml:yeast:v2}CultureInformation" maxOccurs="unbounded"/>
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
        "yeast"
    })
    public static class Cultures {

        @XmlElement(namespace = "urn:beerxml:v2", required = true)
        protected List<CultureInformation> yeast;

        /**
         * Gets the value of the yeast property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the yeast property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getYeast().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CultureInformation }
         * 
         * 
         */
        public List<CultureInformation> getYeast() {
            if (yeast == null) {
                yeast = new ArrayList<CultureInformation>();
            }
            return this.yeast;
        }

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
     *         <element name="fermentable" type="{urn:beerxml:fermentable:v2}FermentableType" maxOccurs="unbounded"/>
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
        "fermentable"
    })
    public static class Fermentables {

        @XmlElement(namespace = "urn:beerxml:v2", required = true)
        protected List<FermentableType> fermentable;

        /**
         * Gets the value of the fermentable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fermentable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFermentable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FermentableType }
         * 
         * 
         */
        public List<FermentableType> getFermentable() {
            if (fermentable == null) {
                fermentable = new ArrayList<FermentableType>();
            }
            return this.fermentable;
        }

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
     *         <element name="hop" type="{urn:beerxml:hop:v2}VarietyInformation" maxOccurs="unbounded"/>
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
        "hop"
    })
    public static class HopVarieties {

        @XmlElement(namespace = "urn:beerxml:v2", required = true)
        protected List<VarietyInformation> hop;

        /**
         * Gets the value of the hop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHop().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VarietyInformation }
         * 
         * 
         */
        public List<VarietyInformation> getHop() {
            if (hop == null) {
                hop = new ArrayList<VarietyInformation>();
            }
            return this.hop;
        }

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
     *         <element name="miscellaneous" type="{urn:beerxml:miscellaneous:v2}MiscellaneousType" maxOccurs="unbounded"/>
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
        "miscellaneous"
    })
    public static class MiscellaneousIngredients {

        @XmlElement(namespace = "urn:beerxml:v2", required = true)
        protected List<MiscellaneousType> miscellaneous;

        /**
         * Gets the value of the miscellaneous property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the miscellaneous property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMiscellaneous().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiscellaneousType }
         * 
         * 
         */
        public List<MiscellaneousType> getMiscellaneous() {
            if (miscellaneous == null) {
                miscellaneous = new ArrayList<MiscellaneousType>();
            }
            return this.miscellaneous;
        }

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
     *         <element name="mash" type="{urn:beerxml:mash:v2}MashProcedureType" maxOccurs="unbounded"/>
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
        "mash"
    })
    public static class Procedure {

        @XmlElement(namespace = "urn:beerxml:v2", required = true)
        protected List<MashProcedureType> mash;

        /**
         * Gets the value of the mash property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mash property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMash().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MashProcedureType }
         * 
         * 
         */
        public List<MashProcedureType> getMash() {
            if (mash == null) {
                mash = new ArrayList<MashProcedureType>();
            }
            return this.mash;
        }

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
     *         <element name="water" type="{urn:beerxml:water:v2}WaterType" maxOccurs="unbounded"/>
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
        "water"
    })
    public static class Profiles {

        @XmlElement(namespace = "urn:beerxml:v2", required = true)
        protected List<WaterType> water;

        /**
         * Gets the value of the water property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the water property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWater().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WaterType }
         * 
         * 
         */
        public List<WaterType> getWater() {
            if (water == null) {
                water = new ArrayList<WaterType>();
            }
            return this.water;
        }

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
     *         <element name="recipe" type="{urn:beerxml:recipe:v2}RecipeType" maxOccurs="unbounded"/>
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
        "recipe"
    })
    public static class Recipes {

        @XmlElement(namespace = "urn:beerxml:v2", required = true)
        protected List<RecipeType> recipe;

        /**
         * Gets the value of the recipe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recipe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecipe().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecipeType }
         * 
         * 
         */
        public List<RecipeType> getRecipe() {
            if (recipe == null) {
                recipe = new ArrayList<RecipeType>();
            }
            return this.recipe;
        }

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
     *         <element name="style" type="{urn:beerxml:style:v2}StyleType" maxOccurs="unbounded"/>
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
        "style"
    })
    public static class Styles {

        @XmlElement(namespace = "urn:beerxml:v2", required = true)
        protected List<StyleType> style;

        /**
         * Gets the value of the style property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the style property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStyle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StyleType }
         * 
         * 
         */
        public List<StyleType> getStyle() {
            if (style == null) {
                style = new ArrayList<StyleType>();
            }
            return this.style;
        }

    }

}
