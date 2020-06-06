package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
 **/
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(String.class)
public enum SkinModel {

    @XmlEnumValue("") EMPTY(String.valueOf("")), @XmlEnumValue("slim") SLIM(String.valueOf("slim"));


    private String value;

    SkinModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SkinModel fromValue(String v) {
        for (SkinModel b : SkinModel.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}



