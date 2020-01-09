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


class Contract(object):
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
        'staff_group': 'str',
        'grade': 'str',
        'contract': 'str',
        'payscale': 'str',
        'contract_type': 'str',
        'contracted_time': 'str',
        'default_unavailability_hours': 'str',
        'wtd_opt_out': 'bool',
        'salary_frequency': 'str',
        'salary_amount': 'float'
    }

    attribute_map = {
        'staff_group': 'staffGroup',
        'grade': 'grade',
        'contract': 'contract',
        'payscale': 'payscale',
        'contract_type': 'contractType',
        'contracted_time': 'contractedTime',
        'default_unavailability_hours': 'defaultUnavailabilityHours',
        'wtd_opt_out': 'wtdOptOut',
        'salary_frequency': 'salaryFrequency',
        'salary_amount': 'salaryAmount'
    }

    def __init__(self, staff_group=None, grade=None, contract=None, payscale=None, contract_type=None, contracted_time=None, default_unavailability_hours=None, wtd_opt_out=None, salary_frequency=None, salary_amount=None, local_vars_configuration=None):  # noqa: E501
        """Contract - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._staff_group = None
        self._grade = None
        self._contract = None
        self._payscale = None
        self._contract_type = None
        self._contracted_time = None
        self._default_unavailability_hours = None
        self._wtd_opt_out = None
        self._salary_frequency = None
        self._salary_amount = None
        self.discriminator = None

        if staff_group is not None:
            self.staff_group = staff_group
        self.grade = grade
        self.contract = contract
        if payscale is not None:
            self.payscale = payscale
        if contract_type is not None:
            self.contract_type = contract_type
        self.contracted_time = contracted_time
        if default_unavailability_hours is not None:
            self.default_unavailability_hours = default_unavailability_hours
        if wtd_opt_out is not None:
            self.wtd_opt_out = wtd_opt_out
        if salary_frequency is not None:
            self.salary_frequency = salary_frequency
        if salary_amount is not None:
            self.salary_amount = salary_amount

    @property
    def staff_group(self):
        """Gets the staff_group of this Contract.  # noqa: E501


        :return: The staff_group of this Contract.  # noqa: E501
        :rtype: str
        """
        return self._staff_group

    @staff_group.setter
    def staff_group(self, staff_group):
        """Sets the staff_group of this Contract.


        :param staff_group: The staff_group of this Contract.  # noqa: E501
        :type: str
        """

        self._staff_group = staff_group

    @property
    def grade(self):
        """Gets the grade of this Contract.  # noqa: E501


        :return: The grade of this Contract.  # noqa: E501
        :rtype: str
        """
        return self._grade

    @grade.setter
    def grade(self, grade):
        """Sets the grade of this Contract.


        :param grade: The grade of this Contract.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and grade is None:  # noqa: E501
            raise ValueError("Invalid value for `grade`, must not be `None`")  # noqa: E501

        self._grade = grade

    @property
    def contract(self):
        """Gets the contract of this Contract.  # noqa: E501


        :return: The contract of this Contract.  # noqa: E501
        :rtype: str
        """
        return self._contract

    @contract.setter
    def contract(self, contract):
        """Sets the contract of this Contract.


        :param contract: The contract of this Contract.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and contract is None:  # noqa: E501
            raise ValueError("Invalid value for `contract`, must not be `None`")  # noqa: E501

        self._contract = contract

    @property
    def payscale(self):
        """Gets the payscale of this Contract.  # noqa: E501


        :return: The payscale of this Contract.  # noqa: E501
        :rtype: str
        """
        return self._payscale

    @payscale.setter
    def payscale(self, payscale):
        """Sets the payscale of this Contract.


        :param payscale: The payscale of this Contract.  # noqa: E501
        :type: str
        """

        self._payscale = payscale

    @property
    def contract_type(self):
        """Gets the contract_type of this Contract.  # noqa: E501


        :return: The contract_type of this Contract.  # noqa: E501
        :rtype: str
        """
        return self._contract_type

    @contract_type.setter
    def contract_type(self, contract_type):
        """Sets the contract_type of this Contract.


        :param contract_type: The contract_type of this Contract.  # noqa: E501
        :type: str
        """

        self._contract_type = contract_type

    @property
    def contracted_time(self):
        """Gets the contracted_time of this Contract.  # noqa: E501


        :return: The contracted_time of this Contract.  # noqa: E501
        :rtype: str
        """
        return self._contracted_time

    @contracted_time.setter
    def contracted_time(self, contracted_time):
        """Sets the contracted_time of this Contract.


        :param contracted_time: The contracted_time of this Contract.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and contracted_time is None:  # noqa: E501
            raise ValueError("Invalid value for `contracted_time`, must not be `None`")  # noqa: E501

        self._contracted_time = contracted_time

    @property
    def default_unavailability_hours(self):
        """Gets the default_unavailability_hours of this Contract.  # noqa: E501


        :return: The default_unavailability_hours of this Contract.  # noqa: E501
        :rtype: str
        """
        return self._default_unavailability_hours

    @default_unavailability_hours.setter
    def default_unavailability_hours(self, default_unavailability_hours):
        """Sets the default_unavailability_hours of this Contract.


        :param default_unavailability_hours: The default_unavailability_hours of this Contract.  # noqa: E501
        :type: str
        """

        self._default_unavailability_hours = default_unavailability_hours

    @property
    def wtd_opt_out(self):
        """Gets the wtd_opt_out of this Contract.  # noqa: E501


        :return: The wtd_opt_out of this Contract.  # noqa: E501
        :rtype: bool
        """
        return self._wtd_opt_out

    @wtd_opt_out.setter
    def wtd_opt_out(self, wtd_opt_out):
        """Sets the wtd_opt_out of this Contract.


        :param wtd_opt_out: The wtd_opt_out of this Contract.  # noqa: E501
        :type: bool
        """

        self._wtd_opt_out = wtd_opt_out

    @property
    def salary_frequency(self):
        """Gets the salary_frequency of this Contract.  # noqa: E501


        :return: The salary_frequency of this Contract.  # noqa: E501
        :rtype: str
        """
        return self._salary_frequency

    @salary_frequency.setter
    def salary_frequency(self, salary_frequency):
        """Sets the salary_frequency of this Contract.


        :param salary_frequency: The salary_frequency of this Contract.  # noqa: E501
        :type: str
        """

        self._salary_frequency = salary_frequency

    @property
    def salary_amount(self):
        """Gets the salary_amount of this Contract.  # noqa: E501


        :return: The salary_amount of this Contract.  # noqa: E501
        :rtype: float
        """
        return self._salary_amount

    @salary_amount.setter
    def salary_amount(self, salary_amount):
        """Sets the salary_amount of this Contract.


        :param salary_amount: The salary_amount of this Contract.  # noqa: E501
        :type: float
        """

        self._salary_amount = salary_amount

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
        if not isinstance(other, Contract):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Contract):
            return True

        return self.to_dict() != other.to_dict()
