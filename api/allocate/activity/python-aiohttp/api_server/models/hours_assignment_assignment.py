# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class HoursAssignmentAssignment(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, method: str=None, from_request: bool=None):
        """HoursAssignmentAssignment - a model defined in OpenAPI

        :param method: The method of this HoursAssignmentAssignment.
        :param from_request: The from_request of this HoursAssignmentAssignment.
        """
        self.openapi_types = {
            'method': str,
            'from_request': bool
        }

        self.attribute_map = {
            'method': 'method',
            'from_request': 'fromRequest'
        }

        self._method = method
        self._from_request = from_request

    @classmethod
    def from_dict(cls, dikt: dict) -> 'HoursAssignmentAssignment':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The HoursAssignment_assignment of this HoursAssignmentAssignment.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def method(self):
        """Gets the method of this HoursAssignmentAssignment.

        How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 

        :return: The method of this HoursAssignmentAssignment.
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method):
        """Sets the method of this HoursAssignmentAssignment.

        How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 

        :param method: The method of this HoursAssignmentAssignment.
        :type method: str
        """
        allowed_values = ["unspecified", "autoroster", "manualManagerAssignment", "employeeWebTimesheet", "externalAssignment", "employeeRequest"]
        if method not in allowed_values:
            raise ValueError(
                "Invalid value for `method` ({0}), must be one of {1}"
                .format(method, allowed_values)
            )

        self._method = method

    @property
    def from_request(self):
        """Gets the from_request of this HoursAssignmentAssignment.

        Did the employee request this assignment? Yes/No

        :return: The from_request of this HoursAssignmentAssignment.
        :rtype: bool
        """
        return self._from_request

    @from_request.setter
    def from_request(self, from_request):
        """Sets the from_request of this HoursAssignmentAssignment.

        Did the employee request this assignment? Yes/No

        :param from_request: The from_request of this HoursAssignmentAssignment.
        :type from_request: bool
        """

        self._from_request = from_request
