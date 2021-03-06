# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class CancellationCost(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, after_date=None, amount=None):  # noqa: E501
        """CancellationCost - a model defined in OpenAPI

        :param after_date: The after_date of this CancellationCost.  # noqa: E501
        :type after_date: datetime
        :param amount: The amount of this CancellationCost.  # noqa: E501
        :type amount: float
        """
        self.openapi_types = {
            'after_date': datetime,
            'amount': float
        }

        self.attribute_map = {
            'after_date': 'afterDate',
            'amount': 'amount'
        }

        self._after_date = after_date
        self._amount = amount

    @classmethod
    def from_dict(cls, dikt) -> 'CancellationCost':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CancellationCost of this CancellationCost.  # noqa: E501
        :rtype: CancellationCost
        """
        return util.deserialize_model(dikt, cls)

    @property
    def after_date(self):
        """Gets the after_date of this CancellationCost.

        The date/time after which this cost becomes valid  # noqa: E501

        :return: The after_date of this CancellationCost.
        :rtype: datetime
        """
        return self._after_date

    @after_date.setter
    def after_date(self, after_date):
        """Sets the after_date of this CancellationCost.

        The date/time after which this cost becomes valid  # noqa: E501

        :param after_date: The after_date of this CancellationCost.
        :type after_date: datetime
        """
        if after_date is None:
            raise ValueError("Invalid value for `after_date`, must not be `None`")  # noqa: E501

        self._after_date = after_date

    @property
    def amount(self):
        """Gets the amount of this CancellationCost.

        The cost of cancellation  # noqa: E501

        :return: The amount of this CancellationCost.
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this CancellationCost.

        The cost of cancellation  # noqa: E501

        :param amount: The amount of this CancellationCost.
        :type amount: float
        """
        if amount is None:
            raise ValueError("Invalid value for `amount`, must not be `None`")  # noqa: E501

        self._amount = amount
