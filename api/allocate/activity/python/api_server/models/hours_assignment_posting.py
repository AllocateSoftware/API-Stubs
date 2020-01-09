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


class HoursAssignmentPosting(object):
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
        'assignment_number': 'str'
    }

    attribute_map = {
        'assignment_number': 'assignmentNumber'
    }

    def __init__(self, assignment_number=None, local_vars_configuration=None):  # noqa: E501
        """HoursAssignmentPosting - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._assignment_number = None
        self.discriminator = None

        if assignment_number is not None:
            self.assignment_number = assignment_number

    @property
    def assignment_number(self):
        """Gets the assignment_number of this HoursAssignmentPosting.  # noqa: E501


        :return: The assignment_number of this HoursAssignmentPosting.  # noqa: E501
        :rtype: str
        """
        return self._assignment_number

    @assignment_number.setter
    def assignment_number(self, assignment_number):
        """Sets the assignment_number of this HoursAssignmentPosting.


        :param assignment_number: The assignment_number of this HoursAssignmentPosting.  # noqa: E501
        :type: str
        """

        self._assignment_number = assignment_number

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
        if not isinstance(other, HoursAssignmentPosting):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, HoursAssignmentPosting):
            return True

        return self.to_dict() != other.to_dict()
