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

class DutyDeletedEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_type=None, duty_id=None):  # noqa: E501
        """DutyDeletedEvent - a model defined in OpenAPI

        :param event_type: The event_type of this DutyDeletedEvent.  # noqa: E501
        :type event_type: str
        :param duty_id: The duty_id of this DutyDeletedEvent.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'DutyDeletedEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DutyDeletedEvent of this DutyDeletedEvent.  # noqa: E501
        :rtype: DutyDeletedEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event_type(self):
        """Gets the event_type of this DutyDeletedEvent.


        :return: The event_type of this DutyDeletedEvent.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """Sets the event_type of this DutyDeletedEvent.


        :param event_type: The event_type of this DutyDeletedEvent.
        :type event_type: str
        """
        if event_type is None:
            raise ValueError("Invalid value for `event_type`, must not be `None`")  # noqa: E501

        self._event_type = event_type

    @property
    def duty_id(self):
        """Gets the duty_id of this DutyDeletedEvent.


        :return: The duty_id of this DutyDeletedEvent.
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this DutyDeletedEvent.


        :param duty_id: The duty_id of this DutyDeletedEvent.
        :type duty_id: str
        """

        self._duty_id = duty_id
