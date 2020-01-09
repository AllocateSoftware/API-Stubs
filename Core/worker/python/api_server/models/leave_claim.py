# coding: utf-8

"""
    Workers

    ## Workers and events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class LeaveClaim(object):
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
        'when': 'LeaveClaimWhen',
        'reason': 'str'
    }

    attribute_map = {
        'when': 'when',
        'reason': 'reason'
    }

    def __init__(self, when=None, reason=None, local_vars_configuration=None):  # noqa: E501
        """LeaveClaim - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._when = None
        self._reason = None
        self.discriminator = None

        if when is not None:
            self.when = when
        if reason is not None:
            self.reason = reason

    @property
    def when(self):
        """Gets the when of this LeaveClaim.  # noqa: E501


        :return: The when of this LeaveClaim.  # noqa: E501
        :rtype: LeaveClaimWhen
        """
        return self._when

    @when.setter
    def when(self, when):
        """Sets the when of this LeaveClaim.


        :param when: The when of this LeaveClaim.  # noqa: E501
        :type: LeaveClaimWhen
        """

        self._when = when

    @property
    def reason(self):
        """Gets the reason of this LeaveClaim.  # noqa: E501

        The reason for the leave claim  # noqa: E501

        :return: The reason of this LeaveClaim.  # noqa: E501
        :rtype: str
        """
        return self._reason

    @reason.setter
    def reason(self, reason):
        """Sets the reason of this LeaveClaim.

        The reason for the leave claim  # noqa: E501

        :param reason: The reason of this LeaveClaim.  # noqa: E501
        :type: str
        """
        allowed_values = ["annualLeave"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and reason not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `reason` ({0}), must be one of {1}"  # noqa: E501
                .format(reason, allowed_values)
            )

        self._reason = reason

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
        if not isinstance(other, LeaveClaim):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, LeaveClaim):
            return True

        return self.to_dict() != other.to_dict()
