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
 * <p>Java class for DistanceUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="DistanceUnitType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="cm"/>
 *     <enumeration value="m"/>
 *     <enumeration value="ft"/>
 *     <enumeration value="in"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistanceUnitType")
@XmlEnum
public enum DistanceUnitType {

    @XmlEnumValue("cm")
    CM("cm"),
    @XmlEnumValue("m")
    M("m"),
    @XmlEnumValue("ft")
    FT("ft"),
    @XmlEnumValue("in")
    IN("in");
    private final String value;

    DistanceUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistanceUnitType fromValue(String v) {
        for (DistanceUnitType c: DistanceUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
