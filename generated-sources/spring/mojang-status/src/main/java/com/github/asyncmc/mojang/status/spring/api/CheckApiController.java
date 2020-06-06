package com.github.asyncmc.mojang.status.spring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-06T05:02:23.923199200-03:00[America/Sao_Paulo]")

@Controller
@RequestMapping("${openapi.mojang.base-path:}")
public class CheckApiController implements CheckApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CheckApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
