# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class DateSpan(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, start: datetime=None, end: datetime=None):
        """DateSpan - a model defined in OpenAPI

        :param start: The start of this DateSpan.
        :param end: The end of this DateSpan.
        """
        self.openapi_types = {
            'start': datetime,
            'end': datetime
        }

        self.attribute_map = {
            'start': 'start',
            'end': 'end'
        }

        self._start = start
        self._end = end

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DateSpan':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DateSpan of this DateSpan.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def start(self):
        """Gets the start of this DateSpan.

        Start date-time

        :return: The start of this DateSpan.
        :rtype: datetime
        """
        return self._start

    @start.setter
    def start(self, start):
        """Sets the start of this DateSpan.

        Start date-time

        :param start: The start of this DateSpan.
        :type start: datetime
        """

        self._start = start

    @property
    def end(self):
        """Gets the end of this DateSpan.

        End date-time

        :return: The end of this DateSpan.
        :rtype: datetime
        """
        return self._end

    @end.setter
    def end(self, end):
        """Sets the end of this DateSpan.

        End date-time

        :param end: The end of this DateSpan.
        :type end: datetime
        """

        self._end = end
