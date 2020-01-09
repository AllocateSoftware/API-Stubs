# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class GradeTypeCategory(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name: str=None):
        """GradeTypeCategory - a model defined in OpenAPI

        :param name: The name of this GradeTypeCategory.
        """
        self.openapi_types = {
            'name': str
        }

        self.attribute_map = {
            'name': 'name'
        }

        self._name = name

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GradeTypeCategory':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GradeTypeCategory of this GradeTypeCategory.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this GradeTypeCategory.


        :return: The name of this GradeTypeCategory.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this GradeTypeCategory.


        :param name: The name of this GradeTypeCategory.
        :type name: str
        """

        self._name = name
