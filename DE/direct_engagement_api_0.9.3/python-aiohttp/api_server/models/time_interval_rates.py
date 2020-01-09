# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.rates import Rates
from api_server import util


class TimeIntervalRates(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, start_time: datetime=None, end_time: datetime=None, rates: List[Rates]=None):
        """TimeIntervalRates - a model defined in OpenAPI

        :param start_time: The start_time of this TimeIntervalRates.
        :param end_time: The end_time of this TimeIntervalRates.
        :param rates: The rates of this TimeIntervalRates.
        """
        self.openapi_types = {
            'start_time': datetime,
            'end_time': datetime,
            'rates': List[Rates]
        }

        self.attribute_map = {
            'start_time': 'startTime',
            'end_time': 'endTime',
            'rates': 'rates'
        }

        self._start_time = start_time
        self._end_time = end_time
        self._rates = rates

    @classmethod
    def from_dict(cls, dikt: dict) -> 'TimeIntervalRates':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The TimeIntervalRates of this TimeIntervalRates.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def start_time(self):
        """Gets the start_time of this TimeIntervalRates.


        :return: The start_time of this TimeIntervalRates.
        :rtype: datetime
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this TimeIntervalRates.


        :param start_time: The start_time of this TimeIntervalRates.
        :type start_time: datetime
        """

        self._start_time = start_time

    @property
    def end_time(self):
        """Gets the end_time of this TimeIntervalRates.


        :return: The end_time of this TimeIntervalRates.
        :rtype: datetime
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """Sets the end_time of this TimeIntervalRates.


        :param end_time: The end_time of this TimeIntervalRates.
        :type end_time: datetime
        """

        self._end_time = end_time

    @property
    def rates(self):
        """Gets the rates of this TimeIntervalRates.

        Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency

        :return: The rates of this TimeIntervalRates.
        :rtype: List[Rates]
        """
        return self._rates

    @rates.setter
    def rates(self, rates):
        """Sets the rates of this TimeIntervalRates.

        Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency

        :param rates: The rates of this TimeIntervalRates.
        :type rates: List[Rates]
        """

        self._rates = rates
