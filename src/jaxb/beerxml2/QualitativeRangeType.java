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
 * <p>Java class for QualitativeRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="QualitativeRangeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="very low"/>
 *     <enumeration value="low"/>
 *     <enumeration value="medium low"/>
 *     <enumeration value="medium"/>
 *     <enumeration value="medium high"/>
 *     <enumeration value="high"/>
 *     <enumeration value="very high"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QualitativeRangeType")
@XmlEnum
public enum QualitativeRangeType {

    @XmlEnumValue("very low")
    VERY_LOW("very low"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("medium low")
    MEDIUM_LOW("medium low"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("medium high")
    MEDIUM_HIGH("medium high"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("very high")
    VERY_HIGH("very high");
    private final String value;

    QualitativeRangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualitativeRangeType fromValue(String v) {
        for (QualitativeRangeType c: QualitativeRangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}