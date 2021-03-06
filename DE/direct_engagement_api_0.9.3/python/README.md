# api-server
description

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import api_server 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import api_server
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint


# Defining host is optional and default to http://localhost
configuration.host = "http://localhost"
# Create an instance of the API class
api_instance = api_server.DutyApi(api_server.ApiClient(configuration))
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
duty_id = 56 # int | ID of the duty associated with the DE contract

try:
    # Cancel a duty
    api_instance.cancel_duty(version, trust_code, duty_id)
except ApiException as e:
    print("Exception when calling DutyApi->cancel_duty: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DutyApi* | [**cancel_duty**](docs/DutyApi.md#cancel_duty) | **POST** /{version}/trustcode/{trustCode}/duty/{dutyId}/cancel | Cancel a duty
*DutyApi* | [**fill_duty**](docs/DutyApi.md#fill_duty) | **POST** /{version}/trustcode/{trustCode}/duty/{dutyId}/booking | Creates booking for duty
*DutyApi* | [**get_duty_details**](docs/DutyApi.md#get_duty_details) | **GET** /{version}/trustcode/{trustCode}/duty/ | Returns details about a duties.
*DutyApi* | [**get_single_duty_details**](docs/DutyApi.md#get_single_duty_details) | **GET** /{version}/trustcode/{trustCode}/duty/{dutyId} | Returns details about a duties.
*DutyApi* | [**update_contract_status**](docs/DutyApi.md#update_contract_status) | **PUT** /{version}/trustcode/{trustCode}/duty/{dutyId}/contract/{contractId}/status/{statusId} | Updates DE Contract status
*DutyApi* | [**update_timesheets**](docs/DutyApi.md#update_timesheets) | **PUT** /{version}/trustcode/{trustCode}/duty/{dutyId}/timesheet | Updates timesheet for duty
*EventApi* | [**get_events**](docs/EventApi.md#get_events) | **GET** /{version}/trustcode/{trustCode}/event | Get all events older than input timestamp
*ReferenceDataApi* | [**get_agencies_by_ids**](docs/ReferenceDataApi.md#get_agencies_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/agency/ | Get agencies
*ReferenceDataApi* | [**get_all_agencies**](docs/ReferenceDataApi.md#get_all_agencies) | **GET** /{version}/trustcode/{trustCode}/referenceData/agency | Get all agencies
*ReferenceDataApi* | [**get_all_contract_statuses**](docs/ReferenceDataApi.md#get_all_contract_statuses) | **GET** /{version}/trustcode/{trustCode}/referenceData/contractStatus | Get all contract statuses
*ReferenceDataApi* | [**get_all_grades**](docs/ReferenceDataApi.md#get_all_grades) | **GET** /{version}/trustcode/{trustCode}/referenceData/grade | Get all grades
*ReferenceDataApi* | [**get_all_reasons_for_vacancy**](docs/ReferenceDataApi.md#get_all_reasons_for_vacancy) | **GET** /{version}/trustcode/{trustCode}/referenceData/reasonForVacancy | Get all reasons for vacancy
*ReferenceDataApi* | [**get_all_staff_groups**](docs/ReferenceDataApi.md#get_all_staff_groups) | **GET** /{version}/trustcode/{trustCode}/referenceData/staffGroup | Get all staff groups
*ReferenceDataApi* | [**get_all_units**](docs/ReferenceDataApi.md#get_all_units) | **GET** /{version}/trustcode/{trustCode}/referenceData/unit | Get all units
*ReferenceDataApi* | [**get_contract_statuses_by_ids**](docs/ReferenceDataApi.md#get_contract_statuses_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/contractStatus/ | Get contract statuses
*ReferenceDataApi* | [**get_grades_by_ids**](docs/ReferenceDataApi.md#get_grades_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/grade/ | Get grades
*ReferenceDataApi* | [**get_reasons_for_vacancy_by_ids**](docs/ReferenceDataApi.md#get_reasons_for_vacancy_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/reasonForVacancy/ | Get reasons for vacancy
*ReferenceDataApi* | [**get_staff_groups_by_ids**](docs/ReferenceDataApi.md#get_staff_groups_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/staffGroup/ | Get staff groups
*ReferenceDataApi* | [**get_units_by_ids**](docs/ReferenceDataApi.md#get_units_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/unit/ | Get units


## Documentation For Models

 - [ApiResponse](docs/ApiResponse.md)
 - [BookingInfo](docs/BookingInfo.md)
 - [BookingResponse](docs/BookingResponse.md)
 - [ContractStatus](docs/ContractStatus.md)
 - [Duty](docs/Duty.md)
 - [Event](docs/Event.md)
 - [InlineObject](docs/InlineObject.md)
 - [Person](docs/Person.md)
 - [PersonGender](docs/PersonGender.md)
 - [Rates](docs/Rates.md)
 - [ReferenceDataResponse](docs/ReferenceDataResponse.md)
 - [RequestGender](docs/RequestGender.md)
 - [TimeIntervalRates](docs/TimeIntervalRates.md)
 - [UnitReferenceDataResponse](docs/UnitReferenceDataResponse.md)
 - [XPaginationHeader](docs/XPaginationHeader.md)


## Documentation For Authorization

 All endpoints do not require authorization.

## Author




