//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.19 at 02:00:16 PM MDT 
//


package jaxb.beerxml2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StyleCategories.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="StyleCategories">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="lager"/>
 *     <enumeration value="ale"/>
 *     <enumeration value="mead"/>
 *     <enumeration value="wheat"/>
 *     <enumeration value="mixed"/>
 *     <enumeration value="cider"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StyleCategories", namespace = "urn:beerxml:style:v2")
@XmlEnum
public enum StyleCategories {

    @XmlEnumValue("lager")
    LAGER("lager"),
    @XmlEnumValue("ale")
    ALE("ale"),
    @XmlEnumValue("mead")
    MEAD("mead"),
    @XmlEnumValue("wheat")
    WHEAT("wheat"),
    @XmlEnumValue("mixed")
    MIXED("mixed"),
    @XmlEnumValue("cider")
    CIDER("cider");
    private final String value;

    StyleCategories(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StyleCategories fromValue(String v) {
        for (StyleCategories c: StyleCategories.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
