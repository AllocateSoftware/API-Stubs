# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.personal_pattern_duty import PersonalPatternDuty
from api_server.models.personal_pattern_unavailability import PersonalPatternUnavailability
from api_server import util

from api_server.models.personal_pattern_duty import PersonalPatternDuty  # noqa: E501
from api_server.models.personal_pattern_unavailability import PersonalPatternUnavailability  # noqa: E501

class PersonalPattern(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, duty=None, unavailability=None):  # noqa: E501
        """PersonalPattern - a model defined in OpenAPI

        :param duty: The duty of this PersonalPattern.  # noqa: E501
        :type duty: List[PersonalPatternDuty]
        :param unavailability: The unavailability of this PersonalPattern.  # noqa: E501
        :type unavailability: List[PersonalPatternUnavailability]
        """
        self.openapi_types = {
            'duty': List[PersonalPatternDuty],
            'unavailability': List[PersonalPatternUnavailability]
        }

        self.attribute_map = {
            'duty': 'duty',
            'unavailability': 'unavailability'
        }

        self._duty = duty
        self._unavailability = unavailability

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalPattern':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalPattern of this PersonalPattern.  # noqa: E501
        :rtype: PersonalPattern
        """
        return util.deserialize_model(dikt, cls)

    @property
    def duty(self):
        """Gets the duty of this PersonalPattern.


        :return: The duty of this PersonalPattern.
        :rtype: List[PersonalPatternDuty]
        """
        return self._duty

    @duty.setter
    def duty(self, duty):
        """Sets the duty of this PersonalPattern.


        :param duty: The duty of this PersonalPattern.
        :type duty: List[PersonalPatternDuty]
        """

        self._duty = duty

    @property
    def unavailability(self):
        """Gets the unavailability of this PersonalPattern.


        :return: The unavailability of this PersonalPattern.
        :rtype: List[PersonalPatternUnavailability]
        """
        return self._unavailability

    @unavailability.setter
    def unavailability(self, unavailability):
        """Sets the unavailability of this PersonalPattern.


        :param unavailability: The unavailability of this PersonalPattern.
        :type unavailability: List[PersonalPatternUnavailability]
        """

        self._unavailability = unavailability
