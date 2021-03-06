# coding: utf-8

"""
    VMS API

    ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class Duty(object):
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
        'id': 'str',
        'when': 'DutyTiming',
        'where': 'DutyLocation',
        'requirements': 'DutyRequirements',
        'client_dept_id': 'str',
        'sub_discipline': 'str',
        'grade': 'str',
        'fallback_grade': 'str',
        'vacancy_reason': 'str',
        'po_number': 'int',
        'unique_number': 'int',
        'agency': 'str'
    }

    attribute_map = {
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

    def __init__(self, id=None, when=None, where=None, requirements=None, client_dept_id=None, sub_discipline=None, grade=None, fallback_grade=None, vacancy_reason=None, po_number=None, unique_number=None, agency=None, local_vars_configuration=None):  # noqa: E501
        """Duty - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._when = None
        self._where = None
        self._requirements = None
        self._client_dept_id = None
        self._sub_discipline = None
        self._grade = None
        self._fallback_grade = None
        self._vacancy_reason = None
        self._po_number = None
        self._unique_number = None
        self._agency = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if when is not None:
            self.when = when
        if where is not None:
            self.where = where
        if requirements is not None:
            self.requirements = requirements
        if client_dept_id is not None:
            self.client_dept_id = client_dept_id
        if sub_discipline is not None:
            self.sub_discipline = sub_discipline
        if grade is not None:
            self.grade = grade
        if fallback_grade is not None:
            self.fallback_grade = fallback_grade
        if vacancy_reason is not None:
            self.vacancy_reason = vacancy_reason
        if po_number is not None:
            self.po_number = po_number
        if unique_number is not None:
            self.unique_number = unique_number
        if agency is not None:
            self.agency = agency

    @property
    def id(self):
        """Gets the id of this Duty.  # noqa: E501

        ID of the duty (from the source system)  # noqa: E501

        :return: The id of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Duty.

        ID of the duty (from the source system)  # noqa: E501

        :param id: The id of this Duty.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def when(self):
        """Gets the when of this Duty.  # noqa: E501


        :return: The when of this Duty.  # noqa: E501
        :rtype: DutyTiming
        """
        return self._when

    @when.setter
    def when(self, when):
        """Sets the when of this Duty.


        :param when: The when of this Duty.  # noqa: E501
        :type: DutyTiming
        """

        self._when = when

    @property
    def where(self):
        """Gets the where of this Duty.  # noqa: E501


        :return: The where of this Duty.  # noqa: E501
        :rtype: DutyLocation
        """
        return self._where

    @where.setter
    def where(self, where):
        """Sets the where of this Duty.


        :param where: The where of this Duty.  # noqa: E501
        :type: DutyLocation
        """

        self._where = where

    @property
    def requirements(self):
        """Gets the requirements of this Duty.  # noqa: E501


        :return: The requirements of this Duty.  # noqa: E501
        :rtype: DutyRequirements
        """
        return self._requirements

    @requirements.setter
    def requirements(self, requirements):
        """Sets the requirements of this Duty.


        :param requirements: The requirements of this Duty.  # noqa: E501
        :type: DutyRequirements
        """

        self._requirements = requirements

    @property
    def client_dept_id(self):
        """Gets the client_dept_id of this Duty.  # noqa: E501

        BankStaff ward trust identifier  # noqa: E501

        :return: The client_dept_id of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._client_dept_id

    @client_dept_id.setter
    def client_dept_id(self, client_dept_id):
        """Sets the client_dept_id of this Duty.

        BankStaff ward trust identifier  # noqa: E501

        :param client_dept_id: The client_dept_id of this Duty.  # noqa: E501
        :type: str
        """

        self._client_dept_id = client_dept_id

    @property
    def sub_discipline(self):
        """Gets the sub_discipline of this Duty.  # noqa: E501

        Staff group trust identifier  # noqa: E501

        :return: The sub_discipline of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._sub_discipline

    @sub_discipline.setter
    def sub_discipline(self, sub_discipline):
        """Sets the sub_discipline of this Duty.

        Staff group trust identifier  # noqa: E501

        :param sub_discipline: The sub_discipline of this Duty.  # noqa: E501
        :type: str
        """

        self._sub_discipline = sub_discipline

    @property
    def grade(self):
        """Gets the grade of this Duty.  # noqa: E501

        Grade trust identifier of the request  # noqa: E501

        :return: The grade of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._grade

    @grade.setter
    def grade(self, grade):
        """Sets the grade of this Duty.

        Grade trust identifier of the request  # noqa: E501

        :param grade: The grade of this Duty.  # noqa: E501
        :type: str
        """

        self._grade = grade

    @property
    def fallback_grade(self):
        """Gets the fallback_grade of this Duty.  # noqa: E501


        :return: The fallback_grade of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._fallback_grade

    @fallback_grade.setter
    def fallback_grade(self, fallback_grade):
        """Sets the fallback_grade of this Duty.


        :param fallback_grade: The fallback_grade of this Duty.  # noqa: E501
        :type: str
        """

        self._fallback_grade = fallback_grade

    @property
    def vacancy_reason(self):
        """Gets the vacancy_reason of this Duty.  # noqa: E501


        :return: The vacancy_reason of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._vacancy_reason

    @vacancy_reason.setter
    def vacancy_reason(self, vacancy_reason):
        """Sets the vacancy_reason of this Duty.


        :param vacancy_reason: The vacancy_reason of this Duty.  # noqa: E501
        :type: str
        """

        self._vacancy_reason = vacancy_reason

    @property
    def po_number(self):
        """Gets the po_number of this Duty.  # noqa: E501

        Need to understand if needed from Trust/Agency  # noqa: E501

        :return: The po_number of this Duty.  # noqa: E501
        :rtype: int
        """
        return self._po_number

    @po_number.setter
    def po_number(self, po_number):
        """Sets the po_number of this Duty.

        Need to understand if needed from Trust/Agency  # noqa: E501

        :param po_number: The po_number of this Duty.  # noqa: E501
        :type: int
        """

        self._po_number = po_number

    @property
    def unique_number(self):
        """Gets the unique_number of this Duty.  # noqa: E501

        BRN / Unique number  # noqa: E501

        :return: The unique_number of this Duty.  # noqa: E501
        :rtype: int
        """
        return self._unique_number

    @unique_number.setter
    def unique_number(self, unique_number):
        """Sets the unique_number of this Duty.

        BRN / Unique number  # noqa: E501

        :param unique_number: The unique_number of this Duty.  # noqa: E501
        :type: int
        """

        self._unique_number = unique_number

    @property
    def agency(self):
        """Gets the agency of this Duty.  # noqa: E501

        Supplying agency for the duty  # noqa: E501

        :return: The agency of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._agency

    @agency.setter
    def agency(self, agency):
        """Sets the agency of this Duty.

        Supplying agency for the duty  # noqa: E501

        :param agency: The agency of this Duty.  # noqa: E501
        :type: str
        """

        self._agency = agency

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
        if not isinstance(other, Duty):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Duty):
            return True

        return self.to_dict() != other.to_dict()
