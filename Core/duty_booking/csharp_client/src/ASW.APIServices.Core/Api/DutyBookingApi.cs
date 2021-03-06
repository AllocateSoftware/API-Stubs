/* 
 * Duty Booking API and Events
 *
 * ## Duty Booking API and events and Events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace ASW.APIServices.Core.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDutyBookingApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Cancel the proposal (and the booking, if it has been accepted)
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <returns></returns>
        void CancelProposal (string id);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Cancel the proposal (and the booking, if it has been accepted)
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> CancelProposalWithHttpInfo (string id);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Offer a worker for filling a duty
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>string</returns>
        string CreateProposal (string vacancyId, ProposalDetails proposalDetails);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Offer a worker for filling a duty
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>ApiResponse of string</returns>
        ApiResponse<string> CreateProposalWithHttpInfo (string vacancyId, ProposalDetails proposalDetails);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns></returns>
        void UpdateProposal (string id, ProposalDetails proposalDetails);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> UpdateProposalWithHttpInfo (string id, ProposalDetails proposalDetails);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Cancel the proposal (and the booking, if it has been accepted)
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task CancelProposalAsync (string id);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Cancel the proposal (and the booking, if it has been accepted)
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> CancelProposalAsyncWithHttpInfo (string id);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Offer a worker for filling a duty
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>Task of string</returns>
        System.Threading.Tasks.Task<string> CreateProposalAsync (string vacancyId, ProposalDetails proposalDetails);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Offer a worker for filling a duty
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>Task of ApiResponse (string)</returns>
        System.Threading.Tasks.Task<ApiResponse<string>> CreateProposalAsyncWithHttpInfo (string vacancyId, ProposalDetails proposalDetails);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task UpdateProposalAsync (string id, ProposalDetails proposalDetails);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> UpdateProposalAsyncWithHttpInfo (string id, ProposalDetails proposalDetails);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DutyBookingApi : IDutyBookingApi
    {
        private ASW.APIServices.Core.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="DutyBookingApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DutyBookingApi(String basePath)
        {
            this.Configuration = new ASW.APIServices.Core.Client.Configuration { BasePath = basePath };

            ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DutyBookingApi"/> class
        /// </summary>
        /// <returns></returns>
        public DutyBookingApi()
        {
            this.Configuration = ASW.APIServices.Core.Client.Configuration.Default;

            ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DutyBookingApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DutyBookingApi(ASW.APIServices.Core.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = ASW.APIServices.Core.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public ASW.APIServices.Core.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public ASW.APIServices.Core.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        ///  Cancel the proposal (and the booking, if it has been accepted)
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <returns></returns>
        public void CancelProposal (string id)
        {
             CancelProposalWithHttpInfo(id);
        }

        /// <summary>
        ///  Cancel the proposal (and the booking, if it has been accepted)
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> CancelProposalWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DutyBookingApi->CancelProposal");

            var localVarPath = "/proposals/{id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CancelProposal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Cancel the proposal (and the booking, if it has been accepted)
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task CancelProposalAsync (string id)
        {
             await CancelProposalAsyncWithHttpInfo(id);

        }

        /// <summary>
        ///  Cancel the proposal (and the booking, if it has been accepted)
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> CancelProposalAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DutyBookingApi->CancelProposal");

            var localVarPath = "/proposals/{id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CancelProposal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  Offer a worker for filling a duty
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>string</returns>
        public string CreateProposal (string vacancyId, ProposalDetails proposalDetails)
        {
             ApiResponse<string> localVarResponse = CreateProposalWithHttpInfo(vacancyId, proposalDetails);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Offer a worker for filling a duty
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>ApiResponse of string</returns>
        public ApiResponse<string> CreateProposalWithHttpInfo (string vacancyId, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'vacancyId' is set
            if (vacancyId == null)
                throw new ApiException(400, "Missing required parameter 'vacancyId' when calling DutyBookingApi->CreateProposal");
            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ApiException(400, "Missing required parameter 'proposalDetails' when calling DutyBookingApi->CreateProposal");

            var localVarPath = "/vacancy/{vacancyId}/proposals";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "text/plain",
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vacancyId != null) localVarPathParams.Add("vacancyId", this.Configuration.ApiClient.ParameterToString(vacancyId)); // path parameter
            if (proposalDetails != null && proposalDetails.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(proposalDetails); // http body (model) parameter
            }
            else
            {
                localVarPostBody = proposalDetails; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateProposal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<string>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (string) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(string)));
        }

        /// <summary>
        ///  Offer a worker for filling a duty
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>Task of string</returns>
        public async System.Threading.Tasks.Task<string> CreateProposalAsync (string vacancyId, ProposalDetails proposalDetails)
        {
             ApiResponse<string> localVarResponse = await CreateProposalAsyncWithHttpInfo(vacancyId, proposalDetails);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Offer a worker for filling a duty
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>Task of ApiResponse (string)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<string>> CreateProposalAsyncWithHttpInfo (string vacancyId, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'vacancyId' is set
            if (vacancyId == null)
                throw new ApiException(400, "Missing required parameter 'vacancyId' when calling DutyBookingApi->CreateProposal");
            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ApiException(400, "Missing required parameter 'proposalDetails' when calling DutyBookingApi->CreateProposal");

            var localVarPath = "/vacancy/{vacancyId}/proposals";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "text/plain",
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (vacancyId != null) localVarPathParams.Add("vacancyId", this.Configuration.ApiClient.ParameterToString(vacancyId)); // path parameter
            if (proposalDetails != null && proposalDetails.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(proposalDetails); // http body (model) parameter
            }
            else
            {
                localVarPostBody = proposalDetails; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateProposal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<string>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (string) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(string)));
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns></returns>
        public void UpdateProposal (string id, ProposalDetails proposalDetails)
        {
             UpdateProposalWithHttpInfo(id, proposalDetails);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> UpdateProposalWithHttpInfo (string id, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DutyBookingApi->UpdateProposal");
            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ApiException(400, "Missing required parameter 'proposalDetails' when calling DutyBookingApi->UpdateProposal");

            var localVarPath = "/proposals/{id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (proposalDetails != null && proposalDetails.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(proposalDetails); // http body (model) parameter
            }
            else
            {
                localVarPostBody = proposalDetails; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateProposal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task UpdateProposalAsync (string id, ProposalDetails proposalDetails)
        {
             await UpdateProposalAsyncWithHttpInfo(id, proposalDetails);

        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the proposal</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> UpdateProposalAsyncWithHttpInfo (string id, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling DutyBookingApi->UpdateProposal");
            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ApiException(400, "Missing required parameter 'proposalDetails' when calling DutyBookingApi->UpdateProposal");

            var localVarPath = "/proposals/{id}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (id != null) localVarPathParams.Add("id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter
            if (proposalDetails != null && proposalDetails.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(proposalDetails); // http body (model) parameter
            }
            else
            {
                localVarPostBody = proposalDetails; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateProposal", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
