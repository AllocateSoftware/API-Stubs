package com.allocate.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

@Controller
@RequestMapping("${openapi.dutiesAndEvents.base-path:/api/duty/v1}")
public class DutiesApiController implements DutiesApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DutiesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
