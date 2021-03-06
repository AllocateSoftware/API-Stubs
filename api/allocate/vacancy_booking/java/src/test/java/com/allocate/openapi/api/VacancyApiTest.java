/*
 * Vacancy Booking API and Events
 *      ## Duty Booking API and events and Events 
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
import com.allocate.openapi.model.CreateProposalResponse;
import com.allocate.openapi.model.CreateVacancyResponse;
import com.allocate.openapi.model.ErrorResponse;
import com.allocate.openapi.model.InlineObject;
import com.allocate.openapi.model.ProposalDetails;
import com.allocate.openapi.model.Vacancy;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VacancyApi
 */
@Ignore
public class VacancyApiTest {

    private final VacancyApi api = new VacancyApi();

    
    /**
     * 
     *
     * Offer a worker for filling a duty
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProposalTest() throws ApiException {
        String vacancyId = null;
        ProposalDetails proposalDetails = null;
        CreateProposalResponse response = api.createProposal(vacancyId, proposalDetails);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new vacancy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVacancyTest() throws ApiException {
        Vacancy vacancy = null;
        CreateVacancyResponse response = api.createVacancy(vacancy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Send timesheet information for a completed activity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitTimesheetTest() throws ApiException {
        String vacancyId = null;
        InlineObject inlineObject = null;
        api.submitTimesheet(vacancyId, inlineObject);

        // TODO: test validations
    }
    
}
