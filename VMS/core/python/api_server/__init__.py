# coding: utf-8

# flake8: noqa

"""
    VMS API

    ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

__version__ = "1.0.0"

# import apis into sdk package
from api_server.api.agencies_api import AgenciesApi
from api_server.api.agency_api import AgencyApi
from api_server.api.bookings_api import BookingsApi
from api_server.api.workers_api import WorkersApi

# import ApiClient
from api_server.api_client import ApiClient
from api_server.configuration import Configuration
from api_server.exceptions import OpenApiException
from api_server.exceptions import ApiTypeError
from api_server.exceptions import ApiValueError
from api_server.exceptions import ApiKeyError
from api_server.exceptions import ApiException
# import models into sdk package
from api_server.models.agency import Agency
from api_server.models.agency_costing import AgencyCosting
from api_server.models.agency_costings import AgencyCostings
from api_server.models.booking_cancelled_event import BookingCancelledEvent
from api_server.models.booking_confirmed_event import BookingConfirmedEvent
from api_server.models.duty import Duty
from api_server.models.duty_location import DutyLocation
from api_server.models.duty_request import DutyRequest
from api_server.models.duty_requirements import DutyRequirements
from api_server.models.duty_timing import DutyTiming
from api_server.models.link import Link
from api_server.models.person import Person
from api_server.models.person_identifier import PersonIdentifier
from api_server.models.worker_offer import WorkerOffer
from api_server.models.worker_offered_event import WorkerOfferedEvent

