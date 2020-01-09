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
import com.allocate.openapi.model.ReferenceDataResponse;
import com.allocate.openapi.model.UnitReferenceDataResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReferenceDataApi
 */
@Ignore
public class ReferenceDataApiTest {

    private final ReferenceDataApi api = new ReferenceDataApi();

    
    /**
     * Get agencies
     *
     * Returns an array of agencies
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgenciesByIdsTest() throws ApiException {
        String version = null;
        String trustCode = null;
        List<Integer> id = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getAgenciesByIds(version, trustCode, id, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get all agencies
     *
     * Returns an array of agencies
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAgenciesTest() throws ApiException {
        String version = null;
        String trustCode = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getAllAgencies(version, trustCode, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get all contract statuses
     *
     * Returns an array of contract statuses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllContractStatusesTest() throws ApiException {
        String version = null;
        String trustCode = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getAllContractStatuses(version, trustCode, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get all grades
     *
     * Returns an array of grades
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllGradesTest() throws ApiException {
        String version = null;
        String trustCode = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getAllGrades(version, trustCode, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get all reasons for vacancy
     *
     * Returns an array of reasons for vacancy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllReasonsForVacancyTest() throws ApiException {
        String version = null;
        String trustCode = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getAllReasonsForVacancy(version, trustCode, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get all staff groups
     *
     * Returns an array of staff groups
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStaffGroupsTest() throws ApiException {
        String version = null;
        String trustCode = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getAllStaffGroups(version, trustCode, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get all units
     *
     * Returns an array of units
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllUnitsTest() throws ApiException {
        String version = null;
        String trustCode = null;
        Integer page = null;
        Integer pageSize = null;
        List<UnitReferenceDataResponse> response = api.getAllUnits(version, trustCode, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get contract statuses
     *
     * Returns an array of contract statuses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContractStatusesByIdsTest() throws ApiException {
        String version = null;
        String trustCode = null;
        List<String> id = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getContractStatusesByIds(version, trustCode, id, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get grades
     *
     * Returns an array of grades
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGradesByIdsTest() throws ApiException {
        String version = null;
        String trustCode = null;
        List<Integer> id = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getGradesByIds(version, trustCode, id, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get reasons for vacancy
     *
     * Returns an array of reasons for vacancy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReasonsForVacancyByIdsTest() throws ApiException {
        String version = null;
        String trustCode = null;
        List<Integer> id = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getReasonsForVacancyByIds(version, trustCode, id, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get staff groups
     *
     * Returns an array of staff groups
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStaffGroupsByIdsTest() throws ApiException {
        String version = null;
        String trustCode = null;
        List<Integer> id = null;
        Integer page = null;
        Integer pageSize = null;
        List<ReferenceDataResponse> response = api.getStaffGroupsByIds(version, trustCode, id, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get units
     *
     * Returns an array of units
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnitsByIdsTest() throws ApiException {
        String version = null;
        String trustCode = null;
        List<Integer> id = null;
        Integer page = null;
        Integer pageSize = null;
        List<UnitReferenceDataResponse> response = api.getUnitsByIds(version, trustCode, id, page, pageSize);

        // TODO: test validations
    }
    
}
