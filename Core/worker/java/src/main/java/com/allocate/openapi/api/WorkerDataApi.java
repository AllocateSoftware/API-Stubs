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
import com.allocate.openapi.model.ErrorResponse;
import com.allocate.openapi.model.Person;
import com.allocate.openapi.model.WorkerRegistrationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerDataApi {
    private ApiClient localVarApiClient;

    public WorkerDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkerDataApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for registerWorker
     * @param person Worker information (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The worker has been registered successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> One or more errors have occurred when attempting to process the provided data </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The worker data has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerWorkerCall(Person person, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = person;

        // create path and map variables
        String localVarPath = "/workers";

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
    private okhttp3.Call registerWorkerValidateBeforeCall(Person person, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'person' is set
        if (person == null) {
            throw new ApiException("Missing the required parameter 'person' when calling registerWorker(Async)");
        }
        

        okhttp3.Call localVarCall = registerWorkerCall(person, _callback);
        return localVarCall;

    }

    /**
     * 
     * Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed.
     * @param person Worker information (required)
     * @return WorkerRegistrationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The worker has been registered successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> One or more errors have occurred when attempting to process the provided data </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The worker data has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public WorkerRegistrationResponse registerWorker(Person person) throws ApiException {
        ApiResponse<WorkerRegistrationResponse> localVarResp = registerWorkerWithHttpInfo(person);
        return localVarResp.getData();
    }

    /**
     * 
     * Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed.
     * @param person Worker information (required)
     * @return ApiResponse&lt;WorkerRegistrationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The worker has been registered successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> One or more errors have occurred when attempting to process the provided data </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The worker data has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkerRegistrationResponse> registerWorkerWithHttpInfo(Person person) throws ApiException {
        okhttp3.Call localVarCall = registerWorkerValidateBeforeCall(person, null);
        Type localVarReturnType = new TypeToken<WorkerRegistrationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed.
     * @param person Worker information (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The worker has been registered successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> One or more errors have occurred when attempting to process the provided data </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The worker data has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerWorkerAsync(Person person, final ApiCallback<WorkerRegistrationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = registerWorkerValidateBeforeCall(person, _callback);
        Type localVarReturnType = new TypeToken<WorkerRegistrationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
