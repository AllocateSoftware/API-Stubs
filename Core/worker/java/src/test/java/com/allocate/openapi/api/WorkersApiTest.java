/*
 * Workers
 * ## Workers and events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.api;

import com.allocate.openapi.ApiException;
import com.allocate.openapi.model.AsyncResponse;
import com.allocate.openapi.model.ErrorResponse;
import com.allocate.openapi.model.LeaveClaim;
import com.allocate.openapi.model.Person;
import com.allocate.openapi.model.WorkerRegistrationResponse;
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
     * Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerWorkerTest() throws ApiException {
        Person person = null;
        WorkerRegistrationResponse response = api.registerWorker(person);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Submit an leave (vacation) claim for a worker
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitAnnualLeaveClaimTest() throws ApiException {
        String id = null;
        LeaveClaim leaveClaim = null;
        AsyncResponse response = api.submitAnnualLeaveClaim(id, leaveClaim);

        // TODO: test validations
    }
    
}