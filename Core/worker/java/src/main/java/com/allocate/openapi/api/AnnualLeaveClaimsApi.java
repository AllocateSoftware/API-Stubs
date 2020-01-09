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

import com.allocate.openapi.ApiCallback;
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.ApiResponse;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.Pair;
import com.allocate.openapi.ProgressRequestBody;
import com.allocate.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.allocate.openapi.model.AsyncResponse;
import com.allocate.openapi.model.LeaveClaim;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnualLeaveClaimsApi {
    private ApiClient localVarApiClient;

    public AnnualLeaveClaimsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnnualLeaveClaimsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for submitAnnualLeaveClaim
     * @param id ID of the worker (required)
     * @param leaveClaim Leave claim for a worker (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> The worker data has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitAnnualLeaveClaimCall(String id, LeaveClaim leaveClaim, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = leaveClaim;

        // create path and map variables
        String localVarPath = "/worker/{id}/leave"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call submitAnnualLeaveClaimValidateBeforeCall(String id, LeaveClaim leaveClaim, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling submitAnnualLeaveClaim(Async)");
        }
        
        // verify the required parameter 'leaveClaim' is set
        if (leaveClaim == null) {
            throw new ApiException("Missing the required parameter 'leaveClaim' when calling submitAnnualLeaveClaim(Async)");
        }
        

        okhttp3.Call localVarCall = submitAnnualLeaveClaimCall(id, leaveClaim, _callback);
        return localVarCall;

    }

    /**
     * 
     * Submit an leave (vacation) claim for a worker
     * @param id ID of the worker (required)
     * @param leaveClaim Leave claim for a worker (required)
     * @return AsyncResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> The worker data has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public AsyncResponse submitAnnualLeaveClaim(String id, LeaveClaim leaveClaim) throws ApiException {
        ApiResponse<AsyncResponse> localVarResp = submitAnnualLeaveClaimWithHttpInfo(id, leaveClaim);
        return localVarResp.getData();
    }

    /**
     * 
     * Submit an leave (vacation) claim for a worker
     * @param id ID of the worker (required)
     * @param leaveClaim Leave claim for a worker (required)
     * @return ApiResponse&lt;AsyncResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> The worker data has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AsyncResponse> submitAnnualLeaveClaimWithHttpInfo(String id, LeaveClaim leaveClaim) throws ApiException {
        okhttp3.Call localVarCall = submitAnnualLeaveClaimValidateBeforeCall(id, leaveClaim, null);
        Type localVarReturnType = new TypeToken<AsyncResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Submit an leave (vacation) claim for a worker
     * @param id ID of the worker (required)
     * @param leaveClaim Leave claim for a worker (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> The worker data has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitAnnualLeaveClaimAsync(String id, LeaveClaim leaveClaim, final ApiCallback<AsyncResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitAnnualLeaveClaimValidateBeforeCall(id, leaveClaim, _callback);
        Type localVarReturnType = new TypeToken<AsyncResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}