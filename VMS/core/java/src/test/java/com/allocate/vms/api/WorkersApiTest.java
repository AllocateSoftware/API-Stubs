/*
 * VMS API
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.vms.api;

import com.allocate.vms.ApiException;
import com.allocate.vms.api.model.Person;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkersApi
 */
@Ignore
public class WorkersApiTest {

    private final WorkersApi api = new WorkersApi();

    
    /**
     * 
     *
     * Get the details of a person (worker) from the VMS
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkerTest() throws ApiException {
        String id = null;
        Person response = api.getWorker(id);

        // TODO: test validations
    }
    
}
