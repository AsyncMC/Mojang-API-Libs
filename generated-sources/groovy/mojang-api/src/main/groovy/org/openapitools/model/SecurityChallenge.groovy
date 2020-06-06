package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SecurityAnswerId;
import org.openapitools.model.SecurityQuestion;

@Canonical
class SecurityChallenge {
    SecurityQuestion question = null

    SecurityAnswerId answer = null

}
