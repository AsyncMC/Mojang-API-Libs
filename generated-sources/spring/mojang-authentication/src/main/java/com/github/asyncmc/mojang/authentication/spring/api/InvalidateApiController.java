package com.github.asyncmc.mojang.authentication.spring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-06T02:35:20.256253900-03:00[America/Sao_Paulo]")

@Controller
@RequestMapping("${openapi.mojangAuthentication.base-path:}")
public class InvalidateApiController implements InvalidateApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InvalidateApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}