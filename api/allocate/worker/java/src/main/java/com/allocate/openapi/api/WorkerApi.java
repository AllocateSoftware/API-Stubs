/*
 * Worker API and Events
 *      ## API and events for providing workers. 
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
import com.allocate.openapi.model.InlineObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerApi {
    private ApiClient localVarApiClient;

    public WorkerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for onboardWorkerToTrust
     * @param id The Allocate Worker ID (required)
     * @param inlineObject  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The worker has been on-boarded successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> One or more errors have occurred when attempting to process the provided data </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - you do not have the necessary permissions to undertake this action </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The request has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call onboardWorkerToTrustCall(String id, InlineObject inlineObject, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject;

        // create path and map variables
        String localVarPath = "/workers/{id}/onboardToTrust"
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

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call onboardWorkerToTrustValidateBeforeCall(String id, InlineObject inlineObject, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling onboardWorkerToTrust(Async)");
        }
        
        // verify the required parameter 'inlineObject' is set
        if (inlineObject == null) {
            throw new ApiException("Missing the required parameter 'inlineObject' when calling onboardWorkerToTrust(Async)");
        }
        

        okhttp3.Call localVarCall = onboardWorkerToTrustCall(id, inlineObject, _callback);
        return localVarCall;

    }

    /**
     * 
     * On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to &#39;on-board&#39; that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.  
     * @param id The Allocate Worker ID (required)
     * @param inlineObject  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The worker has been on-boarded successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> One or more errors have occurred when attempting to process the provided data </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - you do not have the necessary permissions to undertake this action </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The request has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public void onboardWorkerToTrust(String id, InlineObject inlineObject) throws ApiException {
        onboardWorkerToTrustWithHttpInfo(id, inlineObject);
    }

    /**
     * 
     * On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to &#39;on-board&#39; that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.  
     * @param id The Allocate Worker ID (required)
     * @param inlineObject  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The worker has been on-boarded successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> One or more errors have occurred when attempting to process the provided data </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - you do not have the necessary permissions to undertake this action </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The request has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> onboardWorkerToTrustWithHttpInfo(String id, InlineObject inlineObject) throws ApiException {
        okhttp3.Call localVarCall = onboardWorkerToTrustValidateBeforeCall(id, inlineObject, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to &#39;on-board&#39; that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.  
     * @param id The Allocate Worker ID (required)
     * @param inlineObject  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The worker has been on-boarded successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> One or more errors have occurred when attempting to process the provided data </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - you do not have the necessary permissions to undertake this action </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The request has been accepted, and will be processed in due course. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call onboardWorkerToTrustAsync(String id, InlineObject inlineObject, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = onboardWorkerToTrustValidateBeforeCall(id, inlineObject, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
