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
import com.allocate.vms.api.model.AgencyCostings;
import com.allocate.vms.api.model.Duty;
import com.allocate.vms.api.model.DutyRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgenciesApi
 */
@Ignore
public class AgenciesApiTest {

    private final AgenciesApi api = new AgenciesApi();

    
    /**
     * 
     *
     * Returns a list of agencies and their costs for the supplied duty.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCostingsTest() throws ApiException {
        Duty duty = null;
        AgencyCostings response = api.getCostings(duty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendDutyToAgenciesTest() throws ApiException {
        DutyRequest dutyRequest = null;
        String response = api.sendDutyToAgencies(dutyRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendDutyToAgencyTest() throws ApiException {
        String agencyId = null;
        DutyRequest dutyRequest = null;
        String response = api.sendDutyToAgency(agencyId, dutyRequest);

        // TODO: test validations
    }
    
}