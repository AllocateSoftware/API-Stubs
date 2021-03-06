# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class DutyRequirementsGradeRequirement(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, grade: str=None, grade_type: str=None, grade_type_category: str=None):
        """DutyRequirementsGradeRequirement - a model defined in OpenAPI

        :param grade: The grade of this DutyRequirementsGradeRequirement.
        :param grade_type: The grade_type of this DutyRequirementsGradeRequirement.
        :param grade_type_category: The grade_type_category of this DutyRequirementsGradeRequirement.
        """
        self.openapi_types = {
            'grade': str,
            'grade_type': str,
            'grade_type_category': str
        }

        self.attribute_map = {
            'grade': 'grade',
            'grade_type': 'gradeType',
            'grade_type_category': 'gradeTypeCategory'
        }

        self._grade = grade
        self._grade_type = grade_type
        self._grade_type_category = grade_type_category

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DutyRequirementsGradeRequirement':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Duty_requirements_gradeRequirement of this DutyRequirementsGradeRequirement.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def grade(self):
        """Gets the grade of this DutyRequirementsGradeRequirement.


        :return: The grade of this DutyRequirementsGradeRequirement.
        :rtype: str
        """
        return self._grade

    @grade.setter
    def grade(self, grade):
        """Sets the grade of this DutyRequirementsGradeRequirement.


        :param grade: The grade of this DutyRequirementsGradeRequirement.
        :type grade: str
        """

        self._grade = grade

    @property
    def grade_type(self):
        """Gets the grade_type of this DutyRequirementsGradeRequirement.


        :return: The grade_type of this DutyRequirementsGradeRequirement.
        :rtype: str
        """
        return self._grade_type

    @grade_type.setter
    def grade_type(self, grade_type):
        """Sets the grade_type of this DutyRequirementsGradeRequirement.


        :param grade_type: The grade_type of this DutyRequirementsGradeRequirement.
        :type grade_type: str
        """

        self._grade_type = grade_type

    @property
    def grade_type_category(self):
        """Gets the grade_type_category of this DutyRequirementsGradeRequirement.


        :return: The grade_type_category of this DutyRequirementsGradeRequirement.
        :rtype: str
        """
        return self._grade_type_category

    @grade_type_category.setter
    def grade_type_category(self, grade_type_category):
        """Sets the grade_type_category of this DutyRequirementsGradeRequirement.


        :param grade_type_category: The grade_type_category of this DutyRequirementsGradeRequirement.
        :type grade_type_category: str
        """

        self._grade_type_category = grade_type_category
