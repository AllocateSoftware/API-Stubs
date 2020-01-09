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

import com.allocate.vms.ApiCallback;
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.ApiResponse;
import com.allocate.vms.Configuration;
import com.allocate.vms.Pair;
import com.allocate.vms.ProgressRequestBody;
import com.allocate.vms.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.allocate.vms.api.model.AgencyCostings;
import com.allocate.vms.api.model.Duty;
import com.allocate.vms.api.model.DutyRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgenciesApi {
    private ApiClient localVarApiClient;

    public AgenciesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AgenciesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCostings
     * @param duty Duty to be costed (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCostingsCall(Duty duty, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = duty;

        // create path and map variables
        String localVarPath = "/agencies/costings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCostingsValidateBeforeCall(Duty duty, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'duty' is set
        if (duty == null) {
            throw new ApiException("Missing the required parameter 'duty' when calling getCostings(Async)");
        }
        

        okhttp3.Call localVarCall = getCostingsCall(duty, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a list of agencies and their costs for the supplied duty.
     * @param duty Duty to be costed (required)
     * @return AgencyCostings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public AgencyCostings getCostings(Duty duty) throws ApiException {
        ApiResponse<AgencyCostings> localVarResp = getCostingsWithHttpInfo(duty);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a list of agencies and their costs for the supplied duty.
     * @param duty Duty to be costed (required)
     * @return ApiResponse&lt;AgencyCostings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AgencyCostings> getCostingsWithHttpInfo(Duty duty) throws ApiException {
        okhttp3.Call localVarCall = getCostingsValidateBeforeCall(duty, null);
        Type localVarReturnType = new TypeToken<AgencyCostings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of agencies and their costs for the supplied duty.
     * @param duty Duty to be costed (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCostingsAsync(Duty duty, final ApiCallback<AgencyCostings> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCostingsValidateBeforeCall(duty, _callback);
        Type localVarReturnType = new TypeToken<AgencyCostings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendDutyToAgencies
     * @param dutyRequest Duty to be sent to agency (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty accepted by VMS. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendDutyToAgenciesCall(DutyRequest dutyRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = dutyRequest;

        // create path and map variables
        String localVarPath = "/agencies";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendDutyToAgenciesValidateBeforeCall(DutyRequest dutyRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'dutyRequest' is set
        if (dutyRequest == null) {
            throw new ApiException("Missing the required parameter 'dutyRequest' when calling sendDutyToAgencies(Async)");
        }
        

        okhttp3.Call localVarCall = sendDutyToAgenciesCall(dutyRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.
     * @param dutyRequest Duty to be sent to agency (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty accepted by VMS. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public String sendDutyToAgencies(DutyRequest dutyRequest) throws ApiException {
        ApiResponse<String> localVarResp = sendDutyToAgenciesWithHttpInfo(dutyRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.
     * @param dutyRequest Duty to be sent to agency (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty accepted by VMS. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> sendDutyToAgenciesWithHttpInfo(DutyRequest dutyRequest) throws ApiException {
        okhttp3.Call localVarCall = sendDutyToAgenciesValidateBeforeCall(dutyRequest, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.
     * @param dutyRequest Duty to be sent to agency (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty accepted by VMS. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendDutyToAgenciesAsync(DutyRequest dutyRequest, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendDutyToAgenciesValidateBeforeCall(dutyRequest, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendDutyToAgency
     * @param agencyId ID of the agency to send the request to. (required)
     * @param dutyRequest Duty to be sent to agency (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty accepted by VMS. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendDutyToAgencyCall(String agencyId, DutyRequest dutyRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = dutyRequest;

        // create path and map variables
        String localVarPath = "/agencies/{agencyId}"
            .replaceAll("\\{" + "agencyId" + "\\}", localVarApiClient.escapeString(agencyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendDutyToAgencyValidateBeforeCall(String agencyId, DutyRequest dutyRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'agencyId' is set
        if (agencyId == null) {
            throw new ApiException("Missing the required parameter 'agencyId' when calling sendDutyToAgency(Async)");
        }
        
        // verify the required parameter 'dutyRequest' is set
        if (dutyRequest == null) {
            throw new ApiException("Missing the required parameter 'dutyRequest' when calling sendDutyToAgency(Async)");
        }
        

        okhttp3.Call localVarCall = sendDutyToAgencyCall(agencyId, dutyRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.
     * @param agencyId ID of the agency to send the request to. (required)
     * @param dutyRequest Duty to be sent to agency (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty accepted by VMS. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public String sendDutyToAgency(String agencyId, DutyRequest dutyRequest) throws ApiException {
        ApiResponse<String> localVarResp = sendDutyToAgencyWithHttpInfo(agencyId, dutyRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.
     * @param agencyId ID of the agency to send the request to. (required)
     * @param dutyRequest Duty to be sent to agency (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty accepted by VMS. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> sendDutyToAgencyWithHttpInfo(String agencyId, DutyRequest dutyRequest) throws ApiException {
        okhttp3.Call localVarCall = sendDutyToAgencyValidateBeforeCall(agencyId, dutyRequest, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.
     * @param agencyId ID of the agency to send the request to. (required)
     * @param dutyRequest Duty to be sent to agency (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty accepted by VMS. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Trust not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendDutyToAgencyAsync(String agencyId, DutyRequest dutyRequest, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendDutyToAgencyValidateBeforeCall(agencyId, dutyRequest, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}