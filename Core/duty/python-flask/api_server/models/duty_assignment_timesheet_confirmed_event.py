# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.duty_event_all_of import DutyEventAllOf
from api_server.models.event import Event
from api_server import util

from api_server.models.duty_event_all_of import DutyEventAllOf  # noqa: E501
from api_server.models.event import Event  # noqa: E501

class DutyAssignmentTimesheetConfirmedEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_type=None, duty_id=None):  # noqa: E501
        """DutyAssignmentTimesheetConfirmedEvent - a model defined in OpenAPI

        :param event_type: The event_type of this DutyAssignmentTimesheetConfirmedEvent.  # noqa: E501
        :type event_type: str
        :param duty_id: The duty_id of this DutyAssignmentTimesheetConfirmedEvent.  # noqa: E501
        :type duty_id: str
        """
        self.openapi_types = {
            'event_type': str,
            'duty_id': str
        }

        self.attribute_map = {
            'event_type': 'eventType',
            'duty_id': 'dutyId'
        }

        self._event_type = event_type
        self._duty_id = duty_id

    @classmethod
    def from_dict(cls, dikt) -> 'DutyAssignmentTimesheetConfirmedEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DutyAssignmentTimesheetConfirmedEvent of this DutyAssignmentTimesheetConfirmedEvent.  # noqa: E501
        :rtype: DutyAssignmentTimesheetConfirmedEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event_type(self):
        """Gets the event_type of this DutyAssignmentTimesheetConfirmedEvent.


        :return: The event_type of this DutyAssignmentTimesheetConfirmedEvent.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """Sets the event_type of this DutyAssignmentTimesheetConfirmedEvent.


        :param event_type: The event_type of this DutyAssignmentTimesheetConfirmedEvent.
        :type event_type: str
        """
        if event_type is None:
            raise ValueError("Invalid value for `event_type`, must not be `None`")  # noqa: E501

        self._event_type = event_type

    @property
    def duty_id(self):
        """Gets the duty_id of this DutyAssignmentTimesheetConfirmedEvent.


        :return: The duty_id of this DutyAssignmentTimesheetConfirmedEvent.
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this DutyAssignmentTimesheetConfirmedEvent.


        :param duty_id: The duty_id of this DutyAssignmentTimesheetConfirmedEvent.
        :type duty_id: str
        """

        self._duty_id = duty_id