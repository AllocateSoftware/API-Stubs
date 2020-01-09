

# Event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of change that is done to the entity |  [optional]
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Entity that is changed. |  [optional]
**entityId** | **String** | Trust identifier of the changed entity |  [optional]
**timeStamp** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the event |  [optional]



## Enum: EventTypeEnum

Name | Value
---- | -----
CREATE | &quot;CREATE&quot;
DELETE | &quot;DELETE&quot;
UPDATE | &quot;UPDATE&quot;



## Enum: EntityTypeEnum

Name | Value
---- | -----
DUTY | &quot;duty&quot;
TIMESHEET | &quot;timesheet&quot;
BOOKING | &quot;booking&quot;
GRADE | &quot;grade&quot;
AGENCY | &quot;agency&quot;
REASON_FOR_VACANCY | &quot;reason_for_vacancy&quot;
CONTRACT_STATUS | &quot;contract_status&quot;
STAFF_GROUP | &quot;staff_group&quot;
UNIT | &quot;unit&quot;



