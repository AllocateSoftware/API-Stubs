# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.duty_temp_staffing_note_created_event_all_of import DutyTempStaffingNoteCreatedEventAllOf
from api_server.models.event import Event
from api_server import util

from api_server.models.duty_temp_staffing_note_created_event_all_of import DutyTempStaffingNoteCreatedEventAllOf  # noqa: E501
from api_server.models.event import Event  # noqa: E501

class DutyTempStaffingNoteCreatedEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event_type=None, duty_id=None, note_id=None, content=None):  # noqa: E501
        """DutyTempStaffingNoteCreatedEvent - a model defined in OpenAPI

        :param event_type: The event_type of this DutyTempStaffingNoteCreatedEvent.  # noqa: E501
        :type event_type: str
        :param duty_id: The duty_id of this DutyTempStaffingNoteCreatedEvent.  # noqa: E501
        :type duty_id: str
        :param note_id: The note_id of this DutyTempStaffingNoteCreatedEvent.  # noqa: E501
        :type note_id: str
        :param content: The content of this DutyTempStaffingNoteCreatedEvent.  # noqa: E501
        :type content: str
        """
        self.openapi_types = {
            'event_type': str,
            'duty_id': str,
            'note_id': str,
            'content': str
        }

        self.attribute_map = {
            'event_type': 'eventType',
            'duty_id': 'dutyId',
            'note_id': 'noteId',
            'content': 'content'
        }

        self._event_type = event_type
        self._duty_id = duty_id
        self._note_id = note_id
        self._content = content

    @classmethod
    def from_dict(cls, dikt) -> 'DutyTempStaffingNoteCreatedEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DutyTempStaffingNoteCreatedEvent of this DutyTempStaffingNoteCreatedEvent.  # noqa: E501
        :rtype: DutyTempStaffingNoteCreatedEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event_type(self):
        """Gets the event_type of this DutyTempStaffingNoteCreatedEvent.


        :return: The event_type of this DutyTempStaffingNoteCreatedEvent.
        :rtype: str
        """
        return self._event_type

    @event_type.setter
    def event_type(self, event_type):
        """Sets the event_type of this DutyTempStaffingNoteCreatedEvent.


        :param event_type: The event_type of this DutyTempStaffingNoteCreatedEvent.
        :type event_type: str
        """
        if event_type is None:
            raise ValueError("Invalid value for `event_type`, must not be `None`")  # noqa: E501

        self._event_type = event_type

    @property
    def duty_id(self):
        """Gets the duty_id of this DutyTempStaffingNoteCreatedEvent.


        :return: The duty_id of this DutyTempStaffingNoteCreatedEvent.
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this DutyTempStaffingNoteCreatedEvent.


        :param duty_id: The duty_id of this DutyTempStaffingNoteCreatedEvent.
        :type duty_id: str
        """

        self._duty_id = duty_id

    @property
    def note_id(self):
        """Gets the note_id of this DutyTempStaffingNoteCreatedEvent.

        Identifier for the note  # noqa: E501

        :return: The note_id of this DutyTempStaffingNoteCreatedEvent.
        :rtype: str
        """
        return self._note_id

    @note_id.setter
    def note_id(self, note_id):
        """Sets the note_id of this DutyTempStaffingNoteCreatedEvent.

        Identifier for the note  # noqa: E501

        :param note_id: The note_id of this DutyTempStaffingNoteCreatedEvent.
        :type note_id: str
        """

        self._note_id = note_id

    @property
    def content(self):
        """Gets the content of this DutyTempStaffingNoteCreatedEvent.

        Content for the note  # noqa: E501

        :return: The content of this DutyTempStaffingNoteCreatedEvent.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this DutyTempStaffingNoteCreatedEvent.

        Content for the note  # noqa: E501

        :param content: The content of this DutyTempStaffingNoteCreatedEvent.
        :type content: str
        """

        self._content = content