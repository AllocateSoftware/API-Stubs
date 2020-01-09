# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class VacancyPersonRequirements(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, grade=None, grade_type=None, grade_type_category=None, gender=None):  # noqa: E501
        """VacancyPersonRequirements - a model defined in OpenAPI

        :param grade: The grade of this VacancyPersonRequirements.  # noqa: E501
        :type grade: str
        :param grade_type: The grade_type of this VacancyPersonRequirements.  # noqa: E501
        :type grade_type: str
        :param grade_type_category: The grade_type_category of this VacancyPersonRequirements.  # noqa: E501
        :type grade_type_category: str
        :param gender: The gender of this VacancyPersonRequirements.  # noqa: E501
        :type gender: str
        """
        self.openapi_types = {
            'grade': str,
            'grade_type': str,
            'grade_type_category': str,
            'gender': str
        }

        self.attribute_map = {
            'grade': 'grade',
            'grade_type': 'gradeType',
            'grade_type_category': 'gradeTypeCategory',
            'gender': 'gender'
        }

        self._grade = grade
        self._grade_type = grade_type
        self._grade_type_category = grade_type_category
        self._gender = gender

    @classmethod
    def from_dict(cls, dikt) -> 'VacancyPersonRequirements':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Vacancy_personRequirements of this VacancyPersonRequirements.  # noqa: E501
        :rtype: VacancyPersonRequirements
        """
        return util.deserialize_model(dikt, cls)

    @property
    def grade(self):
        """Gets the grade of this VacancyPersonRequirements.


        :return: The grade of this VacancyPersonRequirements.
        :rtype: str
        """
        return self._grade

    @grade.setter
    def grade(self, grade):
        """Sets the grade of this VacancyPersonRequirements.


        :param grade: The grade of this VacancyPersonRequirements.
        :type grade: str
        """

        self._grade = grade

    @property
    def grade_type(self):
        """Gets the grade_type of this VacancyPersonRequirements.


        :return: The grade_type of this VacancyPersonRequirements.
        :rtype: str
        """
        return self._grade_type

    @grade_type.setter
    def grade_type(self, grade_type):
        """Sets the grade_type of this VacancyPersonRequirements.


        :param grade_type: The grade_type of this VacancyPersonRequirements.
        :type grade_type: str
        """

        self._grade_type = grade_type

    @property
    def grade_type_category(self):
        """Gets the grade_type_category of this VacancyPersonRequirements.


        :return: The grade_type_category of this VacancyPersonRequirements.
        :rtype: str
        """
        return self._grade_type_category

    @grade_type_category.setter
    def grade_type_category(self, grade_type_category):
        """Sets the grade_type_category of this VacancyPersonRequirements.


        :param grade_type_category: The grade_type_category of this VacancyPersonRequirements.
        :type grade_type_category: str
        """

        self._grade_type_category = grade_type_category

    @property
    def gender(self):
        """Gets the gender of this VacancyPersonRequirements.


        :return: The gender of this VacancyPersonRequirements.
        :rtype: str
        """
        return self._gender

    @gender.setter
    def gender(self, gender):
        """Sets the gender of this VacancyPersonRequirements.


        :param gender: The gender of this VacancyPersonRequirements.
        :type gender: str
        """

        self._gender = gender