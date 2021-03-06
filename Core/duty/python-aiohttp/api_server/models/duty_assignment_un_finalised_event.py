# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.duty_event_all_of import DutyEventAllOf
from api_server.models.event import Event
from api_server import util


class DutyAssignmentUnFinalisedEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_type: str=None, duty_id: str=None):
        """DutyAssignmentUnFinalisedEvent - a model defined in OpenAPI

        :param event_type: The event_type of this DutyAssignmentUnFinalisedEvent.
        :param duty_id: The duty_id of this DutyAssignmentUnFinalisedEvent.
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
    def from_dict(cls, dikt: dict) -> 'DutyAssignmentUnFinalisedEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DutyAssignmentUnFinalisedEvent of this DutyAssignmentUnFinalisedEvent.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event_type(self):
        """Gets the event_type of this DutyAssignmentUnFinalisedEvent.


        :return: The event_type of this DutyAssignmentUnFinalisedEvent.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """Sets the event_type of this DutyAssignmentUnFinalisedEvent.


        :param event_type: The event_type of this DutyAssignmentUnFinalisedEvent.
        :type event_type: str
        """
        if event_type is None:
            raise ValueError("Invalid value for `event_type`, must not be `None`")

        self._event_type = event_type

    @property
    def duty_id(self):
        """Gets the duty_id of this DutyAssignmentUnFinalisedEvent.


        :return: The duty_id of this DutyAssignmentUnFinalisedEvent.
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this DutyAssignmentUnFinalisedEvent.


        :param duty_id: The duty_id of this DutyAssignmentUnFinalisedEvent.
        :type duty_id: str
        """

        self._duty_id = duty_id
