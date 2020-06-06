package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-05T23:36:13.683018100-03:00[America/Sao_Paulo]")

@Controller
@RequestMapping("${openapi.mojangSession.base-path:}")
public class BlockedserversApiController implements BlockedserversApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BlockedserversApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
