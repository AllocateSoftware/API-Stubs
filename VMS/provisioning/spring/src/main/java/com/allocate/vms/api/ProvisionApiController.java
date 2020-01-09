package com.allocate.vms.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:34.643941Z[Europe/London]")

@Controller
@RequestMapping("${openapi.vMSProvisioning.base-path:/vms/provisioning/v1}")
public class ProvisionApiController implements ProvisionApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProvisionApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
