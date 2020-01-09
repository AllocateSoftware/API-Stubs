# coding: utf-8

# flake8: noqa

"""
    Vacancy Booking API and Events

         ## Duty Booking API and events and Events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

__version__ = "1.0.0"

# import apis into sdk package
from api_server.api.proposal_api import ProposalApi
from api_server.api.vacancy_api import VacancyApi

# import ApiClient
from api_server.api_client import ApiClient
from api_server.configuration import Configuration
from api_server.exceptions import OpenApiException
from api_server.exceptions import ApiTypeError
from api_server.exceptions import ApiValueError
from api_server.exceptions import ApiKeyError
from api_server.exceptions import ApiException
# import models into sdk package
from api_server.models.async_response import AsyncResponse
from api_server.models.booking_cancelled_event import BookingCancelledEvent
from api_server.models.booking_event import BookingEvent
from api_server.models.cancellation_cost import CancellationCost
from api_server.models.create_proposal_response import CreateProposalResponse
from api_server.models.create_vacancy_response import CreateVacancyResponse
from api_server.models.date_span import DateSpan
from api_server.models.error_response import ErrorResponse
from api_server.models.identifier import Identifier
from api_server.models.inline_object import InlineObject
from api_server.models.proposal_details import ProposalDetails
from api_server.models.time_span import TimeSpan
from api_server.models.vacancy import Vacancy
from api_server.models.vacancy_person_requirements import VacancyPersonRequirements
from api_server.models.vacancy_published_event import VacancyPublishedEvent
from api_server.models.vacancy_updated_event import VacancyUpdatedEvent
from api_server.models.vacancy_when import VacancyWhen
from api_server.models.vacancy_where import VacancyWhere
from api_server.models.vacancy_where_location import VacancyWhereLocation
from api_server.models.vacancy_withdrawn_event import VacancyWithdrawnEvent
