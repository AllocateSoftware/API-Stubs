# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.rates import Rates
from api_server import util

from api_server.models.rates import Rates  # noqa: E501

class InlineObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, start_time=None, end_time=None, _break=None, status=None, rates=None):  # noqa: E501
        """InlineObject - a model defined in OpenAPI

        :param start_time: The start_time of this InlineObject.  # noqa: E501
        :type start_time: str
        :param end_time: The end_time of this InlineObject.  # noqa: E501
        :type end_time: str
        :param _break: The _break of this InlineObject.  # noqa: E501
        :type _break: int
        :param status: The status of this InlineObject.  # noqa: E501
        :type status: str
        :param rates: The rates of this InlineObject.  # noqa: E501
        :type rates: List[Rates]
        """
        self.openapi_types = {
            'start_time': str,
            'end_time': str,
            '_break': int,
            'status': str,
            'rates': List[Rates]
        }

        self.attribute_map = {
            'start_time': 'startTime',
            'end_time': 'endTime',
            '_break': 'break',
            'status': 'status',
            'rates': 'rates'
        }

        self._start_time = start_time
        self._end_time = end_time
        self.__break = _break
        self._status = status
        self._rates = rates

    @classmethod
    def from_dict(cls, dikt) -> 'InlineObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_object of this InlineObject.  # noqa: E501
        :rtype: InlineObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def start_time(self):
        """Gets the start_time of this InlineObject.


        :return: The start_time of this InlineObject.
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this InlineObject.


        :param start_time: The start_time of this InlineObject.
        :type start_time: str
        """

        self._start_time = start_time

    @property
    def end_time(self):
        """Gets the end_time of this InlineObject.


        :return: The end_time of this InlineObject.
        :rtype: str
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """Sets the end_time of this InlineObject.


        :param end_time: The end_time of this InlineObject.
        :type end_time: str
        """

        self._end_time = end_time

    @property
    def _break(self):
        """Gets the _break of this InlineObject.

        Break Duration  # noqa: E501

        :return: The _break of this InlineObject.
        :rtype: int
        """
        return self.__break

    @_break.setter
    def _break(self, _break):
        """Sets the _break of this InlineObject.

        Break Duration  # noqa: E501

        :param _break: The _break of this InlineObject.
        :type _break: int
        """

        self.__break = _break

    @property
    def status(self):
        """Gets the status of this InlineObject.

        Status of the timesheet  # noqa: E501

        :return: The status of this InlineObject.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this InlineObject.

        Status of the timesheet  # noqa: E501

        :param status: The status of this InlineObject.
        :type status: str
        """

        self._status = status

    @property
    def rates(self):
        """Gets the rates of this InlineObject.

        Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency  # noqa: E501

        :return: The rates of this InlineObject.
        :rtype: List[Rates]
        """
        return self._rates

    @rates.setter
    def rates(self, rates):
        """Sets the rates of this InlineObject.

        Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency  # noqa: E501

        :param rates: The rates of this InlineObject.
        :type rates: List[Rates]
        """

        self._rates = rates
