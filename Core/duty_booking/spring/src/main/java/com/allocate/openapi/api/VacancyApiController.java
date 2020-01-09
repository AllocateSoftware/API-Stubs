package com.allocate.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:20.724158Z[Europe/London]")

@Controller
@RequestMapping("${openapi.dutyBookingAPIAndEvents.base-path:/api/booking/v1}")
public class VacancyApiController implements VacancyApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public VacancyApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
