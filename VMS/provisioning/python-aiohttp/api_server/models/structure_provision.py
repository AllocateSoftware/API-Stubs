# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.unit import Unit
from api_server import util


class StructureProvision(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, customer_code: str=None, units: List[Unit]=None):
        """StructureProvision - a model defined in OpenAPI

        :param customer_code: The customer_code of this StructureProvision.
        :param units: The units of this StructureProvision.
        """
        self.openapi_types = {
            'customer_code': str,
            'units': List[Unit]
        }

        self.attribute_map = {
            'customer_code': 'customerCode',
            'units': 'units'
        }

        self._customer_code = customer_code
        self._units = units

    @classmethod
    def from_dict(cls, dikt: dict) -> 'StructureProvision':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The StructureProvision of this StructureProvision.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def customer_code(self):
        """Gets the customer_code of this StructureProvision.

        ID of the Customer (Trust)

        :return: The customer_code of this StructureProvision.
        :rtype: str
        """
        return self._customer_code

    @customer_code.setter
    def customer_code(self, customer_code):
        """Sets the customer_code of this StructureProvision.

        ID of the Customer (Trust)

        :param customer_code: The customer_code of this StructureProvision.
        :type customer_code: str
        """

        self._customer_code = customer_code

    @property
    def units(self):
        """Gets the units of this StructureProvision.

        List of units present within the customer's system

        :return: The units of this StructureProvision.
        :rtype: List[Unit]
        """
        return self._units

    @units.setter
    def units(self, units):
        """Sets the units of this StructureProvision.

        List of units present within the customer's system

        :param units: The units of this StructureProvision.
        :type units: List[Unit]
        """

        self._units = units
