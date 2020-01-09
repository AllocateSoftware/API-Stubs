# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class Availabilities(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, availability=None, no_bank=None):  # noqa: E501
        """Availabilities - a model defined in OpenAPI

        :param availability: The availability of this Availabilities.  # noqa: E501
        :type availability: List[object]
        :param no_bank: The no_bank of this Availabilities.  # noqa: E501
        :type no_bank: List[object]
        """
        self.openapi_types = {
            'availability': List[object],
            'no_bank': List[object]
        }

        self.attribute_map = {
            'availability': 'Availability',
            'no_bank': 'NoBank'
        }

        self._availability = availability
        self._no_bank = no_bank

    @classmethod
    def from_dict(cls, dikt) -> 'Availabilities':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Availabilities of this Availabilities.  # noqa: E501
        :rtype: Availabilities
        """
        return util.deserialize_model(dikt, cls)

    @property
    def availability(self):
        """Gets the availability of this Availabilities.


        :return: The availability of this Availabilities.
        :rtype: List[object]
        """
        return self._availability

    @availability.setter
    def availability(self, availability):
        """Sets the availability of this Availabilities.


        :param availability: The availability of this Availabilities.
        :type availability: List[object]
        """
        if availability is None:
            raise ValueError("Invalid value for `availability`, must not be `None`")  # noqa: E501

        self._availability = availability

    @property
    def no_bank(self):
        """Gets the no_bank of this Availabilities.


        :return: The no_bank of this Availabilities.
        :rtype: List[object]
        """
        return self._no_bank

    @no_bank.setter
    def no_bank(self, no_bank):
        """Sets the no_bank of this Availabilities.


        :param no_bank: The no_bank of this Availabilities.
        :type no_bank: List[object]
        """
        if no_bank is None:
            raise ValueError("Invalid value for `no_bank`, must not be `None`")  # noqa: E501

        self._no_bank = no_bank
