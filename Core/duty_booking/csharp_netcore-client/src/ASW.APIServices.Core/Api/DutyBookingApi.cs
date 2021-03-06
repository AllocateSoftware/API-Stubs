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
using System.Net;
using System.Net.Mime;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace ASW.APIServices.Core.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDutyBookingApiSync : IApiAccessor
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
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDutyBookingApiAsync : IApiAccessor
    {
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
    public interface IDutyBookingApi : IDutyBookingApiSync, IDutyBookingApiAsync
    {

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
        public DutyBookingApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DutyBookingApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DutyBookingApi(String basePath)
        {
            this.Configuration = ASW.APIServices.Core.Client.Configuration.MergeConfigurations(
                ASW.APIServices.Core.Client.GlobalConfiguration.Instance,
                new ASW.APIServices.Core.Client.Configuration { BasePath = basePath }
            );
            this.Client = new ASW.APIServices.Core.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new ASW.APIServices.Core.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DutyBookingApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DutyBookingApi(ASW.APIServices.Core.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = ASW.APIServices.Core.Client.Configuration.MergeConfigurations(
                ASW.APIServices.Core.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new ASW.APIServices.Core.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new ASW.APIServices.Core.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DutyBookingApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public DutyBookingApi(ASW.APIServices.Core.Client.ISynchronousClient client,ASW.APIServices.Core.Client.IAsynchronousClient asyncClient, ASW.APIServices.Core.Client.IReadableConfiguration configuration)
        {
            if(client == null) throw new ArgumentNullException("client");
            if(asyncClient == null) throw new ArgumentNullException("asyncClient");
            if(configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public ASW.APIServices.Core.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public ASW.APIServices.Core.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public ASW.APIServices.Core.Client.IReadableConfiguration Configuration {get; set;}

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
        public ASW.APIServices.Core.Client.ApiResponse<Object> CancelProposalWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'id' when calling DutyBookingApi->CancelProposal");

            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "application/json"
            };

            var localVarContentType = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(id)); // path parameter


            // make the HTTP request
            var localVarResponse = this.Client.Delete<Object>("/proposals/{id}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CancelProposal", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
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
        public async System.Threading.Tasks.Task<ASW.APIServices.Core.Client.ApiResponse<Object>> CancelProposalAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'id' when calling DutyBookingApi->CancelProposal");


            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "application/json"
            };
            
            foreach (var _contentType in _contentTypes)
                localVarRequestOptions.HeaderParameters.Add("Content-Type", _contentType);
            
            foreach (var _accept in _accepts)
                localVarRequestOptions.HeaderParameters.Add("Accept", _accept);
            
            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(id)); // path parameter


            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.DeleteAsync<Object>("/proposals/{id}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CancelProposal", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
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
             ASW.APIServices.Core.Client.ApiResponse<string> localVarResponse = CreateProposalWithHttpInfo(vacancyId, proposalDetails);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Offer a worker for filling a duty
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>ApiResponse of string</returns>
        public ASW.APIServices.Core.Client.ApiResponse< string > CreateProposalWithHttpInfo (string vacancyId, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'vacancyId' is set
            if (vacancyId == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'vacancyId' when calling DutyBookingApi->CreateProposal");

            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'proposalDetails' when calling DutyBookingApi->CreateProposal");

            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "text/plain",
                "application/json"
            };

            var localVarContentType = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vacancyId != null)
                localVarRequestOptions.PathParameters.Add("vacancyId", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(vacancyId)); // path parameter
            localVarRequestOptions.Data = proposalDetails;


            // make the HTTP request
            var localVarResponse = this.Client.Post< string >("/vacancy/{vacancyId}/proposals", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateProposal", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
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
             ASW.APIServices.Core.Client.ApiResponse<string> localVarResponse = await CreateProposalAsyncWithHttpInfo(vacancyId, proposalDetails);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Offer a worker for filling a duty
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <returns>Task of ApiResponse (string)</returns>
        public async System.Threading.Tasks.Task<ASW.APIServices.Core.Client.ApiResponse<string>> CreateProposalAsyncWithHttpInfo (string vacancyId, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'vacancyId' is set
            if (vacancyId == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'vacancyId' when calling DutyBookingApi->CreateProposal");

            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'proposalDetails' when calling DutyBookingApi->CreateProposal");


            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "text/plain",
                "application/json"
            };
            
            foreach (var _contentType in _contentTypes)
                localVarRequestOptions.HeaderParameters.Add("Content-Type", _contentType);
            
            foreach (var _accept in _accepts)
                localVarRequestOptions.HeaderParameters.Add("Accept", _accept);
            
            if (vacancyId != null)
                localVarRequestOptions.PathParameters.Add("vacancyId", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(vacancyId)); // path parameter
            localVarRequestOptions.Data = proposalDetails;


            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.PostAsync<string>("/vacancy/{vacancyId}/proposals", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateProposal", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
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
        public ASW.APIServices.Core.Client.ApiResponse<Object> UpdateProposalWithHttpInfo (string id, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'id' when calling DutyBookingApi->UpdateProposal");

            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'proposalDetails' when calling DutyBookingApi->UpdateProposal");

            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "application/json"
            };

            var localVarContentType = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = proposalDetails;


            // make the HTTP request
            var localVarResponse = this.Client.Put<Object>("/proposals/{id}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("UpdateProposal", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
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
        public async System.Threading.Tasks.Task<ASW.APIServices.Core.Client.ApiResponse<Object>> UpdateProposalAsyncWithHttpInfo (string id, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'id' when calling DutyBookingApi->UpdateProposal");

            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'proposalDetails' when calling DutyBookingApi->UpdateProposal");


            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "application/json"
            };
            
            foreach (var _contentType in _contentTypes)
                localVarRequestOptions.HeaderParameters.Add("Content-Type", _contentType);
            
            foreach (var _accept in _accepts)
                localVarRequestOptions.HeaderParameters.Add("Accept", _accept);
            
            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = proposalDetails;


            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.PutAsync<Object>("/proposals/{id}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("UpdateProposal", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
