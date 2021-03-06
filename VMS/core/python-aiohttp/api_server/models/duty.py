# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.duty_location import DutyLocation
from api_server.models.duty_requirements import DutyRequirements
from api_server.models.duty_timing import DutyTiming
from api_server import util


class Duty(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, when: DutyTiming=None, where: DutyLocation=None, requirements: DutyRequirements=None, client_dept_id: str=None, sub_discipline: str=None, grade: str=None, fallback_grade: str=None, vacancy_reason: str=None, po_number: int=None, unique_number: int=None, agency: str=None):
        """Duty - a model defined in OpenAPI

        :param id: The id of this Duty.
        :param when: The when of this Duty.
        :param where: The where of this Duty.
        :param requirements: The requirements of this Duty.
        :param client_dept_id: The client_dept_id of this Duty.
        :param sub_discipline: The sub_discipline of this Duty.
        :param grade: The grade of this Duty.
        :param fallback_grade: The fallback_grade of this Duty.
        :param vacancy_reason: The vacancy_reason of this Duty.
        :param po_number: The po_number of this Duty.
        :param unique_number: The unique_number of this Duty.
        :param agency: The agency of this Duty.
        """
        self.openapi_types = {
            'id': str,
            'when': DutyTiming,
            'where': DutyLocation,
            'requirements': DutyRequirements,
            'client_dept_id': str,
            'sub_discipline': str,
            'grade': str,
            'fallback_grade': str,
            'vacancy_reason': str,
            'po_number': int,
            'unique_number': int,
            'agency': str
        }

        self.attribute_map = {
            'id': 'id',
            'when': 'when',
            'where': 'where',
            'requirements': 'requirements',
            'client_dept_id': 'clientDeptId',
            'sub_discipline': 'subDiscipline',
            'grade': 'grade',
            'fallback_grade': 'fallbackGrade',
            'vacancy_reason': 'vacancyReason',
            'po_number': 'poNumber',
            'unique_number': 'uniqueNumber',
            'agency': 'agency'
        }

        self._id = id
        self._when = when
        self._where = where
        self._requirements = requirements
        self._client_dept_id = client_dept_id
        self._sub_discipline = sub_discipline
        self._grade = grade
        self._fallback_grade = fallback_grade
        self._vacancy_reason = vacancy_reason
        self._po_number = po_number
        self._unique_number = unique_number
        self._agency = agency

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Duty':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Duty of this Duty.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this Duty.

        ID of the duty (from the source system)

        :return: The id of this Duty.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Duty.

        ID of the duty (from the source system)

        :param id: The id of this Duty.
        :type id: str
        """

        self._id = id

    @property
    def when(self):
        """Gets the when of this Duty.


        :return: The when of this Duty.
        :rtype: DutyTiming
        """
        return self._when

    @when.setter
    def when(self, when):
        """Sets the when of this Duty.


        :param when: The when of this Duty.
        :type when: DutyTiming
        """

        self._when = when

    @property
    def where(self):
        """Gets the where of this Duty.


        :return: The where of this Duty.
        :rtype: DutyLocation
        """
        return self._where

    @where.setter
    def where(self, where):
        """Sets the where of this Duty.


        :param where: The where of this Duty.
        :type where: DutyLocation
        """

        self._where = where

    @property
    def requirements(self):
        """Gets the requirements of this Duty.


        :return: The requirements of this Duty.
        :rtype: DutyRequirements
        """
        return self._requirements

    @requirements.setter
    def requirements(self, requirements):
        """Sets the requirements of this Duty.


        :param requirements: The requirements of this Duty.
        :type requirements: DutyRequirements
        """

        self._requirements = requirements

    @property
    def client_dept_id(self):
        """Gets the client_dept_id of this Duty.

        BankStaff ward trust identifier

        :return: The client_dept_id of this Duty.
        :rtype: str
        """
        return self._client_dept_id

    @client_dept_id.setter
    def client_dept_id(self, client_dept_id):
        """Sets the client_dept_id of this Duty.

        BankStaff ward trust identifier

        :param client_dept_id: The client_dept_id of this Duty.
        :type client_dept_id: str
        """

        self._client_dept_id = client_dept_id

    @property
    def sub_discipline(self):
        """Gets the sub_discipline of this Duty.

        Staff group trust identifier

        :return: The sub_discipline of this Duty.
        :rtype: str
        """
        return self._sub_discipline

    @sub_discipline.setter
    def sub_discipline(self, sub_discipline):
        """Sets the sub_discipline of this Duty.

        Staff group trust identifier

        :param sub_discipline: The sub_discipline of this Duty.
        :type sub_discipline: str
        """

        self._sub_discipline = sub_discipline

    @property
    def grade(self):
        """Gets the grade of this Duty.

        Grade trust identifier of the request

        :return: The grade of this Duty.
        :rtype: str
        """
        return self._grade

    @grade.setter
    def grade(self, grade):
        """Sets the grade of this Duty.

        Grade trust identifier of the request

        :param grade: The grade of this Duty.
        :type grade: str
        """

        self._grade = grade

    @property
    def fallback_grade(self):
        """Gets the fallback_grade of this Duty.


        :return: The fallback_grade of this Duty.
        :rtype: str
        """
        return self._fallback_grade

    @fallback_grade.setter
    def fallback_grade(self, fallback_grade):
        """Sets the fallback_grade of this Duty.


        :param fallback_grade: The fallback_grade of this Duty.
        :type fallback_grade: str
        """

        self._fallback_grade = fallback_grade

    @property
    def vacancy_reason(self):
        """Gets the vacancy_reason of this Duty.


        :return: The vacancy_reason of this Duty.
        :rtype: str
        """
        return self._vacancy_reason

    @vacancy_reason.setter
    def vacancy_reason(self, vacancy_reason):
        """Sets the vacancy_reason of this Duty.


        :param vacancy_reason: The vacancy_reason of this Duty.
        :type vacancy_reason: str
        """

        self._vacancy_reason = vacancy_reason

    @property
    def po_number(self):
        """Gets the po_number of this Duty.

        Need to understand if needed from Trust/Agency

        :return: The po_number of this Duty.
        :rtype: int
        """
        return self._po_number

    @po_number.setter
    def po_number(self, po_number):
        """Sets the po_number of this Duty.

        Need to understand if needed from Trust/Agency

        :param po_number: The po_number of this Duty.
        :type po_number: int
        """

        self._po_number = po_number

    @property
    def unique_number(self):
        """Gets the unique_number of this Duty.

        BRN / Unique number

        :return: The unique_number of this Duty.
        :rtype: int
        """
        return self._unique_number

    @unique_number.setter
    def unique_number(self, unique_number):
        """Sets the unique_number of this Duty.

        BRN / Unique number

        :param unique_number: The unique_number of this Duty.
        :type unique_number: int
        """

        self._unique_number = unique_number

    @property
    def agency(self):
        """Gets the agency of this Duty.

        Supplying agency for the duty

        :return: The agency of this Duty.
        :rtype: str
        """
        return self._agency

    @agency.setter
    def agency(self, agency):
        """Sets the agency of this Duty.

        Supplying agency for the duty

        :param agency: The agency of this Duty.
        :type agency: str
        """

        self._agency = agency
