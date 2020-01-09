package com.allocate.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

@Controller
@RequestMapping("${openapi.workers.base-path:/api/worker/v1}")
public class WorkerApiController implements WorkerApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WorkerApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
