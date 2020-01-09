# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class DateSpan(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _from=None, to=None):  # noqa: E501
        """DateSpan - a model defined in OpenAPI

        :param _from: The _from of this DateSpan.  # noqa: E501
        :type _from: date
        :param to: The to of this DateSpan.  # noqa: E501
        :type to: date
        """
        self.openapi_types = {
            '_from': date,
            'to': date
        }

        self.attribute_map = {
            '_from': 'from',
            'to': 'to'
        }

        self.__from = _from
        self._to = to

    @classmethod
    def from_dict(cls, dikt) -> 'DateSpan':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DateSpan of this DateSpan.  # noqa: E501
        :rtype: DateSpan
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _from(self):
        """Gets the _from of this DateSpan.

        When the span starts  # noqa: E501

        :return: The _from of this DateSpan.
        :rtype: date
        """
        return self.__from

    @_from.setter
    def _from(self, _from):
        """Sets the _from of this DateSpan.

        When the span starts  # noqa: E501

        :param _from: The _from of this DateSpan.
        :type _from: date
        """

        self.__from = _from

    @property
    def to(self):
        """Gets the to of this DateSpan.

        When the span ends  # noqa: E501

        :return: The to of this DateSpan.
        :rtype: date
        """
        return self._to

    @to.setter
    def to(self, to):
        """Sets the to of this DateSpan.

        When the span ends  # noqa: E501

        :param to: The to of this DateSpan.
        :type to: date
        """

        self._to = to
