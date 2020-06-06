package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 **/
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(String.class)
public enum ApiStatus {

    @XmlEnumValue("green") GREEN(String.valueOf("green")), @XmlEnumValue("yellow") YELLOW(String.valueOf("yellow")), @XmlEnumValue("red") RED(String.valueOf("red"));


    private String value;

    ApiStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApiStatus fromValue(String v) {
        for (ApiStatus b : ApiStatus.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}



