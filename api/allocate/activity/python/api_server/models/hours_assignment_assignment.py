# coding: utf-8

"""
    Activity API

         ## API for querying worker activity.      This is an early availabilty API, and is subject to change.   # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class HoursAssignmentAssignment(object):
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
        'method': 'str',
        'from_request': 'bool'
    }

    attribute_map = {
        'method': 'method',
        'from_request': 'fromRequest'
    }

    def __init__(self, method=None, from_request=None, local_vars_configuration=None):  # noqa: E501
        """HoursAssignmentAssignment - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._method = None
        self._from_request = None
        self.discriminator = None

        if method is not None:
            self.method = method
        if from_request is not None:
            self.from_request = from_request

    @property
    def method(self):
        """Gets the method of this HoursAssignmentAssignment.  # noqa: E501

        How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest   # noqa: E501

        :return: The method of this HoursAssignmentAssignment.  # noqa: E501
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method):
        """Sets the method of this HoursAssignmentAssignment.

        How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest   # noqa: E501

        :param method: The method of this HoursAssignmentAssignment.  # noqa: E501
        :type: str
        """
        allowed_values = ["unspecified", "autoroster", "manualManagerAssignment", "employeeWebTimesheet", "externalAssignment", "employeeRequest"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and method not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `method` ({0}), must be one of {1}"  # noqa: E501
                .format(method, allowed_values)
            )

        self._method = method

    @property
    def from_request(self):
        """Gets the from_request of this HoursAssignmentAssignment.  # noqa: E501

        Did the employee request this assignment? Yes/No  # noqa: E501

        :return: The from_request of this HoursAssignmentAssignment.  # noqa: E501
        :rtype: bool
        """
        return self._from_request

    @from_request.setter
    def from_request(self, from_request):
        """Sets the from_request of this HoursAssignmentAssignment.

        Did the employee request this assignment? Yes/No  # noqa: E501

        :param from_request: The from_request of this HoursAssignmentAssignment.  # noqa: E501
        :type: bool
        """

        self._from_request = from_request

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
        if not isinstance(other, HoursAssignmentAssignment):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, HoursAssignmentAssignment):
            return True

        return self.to_dict() != other.to_dict()