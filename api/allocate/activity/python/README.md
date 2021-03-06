# api-server
     ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.0.1
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen
For more information, please visit [http://www.allocatesoftware.com/](http://www.allocatesoftware.com/)

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

configuration = api_server.Configuration()
# Configure Bearer authorization (JWT): jwt
configuration.access_token = 'YOUR_BEARER_TOKEN'

# Defining host is optional and default to http://healthsuite.allocatesoftware.com/api/v1
configuration.host = "http://healthsuite.allocatesoftware.com/api/v1"
# Create an instance of the API class
api_instance = api_server.DefaultApi(api_server.ApiClient(configuration))
customer_code = 'ASPH' # str | The code for the customer (trust) for which the activities should be returned
format = 'short' # str | Format for the output. TBD, but may be used to control the scope of information returned. (optional)

try:
    api_response = api_instance.get_activities(customer_code, format=format)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_activities: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**get_activities**](docs/DefaultApi.md#get_activities) | **GET** /activities | 


## Documentation For Models

 - [AsyncResponse](docs/AsyncResponse.md)
 - [DateSpan](docs/DateSpan.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Grade](docs/Grade.md)
 - [GradeType](docs/GradeType.md)
 - [GradeTypeCategory](docs/GradeTypeCategory.md)
 - [HoursAssignment](docs/HoursAssignment.md)
 - [HoursAssignmentAssignment](docs/HoursAssignmentAssignment.md)
 - [HoursAssignmentCancellation](docs/HoursAssignmentCancellation.md)
 - [HoursAssignmentCancellationReason](docs/HoursAssignmentCancellationReason.md)
 - [HoursAssignmentCostCentre](docs/HoursAssignmentCostCentre.md)
 - [HoursAssignmentDuty](docs/HoursAssignmentDuty.md)
 - [HoursAssignmentEmployeeType](docs/HoursAssignmentEmployeeType.md)
 - [HoursAssignmentFulfillment](docs/HoursAssignmentFulfillment.md)
 - [HoursAssignmentLocation](docs/HoursAssignmentLocation.md)
 - [HoursAssignmentOwningUnit](docs/HoursAssignmentOwningUnit.md)
 - [HoursAssignmentPerson](docs/HoursAssignmentPerson.md)
 - [HoursAssignmentPost](docs/HoursAssignmentPost.md)
 - [HoursAssignmentPosting](docs/HoursAssignmentPosting.md)
 - [HoursAssignmentRequirement](docs/HoursAssignmentRequirement.md)
 - [HoursAssignmentShift](docs/HoursAssignmentShift.md)
 - [TimeSpan](docs/TimeSpan.md)


## Documentation For Authorization


## jwt

- **Type**: Bearer authentication (JWT)


## Author

support@allocatesoftware.com


