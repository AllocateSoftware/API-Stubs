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
import com.allocate.openapi.model.DutyCostDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingsApi {
    private ApiClient localVarApiClient;

    public BookingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BookingsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for sendDutyCosting
     * @param id ID of the duty (required)
     * @param dutyCostDetails Costing Information (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty costing successfully </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The duty costing has been accepted and a response will be returned asyncronously. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendDutyCostingCall(String id, DutyCostDetails dutyCostDetails, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = dutyCostDetails;

        // create path and map variables
        String localVarPath = "/duties/{id}/costing"
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
    private okhttp3.Call sendDutyCostingValidateBeforeCall(String id, DutyCostDetails dutyCostDetails, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling sendDutyCosting(Async)");
        }
        
        // verify the required parameter 'dutyCostDetails' is set
        if (dutyCostDetails == null) {
            throw new ApiException("Missing the required parameter 'dutyCostDetails' when calling sendDutyCosting(Async)");
        }
        

        okhttp3.Call localVarCall = sendDutyCostingCall(id, dutyCostDetails, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param id ID of the duty (required)
     * @param dutyCostDetails Costing Information (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty costing successfully </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The duty costing has been accepted and a response will be returned asyncronously. </td><td>  -  </td></tr>
     </table>
     */
    public void sendDutyCosting(String id, DutyCostDetails dutyCostDetails) throws ApiException {
        sendDutyCostingWithHttpInfo(id, dutyCostDetails);
    }

    /**
     * 
     * 
     * @param id ID of the duty (required)
     * @param dutyCostDetails Costing Information (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty costing successfully </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The duty costing has been accepted and a response will be returned asyncronously. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> sendDutyCostingWithHttpInfo(String id, DutyCostDetails dutyCostDetails) throws ApiException {
        okhttp3.Call localVarCall = sendDutyCostingValidateBeforeCall(id, dutyCostDetails, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param id ID of the duty (required)
     * @param dutyCostDetails Costing Information (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Duty costing successfully </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The duty costing has been accepted and a response will be returned asyncronously. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendDutyCostingAsync(String id, DutyCostDetails dutyCostDetails, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendDutyCostingValidateBeforeCall(id, dutyCostDetails, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
