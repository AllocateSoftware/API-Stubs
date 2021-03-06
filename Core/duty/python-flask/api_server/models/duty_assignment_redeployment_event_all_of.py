# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.duty import Duty
from api_server import util

from api_server.models.duty import Duty  # noqa: E501

class DutyAssignmentRedeploymentEventAllOf(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assignment_number=None, original_duty=None, new_duty=None):  # noqa: E501
        """DutyAssignmentRedeploymentEventAllOf - a model defined in OpenAPI

        :param assignment_number: The assignment_number of this DutyAssignmentRedeploymentEventAllOf.  # noqa: E501
        :type assignment_number: str
        :param original_duty: The original_duty of this DutyAssignmentRedeploymentEventAllOf.  # noqa: E501
        :type original_duty: Duty
        :param new_duty: The new_duty of this DutyAssignmentRedeploymentEventAllOf.  # noqa: E501
        :type new_duty: Duty
        """
        self.openapi_types = {
            'assignment_number': str,
            'original_duty': Duty,
            'new_duty': Duty
        }

        self.attribute_map = {
            'assignment_number': 'assignmentNumber',
            'original_duty': 'originalDuty',
            'new_duty': 'newDuty'
        }

        self._assignment_number = assignment_number
        self._original_duty = original_duty
        self._new_duty = new_duty

    @classmethod
    def from_dict(cls, dikt) -> 'DutyAssignmentRedeploymentEventAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DutyAssignmentRedeploymentEvent_allOf of this DutyAssignmentRedeploymentEventAllOf.  # noqa: E501
        :rtype: DutyAssignmentRedeploymentEventAllOf
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assignment_number(self):
        """Gets the assignment_number of this DutyAssignmentRedeploymentEventAllOf.


        :return: The assignment_number of this DutyAssignmentRedeploymentEventAllOf.
        :rtype: str
        """
        return self._assignment_number

    @assignment_number.setter
    def assignment_number(self, assignment_number):
        """Sets the assignment_number of this DutyAssignmentRedeploymentEventAllOf.


        :param assignment_number: The assignment_number of this DutyAssignmentRedeploymentEventAllOf.
        :type assignment_number: str
        """

        self._assignment_number = assignment_number

    @property
    def original_duty(self):
        """Gets the original_duty of this DutyAssignmentRedeploymentEventAllOf.


        :return: The original_duty of this DutyAssignmentRedeploymentEventAllOf.
        :rtype: Duty
        """
        return self._original_duty

    @original_duty.setter
    def original_duty(self, original_duty):
        """Sets the original_duty of this DutyAssignmentRedeploymentEventAllOf.


        :param original_duty: The original_duty of this DutyAssignmentRedeploymentEventAllOf.
        :type original_duty: Duty
        """

        self._original_duty = original_duty

    @property
    def new_duty(self):
        """Gets the new_duty of this DutyAssignmentRedeploymentEventAllOf.


        :return: The new_duty of this DutyAssignmentRedeploymentEventAllOf.
        :rtype: Duty
        """
        return self._new_duty

    @new_duty.setter
    def new_duty(self, new_duty):
        """Sets the new_duty of this DutyAssignmentRedeploymentEventAllOf.


        :param new_duty: The new_duty of this DutyAssignmentRedeploymentEventAllOf.
        :type new_duty: Duty
        """

        self._new_duty = new_duty
