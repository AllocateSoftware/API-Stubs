# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.duty import Duty
from api_server import util


class DutySendEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_type: str=None, destination: str=None, duty: Duty=None):
        """DutySendEvent - a model defined in OpenAPI

        :param event_type: The event_type of this DutySendEvent.
        :param destination: The destination of this DutySendEvent.
        :param duty: The duty of this DutySendEvent.
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
    def from_dict(cls, dikt: dict) -> 'DutySendEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DutySendEvent of this DutySendEvent.
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
            raise ValueError("Invalid value for `event_type`, must not be `None`")

        self._event_type = event_type

    @property
    def destination(self):
        """Gets the destination of this DutySendEvent.

        Where this duty has been sent

        :return: The destination of this DutySendEvent.
        :rtype: str
        """
        return self._destination

    @destination.setter
    def destination(self, destination):
        """Sets the destination of this DutySendEvent.

        Where this duty has been sent

        :param destination: The destination of this DutySendEvent.
        :type destination: str
        """
        allowed_values = ["bank", "agency", "cloudstaff"]
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
