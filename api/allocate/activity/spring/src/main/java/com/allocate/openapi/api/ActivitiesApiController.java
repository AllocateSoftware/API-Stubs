package com.allocate.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

@Controller
@RequestMapping("${openapi.activity.base-path:/api/v1}")
public class ActivitiesApiController implements ActivitiesApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ActivitiesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
