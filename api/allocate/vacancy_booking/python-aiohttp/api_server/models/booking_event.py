# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class BookingEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, proposal_id: str=None, vacancy_id: str=None):
        """BookingEvent - a model defined in OpenAPI

        :param proposal_id: The proposal_id of this BookingEvent.
        :param vacancy_id: The vacancy_id of this BookingEvent.
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
    def from_dict(cls, dikt: dict) -> 'BookingEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The BookingEvent of this BookingEvent.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def proposal_id(self):
        """Gets the proposal_id of this BookingEvent.

        The ID of the proposal

        :return: The proposal_id of this BookingEvent.
        :rtype: str
        """
        return self._proposal_id

    @proposal_id.setter
    def proposal_id(self, proposal_id):
        """Sets the proposal_id of this BookingEvent.

        The ID of the proposal

        :param proposal_id: The proposal_id of this BookingEvent.
        :type proposal_id: str
        """
        if proposal_id is None:
            raise ValueError("Invalid value for `proposal_id`, must not be `None`")

        self._proposal_id = proposal_id

    @property
    def vacancy_id(self):
        """Gets the vacancy_id of this BookingEvent.

        The ID of the vacancy

        :return: The vacancy_id of this BookingEvent.
        :rtype: str
        """
        return self._vacancy_id

    @vacancy_id.setter
    def vacancy_id(self, vacancy_id):
        """Sets the vacancy_id of this BookingEvent.

        The ID of the vacancy

        :param vacancy_id: The vacancy_id of this BookingEvent.
        :type vacancy_id: str
        """
        if vacancy_id is None:
            raise ValueError("Invalid value for `vacancy_id`, must not be `None`")

        self._vacancy_id = vacancy_id
