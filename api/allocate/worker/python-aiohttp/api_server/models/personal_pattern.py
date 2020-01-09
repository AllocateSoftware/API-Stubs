# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class PersonalPattern(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, duty: List[object]=None, unavailability: List[object]=None):
        """PersonalPattern - a model defined in OpenAPI

        :param duty: The duty of this PersonalPattern.
        :param unavailability: The unavailability of this PersonalPattern.
        """
        self.openapi_types = {
            'duty': List[object],
            'unavailability': List[object]
        }

        self.attribute_map = {
            'duty': 'duty',
            'unavailability': 'unavailability'
        }

        self._duty = duty
        self._unavailability = unavailability

    @classmethod
    def from_dict(cls, dikt: dict) -> 'PersonalPattern':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The PersonalPattern of this PersonalPattern.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def duty(self):
        """Gets the duty of this PersonalPattern.


        :return: The duty of this PersonalPattern.
        :rtype: List[object]
        """
        return self._duty

    @duty.setter
    def duty(self, duty):
        """Sets the duty of this PersonalPattern.


        :param duty: The duty of this PersonalPattern.
        :type duty: List[object]
        """

        self._duty = duty

    @property
    def unavailability(self):
        """Gets the unavailability of this PersonalPattern.


        :return: The unavailability of this PersonalPattern.
        :rtype: List[object]
        """
        return self._unavailability

    @unavailability.setter
    def unavailability(self, unavailability):
        """Sets the unavailability of this PersonalPattern.


        :param unavailability: The unavailability of this PersonalPattern.
        :type unavailability: List[object]
        """

        self._unavailability = unavailability
