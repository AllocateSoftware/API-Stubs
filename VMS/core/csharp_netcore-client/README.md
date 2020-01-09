# ASW.APIServices.VMS - the C# library for the VMS API

## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 1.0.0
- Build package: org.openapitools.codegen.languages.CSharpNetCoreClientCodegen
    For more information, please visit [http://www.allocatesoftware.com/](http://www.allocatesoftware.com/)

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET Core >=1.0
- .NET Framework >=4.6
- Mono/Xamarin >=vNext

<a name="dependencies"></a>
## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.6.7 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 12.0.1 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.5.2 or later
- [CompareNETObjects](https://www.nuget.org/packages/CompareNETObjects) - 4.57.0 or later
- [System.ComponentModel.Annotations](https://www.nuget.org/packages/System.ComponentModel.Annotations) - 4.5.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
Install-Package System.ComponentModel.Annotations
Install-Package CompareNETObjects
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742)

<a name="installation"></a>
## Installation
Generate the DLL using your preferred tool (e.g. `dotnet build`)

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;
```
<a name="getting-started"></a>
## Getting Started

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class Example
    {
        public static void Main()
        {

            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AgenciesApi(Configuration.Default);
            var duty = new Duty(); // Duty | Duty to be costed

            try
            {
                AgencyCostings result = apiInstance.GetCostings(duty);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AgenciesApi.GetCostings: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }

        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgenciesApi* | [**GetCostings**](docs/AgenciesApi.md#getcostings) | **POST** /agencies/costings | 
*AgenciesApi* | [**SendDutyToAgencies**](docs/AgenciesApi.md#senddutytoagencies) | **POST** /agencies | 
*AgenciesApi* | [**SendDutyToAgency**](docs/AgenciesApi.md#senddutytoagency) | **POST** /agencies/{agencyId} | 
*AgencyApi* | [**OfferWorker**](docs/AgencyApi.md#offerworker) | **POST** /bookingRequests/{bookingRequestId}/offers | 
*BookingsApi* | [**AcceptAgencyOffer**](docs/BookingsApi.md#acceptagencyoffer) | **PUT** /bookingRequests/{bookingRequestId}/offers/{offerId}/accept | 
*BookingsApi* | [**CancelBooking**](docs/BookingsApi.md#cancelbooking) | **DELETE** /bookings/{bookingId} | 
*BookingsApi* | [**CancelBookingRequest**](docs/BookingsApi.md#cancelbookingrequest) | **DELETE** /bookingRequests/{bookingRequestId} | 
*BookingsApi* | [**GetBooking**](docs/BookingsApi.md#getbooking) | **GET** /bookings/{bookingId} | 
*WorkersApi* | [**GetWorker**](docs/WorkersApi.md#getworker) | **GET** /workers/{id} | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Model.Agency](docs/Agency.md)
 - [Model.AgencyCosting](docs/AgencyCosting.md)
 - [Model.AgencyCostings](docs/AgencyCostings.md)
 - [Model.BookingCancelledEvent](docs/BookingCancelledEvent.md)
 - [Model.BookingConfirmedEvent](docs/BookingConfirmedEvent.md)
 - [Model.Duty](docs/Duty.md)
 - [Model.DutyLocation](docs/DutyLocation.md)
 - [Model.DutyRequest](docs/DutyRequest.md)
 - [Model.DutyRequirements](docs/DutyRequirements.md)
 - [Model.DutyTiming](docs/DutyTiming.md)
 - [Model.Link](docs/Link.md)
 - [Model.Person](docs/Person.md)
 - [Model.PersonIdentifier](docs/PersonIdentifier.md)
 - [Model.WorkerOffer](docs/WorkerOffer.md)
 - [Model.WorkerOfferedEvent](docs/WorkerOfferedEvent.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="bearerAuth"></a>
### bearerAuth

- **Type**: HTTP basic authentication
