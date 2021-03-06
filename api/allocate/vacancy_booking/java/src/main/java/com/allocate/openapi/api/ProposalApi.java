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
import com.allocate.openapi.model.ProposalDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProposalApi {
    private ApiClient localVarApiClient;

    public ProposalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProposalApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for acceptProposal
     * @param id The ID of the proposal (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Proposal successfully accepted </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceptProposalCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/proposals/{id}/accept"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call acceptProposalValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling acceptProposal(Async)");
        }
        

        okhttp3.Call localVarCall = acceptProposalCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Accept the proposal (possibly on behalf of the trust). Note that it is not neccessary to call this API in the case of direct-book scenarios as it will be assumed as a part of the workflow.
     * @param id The ID of the proposal (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Proposal successfully accepted </td><td>  -  </td></tr>
     </table>
     */
    public void acceptProposal(String id) throws ApiException {
        acceptProposalWithHttpInfo(id);
    }

    /**
     * 
     * Accept the proposal (possibly on behalf of the trust). Note that it is not neccessary to call this API in the case of direct-book scenarios as it will be assumed as a part of the workflow.
     * @param id The ID of the proposal (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Proposal successfully accepted </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> acceptProposalWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = acceptProposalValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Accept the proposal (possibly on behalf of the trust). Note that it is not neccessary to call this API in the case of direct-book scenarios as it will be assumed as a part of the workflow.
     * @param id The ID of the proposal (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Proposal successfully accepted </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceptProposalAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = acceptProposalValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for cancelProposal
     * @param id The ID of the proposal (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Cancelled successfully </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The request was accepted and will be processed asynchronously </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelProposalCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/proposals/{id}"
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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelProposalValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling cancelProposal(Async)");
        }
        

        okhttp3.Call localVarCall = cancelProposalCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Cancel the proposal (and the booking, if it has been accepted)
     * @param id The ID of the proposal (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Cancelled successfully </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The request was accepted and will be processed asynchronously </td><td>  -  </td></tr>
     </table>
     */
    public void cancelProposal(String id) throws ApiException {
        cancelProposalWithHttpInfo(id);
    }

    /**
     * 
     * Cancel the proposal (and the booking, if it has been accepted)
     * @param id The ID of the proposal (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Cancelled successfully </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The request was accepted and will be processed asynchronously </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> cancelProposalWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = cancelProposalValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Cancel the proposal (and the booking, if it has been accepted)
     * @param id The ID of the proposal (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Cancelled successfully </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> The request was accepted and will be processed asynchronously </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelProposalAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelProposalValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProposal
     * @param id The ID of the proposal (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Proposal successfully found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProposalCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/proposals/{id}"
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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProposalValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProposal(Async)");
        }
        

        okhttp3.Call localVarCall = getProposalCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param id The ID of the proposal (required)
     * @return ProposalDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Proposal successfully found </td><td>  -  </td></tr>
     </table>
     */
    public ProposalDetails getProposal(String id) throws ApiException {
        ApiResponse<ProposalDetails> localVarResp = getProposalWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param id The ID of the proposal (required)
     * @return ApiResponse&lt;ProposalDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Proposal successfully found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProposalDetails> getProposalWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getProposalValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ProposalDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param id The ID of the proposal (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Proposal successfully found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProposalAsync(String id, final ApiCallback<ProposalDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProposalValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ProposalDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProposal
     * @param id The ID of the proposal (required)
     * @param proposalDetails Details of the proposal for filling the duty (worker) (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> The Proposal successfully updated </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProposalCall(String id, ProposalDetails proposalDetails, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = proposalDetails;

        // create path and map variables
        String localVarPath = "/proposals/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
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
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateProposalValidateBeforeCall(String id, ProposalDetails proposalDetails, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateProposal(Async)");
        }
        
        // verify the required parameter 'proposalDetails' is set
        if (proposalDetails == null) {
            throw new ApiException("Missing the required parameter 'proposalDetails' when calling updateProposal(Async)");
        }
        

        okhttp3.Call localVarCall = updateProposalCall(id, proposalDetails, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param id The ID of the proposal (required)
     * @param proposalDetails Details of the proposal for filling the duty (worker) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> The Proposal successfully updated </td><td>  -  </td></tr>
     </table>
     */
    public void updateProposal(String id, ProposalDetails proposalDetails) throws ApiException {
        updateProposalWithHttpInfo(id, proposalDetails);
    }

    /**
     * 
     * 
     * @param id The ID of the proposal (required)
     * @param proposalDetails Details of the proposal for filling the duty (worker) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> The Proposal successfully updated </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateProposalWithHttpInfo(String id, ProposalDetails proposalDetails) throws ApiException {
        okhttp3.Call localVarCall = updateProposalValidateBeforeCall(id, proposalDetails, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param id The ID of the proposal (required)
     * @param proposalDetails Details of the proposal for filling the duty (worker) (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 404 </td><td> The proposal was not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> The Proposal successfully updated </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProposalAsync(String id, ProposalDetails proposalDetails, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProposalValidateBeforeCall(id, proposalDetails, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
