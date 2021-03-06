# openapi-java-client

Duties and Events
- API version: 1.0.0
  - Build date: 2020-01-09T13:35:58.022235Z[Europe/London]

## Duties and Events 

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
import com.allocate.openapi.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/duty/v1");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String id = "id_example"; // String | ID of the duty
    DutyCostDetails dutyCostDetails = new DutyCostDetails(); // DutyCostDetails | Costing Information
    try {
      apiInstance.sendDutyCosting(id, dutyCostDetails);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#sendDutyCosting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/duty/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BookingsApi* | [**sendDutyCosting**](docs/BookingsApi.md#sendDutyCosting) | **POST** /duties/{id}/costing | 
*Class3rdPartyRosteringApi* | [**cancelDuty**](docs/Class3rdPartyRosteringApi.md#cancelDuty) | **DELETE** /duties/{id} | 
*Class3rdPartyRosteringApi* | [**cancelDutyBooking**](docs/Class3rdPartyRosteringApi.md#cancelDutyBooking) | **DELETE** /duties/{id}/booking | 
*Class3rdPartyRosteringApi* | [**createDuty**](docs/Class3rdPartyRosteringApi.md#createDuty) | **POST** /duties | 
*Class3rdPartyRosteringApi* | [**sendDutyForFulfillment**](docs/Class3rdPartyRosteringApi.md#sendDutyForFulfillment) | **POST** /duties/{id}/sendTo/{destination} | 
*CostingApi* | [**sendDutyCosting**](docs/CostingApi.md#sendDutyCosting) | **POST** /duties/{id}/costing | 
*DutiesApi* | [**cancelDuty**](docs/DutiesApi.md#cancelDuty) | **DELETE** /duties/{id} | 
*DutiesApi* | [**cancelDutyBooking**](docs/DutiesApi.md#cancelDutyBooking) | **DELETE** /duties/{id}/booking | 
*DutiesApi* | [**createDuty**](docs/DutiesApi.md#createDuty) | **POST** /duties | 
*DutiesApi* | [**sendDutyCosting**](docs/DutiesApi.md#sendDutyCosting) | **POST** /duties/{id}/costing | 
*DutiesApi* | [**sendDutyForFulfillment**](docs/DutiesApi.md#sendDutyForFulfillment) | **POST** /duties/{id}/sendTo/{destination} | 


## Documentation for Models

 - [AsyncResponse](docs/AsyncResponse.md)
 - [DateSpan](docs/DateSpan.md)
 - [Duty](docs/Duty.md)
 - [DutyApprovedEvent](docs/DutyApprovedEvent.md)
 - [DutyAssignedEvent](docs/DutyAssignedEvent.md)
 - [DutyAssignmentClearedEvent](docs/DutyAssignmentClearedEvent.md)
 - [DutyAssignmentFinalisedEvent](docs/DutyAssignmentFinalisedEvent.md)
 - [DutyAssignmentRedeploymentEvent](docs/DutyAssignmentRedeploymentEvent.md)
 - [DutyAssignmentRedeploymentEventAllOf](docs/DutyAssignmentRedeploymentEventAllOf.md)
 - [DutyAssignmentSubmittedEvent](docs/DutyAssignmentSubmittedEvent.md)
 - [DutyAssignmentTimesheetConfirmedEvent](docs/DutyAssignmentTimesheetConfirmedEvent.md)
 - [DutyAssignmentTimesheetRejectedEvent](docs/DutyAssignmentTimesheetRejectedEvent.md)
 - [DutyAssignmentTimesheetUnconfirmedEvent](docs/DutyAssignmentTimesheetUnconfirmedEvent.md)
 - [DutyAssignmentUnFinalisedEvent](docs/DutyAssignmentUnFinalisedEvent.md)
 - [DutyAssignmentUpdatedEvent](docs/DutyAssignmentUpdatedEvent.md)
 - [DutyCancelledEvent](docs/DutyCancelledEvent.md)
 - [DutyCascadeEvent](docs/DutyCascadeEvent.md)
 - [DutyCascadeEventAllOf](docs/DutyCascadeEventAllOf.md)
 - [DutyCostDetails](docs/DutyCostDetails.md)
 - [DutyDeletedEvent](docs/DutyDeletedEvent.md)
 - [DutyDetails](docs/DutyDetails.md)
 - [DutyDetailsWhen](docs/DutyDetailsWhen.md)
 - [DutyDetailsWhere](docs/DutyDetailsWhere.md)
 - [DutyEvent](docs/DutyEvent.md)
 - [DutyEventAllOf](docs/DutyEventAllOf.md)
 - [DutyRequirements](docs/DutyRequirements.md)
 - [DutyRequirementsGradeRequirement](docs/DutyRequirementsGradeRequirement.md)
 - [DutySendEvent](docs/DutySendEvent.md)
 - [DutyTempStaffingExpressionOfInterestEvent](docs/DutyTempStaffingExpressionOfInterestEvent.md)
 - [DutyTempStaffingExpressionOfInterestEventAllOf](docs/DutyTempStaffingExpressionOfInterestEventAllOf.md)
 - [DutyTempStaffingNoteCreatedEvent](docs/DutyTempStaffingNoteCreatedEvent.md)
 - [DutyTempStaffingNoteCreatedEventAllOf](docs/DutyTempStaffingNoteCreatedEventAllOf.md)
 - [DutyTempStaffingNoteDeletedEvent](docs/DutyTempStaffingNoteDeletedEvent.md)
 - [DutyTempStaffingNoteDeletedEventAllOf](docs/DutyTempStaffingNoteDeletedEventAllOf.md)
 - [DutyTimes](docs/DutyTimes.md)
 - [DutyUpdatedEvent](docs/DutyUpdatedEvent.md)
 - [DutyUpdatedEventAllOf](docs/DutyUpdatedEventAllOf.md)
 - [DutyWhen](docs/DutyWhen.md)
 - [DutyWhere](docs/DutyWhere.md)
 - [Event](docs/Event.md)
 - [EventResponse](docs/EventResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@allocatesoftware.com

