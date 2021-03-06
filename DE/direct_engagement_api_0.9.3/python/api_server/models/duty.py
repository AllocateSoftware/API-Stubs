# coding: utf-8

"""
    DE Provider Direct Engagement API

    description  # noqa: E501

    The version of the OpenAPI document: 1.0
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
        'duty_id': 'str',
        'slave_duty_id': 'str',
        'block_id': 'str',
        'client_dept_id': 'str',
        'sub_discipline': 'str',
        'request_gender': 'RequestGender',
        'grade': 'str',
        'fallback_grade': 'str',
        'vacancy_reason': 'str',
        'date': 'date',
        'start_time': 'str',
        'end_time': 'str',
        'break_duration': 'int',
        'po_number': 'int',
        'unique_number': 'int',
        'agency': 'str',
        'skill': 'str',
        'specialty': 'str',
        'fallback_skill': 'str',
        'fallback_speciality': 'str',
        'status': 'str',
        'rates': 'list[Rates]',
        'time_interval_rates': 'list[TimeIntervalRates]',
        'person': 'Person'
    }

    attribute_map = {
        'duty_id': 'dutyId',
        'slave_duty_id': 'slaveDutyId',
        'block_id': 'blockId',
        'client_dept_id': 'clientDeptId',
        'sub_discipline': 'subDiscipline',
        'request_gender': 'requestGender',
        'grade': 'grade',
        'fallback_grade': 'fallbackGrade',
        'vacancy_reason': 'vacancyReason',
        'date': 'date',
        'start_time': 'startTime',
        'end_time': 'endTime',
        'break_duration': 'breakDuration',
        'po_number': 'poNumber',
        'unique_number': 'uniqueNumber',
        'agency': 'agency',
        'skill': 'skill',
        'specialty': 'specialty',
        'fallback_skill': 'fallbackSkill',
        'fallback_speciality': 'fallbackSpeciality',
        'status': 'status',
        'rates': 'rates',
        'time_interval_rates': 'timeIntervalRates',
        'person': 'person'
    }

    def __init__(self, duty_id=None, slave_duty_id=None, block_id=None, client_dept_id=None, sub_discipline=None, request_gender=None, grade=None, fallback_grade=None, vacancy_reason=None, date=None, start_time=None, end_time=None, break_duration=None, po_number=None, unique_number=None, agency=None, skill=None, specialty=None, fallback_skill=None, fallback_speciality=None, status=None, rates=None, time_interval_rates=None, person=None, local_vars_configuration=None):  # noqa: E501
        """Duty - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._duty_id = None
        self._slave_duty_id = None
        self._block_id = None
        self._client_dept_id = None
        self._sub_discipline = None
        self._request_gender = None
        self._grade = None
        self._fallback_grade = None
        self._vacancy_reason = None
        self._date = None
        self._start_time = None
        self._end_time = None
        self._break_duration = None
        self._po_number = None
        self._unique_number = None
        self._agency = None
        self._skill = None
        self._specialty = None
        self._fallback_skill = None
        self._fallback_speciality = None
        self._status = None
        self._rates = None
        self._time_interval_rates = None
        self._person = None
        self.discriminator = None

        if duty_id is not None:
            self.duty_id = duty_id
        if slave_duty_id is not None:
            self.slave_duty_id = slave_duty_id
        if block_id is not None:
            self.block_id = block_id
        if client_dept_id is not None:
            self.client_dept_id = client_dept_id
        if sub_discipline is not None:
            self.sub_discipline = sub_discipline
        if request_gender is not None:
            self.request_gender = request_gender
        if grade is not None:
            self.grade = grade
        if fallback_grade is not None:
            self.fallback_grade = fallback_grade
        if vacancy_reason is not None:
            self.vacancy_reason = vacancy_reason
        if date is not None:
            self.date = date
        if start_time is not None:
            self.start_time = start_time
        if end_time is not None:
            self.end_time = end_time
        if break_duration is not None:
            self.break_duration = break_duration
        if po_number is not None:
            self.po_number = po_number
        if unique_number is not None:
            self.unique_number = unique_number
        if agency is not None:
            self.agency = agency
        if skill is not None:
            self.skill = skill
        if specialty is not None:
            self.specialty = specialty
        if fallback_skill is not None:
            self.fallback_skill = fallback_skill
        if fallback_speciality is not None:
            self.fallback_speciality = fallback_speciality
        if status is not None:
            self.status = status
        if rates is not None:
            self.rates = rates
        if time_interval_rates is not None:
            self.time_interval_rates = time_interval_rates
        if person is not None:
            self.person = person

    @property
    def duty_id(self):
        """Gets the duty_id of this Duty.  # noqa: E501

        Trust identifier of the duty  # noqa: E501

        :return: The duty_id of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this Duty.

        Trust identifier of the duty  # noqa: E501

        :param duty_id: The duty_id of this Duty.  # noqa: E501
        :type: str
        """

        self._duty_id = duty_id

    @property
    def slave_duty_id(self):
        """Gets the slave_duty_id of this Duty.  # noqa: E501

        Identifier of the slave duty if duty is part of consolidated duties  # noqa: E501

        :return: The slave_duty_id of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._slave_duty_id

    @slave_duty_id.setter
    def slave_duty_id(self, slave_duty_id):
        """Sets the slave_duty_id of this Duty.

        Identifier of the slave duty if duty is part of consolidated duties  # noqa: E501

        :param slave_duty_id: The slave_duty_id of this Duty.  # noqa: E501
        :type: str
        """

        self._slave_duty_id = slave_duty_id

    @property
    def block_id(self):
        """Gets the block_id of this Duty.  # noqa: E501

        Identifier of block duties if duty is part of the block  # noqa: E501

        :return: The block_id of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._block_id

    @block_id.setter
    def block_id(self, block_id):
        """Sets the block_id of this Duty.

        Identifier of block duties if duty is part of the block  # noqa: E501

        :param block_id: The block_id of this Duty.  # noqa: E501
        :type: str
        """

        self._block_id = block_id

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
    def request_gender(self):
        """Gets the request_gender of this Duty.  # noqa: E501


        :return: The request_gender of this Duty.  # noqa: E501
        :rtype: RequestGender
        """
        return self._request_gender

    @request_gender.setter
    def request_gender(self, request_gender):
        """Sets the request_gender of this Duty.


        :param request_gender: The request_gender of this Duty.  # noqa: E501
        :type: RequestGender
        """

        self._request_gender = request_gender

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
    def date(self):
        """Gets the date of this Duty.  # noqa: E501

        Date of the duty  # noqa: E501

        :return: The date of this Duty.  # noqa: E501
        :rtype: date
        """
        return self._date

    @date.setter
    def date(self, date):
        """Sets the date of this Duty.

        Date of the duty  # noqa: E501

        :param date: The date of this Duty.  # noqa: E501
        :type: date
        """

        self._date = date

    @property
    def start_time(self):
        """Gets the start_time of this Duty.  # noqa: E501

        Start time of the shift  # noqa: E501

        :return: The start_time of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this Duty.

        Start time of the shift  # noqa: E501

        :param start_time: The start_time of this Duty.  # noqa: E501
        :type: str
        """

        self._start_time = start_time

    @property
    def end_time(self):
        """Gets the end_time of this Duty.  # noqa: E501

        End time of the shift  # noqa: E501

        :return: The end_time of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """Sets the end_time of this Duty.

        End time of the shift  # noqa: E501

        :param end_time: The end_time of this Duty.  # noqa: E501
        :type: str
        """

        self._end_time = end_time

    @property
    def break_duration(self):
        """Gets the break_duration of this Duty.  # noqa: E501

        Duration of break in minutes  # noqa: E501

        :return: The break_duration of this Duty.  # noqa: E501
        :rtype: int
        """
        return self._break_duration

    @break_duration.setter
    def break_duration(self, break_duration):
        """Sets the break_duration of this Duty.

        Duration of break in minutes  # noqa: E501

        :param break_duration: The break_duration of this Duty.  # noqa: E501
        :type: int
        """

        self._break_duration = break_duration

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

        Supplying agency trust identifier  # noqa: E501

        :return: The agency of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._agency

    @agency.setter
    def agency(self, agency):
        """Sets the agency of this Duty.

        Supplying agency trust identifier  # noqa: E501

        :param agency: The agency of this Duty.  # noqa: E501
        :type: str
        """

        self._agency = agency

    @property
    def skill(self):
        """Gets the skill of this Duty.  # noqa: E501

        Stored as free text in DE Provider  # noqa: E501

        :return: The skill of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._skill

    @skill.setter
    def skill(self, skill):
        """Sets the skill of this Duty.

        Stored as free text in DE Provider  # noqa: E501

        :param skill: The skill of this Duty.  # noqa: E501
        :type: str
        """

        self._skill = skill

    @property
    def specialty(self):
        """Gets the specialty of this Duty.  # noqa: E501

        Stored as free text in DE Provider  # noqa: E501

        :return: The specialty of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._specialty

    @specialty.setter
    def specialty(self, specialty):
        """Sets the specialty of this Duty.

        Stored as free text in DE Provider  # noqa: E501

        :param specialty: The specialty of this Duty.  # noqa: E501
        :type: str
        """

        self._specialty = specialty

    @property
    def fallback_skill(self):
        """Gets the fallback_skill of this Duty.  # noqa: E501

        Stored as free text in DE Provider  # noqa: E501

        :return: The fallback_skill of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._fallback_skill

    @fallback_skill.setter
    def fallback_skill(self, fallback_skill):
        """Sets the fallback_skill of this Duty.

        Stored as free text in DE Provider  # noqa: E501

        :param fallback_skill: The fallback_skill of this Duty.  # noqa: E501
        :type: str
        """

        self._fallback_skill = fallback_skill

    @property
    def fallback_speciality(self):
        """Gets the fallback_speciality of this Duty.  # noqa: E501

        Stored as free text in DE Provider  # noqa: E501

        :return: The fallback_speciality of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._fallback_speciality

    @fallback_speciality.setter
    def fallback_speciality(self, fallback_speciality):
        """Sets the fallback_speciality of this Duty.

        Stored as free text in DE Provider  # noqa: E501

        :param fallback_speciality: The fallback_speciality of this Duty.  # noqa: E501
        :type: str
        """

        self._fallback_speciality = fallback_speciality

    @property
    def status(self):
        """Gets the status of this Duty.  # noqa: E501

        Will need to understand if duty is no longer required and cancel on DE Provider  # noqa: E501

        :return: The status of this Duty.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this Duty.

        Will need to understand if duty is no longer required and cancel on DE Provider  # noqa: E501

        :param status: The status of this Duty.  # noqa: E501
        :type: str
        """
        allowed_values = ["active", "cancelled"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and status not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"  # noqa: E501
                .format(status, allowed_values)
            )

        self._status = status

    @property
    def rates(self):
        """Gets the rates of this Duty.  # noqa: E501

        Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency  # noqa: E501

        :return: The rates of this Duty.  # noqa: E501
        :rtype: list[Rates]
        """
        return self._rates

    @rates.setter
    def rates(self, rates):
        """Sets the rates of this Duty.

        Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency  # noqa: E501

        :param rates: The rates of this Duty.  # noqa: E501
        :type: list[Rates]
        """

        self._rates = rates

    @property
    def time_interval_rates(self):
        """Gets the time_interval_rates of this Duty.  # noqa: E501

        Array of rates and intervals for which the rate is applied  # noqa: E501

        :return: The time_interval_rates of this Duty.  # noqa: E501
        :rtype: list[TimeIntervalRates]
        """
        return self._time_interval_rates

    @time_interval_rates.setter
    def time_interval_rates(self, time_interval_rates):
        """Sets the time_interval_rates of this Duty.

        Array of rates and intervals for which the rate is applied  # noqa: E501

        :param time_interval_rates: The time_interval_rates of this Duty.  # noqa: E501
        :type: list[TimeIntervalRates]
        """

        self._time_interval_rates = time_interval_rates

    @property
    def person(self):
        """Gets the person of this Duty.  # noqa: E501


        :return: The person of this Duty.  # noqa: E501
        :rtype: Person
        """
        return self._person

    @person.setter
    def person(self, person):
        """Sets the person of this Duty.


        :param person: The person of this Duty.  # noqa: E501
        :type: Person
        """

        self._person = person

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
