# coding: utf-8

"""
    Vacancy Booking API and Events

         ## Duty Booking API and events and Events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class InlineObject(object):
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
        'proposal_id': 'str',
        'times': 'TimeSpan',
        '_break': 'int'
    }

    attribute_map = {
        'proposal_id': 'proposalId',
        'times': 'times',
        '_break': 'break'
    }

    def __init__(self, proposal_id=None, times=None, _break=None, local_vars_configuration=None):  # noqa: E501
        """InlineObject - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._proposal_id = None
        self._times = None
        self.__break = None
        self.discriminator = None

        if proposal_id is not None:
            self.proposal_id = proposal_id
        if times is not None:
            self.times = times
        if _break is not None:
            self._break = _break

    @property
    def proposal_id(self):
        """Gets the proposal_id of this InlineObject.  # noqa: E501

        The ID of the orignal proposal (booking)  # noqa: E501

        :return: The proposal_id of this InlineObject.  # noqa: E501
        :rtype: str
        """
        return self._proposal_id

    @proposal_id.setter
    def proposal_id(self, proposal_id):
        """Sets the proposal_id of this InlineObject.

        The ID of the orignal proposal (booking)  # noqa: E501

        :param proposal_id: The proposal_id of this InlineObject.  # noqa: E501
        :type: str
        """

        self._proposal_id = proposal_id

    @property
    def times(self):
        """Gets the times of this InlineObject.  # noqa: E501


        :return: The times of this InlineObject.  # noqa: E501
        :rtype: TimeSpan
        """
        return self._times

    @times.setter
    def times(self, times):
        """Sets the times of this InlineObject.


        :param times: The times of this InlineObject.  # noqa: E501
        :type: TimeSpan
        """

        self._times = times

    @property
    def _break(self):
        """Gets the _break of this InlineObject.  # noqa: E501

        Break time in minutes  # noqa: E501

        :return: The _break of this InlineObject.  # noqa: E501
        :rtype: int
        """
        return self.__break

    @_break.setter
    def _break(self, _break):
        """Sets the _break of this InlineObject.

        Break time in minutes  # noqa: E501

        :param _break: The _break of this InlineObject.  # noqa: E501
        :type: int
        """

        self.__break = _break

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
        if not isinstance(other, InlineObject):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, InlineObject):
            return True

        return self.to_dict() != other.to_dict()