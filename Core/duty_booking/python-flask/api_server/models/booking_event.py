# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class BookingEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, proposal_id=None, vacancy_id=None):  # noqa: E501
        """BookingEvent - a model defined in OpenAPI

        :param proposal_id: The proposal_id of this BookingEvent.  # noqa: E501
        :type proposal_id: str
        :param vacancy_id: The vacancy_id of this BookingEvent.  # noqa: E501
        :type vacancy_id: str
        """
        self.openapi_types = {
            'proposal_id': str,
            'vacancy_id': str
        }

        self.attribute_map = {
            'proposal_id': 'proposalId',
            'vacancy_id': 'vacancyId'
        }

        self._proposal_id = proposal_id
        self._vacancy_id = vacancy_id

    @classmethod
    def from_dict(cls, dikt) -> 'BookingEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BookingEvent of this BookingEvent.  # noqa: E501
        :rtype: BookingEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def proposal_id(self):
        """Gets the proposal_id of this BookingEvent.

        The ID of the proposal  # noqa: E501

        :return: The proposal_id of this BookingEvent.
        :rtype: str
        """
        return self._proposal_id

    @proposal_id.setter
    def proposal_id(self, proposal_id):
        """Sets the proposal_id of this BookingEvent.

        The ID of the proposal  # noqa: E501

        :param proposal_id: The proposal_id of this BookingEvent.
        :type proposal_id: str
        """
        if proposal_id is None:
            raise ValueError("Invalid value for `proposal_id`, must not be `None`")  # noqa: E501

        self._proposal_id = proposal_id

    @property
    def vacancy_id(self):
        """Gets the vacancy_id of this BookingEvent.

        The ID of the vacancy  # noqa: E501

        :return: The vacancy_id of this BookingEvent.
        :rtype: str
        """
        return self._vacancy_id

    @vacancy_id.setter
    def vacancy_id(self, vacancy_id):
        """Sets the vacancy_id of this BookingEvent.

        The ID of the vacancy  # noqa: E501

        :param vacancy_id: The vacancy_id of this BookingEvent.
        :type vacancy_id: str
        """

        self._vacancy_id = vacancy_id
