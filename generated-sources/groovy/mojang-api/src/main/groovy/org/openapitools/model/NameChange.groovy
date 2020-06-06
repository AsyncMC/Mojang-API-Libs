package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class NameChange {
    /* The new player name */
    String name = 

    /* Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry. */
    Long changedToAt = 

}
