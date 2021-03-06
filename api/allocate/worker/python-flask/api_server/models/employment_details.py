# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class EmploymentDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, employment_status=None, employee_type=None, hire_details=None, date_joined_nhs=None, al_accrual_plan=None, prev_employer=None, agencies=None):  # noqa: E501
        """EmploymentDetails - a model defined in OpenAPI

        :param employment_status: The employment_status of this EmploymentDetails.  # noqa: E501
        :type employment_status: str
        :param employee_type: The employee_type of this EmploymentDetails.  # noqa: E501
        :type employee_type: str
        :param hire_details: The hire_details of this EmploymentDetails.  # noqa: E501
        :type hire_details: str
        :param date_joined_nhs: The date_joined_nhs of this EmploymentDetails.  # noqa: E501
        :type date_joined_nhs: str
        :param al_accrual_plan: The al_accrual_plan of this EmploymentDetails.  # noqa: E501
        :type al_accrual_plan: str
        :param prev_employer: The prev_employer of this EmploymentDetails.  # noqa: E501
        :type prev_employer: str
        :param agencies: The agencies of this EmploymentDetails.  # noqa: E501
        :type agencies: str
        """
        self.openapi_types = {
            'employment_status': str,
            'employee_type': str,
            'hire_details': str,
            'date_joined_nhs': str,
            'al_accrual_plan': str,
            'prev_employer': str,
            'agencies': str
        }

        self.attribute_map = {
            'employment_status': 'employmentStatus',
            'employee_type': 'employeeType',
            'hire_details': 'hireDetails',
            'date_joined_nhs': 'dateJoinedNHS',
            'al_accrual_plan': 'alAccrualPlan',
            'prev_employer': 'prevEmployer',
            'agencies': 'agencies'
        }

        self._employment_status = employment_status
        self._employee_type = employee_type
        self._hire_details = hire_details
        self._date_joined_nhs = date_joined_nhs
        self._al_accrual_plan = al_accrual_plan
        self._prev_employer = prev_employer
        self._agencies = agencies

    @classmethod
    def from_dict(cls, dikt) -> 'EmploymentDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EmploymentDetails of this EmploymentDetails.  # noqa: E501
        :rtype: EmploymentDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def employment_status(self):
        """Gets the employment_status of this EmploymentDetails.


        :return: The employment_status of this EmploymentDetails.
        :rtype: str
        """
        return self._employment_status

    @employment_status.setter
    def employment_status(self, employment_status):
        """Sets the employment_status of this EmploymentDetails.


        :param employment_status: The employment_status of this EmploymentDetails.
        :type employment_status: str
        """

        self._employment_status = employment_status

    @property
    def employee_type(self):
        """Gets the employee_type of this EmploymentDetails.


        :return: The employee_type of this EmploymentDetails.
        :rtype: str
        """
        return self._employee_type

    @employee_type.setter
    def employee_type(self, employee_type):
        """Sets the employee_type of this EmploymentDetails.


        :param employee_type: The employee_type of this EmploymentDetails.
        :type employee_type: str
        """

        self._employee_type = employee_type

    @property
    def hire_details(self):
        """Gets the hire_details of this EmploymentDetails.


        :return: The hire_details of this EmploymentDetails.
        :rtype: str
        """
        return self._hire_details

    @hire_details.setter
    def hire_details(self, hire_details):
        """Sets the hire_details of this EmploymentDetails.


        :param hire_details: The hire_details of this EmploymentDetails.
        :type hire_details: str
        """
        if hire_details is None:
            raise ValueError("Invalid value for `hire_details`, must not be `None`")  # noqa: E501

        self._hire_details = hire_details

    @property
    def date_joined_nhs(self):
        """Gets the date_joined_nhs of this EmploymentDetails.


        :return: The date_joined_nhs of this EmploymentDetails.
        :rtype: str
        """
        return self._date_joined_nhs

    @date_joined_nhs.setter
    def date_joined_nhs(self, date_joined_nhs):
        """Sets the date_joined_nhs of this EmploymentDetails.


        :param date_joined_nhs: The date_joined_nhs of this EmploymentDetails.
        :type date_joined_nhs: str
        """

        self._date_joined_nhs = date_joined_nhs

    @property
    def al_accrual_plan(self):
        """Gets the al_accrual_plan of this EmploymentDetails.


        :return: The al_accrual_plan of this EmploymentDetails.
        :rtype: str
        """
        return self._al_accrual_plan

    @al_accrual_plan.setter
    def al_accrual_plan(self, al_accrual_plan):
        """Sets the al_accrual_plan of this EmploymentDetails.


        :param al_accrual_plan: The al_accrual_plan of this EmploymentDetails.
        :type al_accrual_plan: str
        """

        self._al_accrual_plan = al_accrual_plan

    @property
    def prev_employer(self):
        """Gets the prev_employer of this EmploymentDetails.


        :return: The prev_employer of this EmploymentDetails.
        :rtype: str
        """
        return self._prev_employer

    @prev_employer.setter
    def prev_employer(self, prev_employer):
        """Sets the prev_employer of this EmploymentDetails.


        :param prev_employer: The prev_employer of this EmploymentDetails.
        :type prev_employer: str
        """

        self._prev_employer = prev_employer

    @property
    def agencies(self):
        """Gets the agencies of this EmploymentDetails.


        :return: The agencies of this EmploymentDetails.
        :rtype: str
        """
        return self._agencies

    @agencies.setter
    def agencies(self, agencies):
        """Sets the agencies of this EmploymentDetails.


        :param agencies: The agencies of this EmploymentDetails.
        :type agencies: str
        """

        self._agencies = agencies
