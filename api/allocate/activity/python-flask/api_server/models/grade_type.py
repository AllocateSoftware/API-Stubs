# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class GradeType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, description=None, external_reference=None):  # noqa: E501
        """GradeType - a model defined in OpenAPI

        :param name: The name of this GradeType.  # noqa: E501
        :type name: str
        :param description: The description of this GradeType.  # noqa: E501
        :type description: str
        :param external_reference: The external_reference of this GradeType.  # noqa: E501
        :type external_reference: str
        """
        self.openapi_types = {
            'name': str,
            'description': str,
            'external_reference': str
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'external_reference': 'externalReference'
        }

        self._name = name
        self._description = description
        self._external_reference = external_reference

    @classmethod
    def from_dict(cls, dikt) -> 'GradeType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GradeType of this GradeType.  # noqa: E501
        :rtype: GradeType
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this GradeType.


        :return: The name of this GradeType.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this GradeType.


        :param name: The name of this GradeType.
        :type name: str
        """

        self._name = name

    @property
    def description(self):
        """Gets the description of this GradeType.


        :return: The description of this GradeType.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this GradeType.


        :param description: The description of this GradeType.
        :type description: str
        """

        self._description = description

    @property
    def external_reference(self):
        """Gets the external_reference of this GradeType.


        :return: The external_reference of this GradeType.
        :rtype: str
        """
        return self._external_reference

    @external_reference.setter
    def external_reference(self, external_reference):
        """Sets the external_reference of this GradeType.


        :param external_reference: The external_reference of this GradeType.
        :type external_reference: str
        """

        self._external_reference = external_reference
