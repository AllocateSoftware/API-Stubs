# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class Event(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_type=None, entity_type=None, entity_id=None, time_stamp=None):  # noqa: E501
        """Event - a model defined in OpenAPI

        :param event_type: The event_type of this Event.  # noqa: E501
        :type event_type: str
        :param entity_type: The entity_type of this Event.  # noqa: E501
        :type entity_type: str
        :param entity_id: The entity_id of this Event.  # noqa: E501
        :type entity_id: str
        :param time_stamp: The time_stamp of this Event.  # noqa: E501
        :type time_stamp: datetime
        """
        self.openapi_types = {
            'event_type': str,
            'entity_type': str,
            'entity_id': str,
            'time_stamp': datetime
        }

        self.attribute_map = {
            'event_type': 'eventType',
            'entity_type': 'entityType',
            'entity_id': 'entityId',
            'time_stamp': 'timeStamp'
        }

        self._event_type = event_type
        self._entity_type = entity_type
        self._entity_id = entity_id
        self._time_stamp = time_stamp

    @classmethod
    def from_dict(cls, dikt) -> 'Event':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Event of this Event.  # noqa: E501
        :rtype: Event
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event_type(self):
        """Gets the event_type of this Event.

        Type of change that is done to the entity  # noqa: E501

        :return: The event_type of this Event.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """Sets the event_type of this Event.

        Type of change that is done to the entity  # noqa: E501

        :param event_type: The event_type of this Event.
        :type event_type: str
        """
        allowed_values = ["CREATE", "DELETE", "UPDATE"]  # noqa: E501
        if event_type not in allowed_values:
            raise ValueError(
                "Invalid value for `event_type` ({0}), must be one of {1}"
                .format(event_type, allowed_values)
            )

        self._event_type = event_type

    @property
    def entity_type(self):
        """Gets the entity_type of this Event.

        Entity that is changed.  # noqa: E501

        :return: The entity_type of this Event.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """Sets the entity_type of this Event.

        Entity that is changed.  # noqa: E501

        :param entity_type: The entity_type of this Event.
        :type entity_type: str
        """
        allowed_values = ["duty", "timesheet", "booking", "grade", "agency", "reason_for_vacancy", "contract_status", "staff_group", "unit"]  # noqa: E501
        if entity_type not in allowed_values:
            raise ValueError(
                "Invalid value for `entity_type` ({0}), must be one of {1}"
                .format(entity_type, allowed_values)
            )

        self._entity_type = entity_type

    @property
    def entity_id(self):
        """Gets the entity_id of this Event.

        Trust identifier of the changed entity  # noqa: E501

        :return: The entity_id of this Event.
        :rtype: str
        """
        return self._entity_id

    @entity_id.setter
    def entity_id(self, entity_id):
        """Sets the entity_id of this Event.

        Trust identifier of the changed entity  # noqa: E501

        :param entity_id: The entity_id of this Event.
        :type entity_id: str
        """

        self._entity_id = entity_id

    @property
    def time_stamp(self):
        """Gets the time_stamp of this Event.

        Timestamp of the event  # noqa: E501

        :return: The time_stamp of this Event.
        :rtype: datetime
        """
        return self._time_stamp

    @time_stamp.setter
    def time_stamp(self, time_stamp):
        """Sets the time_stamp of this Event.

        Timestamp of the event  # noqa: E501

        :param time_stamp: The time_stamp of this Event.
        :type time_stamp: datetime
        """

        self._time_stamp = time_stamp
