# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.grade import Grade
from api_server.models.grade_type import GradeType
from api_server.models.grade_type_category import GradeTypeCategory
from api_server import util

from api_server.models.grade import Grade  # noqa: E501
from api_server.models.grade_type import GradeType  # noqa: E501
from api_server.models.grade_type_category import GradeTypeCategory  # noqa: E501

class HoursAssignmentRequirement(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, grade=None, grade_type=None, grade_type_category=None):  # noqa: E501
        """HoursAssignmentRequirement - a model defined in OpenAPI

        :param grade: The grade of this HoursAssignmentRequirement.  # noqa: E501
        :type grade: Grade
        :param grade_type: The grade_type of this HoursAssignmentRequirement.  # noqa: E501
        :type grade_type: GradeType
        :param grade_type_category: The grade_type_category of this HoursAssignmentRequirement.  # noqa: E501
        :type grade_type_category: GradeTypeCategory
        """
        self.openapi_types = {
            'grade': Grade,
            'grade_type': GradeType,
            'grade_type_category': GradeTypeCategory
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
    def from_dict(cls, dikt) -> 'HoursAssignmentRequirement':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The HoursAssignment_requirement of this HoursAssignmentRequirement.  # noqa: E501
        :rtype: HoursAssignmentRequirement
        """
        return util.deserialize_model(dikt, cls)

    @property
    def grade(self):
        """Gets the grade of this HoursAssignmentRequirement.


        :return: The grade of this HoursAssignmentRequirement.
        :rtype: Grade
        """
        return self._grade

    @grade.setter
    def grade(self, grade):
        """Sets the grade of this HoursAssignmentRequirement.


        :param grade: The grade of this HoursAssignmentRequirement.
        :type grade: Grade
        """

        self._grade = grade

    @property
    def grade_type(self):
        """Gets the grade_type of this HoursAssignmentRequirement.


        :return: The grade_type of this HoursAssignmentRequirement.
        :rtype: GradeType
        """
        return self._grade_type

    @grade_type.setter
    def grade_type(self, grade_type):
        """Sets the grade_type of this HoursAssignmentRequirement.


        :param grade_type: The grade_type of this HoursAssignmentRequirement.
        :type grade_type: GradeType
        """

        self._grade_type = grade_type

    @property
    def grade_type_category(self):
        """Gets the grade_type_category of this HoursAssignmentRequirement.


        :return: The grade_type_category of this HoursAssignmentRequirement.
        :rtype: GradeTypeCategory
        """
        return self._grade_type_category

    @grade_type_category.setter
    def grade_type_category(self, grade_type_category):
        """Sets the grade_type_category of this HoursAssignmentRequirement.


        :param grade_type_category: The grade_type_category of this HoursAssignmentRequirement.
        :type grade_type_category: GradeTypeCategory
        """

        self._grade_type_category = grade_type_category