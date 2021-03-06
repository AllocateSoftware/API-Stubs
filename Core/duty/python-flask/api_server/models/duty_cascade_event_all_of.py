# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class DutyCascadeEventAllOf(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, duty_id=None, cascade_from=None, cascade_to=None, is_duty_reset=None):  # noqa: E501
        """DutyCascadeEventAllOf - a model defined in OpenAPI

        :param duty_id: The duty_id of this DutyCascadeEventAllOf.  # noqa: E501
        :type duty_id: str
        :param cascade_from: The cascade_from of this DutyCascadeEventAllOf.  # noqa: E501
        :type cascade_from: str
        :param cascade_to: The cascade_to of this DutyCascadeEventAllOf.  # noqa: E501
        :type cascade_to: str
        :param is_duty_reset: The is_duty_reset of this DutyCascadeEventAllOf.  # noqa: E501
        :type is_duty_reset: bool
        """
        self.openapi_types = {
            'duty_id': str,
            'cascade_from': str,
            'cascade_to': str,
            'is_duty_reset': bool
        }

        self.attribute_map = {
            'duty_id': 'dutyId',
            'cascade_from': 'cascadeFrom',
            'cascade_to': 'cascadeTo',
            'is_duty_reset': 'isDutyReset'
        }

        self._duty_id = duty_id
        self._cascade_from = cascade_from
        self._cascade_to = cascade_to
        self._is_duty_reset = is_duty_reset

    @classmethod
    def from_dict(cls, dikt) -> 'DutyCascadeEventAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DutyCascadeEvent_allOf of this DutyCascadeEventAllOf.  # noqa: E501
        :rtype: DutyCascadeEventAllOf
        """
        return util.deserialize_model(dikt, cls)

    @property
    def duty_id(self):
        """Gets the duty_id of this DutyCascadeEventAllOf.


        :return: The duty_id of this DutyCascadeEventAllOf.
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this DutyCascadeEventAllOf.


        :param duty_id: The duty_id of this DutyCascadeEventAllOf.
        :type duty_id: str
        """
        if duty_id is None:
            raise ValueError("Invalid value for `duty_id`, must not be `None`")  # noqa: E501

        self._duty_id = duty_id

    @property
    def cascade_from(self):
        """Gets the cascade_from of this DutyCascadeEventAllOf.


        :return: The cascade_from of this DutyCascadeEventAllOf.
        :rtype: str
        """
        return self._cascade_from

    @cascade_from.setter
    def cascade_from(self, cascade_from):
        """Sets the cascade_from of this DutyCascadeEventAllOf.


        :param cascade_from: The cascade_from of this DutyCascadeEventAllOf.
        :type cascade_from: str
        """
        allowed_values = ["ward", "bank", "cloudstaff", "agency", "nationalBank"]  # noqa: E501
        if cascade_from not in allowed_values:
            raise ValueError(
                "Invalid value for `cascade_from` ({0}), must be one of {1}"
                .format(cascade_from, allowed_values)
            )

        self._cascade_from = cascade_from

    @property
    def cascade_to(self):
        """Gets the cascade_to of this DutyCascadeEventAllOf.


        :return: The cascade_to of this DutyCascadeEventAllOf.
        :rtype: str
        """
        return self._cascade_to

    @cascade_to.setter
    def cascade_to(self, cascade_to):
        """Sets the cascade_to of this DutyCascadeEventAllOf.


        :param cascade_to: The cascade_to of this DutyCascadeEventAllOf.
        :type cascade_to: str
        """
        allowed_values = ["ward", "bank", "cloudstaff", "agency", "nationalBank"]  # noqa: E501
        if cascade_to not in allowed_values:
            raise ValueError(
                "Invalid value for `cascade_to` ({0}), must be one of {1}"
                .format(cascade_to, allowed_values)
            )

        self._cascade_to = cascade_to

    @property
    def is_duty_reset(self):
        """Gets the is_duty_reset of this DutyCascadeEventAllOf.

        Is this a 'reset' ? (I.E Revert)  # noqa: E501

        :return: The is_duty_reset of this DutyCascadeEventAllOf.
        :rtype: bool
        """
        return self._is_duty_reset

    @is_duty_reset.setter
    def is_duty_reset(self, is_duty_reset):
        """Sets the is_duty_reset of this DutyCascadeEventAllOf.

        Is this a 'reset' ? (I.E Revert)  # noqa: E501

        :param is_duty_reset: The is_duty_reset of this DutyCascadeEventAllOf.
        :type is_duty_reset: bool
        """

        self._is_duty_reset = is_duty_reset
