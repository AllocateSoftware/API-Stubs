/*
 * Duties and Events
 * ## Duties and Events 
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
import com.allocate.openapi.model.DutyCostDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookingsApi
 */
@Ignore
public class BookingsApiTest {

    private final BookingsApi api = new BookingsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendDutyCostingTest() throws ApiException {
        String id = null;
        DutyCostDetails dutyCostDetails = null;
        api.sendDutyCosting(id, dutyCostDetails);

        // TODO: test validations
    }
    
}
