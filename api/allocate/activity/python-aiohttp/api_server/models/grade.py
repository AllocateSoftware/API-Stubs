# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class Grade(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, long_name: str=None, short_name: str=None, external_reference: str=None):
        """Grade - a model defined in OpenAPI

        :param long_name: The long_name of this Grade.
        :param short_name: The short_name of this Grade.
        :param external_reference: The external_reference of this Grade.
        """
        self.openapi_types = {
            'long_name': str,
            'short_name': str,
            'external_reference': str
        }

        self.attribute_map = {
            'long_name': 'longName',
            'short_name': 'shortName',
            'external_reference': 'externalReference'
        }

        self._long_name = long_name
        self._short_name = short_name
        self._external_reference = external_reference

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Grade':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Grade of this Grade.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def long_name(self):
        """Gets the long_name of this Grade.


        :return: The long_name of this Grade.
        :rtype: str
        """
        return self._long_name

    @long_name.setter
    def long_name(self, long_name):
        """Sets the long_name of this Grade.


        :param long_name: The long_name of this Grade.
        :type long_name: str
        """

        self._long_name = long_name

    @property
    def short_name(self):
        """Gets the short_name of this Grade.


        :return: The short_name of this Grade.
        :rtype: str
        """
        return self._short_name

    @short_name.setter
    def short_name(self, short_name):
        """Sets the short_name of this Grade.


        :param short_name: The short_name of this Grade.
        :type short_name: str
        """

        self._short_name = short_name

    @property
    def external_reference(self):
        """Gets the external_reference of this Grade.


        :return: The external_reference of this Grade.
        :rtype: str
        """
        return self._external_reference

    @external_reference.setter
    def external_reference(self, external_reference):
        """Sets the external_reference of this Grade.


        :param external_reference: The external_reference of this Grade.
        :type external_reference: str
        """

        self._external_reference = external_reference
