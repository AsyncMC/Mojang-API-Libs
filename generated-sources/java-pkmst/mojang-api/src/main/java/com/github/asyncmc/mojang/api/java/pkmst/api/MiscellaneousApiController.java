package com.github.asyncmc.mojang.api.java.pkmst.api;

import com.github.asyncmc.mojang.api.java.pkmst.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.java.pkmst.model.OrderStatisticsResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T02:32:33.503412200-03:00[America/Sao_Paulo]")

@Controller
public class MiscellaneousApiController implements MiscellaneousApi {
    private final ObjectMapper objectMapper;
@Autowired
    public MiscellaneousApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<OrderStatisticsResponse> getOrdersStatistics(@ApiParam(value = "The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/" ,required=true )   @RequestBody OrderStatisticsRequest orderStatisticsRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OrderStatisticsResponse>(objectMapper.readValue("", OrderStatisticsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<OrderStatisticsResponse>(HttpStatus.OK);
    }

}
