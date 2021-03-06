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
 * <p>Java class for PressureUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PressureUnitType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="kPa"/>
 *     <enumeration value="psi"/>
 *     <enumeration value="bar"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressureUnitType")
@XmlEnum
public enum PressureUnitType {

    @XmlEnumValue("kPa")
    K_PA("kPa"),
    @XmlEnumValue("psi")
    PSI("psi"),
    @XmlEnumValue("bar")
    BAR("bar");
    private final String value;

    PressureUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressureUnitType fromValue(String v) {
        for (PressureUnitType c: PressureUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
