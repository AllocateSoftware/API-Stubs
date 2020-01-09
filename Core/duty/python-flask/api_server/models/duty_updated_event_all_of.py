# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.duty import Duty
from api_server import util

from api_server.models.duty import Duty  # noqa: E501

class DutyUpdatedEventAllOf(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, duty=None):  # noqa: E501
        """DutyUpdatedEventAllOf - a model defined in OpenAPI

        :param duty: The duty of this DutyUpdatedEventAllOf.  # noqa: E501
        :type duty: Duty
        """
        self.openapi_types = {
            'duty': Duty
        }

        self.attribute_map = {
            'duty': 'duty'
        }

        self._duty = duty

    @classmethod
    def from_dict(cls, dikt) -> 'DutyUpdatedEventAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DutyUpdatedEvent_allOf of this DutyUpdatedEventAllOf.  # noqa: E501
        :rtype: DutyUpdatedEventAllOf
        """
        return util.deserialize_model(dikt, cls)

    @property
    def duty(self):
        """Gets the duty of this DutyUpdatedEventAllOf.


        :return: The duty of this DutyUpdatedEventAllOf.
        :rtype: Duty
        """
        return self._duty

    @duty.setter
    def duty(self, duty):
        """Sets the duty of this DutyUpdatedEventAllOf.


        :param duty: The duty of this DutyUpdatedEventAllOf.
        :type duty: Duty
        """

        self._duty = duty
