# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.duty import Duty
from api_server import util

from api_server.models.duty import Duty  # noqa: E501

class VacancyUpdatedEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, duty=None):  # noqa: E501
        """VacancyUpdatedEvent - a model defined in OpenAPI

        :param id: The id of this VacancyUpdatedEvent.  # noqa: E501
        :type id: str
        :param duty: The duty of this VacancyUpdatedEvent.  # noqa: E501
        :type duty: Duty
        """
        self.openapi_types = {
            'id': str,
            'duty': Duty
        }

        self.attribute_map = {
            'id': 'id',
            'duty': 'duty'
        }

        self._id = id
        self._duty = duty

    @classmethod
    def from_dict(cls, dikt) -> 'VacancyUpdatedEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VacancyUpdatedEvent of this VacancyUpdatedEvent.  # noqa: E501
        :rtype: VacancyUpdatedEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this VacancyUpdatedEvent.

        ID of the vacancy  # noqa: E501

        :return: The id of this VacancyUpdatedEvent.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this VacancyUpdatedEvent.

        ID of the vacancy  # noqa: E501

        :param id: The id of this VacancyUpdatedEvent.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def duty(self):
        """Gets the duty of this VacancyUpdatedEvent.


        :return: The duty of this VacancyUpdatedEvent.
        :rtype: Duty
        """
        return self._duty

    @duty.setter
    def duty(self, duty):
        """Sets the duty of this VacancyUpdatedEvent.


        :param duty: The duty of this VacancyUpdatedEvent.
        :type duty: Duty
        """
        if duty is None:
            raise ValueError("Invalid value for `duty`, must not be `None`")  # noqa: E501

        self._duty = duty
