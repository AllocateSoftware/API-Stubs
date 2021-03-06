# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class EventResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, duty_id: str=None):
        """EventResponse - a model defined in OpenAPI

        :param duty_id: The duty_id of this EventResponse.
        """
        self.openapi_types = {
            'duty_id': str
        }

        self.attribute_map = {
            'duty_id': 'dutyId'
        }

        self._duty_id = duty_id

    @classmethod
    def from_dict(cls, dikt: dict) -> 'EventResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The EventResponse of this EventResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def duty_id(self):
        """Gets the duty_id of this EventResponse.


        :return: The duty_id of this EventResponse.
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this EventResponse.


        :param duty_id: The duty_id of this EventResponse.
        :type duty_id: str
        """

        self._duty_id = duty_id
