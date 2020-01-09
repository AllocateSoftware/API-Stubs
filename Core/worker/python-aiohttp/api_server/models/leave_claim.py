# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.leave_claim_when import LeaveClaimWhen
from api_server import util


class LeaveClaim(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, when: LeaveClaimWhen=None, reason: str=None):
        """LeaveClaim - a model defined in OpenAPI

        :param when: The when of this LeaveClaim.
        :param reason: The reason of this LeaveClaim.
        """
        self.openapi_types = {
            'when': LeaveClaimWhen,
            'reason': str
        }

        self.attribute_map = {
            'when': 'when',
            'reason': 'reason'
        }

        self._when = when
        self._reason = reason

    @classmethod
    def from_dict(cls, dikt: dict) -> 'LeaveClaim':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The LeaveClaim of this LeaveClaim.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def when(self):
        """Gets the when of this LeaveClaim.


        :return: The when of this LeaveClaim.
        :rtype: LeaveClaimWhen
        """
        return self._when

    @when.setter
    def when(self, when):
        """Sets the when of this LeaveClaim.


        :param when: The when of this LeaveClaim.
        :type when: LeaveClaimWhen
        """

        self._when = when

    @property
    def reason(self):
        """Gets the reason of this LeaveClaim.

        The reason for the leave claim

        :return: The reason of this LeaveClaim.
        :rtype: str
        """
        return self._reason

    @reason.setter
    def reason(self, reason):
        """Sets the reason of this LeaveClaim.

        The reason for the leave claim

        :param reason: The reason of this LeaveClaim.
        :type reason: str
        """
        allowed_values = ["annualLeave"]
        if reason not in allowed_values:
            raise ValueError(
                "Invalid value for `reason` ({0}), must be one of {1}"
                .format(reason, allowed_values)
            )

        self._reason = reason
