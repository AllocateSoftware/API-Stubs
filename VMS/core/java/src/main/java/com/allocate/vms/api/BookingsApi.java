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


import com.allocate.vms.api.model.DutyRequest;

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
     * Build call for acceptAgencyOffer
     * @param bookingRequestId ID of the booking request to accept. (required)
     * @param offerId ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Booking request confirmed by VMS. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking request exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceptAgencyOfferCall(String bookingRequestId, String offerId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bookingRequests/{bookingRequestId}/offers/{offerId}/accept"
            .replaceAll("\\{" + "bookingRequestId" + "\\}", localVarApiClient.escapeString(bookingRequestId.toString()))
            .replaceAll("\\{" + "offerId" + "\\}", localVarApiClient.escapeString(offerId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call acceptAgencyOfferValidateBeforeCall(String bookingRequestId, String offerId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'bookingRequestId' is set
        if (bookingRequestId == null) {
            throw new ApiException("Missing the required parameter 'bookingRequestId' when calling acceptAgencyOffer(Async)");
        }
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new ApiException("Missing the required parameter 'offerId' when calling acceptAgencyOffer(Async)");
        }
        

        okhttp3.Call localVarCall = acceptAgencyOfferCall(bookingRequestId, offerId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Accept an agency offer for a worker.
     * @param bookingRequestId ID of the booking request to accept. (required)
     * @param offerId ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Booking request confirmed by VMS. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking request exists </td><td>  -  </td></tr>
     </table>
     */
    public String acceptAgencyOffer(String bookingRequestId, String offerId) throws ApiException {
        ApiResponse<String> localVarResp = acceptAgencyOfferWithHttpInfo(bookingRequestId, offerId);
        return localVarResp.getData();
    }

    /**
     * 
     * Accept an agency offer for a worker.
     * @param bookingRequestId ID of the booking request to accept. (required)
     * @param offerId ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Booking request confirmed by VMS. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking request exists </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> acceptAgencyOfferWithHttpInfo(String bookingRequestId, String offerId) throws ApiException {
        okhttp3.Call localVarCall = acceptAgencyOfferValidateBeforeCall(bookingRequestId, offerId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Accept an agency offer for a worker.
     * @param bookingRequestId ID of the booking request to accept. (required)
     * @param offerId ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Booking request confirmed by VMS. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking request exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceptAgencyOfferAsync(String bookingRequestId, String offerId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = acceptAgencyOfferValidateBeforeCall(bookingRequestId, offerId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cancelBooking
     * @param bookingId ID of the booking to cancel. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted booking </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelBookingCall(String bookingId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bookings/{bookingId}"
            .replaceAll("\\{" + "bookingId" + "\\}", localVarApiClient.escapeString(bookingId.toString()));

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelBookingValidateBeforeCall(String bookingId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'bookingId' is set
        if (bookingId == null) {
            throw new ApiException("Missing the required parameter 'bookingId' when calling cancelBooking(Async)");
        }
        

        okhttp3.Call localVarCall = cancelBookingCall(bookingId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Cancel a duty booking previously accepted. This does not cancel any outstanding booking requests or duty cascades.
     * @param bookingId ID of the booking to cancel. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted booking </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking exists </td><td>  -  </td></tr>
     </table>
     */
    public void cancelBooking(String bookingId) throws ApiException {
        cancelBookingWithHttpInfo(bookingId);
    }

    /**
     * 
     * Cancel a duty booking previously accepted. This does not cancel any outstanding booking requests or duty cascades.
     * @param bookingId ID of the booking to cancel. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted booking </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking exists </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> cancelBookingWithHttpInfo(String bookingId) throws ApiException {
        okhttp3.Call localVarCall = cancelBookingValidateBeforeCall(bookingId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Cancel a duty booking previously accepted. This does not cancel any outstanding booking requests or duty cascades.
     * @param bookingId ID of the booking to cancel. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted booking </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelBookingAsync(String bookingId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelBookingValidateBeforeCall(bookingId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for cancelBookingRequest
     * @param bookingRequestId ID of the booking request to cancel. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted booking request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking request exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelBookingRequestCall(String bookingRequestId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bookingRequests/{bookingRequestId}"
            .replaceAll("\\{" + "bookingRequestId" + "\\}", localVarApiClient.escapeString(bookingRequestId.toString()));

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelBookingRequestValidateBeforeCall(String bookingRequestId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'bookingRequestId' is set
        if (bookingRequestId == null) {
            throw new ApiException("Missing the required parameter 'bookingRequestId' when calling cancelBookingRequest(Async)");
        }
        

        okhttp3.Call localVarCall = cancelBookingRequestCall(bookingRequestId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Cancel a previously requested booking. If the booking request has resulted in actual bookings, these will also be cancelled.
     * @param bookingRequestId ID of the booking request to cancel. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted booking request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking request exists </td><td>  -  </td></tr>
     </table>
     */
    public void cancelBookingRequest(String bookingRequestId) throws ApiException {
        cancelBookingRequestWithHttpInfo(bookingRequestId);
    }

    /**
     * 
     * Cancel a previously requested booking. If the booking request has resulted in actual bookings, these will also be cancelled.
     * @param bookingRequestId ID of the booking request to cancel. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted booking request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking request exists </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> cancelBookingRequestWithHttpInfo(String bookingRequestId) throws ApiException {
        okhttp3.Call localVarCall = cancelBookingRequestValidateBeforeCall(bookingRequestId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Cancel a previously requested booking. If the booking request has resulted in actual bookings, these will also be cancelled.
     * @param bookingRequestId ID of the booking request to cancel. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted booking request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking request exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelBookingRequestAsync(String bookingRequestId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelBookingRequestValidateBeforeCall(bookingRequestId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBooking
     * @param bookingId ID of the duty booking (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBookingCall(String bookingId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bookings/{bookingId}"
            .replaceAll("\\{" + "bookingId" + "\\}", localVarApiClient.escapeString(bookingId.toString()));

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBookingValidateBeforeCall(String bookingId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'bookingId' is set
        if (bookingId == null) {
            throw new ApiException("Missing the required parameter 'bookingId' when calling getBooking(Async)");
        }
        

        okhttp3.Call localVarCall = getBookingCall(bookingId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Query a duty booking by id
     * @param bookingId ID of the duty booking (required)
     * @return DutyRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking exists </td><td>  -  </td></tr>
     </table>
     */
    public DutyRequest getBooking(String bookingId) throws ApiException {
        ApiResponse<DutyRequest> localVarResp = getBookingWithHttpInfo(bookingId);
        return localVarResp.getData();
    }

    /**
     * 
     * Query a duty booking by id
     * @param bookingId ID of the duty booking (required)
     * @return ApiResponse&lt;DutyRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking exists </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DutyRequest> getBookingWithHttpInfo(String bookingId) throws ApiException {
        okhttp3.Call localVarCall = getBookingValidateBeforeCall(bookingId, null);
        Type localVarReturnType = new TypeToken<DutyRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Query a duty booking by id
     * @param bookingId ID of the duty booking (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Request OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid input parameter </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such booking exists </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBookingAsync(String bookingId, final ApiCallback<DutyRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBookingValidateBeforeCall(bookingId, _callback);
        Type localVarReturnType = new TypeToken<DutyRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
