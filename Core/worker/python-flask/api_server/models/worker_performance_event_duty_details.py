# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class WorkerPerformanceEventDutyDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, duty_id=None, _from=None, to=None):  # noqa: E501
        """WorkerPerformanceEventDutyDetails - a model defined in OpenAPI

        :param duty_id: The duty_id of this WorkerPerformanceEventDutyDetails.  # noqa: E501
        :type duty_id: str
        :param _from: The _from of this WorkerPerformanceEventDutyDetails.  # noqa: E501
        :type _from: datetime
        :param to: The to of this WorkerPerformanceEventDutyDetails.  # noqa: E501
        :type to: datetime
        """
        self.openapi_types = {
            'duty_id': str,
            '_from': datetime,
            'to': datetime
        }

        self.attribute_map = {
            'duty_id': 'dutyId',
            '_from': 'from',
            'to': 'to'
        }

        self._duty_id = duty_id
        self.__from = _from
        self._to = to

    @classmethod
    def from_dict(cls, dikt) -> 'WorkerPerformanceEventDutyDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WorkerPerformanceEvent_dutyDetails of this WorkerPerformanceEventDutyDetails.  # noqa: E501
        :rtype: WorkerPerformanceEventDutyDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def duty_id(self):
        """Gets the duty_id of this WorkerPerformanceEventDutyDetails.

        ID of the duty within the allocate system  # noqa: E501

        :return: The duty_id of this WorkerPerformanceEventDutyDetails.
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this WorkerPerformanceEventDutyDetails.

        ID of the duty within the allocate system  # noqa: E501

        :param duty_id: The duty_id of this WorkerPerformanceEventDutyDetails.
        :type duty_id: str
        """

        self._duty_id = duty_id

    @property
    def _from(self):
        """Gets the _from of this WorkerPerformanceEventDutyDetails.

        When the duty started  # noqa: E501

        :return: The _from of this WorkerPerformanceEventDutyDetails.
        :rtype: datetime
        """
        return self.__from

    @_from.setter
    def _from(self, _from):
        """Sets the _from of this WorkerPerformanceEventDutyDetails.

        When the duty started  # noqa: E501

        :param _from: The _from of this WorkerPerformanceEventDutyDetails.
        :type _from: datetime
        """

        self.__from = _from

    @property
    def to(self):
        """Gets the to of this WorkerPerformanceEventDutyDetails.

        When the duty ended  # noqa: E501

        :return: The to of this WorkerPerformanceEventDutyDetails.
        :rtype: datetime
        """
        return self._to

    @to.setter
    def to(self, to):
        """Sets the to of this WorkerPerformanceEventDutyDetails.

        When the duty ended  # noqa: E501

        :param to: The to of this WorkerPerformanceEventDutyDetails.
        :type to: datetime
        """

        self._to = to