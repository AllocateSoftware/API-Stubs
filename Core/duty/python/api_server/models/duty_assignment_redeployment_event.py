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


class DutyAssignmentRedeploymentEvent(object):
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
        'assignment_number': 'str',
        'original_duty': 'Duty',
        'new_duty': 'Duty'
    }

    attribute_map = {
        'assignment_number': 'assignmentNumber',
        'original_duty': 'originalDuty',
        'new_duty': 'newDuty'
    }

    def __init__(self, assignment_number=None, original_duty=None, new_duty=None, local_vars_configuration=None):  # noqa: E501
        """DutyAssignmentRedeploymentEvent - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._assignment_number = None
        self._original_duty = None
        self._new_duty = None
        self.discriminator = None

        if assignment_number is not None:
            self.assignment_number = assignment_number
        if original_duty is not None:
            self.original_duty = original_duty
        if new_duty is not None:
            self.new_duty = new_duty

    @property
    def assignment_number(self):
        """Gets the assignment_number of this DutyAssignmentRedeploymentEvent.  # noqa: E501


        :return: The assignment_number of this DutyAssignmentRedeploymentEvent.  # noqa: E501
        :rtype: str
        """
        return self._assignment_number

    @assignment_number.setter
    def assignment_number(self, assignment_number):
        """Sets the assignment_number of this DutyAssignmentRedeploymentEvent.


        :param assignment_number: The assignment_number of this DutyAssignmentRedeploymentEvent.  # noqa: E501
        :type: str
        """

        self._assignment_number = assignment_number

    @property
    def original_duty(self):
        """Gets the original_duty of this DutyAssignmentRedeploymentEvent.  # noqa: E501


        :return: The original_duty of this DutyAssignmentRedeploymentEvent.  # noqa: E501
        :rtype: Duty
        """
        return self._original_duty

    @original_duty.setter
    def original_duty(self, original_duty):
        """Sets the original_duty of this DutyAssignmentRedeploymentEvent.


        :param original_duty: The original_duty of this DutyAssignmentRedeploymentEvent.  # noqa: E501
        :type: Duty
        """

        self._original_duty = original_duty

    @property
    def new_duty(self):
        """Gets the new_duty of this DutyAssignmentRedeploymentEvent.  # noqa: E501


        :return: The new_duty of this DutyAssignmentRedeploymentEvent.  # noqa: E501
        :rtype: Duty
        """
        return self._new_duty

    @new_duty.setter
    def new_duty(self, new_duty):
        """Sets the new_duty of this DutyAssignmentRedeploymentEvent.


        :param new_duty: The new_duty of this DutyAssignmentRedeploymentEvent.  # noqa: E501
        :type: Duty
        """

        self._new_duty = new_duty

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
        if not isinstance(other, DutyAssignmentRedeploymentEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DutyAssignmentRedeploymentEvent):
            return True

        return self.to_dict() != other.to_dict()