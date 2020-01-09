# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.grade import Grade
from api_server import util


class StaffGroup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, name: str=None, grades: List[Grade]=None):
        """StaffGroup - a model defined in OpenAPI

        :param id: The id of this StaffGroup.
        :param name: The name of this StaffGroup.
        :param grades: The grades of this StaffGroup.
        """
        self.openapi_types = {
            'id': str,
            'name': str,
            'grades': List[Grade]
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'grades': 'grades'
        }

        self._id = id
        self._name = name
        self._grades = grades

    @classmethod
    def from_dict(cls, dikt: dict) -> 'StaffGroup':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The StaffGroup of this StaffGroup.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this StaffGroup.


        :return: The id of this StaffGroup.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this StaffGroup.


        :param id: The id of this StaffGroup.
        :type id: str
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this StaffGroup.


        :return: The name of this StaffGroup.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this StaffGroup.


        :param name: The name of this StaffGroup.
        :type name: str
        """

        self._name = name

    @property
    def grades(self):
        """Gets the grades of this StaffGroup.


        :return: The grades of this StaffGroup.
        :rtype: List[Grade]
        """
        return self._grades

    @grades.setter
    def grades(self, grades):
        """Sets the grades of this StaffGroup.


        :param grades: The grades of this StaffGroup.
        :type grades: List[Grade]
        """

        self._grades = grades
