# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.vocabulary_entry import VocabularyEntry
from api_server import util

from api_server.models.vocabulary_entry import VocabularyEntry  # noqa: E501

class Mapping(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, mapping_set_id=None, _from=None, to=None):  # noqa: E501
        """Mapping - a model defined in OpenAPI

        :param id: The id of this Mapping.  # noqa: E501
        :type id: str
        :param mapping_set_id: The mapping_set_id of this Mapping.  # noqa: E501
        :type mapping_set_id: str
        :param _from: The _from of this Mapping.  # noqa: E501
        :type _from: VocabularyEntry
        :param to: The to of this Mapping.  # noqa: E501
        :type to: VocabularyEntry
        """
        self.openapi_types = {
            'id': str,
            'mapping_set_id': str,
            '_from': VocabularyEntry,
            'to': VocabularyEntry
        }

        self.attribute_map = {
            'id': 'id',
            'mapping_set_id': 'mappingSetId',
            '_from': 'from',
            'to': 'to'
        }

        self._id = id
        self._mapping_set_id = mapping_set_id
        self.__from = _from
        self._to = to

    @classmethod
    def from_dict(cls, dikt) -> 'Mapping':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Mapping of this Mapping.  # noqa: E501
        :rtype: Mapping
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this Mapping.

        Id of this mapping  # noqa: E501

        :return: The id of this Mapping.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Mapping.

        Id of this mapping  # noqa: E501

        :param id: The id of this Mapping.
        :type id: str
        """

        self._id = id

    @property
    def mapping_set_id(self):
        """Gets the mapping_set_id of this Mapping.


        :return: The mapping_set_id of this Mapping.
        :rtype: str
        """
        return self._mapping_set_id

    @mapping_set_id.setter
    def mapping_set_id(self, mapping_set_id):
        """Sets the mapping_set_id of this Mapping.


        :param mapping_set_id: The mapping_set_id of this Mapping.
        :type mapping_set_id: str
        """
        if mapping_set_id is None:
            raise ValueError("Invalid value for `mapping_set_id`, must not be `None`")  # noqa: E501

        self._mapping_set_id = mapping_set_id

    @property
    def _from(self):
        """Gets the _from of this Mapping.


        :return: The _from of this Mapping.
        :rtype: VocabularyEntry
        """
        return self.__from

    @_from.setter
    def _from(self, _from):
        """Sets the _from of this Mapping.


        :param _from: The _from of this Mapping.
        :type _from: VocabularyEntry
        """
        if _from is None:
            raise ValueError("Invalid value for `_from`, must not be `None`")  # noqa: E501

        self.__from = _from

    @property
    def to(self):
        """Gets the to of this Mapping.


        :return: The to of this Mapping.
        :rtype: VocabularyEntry
        """
        return self._to

    @to.setter
    def to(self, to):
        """Sets the to of this Mapping.


        :param to: The to of this Mapping.
        :type to: VocabularyEntry
        """
        if to is None:
            raise ValueError("Invalid value for `to`, must not be `None`")  # noqa: E501

        self._to = to
