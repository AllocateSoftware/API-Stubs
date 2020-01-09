# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class CancellationCost(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, after_date: datetime=None, amount: float=None):
        """CancellationCost - a model defined in OpenAPI

        :param after_date: The after_date of this CancellationCost.
        :param amount: The amount of this CancellationCost.
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
    def from_dict(cls, dikt: dict) -> 'CancellationCost':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CancellationCost of this CancellationCost.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def after_date(self):
        """Gets the after_date of this CancellationCost.

        The date/time after which this cost becomes valid

        :return: The after_date of this CancellationCost.
        :rtype: datetime
        """
        return self._after_date

    @after_date.setter
    def after_date(self, after_date):
        """Sets the after_date of this CancellationCost.

        The date/time after which this cost becomes valid

        :param after_date: The after_date of this CancellationCost.
        :type after_date: datetime
        """
        if after_date is None:
            raise ValueError("Invalid value for `after_date`, must not be `None`")

        self._after_date = after_date

    @property
    def amount(self):
        """Gets the amount of this CancellationCost.

        The cost of cancellation

        :return: The amount of this CancellationCost.
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this CancellationCost.

        The cost of cancellation

        :param amount: The amount of this CancellationCost.
        :type amount: float
        """
        if amount is None:
            raise ValueError("Invalid value for `amount`, must not be `None`")

        self._amount = amount
