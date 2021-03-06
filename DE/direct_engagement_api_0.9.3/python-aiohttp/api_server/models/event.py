# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class Event(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_type: str=None, entity_type: str=None, entity_id: str=None, time_stamp: datetime=None):
        """Event - a model defined in OpenAPI

        :param event_type: The event_type of this Event.
        :param entity_type: The entity_type of this Event.
        :param entity_id: The entity_id of this Event.
        :param time_stamp: The time_stamp of this Event.
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
    def from_dict(cls, dikt: dict) -> 'Event':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Event of this Event.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event_type(self):
        """Gets the event_type of this Event.

        Type of change that is done to the entity

        :return: The event_type of this Event.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """Sets the event_type of this Event.

        Type of change that is done to the entity

        :param event_type: The event_type of this Event.
        :type event_type: str
        """
        allowed_values = ["CREATE", "DELETE", "UPDATE"]
        if event_type not in allowed_values:
            raise ValueError(
                "Invalid value for `event_type` ({0}), must be one of {1}"
                .format(event_type, allowed_values)
            )

        self._event_type = event_type

    @property
    def entity_type(self):
        """Gets the entity_type of this Event.

        Entity that is changed.

        :return: The entity_type of this Event.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """Sets the entity_type of this Event.

        Entity that is changed.

        :param entity_type: The entity_type of this Event.
        :type entity_type: str
        """
        allowed_values = ["duty", "timesheet", "booking", "grade", "agency", "reason_for_vacancy", "contract_status", "staff_group", "unit"]
        if entity_type not in allowed_values:
            raise ValueError(
                "Invalid value for `entity_type` ({0}), must be one of {1}"
                .format(entity_type, allowed_values)
            )

        self._entity_type = entity_type

    @property
    def entity_id(self):
        """Gets the entity_id of this Event.

        Trust identifier of the changed entity

        :return: The entity_id of this Event.
        :rtype: str
        """
        return self._entity_id

    @entity_id.setter
    def entity_id(self, entity_id):
        """Sets the entity_id of this Event.

        Trust identifier of the changed entity

        :param entity_id: The entity_id of this Event.
        :type entity_id: str
        """

        self._entity_id = entity_id

    @property
    def time_stamp(self):
        """Gets the time_stamp of this Event.

        Timestamp of the event

        :return: The time_stamp of this Event.
        :rtype: datetime
        """
        return self._time_stamp

    @time_stamp.setter
    def time_stamp(self, time_stamp):
        """Sets the time_stamp of this Event.

        Timestamp of the event

        :param time_stamp: The time_stamp of this Event.
        :type time_stamp: datetime
        """

        self._time_stamp = time_stamp
