# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.vacancy_where_location import VacancyWhereLocation
from api_server import util

from api_server.models.vacancy_where_location import VacancyWhereLocation  # noqa: E501

class VacancyWhere(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, trust_id=None, location=None):  # noqa: E501
        """VacancyWhere - a model defined in OpenAPI

        :param trust_id: The trust_id of this VacancyWhere.  # noqa: E501
        :type trust_id: str
        :param location: The location of this VacancyWhere.  # noqa: E501
        :type location: VacancyWhereLocation
        """
        self.openapi_types = {
            'trust_id': str,
            'location': VacancyWhereLocation
        }

        self.attribute_map = {
            'trust_id': 'trustId',
            'location': 'location'
        }

        self._trust_id = trust_id
        self._location = location

    @classmethod
    def from_dict(cls, dikt) -> 'VacancyWhere':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Vacancy_where of this VacancyWhere.  # noqa: E501
        :rtype: VacancyWhere
        """
        return util.deserialize_model(dikt, cls)

    @property
    def trust_id(self):
        """Gets the trust_id of this VacancyWhere.


        :return: The trust_id of this VacancyWhere.
        :rtype: str
        """
        return self._trust_id

    @trust_id.setter
    def trust_id(self, trust_id):
        """Sets the trust_id of this VacancyWhere.


        :param trust_id: The trust_id of this VacancyWhere.
        :type trust_id: str
        """

        self._trust_id = trust_id

    @property
    def location(self):
        """Gets the location of this VacancyWhere.


        :return: The location of this VacancyWhere.
        :rtype: VacancyWhereLocation
        """
        return self._location

    @location.setter
    def location(self, location):
        """Sets the location of this VacancyWhere.


        :param location: The location of this VacancyWhere.
        :type location: VacancyWhereLocation
        """

        self._location = location
