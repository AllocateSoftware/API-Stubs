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
import com.allocate.openapi.model.LeaveClaim;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnnualLeaveClaimsApi
 */
@Ignore
public class AnnualLeaveClaimsApiTest {

    private final AnnualLeaveClaimsApi api = new AnnualLeaveClaimsApi();

    
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
