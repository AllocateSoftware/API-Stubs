/* 
 * Vacancy Booking API and Events
 *
 *      ## Duty Booking API and events and Events 
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
    public interface IVacancyApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Offer a worker for filling a duty
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the vacancy (worker, costs, etc)</param>
        /// <returns>CreateProposalResponse</returns>
        CreateProposalResponse CreateProposal (string vacancyId, ProposalDetails proposalDetails);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Offer a worker for filling a duty
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the vacancy (worker, costs, etc)</param>
        /// <returns>ApiResponse of CreateProposalResponse</returns>
        ApiResponse<CreateProposalResponse> CreateProposalWithHttpInfo (string vacancyId, ProposalDetails proposalDetails);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Create a new vacancy
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancy">Details of the vacancy</param>
        /// <returns>CreateVacancyResponse</returns>
        CreateVacancyResponse CreateVacancy (Vacancy vacancy);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Create a new vacancy
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancy">Details of the vacancy</param>
        /// <returns>ApiResponse of CreateVacancyResponse</returns>
        ApiResponse<CreateVacancyResponse> CreateVacancyWithHttpInfo (Vacancy vacancy);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Send timesheet information for a completed activity
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="inlineObject"></param>
        /// <returns></returns>
        void SubmitTimesheet (string vacancyId, InlineObject inlineObject);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Send timesheet information for a completed activity
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="inlineObject"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> SubmitTimesheetWithHttpInfo (string vacancyId, InlineObject inlineObject);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IVacancyApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Offer a worker for filling a duty
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the vacancy (worker, costs, etc)</param>
        /// <returns>Task of CreateProposalResponse</returns>
        System.Threading.Tasks.Task<CreateProposalResponse> CreateProposalAsync (string vacancyId, ProposalDetails proposalDetails);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Offer a worker for filling a duty
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the vacancy (worker, costs, etc)</param>
        /// <returns>Task of ApiResponse (CreateProposalResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<CreateProposalResponse>> CreateProposalAsyncWithHttpInfo (string vacancyId, ProposalDetails proposalDetails);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Create a new vacancy
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancy">Details of the vacancy</param>
        /// <returns>Task of CreateVacancyResponse</returns>
        System.Threading.Tasks.Task<CreateVacancyResponse> CreateVacancyAsync (Vacancy vacancy);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Create a new vacancy
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancy">Details of the vacancy</param>
        /// <returns>Task of ApiResponse (CreateVacancyResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<CreateVacancyResponse>> CreateVacancyAsyncWithHttpInfo (Vacancy vacancy);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Send timesheet information for a completed activity
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="inlineObject"></param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task SubmitTimesheetAsync (string vacancyId, InlineObject inlineObject);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Send timesheet information for a completed activity
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="inlineObject"></param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> SubmitTimesheetAsyncWithHttpInfo (string vacancyId, InlineObject inlineObject);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IVacancyApi : IVacancyApiSync, IVacancyApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class VacancyApi : IVacancyApi
    {
        private ASW.APIServices.Core.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="VacancyApi"/> class.
        /// </summary>
        /// <returns></returns>
        public VacancyApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="VacancyApi"/> class.
        /// </summary>
        /// <returns></returns>
        public VacancyApi(String basePath)
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
        /// Initializes a new instance of the <see cref="VacancyApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public VacancyApi(ASW.APIServices.Core.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="VacancyApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public VacancyApi(ASW.APIServices.Core.Client.ISynchronousClient client,ASW.APIServices.Core.Client.IAsynchronousClient asyncClient, ASW.APIServices.Core.Client.IReadableConfiguration configuration)
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
        ///  Offer a worker for filling a duty
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the vacancy (worker, costs, etc)</param>
        /// <returns>CreateProposalResponse</returns>
        public CreateProposalResponse CreateProposal (string vacancyId, ProposalDetails proposalDetails)
        {
             ASW.APIServices.Core.Client.ApiResponse<CreateProposalResponse> localVarResponse = CreateProposalWithHttpInfo(vacancyId, proposalDetails);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Offer a worker for filling a duty
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the vacancy (worker, costs, etc)</param>
        /// <returns>ApiResponse of CreateProposalResponse</returns>
        public ASW.APIServices.Core.Client.ApiResponse< CreateProposalResponse > CreateProposalWithHttpInfo (string vacancyId, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'vacancyId' is set
            if (vacancyId == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'vacancyId' when calling VacancyApi->CreateProposal");

            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'proposalDetails' when calling VacancyApi->CreateProposal");

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

            if (vacancyId != null)
                localVarRequestOptions.PathParameters.Add("vacancyId", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(vacancyId)); // path parameter
            localVarRequestOptions.Data = proposalDetails;

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + ASW.APIServices.Core.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post< CreateProposalResponse >("/vacancies/{vacancyId}/proposals", localVarRequestOptions, this.Configuration);

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
        /// <param name="proposalDetails">Details of the proposal for filling the vacancy (worker, costs, etc)</param>
        /// <returns>Task of CreateProposalResponse</returns>
        public async System.Threading.Tasks.Task<CreateProposalResponse> CreateProposalAsync (string vacancyId, ProposalDetails proposalDetails)
        {
             ASW.APIServices.Core.Client.ApiResponse<CreateProposalResponse> localVarResponse = await CreateProposalAsyncWithHttpInfo(vacancyId, proposalDetails);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Offer a worker for filling a duty
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the vacancy (worker, costs, etc)</param>
        /// <returns>Task of ApiResponse (CreateProposalResponse)</returns>
        public async System.Threading.Tasks.Task<ASW.APIServices.Core.Client.ApiResponse<CreateProposalResponse>> CreateProposalAsyncWithHttpInfo (string vacancyId, ProposalDetails proposalDetails)
        {
            // verify the required parameter 'vacancyId' is set
            if (vacancyId == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'vacancyId' when calling VacancyApi->CreateProposal");

            // verify the required parameter 'proposalDetails' is set
            if (proposalDetails == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'proposalDetails' when calling VacancyApi->CreateProposal");


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
            
            if (vacancyId != null)
                localVarRequestOptions.PathParameters.Add("vacancyId", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(vacancyId)); // path parameter
            localVarRequestOptions.Data = proposalDetails;

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + ASW.APIServices.Core.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.PostAsync<CreateProposalResponse>("/vacancies/{vacancyId}/proposals", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateProposal", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Create a new vacancy
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancy">Details of the vacancy</param>
        /// <returns>CreateVacancyResponse</returns>
        public CreateVacancyResponse CreateVacancy (Vacancy vacancy)
        {
             ASW.APIServices.Core.Client.ApiResponse<CreateVacancyResponse> localVarResponse = CreateVacancyWithHttpInfo(vacancy);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Create a new vacancy
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancy">Details of the vacancy</param>
        /// <returns>ApiResponse of CreateVacancyResponse</returns>
        public ASW.APIServices.Core.Client.ApiResponse< CreateVacancyResponse > CreateVacancyWithHttpInfo (Vacancy vacancy)
        {
            // verify the required parameter 'vacancy' is set
            if (vacancy == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'vacancy' when calling VacancyApi->CreateVacancy");

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

            localVarRequestOptions.Data = vacancy;

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + ASW.APIServices.Core.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post< CreateVacancyResponse >("/vacancies", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateVacancy", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Create a new vacancy
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancy">Details of the vacancy</param>
        /// <returns>Task of CreateVacancyResponse</returns>
        public async System.Threading.Tasks.Task<CreateVacancyResponse> CreateVacancyAsync (Vacancy vacancy)
        {
             ASW.APIServices.Core.Client.ApiResponse<CreateVacancyResponse> localVarResponse = await CreateVacancyAsyncWithHttpInfo(vacancy);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Create a new vacancy
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancy">Details of the vacancy</param>
        /// <returns>Task of ApiResponse (CreateVacancyResponse)</returns>
        public async System.Threading.Tasks.Task<ASW.APIServices.Core.Client.ApiResponse<CreateVacancyResponse>> CreateVacancyAsyncWithHttpInfo (Vacancy vacancy)
        {
            // verify the required parameter 'vacancy' is set
            if (vacancy == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'vacancy' when calling VacancyApi->CreateVacancy");


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
            
            localVarRequestOptions.Data = vacancy;

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + ASW.APIServices.Core.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.PostAsync<CreateVacancyResponse>("/vacancies", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateVacancy", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Send timesheet information for a completed activity
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="inlineObject"></param>
        /// <returns></returns>
        public void SubmitTimesheet (string vacancyId, InlineObject inlineObject)
        {
             SubmitTimesheetWithHttpInfo(vacancyId, inlineObject);
        }

        /// <summary>
        ///  Send timesheet information for a completed activity
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="inlineObject"></param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ASW.APIServices.Core.Client.ApiResponse<Object> SubmitTimesheetWithHttpInfo (string vacancyId, InlineObject inlineObject)
        {
            // verify the required parameter 'vacancyId' is set
            if (vacancyId == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'vacancyId' when calling VacancyApi->SubmitTimesheet");

            // verify the required parameter 'inlineObject' is set
            if (inlineObject == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'inlineObject' when calling VacancyApi->SubmitTimesheet");

            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
            };

            var localVarContentType = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (vacancyId != null)
                localVarRequestOptions.PathParameters.Add("vacancyId", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(vacancyId)); // path parameter
            localVarRequestOptions.Data = inlineObject;

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + ASW.APIServices.Core.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<Object>("/vacancies/{vacancyId}/timesheet", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SubmitTimesheet", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Send timesheet information for a completed activity
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="inlineObject"></param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task SubmitTimesheetAsync (string vacancyId, InlineObject inlineObject)
        {
             await SubmitTimesheetAsyncWithHttpInfo(vacancyId, inlineObject);

        }

        /// <summary>
        ///  Send timesheet information for a completed activity
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="inlineObject"></param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ASW.APIServices.Core.Client.ApiResponse<Object>> SubmitTimesheetAsyncWithHttpInfo (string vacancyId, InlineObject inlineObject)
        {
            // verify the required parameter 'vacancyId' is set
            if (vacancyId == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'vacancyId' when calling VacancyApi->SubmitTimesheet");

            // verify the required parameter 'inlineObject' is set
            if (inlineObject == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'inlineObject' when calling VacancyApi->SubmitTimesheet");


            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
            };
            
            foreach (var _contentType in _contentTypes)
                localVarRequestOptions.HeaderParameters.Add("Content-Type", _contentType);
            
            foreach (var _accept in _accepts)
                localVarRequestOptions.HeaderParameters.Add("Accept", _accept);
            
            if (vacancyId != null)
                localVarRequestOptions.PathParameters.Add("vacancyId", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(vacancyId)); // path parameter
            localVarRequestOptions.Data = inlineObject;

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + ASW.APIServices.Core.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.PostAsync<Object>("/vacancies/{vacancyId}/timesheet", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SubmitTimesheet", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
