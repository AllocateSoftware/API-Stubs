/*
 * DE Provider Direct Engagement API
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.api;

import com.allocate.openapi.ApiException;
import com.allocate.openapi.model.Duty;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventApi
 */
@Ignore
public class EventApiTest {

    private final EventApi api = new EventApi();

    
    /**
     * Get all events older than input timestamp
     *
     * Returns an array of events
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsTest() throws ApiException {
        String version = null;
        String trustCode = null;
        OffsetDateTime dateTimeFrom = null;
        Integer page = null;
        Integer pageSize = null;
        Duty response = api.getEvents(version, trustCode, dateTimeFrom, page, pageSize);

        // TODO: test validations
    }
    
}
