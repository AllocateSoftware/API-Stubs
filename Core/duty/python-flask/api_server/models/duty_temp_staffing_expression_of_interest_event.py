# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.duty_temp_staffing_expression_of_interest_event_all_of import DutyTempStaffingExpressionOfInterestEventAllOf
from api_server.models.event import Event
from api_server import util

from api_server.models.duty_temp_staffing_expression_of_interest_event_all_of import DutyTempStaffingExpressionOfInterestEventAllOf  # noqa: E501
from api_server.models.event import Event  # noqa: E501

class DutyTempStaffingExpressionOfInterestEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_type=None, id=None, duty_id=None, worker_id=None):  # noqa: E501
        """DutyTempStaffingExpressionOfInterestEvent - a model defined in OpenAPI

        :param event_type: The event_type of this DutyTempStaffingExpressionOfInterestEvent.  # noqa: E501
        :type event_type: str
        :param id: The id of this DutyTempStaffingExpressionOfInterestEvent.  # noqa: E501
        :type id: str
        :param duty_id: The duty_id of this DutyTempStaffingExpressionOfInterestEvent.  # noqa: E501
        :type duty_id: str
        :param worker_id: The worker_id of this DutyTempStaffingExpressionOfInterestEvent.  # noqa: E501
        :type worker_id: str
        """
        self.openapi_types = {
            'event_type': str,
            'id': str,
            'duty_id': str,
            'worker_id': str
        }

        self.attribute_map = {
            'event_type': 'eventType',
            'id': 'id',
            'duty_id': 'dutyId',
            'worker_id': 'workerId'
        }

        self._event_type = event_type
        self._id = id
        self._duty_id = duty_id
        self._worker_id = worker_id

    @classmethod
    def from_dict(cls, dikt) -> 'DutyTempStaffingExpressionOfInterestEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DutyTempStaffingExpressionOfInterestEvent of this DutyTempStaffingExpressionOfInterestEvent.  # noqa: E501
        :rtype: DutyTempStaffingExpressionOfInterestEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event_type(self):
        """Gets the event_type of this DutyTempStaffingExpressionOfInterestEvent.


        :return: The event_type of this DutyTempStaffingExpressionOfInterestEvent.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """Sets the event_type of this DutyTempStaffingExpressionOfInterestEvent.


        :param event_type: The event_type of this DutyTempStaffingExpressionOfInterestEvent.
        :type event_type: str
        """
        if event_type is None:
            raise ValueError("Invalid value for `event_type`, must not be `None`")  # noqa: E501

        self._event_type = event_type

    @property
    def id(self):
        """Gets the id of this DutyTempStaffingExpressionOfInterestEvent.


        :return: The id of this DutyTempStaffingExpressionOfInterestEvent.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this DutyTempStaffingExpressionOfInterestEvent.


        :param id: The id of this DutyTempStaffingExpressionOfInterestEvent.
        :type id: str
        """

        self._id = id

    @property
    def duty_id(self):
        """Gets the duty_id of this DutyTempStaffingExpressionOfInterestEvent.


        :return: The duty_id of this DutyTempStaffingExpressionOfInterestEvent.
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this DutyTempStaffingExpressionOfInterestEvent.


        :param duty_id: The duty_id of this DutyTempStaffingExpressionOfInterestEvent.
        :type duty_id: str
        """

        self._duty_id = duty_id

    @property
    def worker_id(self):
        """Gets the worker_id of this DutyTempStaffingExpressionOfInterestEvent.

        Identifier for the note  # noqa: E501

        :return: The worker_id of this DutyTempStaffingExpressionOfInterestEvent.
        :rtype: str
        """
        return self._worker_id

    @worker_id.setter
    def worker_id(self, worker_id):
        """Sets the worker_id of this DutyTempStaffingExpressionOfInterestEvent.

        Identifier for the note  # noqa: E501

        :param worker_id: The worker_id of this DutyTempStaffingExpressionOfInterestEvent.
        :type worker_id: str
        """

        self._worker_id = worker_id