# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.duty import Duty
from api_server import util

from api_server.models.duty import Duty  # noqa: E501

class DutySendEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_type=None, destination=None, duty=None):  # noqa: E501
        """DutySendEvent - a model defined in OpenAPI

        :param event_type: The event_type of this DutySendEvent.  # noqa: E501
        :type event_type: str
        :param destination: The destination of this DutySendEvent.  # noqa: E501
        :type destination: str
        :param duty: The duty of this DutySendEvent.  # noqa: E501
        :type duty: Duty
        """
        self.openapi_types = {
            'event_type': str,
            'destination': str,
            'duty': Duty
        }

        self.attribute_map = {
            'event_type': 'eventType',
            'destination': 'destination',
            'duty': 'duty'
        }

        self._event_type = event_type
        self._destination = destination
        self._duty = duty

    @classmethod
    def from_dict(cls, dikt) -> 'DutySendEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DutySendEvent of this DutySendEvent.  # noqa: E501
        :rtype: DutySendEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event_type(self):
        """Gets the event_type of this DutySendEvent.


        :return: The event_type of this DutySendEvent.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """Sets the event_type of this DutySendEvent.


        :param event_type: The event_type of this DutySendEvent.
        :type event_type: str
        """
        if event_type is None:
            raise ValueError("Invalid value for `event_type`, must not be `None`")  # noqa: E501

        self._event_type = event_type

    @property
    def destination(self):
        """Gets the destination of this DutySendEvent.

        Where this duty has been sent  # noqa: E501

        :return: The destination of this DutySendEvent.
        :rtype: str
        """
        return self._destination

    @destination.setter
    def destination(self, destination):
        """Sets the destination of this DutySendEvent.

        Where this duty has been sent  # noqa: E501

        :param destination: The destination of this DutySendEvent.
        :type destination: str
        """
        allowed_values = ["bank", "agency", "cloudstaff"]  # noqa: E501
        if destination not in allowed_values:
            raise ValueError(
                "Invalid value for `destination` ({0}), must be one of {1}"
                .format(destination, allowed_values)
            )

        self._destination = destination

    @property
    def duty(self):
        """Gets the duty of this DutySendEvent.


        :return: The duty of this DutySendEvent.
        :rtype: Duty
        """
        return self._duty

    @duty.setter
    def duty(self, duty):
        """Sets the duty of this DutySendEvent.


        :param duty: The duty of this DutySendEvent.
        :type duty: Duty
        """

        self._duty = duty