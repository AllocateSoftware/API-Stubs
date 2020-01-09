# coding: utf-8

"""
    Vacancy Booking API and Events

         ## Duty Booking API and events and Events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class VacancyPersonRequirements(object):
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
        'grade': 'str',
        'grade_type': 'str',
        'grade_type_category': 'str',
        'gender': 'str'
    }

    attribute_map = {
        'grade': 'grade',
        'grade_type': 'gradeType',
        'grade_type_category': 'gradeTypeCategory',
        'gender': 'gender'
    }

    def __init__(self, grade=None, grade_type=None, grade_type_category=None, gender=None, local_vars_configuration=None):  # noqa: E501
        """VacancyPersonRequirements - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._grade = None
        self._grade_type = None
        self._grade_type_category = None
        self._gender = None
        self.discriminator = None

        if grade is not None:
            self.grade = grade
        if grade_type is not None:
            self.grade_type = grade_type
        if grade_type_category is not None:
            self.grade_type_category = grade_type_category
        if gender is not None:
            self.gender = gender

    @property
    def grade(self):
        """Gets the grade of this VacancyPersonRequirements.  # noqa: E501


        :return: The grade of this VacancyPersonRequirements.  # noqa: E501
        :rtype: str
        """
        return self._grade

    @grade.setter
    def grade(self, grade):
        """Sets the grade of this VacancyPersonRequirements.


        :param grade: The grade of this VacancyPersonRequirements.  # noqa: E501
        :type: str
        """

        self._grade = grade

    @property
    def grade_type(self):
        """Gets the grade_type of this VacancyPersonRequirements.  # noqa: E501


        :return: The grade_type of this VacancyPersonRequirements.  # noqa: E501
        :rtype: str
        """
        return self._grade_type

    @grade_type.setter
    def grade_type(self, grade_type):
        """Sets the grade_type of this VacancyPersonRequirements.


        :param grade_type: The grade_type of this VacancyPersonRequirements.  # noqa: E501
        :type: str
        """

        self._grade_type = grade_type

    @property
    def grade_type_category(self):
        """Gets the grade_type_category of this VacancyPersonRequirements.  # noqa: E501


        :return: The grade_type_category of this VacancyPersonRequirements.  # noqa: E501
        :rtype: str
        """
        return self._grade_type_category

    @grade_type_category.setter
    def grade_type_category(self, grade_type_category):
        """Sets the grade_type_category of this VacancyPersonRequirements.


        :param grade_type_category: The grade_type_category of this VacancyPersonRequirements.  # noqa: E501
        :type: str
        """

        self._grade_type_category = grade_type_category

    @property
    def gender(self):
        """Gets the gender of this VacancyPersonRequirements.  # noqa: E501


        :return: The gender of this VacancyPersonRequirements.  # noqa: E501
        :rtype: str
        """
        return self._gender

    @gender.setter
    def gender(self, gender):
        """Sets the gender of this VacancyPersonRequirements.


        :param gender: The gender of this VacancyPersonRequirements.  # noqa: E501
        :type: str
        """

        self._gender = gender

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
        if not isinstance(other, VacancyPersonRequirements):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, VacancyPersonRequirements):
            return True

        return self.to_dict() != other.to_dict()
