# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class DutyDetailsWhere(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, location_id: str=None):
        """DutyDetailsWhere - a model defined in OpenAPI

        :param location_id: The location_id of this DutyDetailsWhere.
        """
        self.openapi_types = {
            'location_id': str
        }

        self.attribute_map = {
            'location_id': 'locationId'
        }

        self._location_id = location_id

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DutyDetailsWhere':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DutyDetails_where of this DutyDetailsWhere.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def location_id(self):
        """Gets the location_id of this DutyDetailsWhere.


        :return: The location_id of this DutyDetailsWhere.
        :rtype: str
        """
        return self._location_id

    @location_id.setter
    def location_id(self, location_id):
        """Sets the location_id of this DutyDetailsWhere.


        :param location_id: The location_id of this DutyDetailsWhere.
        :type location_id: str
        """

        self._location_id = location_id