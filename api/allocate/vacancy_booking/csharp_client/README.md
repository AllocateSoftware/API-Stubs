# ASW.APIServices.Core - the C# library for the Vacancy Booking API and Events

     ## Duty Booking API and events and Events 

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 1.0.0
- Build package: org.openapitools.codegen.languages.CSharpClientCodegen
    For more information, please visit [http://www.allocatesoftware.com/](http://www.allocatesoftware.com/)

## Frameworks supported


- .NET 4.0 or later
- Windows Phone 7.1 (Mango)

## Dependencies


- [RestSharp](https://www.nuget.org/packages/RestSharp) - 105.1.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 7.0.0 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.2.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:

```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742)

## Installation

Run the following command to generate the DLL

- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:

```csharp
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

```


## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out ASW.APIServices.Core.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.


## Getting Started

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class Example
    {
        public static void Main()
        {

            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProposalApi(Configuration.Default);
            var id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C;  // string | The ID of the proposal

            try
            {
                apiInstance.AcceptProposal(id);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ProposalApi.AcceptProposal: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }

        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProposalApi* | [**AcceptProposal**](docs/ProposalApi.md#acceptproposal) | **POST** /proposals/{id}/accept | 
*ProposalApi* | [**CancelProposal**](docs/ProposalApi.md#cancelproposal) | **DELETE** /proposals/{id} | 
*ProposalApi* | [**GetProposal**](docs/ProposalApi.md#getproposal) | **GET** /proposals/{id} | 
*ProposalApi* | [**UpdateProposal**](docs/ProposalApi.md#updateproposal) | **PUT** /proposals/{id} | 
*VacancyApi* | [**CreateProposal**](docs/VacancyApi.md#createproposal) | **POST** /vacancies/{vacancyId}/proposals | 
*VacancyApi* | [**CreateVacancy**](docs/VacancyApi.md#createvacancy) | **POST** /vacancies | 
*VacancyApi* | [**SubmitTimesheet**](docs/VacancyApi.md#submittimesheet) | **POST** /vacancies/{vacancyId}/timesheet | 


## Documentation for Models

 - [Model.AsyncResponse](docs/AsyncResponse.md)
 - [Model.BookingCancelledEvent](docs/BookingCancelledEvent.md)
 - [Model.BookingEvent](docs/BookingEvent.md)
 - [Model.CancellationCost](docs/CancellationCost.md)
 - [Model.CreateProposalResponse](docs/CreateProposalResponse.md)
 - [Model.CreateVacancyResponse](docs/CreateVacancyResponse.md)
 - [Model.DateSpan](docs/DateSpan.md)
 - [Model.ErrorResponse](docs/ErrorResponse.md)
 - [Model.Identifier](docs/Identifier.md)
 - [Model.InlineObject](docs/InlineObject.md)
 - [Model.ProposalDetails](docs/ProposalDetails.md)
 - [Model.TimeSpan](docs/TimeSpan.md)
 - [Model.Vacancy](docs/Vacancy.md)
 - [Model.VacancyPersonRequirements](docs/VacancyPersonRequirements.md)
 - [Model.VacancyPublishedEvent](docs/VacancyPublishedEvent.md)
 - [Model.VacancyUpdatedEvent](docs/VacancyUpdatedEvent.md)
 - [Model.VacancyWhen](docs/VacancyWhen.md)
 - [Model.VacancyWhere](docs/VacancyWhere.md)
 - [Model.VacancyWhereLocation](docs/VacancyWhereLocation.md)
 - [Model.VacancyWithdrawnEvent](docs/VacancyWithdrawnEvent.md)


## Documentation for Authorization


### APIAuthorizer

- **Type**: API key

- **API key parameter name**: AuthorizationToken
- **Location**: HTTP header


### jwt


- **Type**: HTTP basic authentication
