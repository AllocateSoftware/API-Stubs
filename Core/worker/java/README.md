# openapi-java-client

Workers
- API version: 1.0.0
  - Build date: 2020-01-09T13:36:44.017277Z[Europe/London]

## Workers and events 

  For more information, please visit [http://www.allocatesoftware.com/](http://www.allocatesoftware.com/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.AnnualLeaveClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/worker/v1");

    AnnualLeaveClaimsApi apiInstance = new AnnualLeaveClaimsApi(defaultClient);
    String id = "id_example"; // String | ID of the worker
    LeaveClaim leaveClaim = new LeaveClaim(); // LeaveClaim | Leave claim for a worker
    try {
      AsyncResponse result = apiInstance.submitAnnualLeaveClaim(id, leaveClaim);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnualLeaveClaimsApi#submitAnnualLeaveClaim");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/worker/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnnualLeaveClaimsApi* | [**submitAnnualLeaveClaim**](docs/AnnualLeaveClaimsApi.md#submitAnnualLeaveClaim) | **POST** /worker/{id}/leave | 
*WorkerDataApi* | [**registerWorker**](docs/WorkerDataApi.md#registerWorker) | **POST** /workers | 
*WorkersApi* | [**registerWorker**](docs/WorkersApi.md#registerWorker) | **POST** /workers | 
*WorkersApi* | [**submitAnnualLeaveClaim**](docs/WorkersApi.md#submitAnnualLeaveClaim) | **POST** /worker/{id}/leave | 


## Documentation for Models

 - [AsyncResponse](docs/AsyncResponse.md)
 - [Attribute](docs/Attribute.md)
 - [Availabilities](docs/Availabilities.md)
 - [AvailabilitiesAvailability](docs/AvailabilitiesAvailability.md)
 - [AvailabilitiesNoBank](docs/AvailabilitiesNoBank.md)
 - [ContactDetailsUpdatedEvent](docs/ContactDetailsUpdatedEvent.md)
 - [ContactInformation](docs/ContactInformation.md)
 - [ContactLogEvent](docs/ContactLogEvent.md)
 - [ContactLogInformation](docs/ContactLogInformation.md)
 - [ContactLogInformationDetails](docs/ContactLogInformationDetails.md)
 - [Contract](docs/Contract.md)
 - [DateSpan](docs/DateSpan.md)
 - [EmploymentDetails](docs/EmploymentDetails.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Identification](docs/Identification.md)
 - [Identifier](docs/Identifier.md)
 - [LeaveClaim](docs/LeaveClaim.md)
 - [LeaveClaimWhen](docs/LeaveClaimWhen.md)
 - [Person](docs/Person.md)
 - [PersonalInfo](docs/PersonalInfo.md)
 - [PersonalPattern](docs/PersonalPattern.md)
 - [PersonalPatternDuty](docs/PersonalPatternDuty.md)
 - [PersonalPatternUnavailability](docs/PersonalPatternUnavailability.md)
 - [Posting](docs/Posting.md)
 - [Skill](docs/Skill.md)
 - [Specialty](docs/Specialty.md)
 - [TimeSpan](docs/TimeSpan.md)
 - [Visa](docs/Visa.md)
 - [WorkLocations](docs/WorkLocations.md)
 - [WorkerPerformanceEvent](docs/WorkerPerformanceEvent.md)
 - [WorkerPerformanceEventDutyDetails](docs/WorkerPerformanceEventDutyDetails.md)
 - [WorkerPerformanceEventEvaluation](docs/WorkerPerformanceEventEvaluation.md)
 - [WorkerPerformanceEventEvaluationEvaluator](docs/WorkerPerformanceEventEvaluationEvaluator.md)
 - [WorkerPerformanceEventEvaluationQuesions](docs/WorkerPerformanceEventEvaluationQuesions.md)
 - [WorkerPerformanceEventWorker](docs/WorkerPerformanceEventWorker.md)
 - [WorkerRegistrationResponse](docs/WorkerRegistrationResponse.md)
 - [WorkingRestriction](docs/WorkingRestriction.md)
 - [WorkingRestrictionDefaultLeaveHours](docs/WorkingRestrictionDefaultLeaveHours.md)
 - [WorkingRestrictionHoursOfWork](docs/WorkingRestrictionHoursOfWork.md)
 - [WorkingRestrictionRestrictions](docs/WorkingRestrictionRestrictions.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@allocatesoftware.com

