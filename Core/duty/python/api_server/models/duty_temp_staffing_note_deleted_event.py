# coding: utf-8

"""
    Duties and Events

    ## Duties and Events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class DutyTempStaffingNoteDeletedEvent(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'duty_id': 'str',
        'note_id': 'str'
    }

    attribute_map = {
        'duty_id': 'dutyId',
        'note_id': 'noteId'
    }

    def __init__(self, duty_id=None, note_id=None, local_vars_configuration=None):  # noqa: E501
        """DutyTempStaffingNoteDeletedEvent - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._duty_id = None
        self._note_id = None
        self.discriminator = None

        if duty_id is not None:
            self.duty_id = duty_id
        if note_id is not None:
            self.note_id = note_id

    @property
    def duty_id(self):
        """Gets the duty_id of this DutyTempStaffingNoteDeletedEvent.  # noqa: E501


        :return: The duty_id of this DutyTempStaffingNoteDeletedEvent.  # noqa: E501
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this DutyTempStaffingNoteDeletedEvent.


        :param duty_id: The duty_id of this DutyTempStaffingNoteDeletedEvent.  # noqa: E501
        :type: str
        """

        self._duty_id = duty_id

    @property
    def note_id(self):
        """Gets the note_id of this DutyTempStaffingNoteDeletedEvent.  # noqa: E501

        Identifier for the note  # noqa: E501

        :return: The note_id of this DutyTempStaffingNoteDeletedEvent.  # noqa: E501
        :rtype: str
        """
        return self._note_id

    @note_id.setter
    def note_id(self, note_id):
        """Sets the note_id of this DutyTempStaffingNoteDeletedEvent.

        Identifier for the note  # noqa: E501

        :param note_id: The note_id of this DutyTempStaffingNoteDeletedEvent.  # noqa: E501
        :type: str
        """

        self._note_id = note_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, DutyTempStaffingNoteDeletedEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DutyTempStaffingNoteDeletedEvent):
            return True

        return self.to_dict() != other.to_dict()
