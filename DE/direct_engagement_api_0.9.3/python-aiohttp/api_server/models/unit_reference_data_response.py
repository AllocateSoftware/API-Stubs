# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class UnitReferenceDataResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, ref_id: str=None, description: str=None, unit_site: str=None):
        """UnitReferenceDataResponse - a model defined in OpenAPI

        :param ref_id: The ref_id of this UnitReferenceDataResponse.
        :param description: The description of this UnitReferenceDataResponse.
        :param unit_site: The unit_site of this UnitReferenceDataResponse.
        """
        self.openapi_types = {
            'ref_id': str,
            'description': str,
            'unit_site': str
        }

        self.attribute_map = {
            'ref_id': 'refId',
            'description': 'description',
            'unit_site': 'unitSite'
        }

        self._ref_id = ref_id
        self._description = description
        self._unit_site = unit_site

    @classmethod
    def from_dict(cls, dikt: dict) -> 'UnitReferenceDataResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The UnitReferenceDataResponse of this UnitReferenceDataResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def ref_id(self):
        """Gets the ref_id of this UnitReferenceDataResponse.

        Reference data trust identifier from BankStaff

        :return: The ref_id of this UnitReferenceDataResponse.
        :rtype: str
        """
        return self._ref_id

    @ref_id.setter
    def ref_id(self, ref_id):
        """Sets the ref_id of this UnitReferenceDataResponse.

        Reference data trust identifier from BankStaff

        :param ref_id: The ref_id of this UnitReferenceDataResponse.
        :type ref_id: str
        """

        self._ref_id = ref_id

    @property
    def description(self):
        """Gets the description of this UnitReferenceDataResponse.

        Reference data description from BankStaff

        :return: The description of this UnitReferenceDataResponse.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this UnitReferenceDataResponse.

        Reference data description from BankStaff

        :param description: The description of this UnitReferenceDataResponse.
        :type description: str
        """

        self._description = description

    @property
    def unit_site(self):
        """Gets the unit_site of this UnitReferenceDataResponse.

        Location of the unit from BankStaff

        :return: The unit_site of this UnitReferenceDataResponse.
        :rtype: str
        """
        return self._unit_site

    @unit_site.setter
    def unit_site(self, unit_site):
        """Sets the unit_site of this UnitReferenceDataResponse.

        Location of the unit from BankStaff

        :param unit_site: The unit_site of this UnitReferenceDataResponse.
        :type unit_site: str
        """

        self._unit_site = unit_site