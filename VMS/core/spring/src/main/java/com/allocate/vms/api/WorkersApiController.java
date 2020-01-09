package com.allocate.vms.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

@Controller
@RequestMapping("${openapi.vMS.base-path:/vms/api/v1}")
public class WorkersApiController implements WorkersApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WorkersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
