# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class PersonIdentifier(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, universal_id: str=None):
        """PersonIdentifier - a model defined in OpenAPI

        :param id: The id of this PersonIdentifier.
        :param universal_id: The universal_id of this PersonIdentifier.
        """
        self.openapi_types = {
            'id': str,
            'universal_id': str
        }

        self.attribute_map = {
            'id': 'id',
            'universal_id': 'universalId'
        }

        self._id = id
        self._universal_id = universal_id

    @classmethod
    def from_dict(cls, dikt: dict) -> 'PersonIdentifier':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The PersonIdentifier of this PersonIdentifier.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this PersonIdentifier.

        identifier of the person (worker) within the VMS

        :return: The id of this PersonIdentifier.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PersonIdentifier.

        identifier of the person (worker) within the VMS

        :param id: The id of this PersonIdentifier.
        :type id: str
        """

        self._id = id

    @property
    def universal_id(self):
        """Gets the universal_id of this PersonIdentifier.

        Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.

        :return: The universal_id of this PersonIdentifier.
        :rtype: str
        """
        return self._universal_id

    @universal_id.setter
    def universal_id(self, universal_id):
        """Sets the universal_id of this PersonIdentifier.

        Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.

        :param universal_id: The universal_id of this PersonIdentifier.
        :type universal_id: str
        """

        self._universal_id = universal_id
