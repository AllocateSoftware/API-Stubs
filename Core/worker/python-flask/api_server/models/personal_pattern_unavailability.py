# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class PersonalPatternUnavailability(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, unavailability_group=None, unavailability_reason=None, work=None, start=None, end=None, external_unavailability_identifier=None):  # noqa: E501
        """PersonalPatternUnavailability - a model defined in OpenAPI

        :param unavailability_group: The unavailability_group of this PersonalPatternUnavailability.  # noqa: E501
        :type unavailability_group: str
        :param unavailability_reason: The unavailability_reason of this PersonalPatternUnavailability.  # noqa: E501
        :type unavailability_reason: str
        :param work: The work of this PersonalPatternUnavailability.  # noqa: E501
        :type work: str
        :param start: The start of this PersonalPatternUnavailability.  # noqa: E501
        :type start: str
        :param end: The end of this PersonalPatternUnavailability.  # noqa: E501
        :type end: str
        :param external_unavailability_identifier: The external_unavailability_identifier of this PersonalPatternUnavailability.  # noqa: E501
        :type external_unavailability_identifier: str
        """
        self.openapi_types = {
            'unavailability_group': str,
            'unavailability_reason': str,
            'work': str,
            'start': str,
            'end': str,
            'external_unavailability_identifier': str
        }

        self.attribute_map = {
            'unavailability_group': 'unavailabilityGroup',
            'unavailability_reason': 'unavailabilityReason',
            'work': 'work',
            'start': 'start',
            'end': 'end',
            'external_unavailability_identifier': 'externalUnavailabilityIdentifier'
        }

        self._unavailability_group = unavailability_group
        self._unavailability_reason = unavailability_reason
        self._work = work
        self._start = start
        self._end = end
        self._external_unavailability_identifier = external_unavailability_identifier

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalPatternUnavailability':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalPattern_unavailability of this PersonalPatternUnavailability.  # noqa: E501
        :rtype: PersonalPatternUnavailability
        """
        return util.deserialize_model(dikt, cls)

    @property
    def unavailability_group(self):
        """Gets the unavailability_group of this PersonalPatternUnavailability.


        :return: The unavailability_group of this PersonalPatternUnavailability.
        :rtype: str
        """
        return self._unavailability_group

    @unavailability_group.setter
    def unavailability_group(self, unavailability_group):
        """Sets the unavailability_group of this PersonalPatternUnavailability.


        :param unavailability_group: The unavailability_group of this PersonalPatternUnavailability.
        :type unavailability_group: str
        """

        self._unavailability_group = unavailability_group

    @property
    def unavailability_reason(self):
        """Gets the unavailability_reason of this PersonalPatternUnavailability.


        :return: The unavailability_reason of this PersonalPatternUnavailability.
        :rtype: str
        """
        return self._unavailability_reason

    @unavailability_reason.setter
    def unavailability_reason(self, unavailability_reason):
        """Sets the unavailability_reason of this PersonalPatternUnavailability.


        :param unavailability_reason: The unavailability_reason of this PersonalPatternUnavailability.
        :type unavailability_reason: str
        """
        if unavailability_reason is None:
            raise ValueError("Invalid value for `unavailability_reason`, must not be `None`")  # noqa: E501

        self._unavailability_reason = unavailability_reason

    @property
    def work(self):
        """Gets the work of this PersonalPatternUnavailability.


        :return: The work of this PersonalPatternUnavailability.
        :rtype: str
        """
        return self._work

    @work.setter
    def work(self, work):
        """Sets the work of this PersonalPatternUnavailability.


        :param work: The work of this PersonalPatternUnavailability.
        :type work: str
        """

        self._work = work

    @property
    def start(self):
        """Gets the start of this PersonalPatternUnavailability.


        :return: The start of this PersonalPatternUnavailability.
        :rtype: str
        """
        return self._start

    @start.setter
    def start(self, start):
        """Sets the start of this PersonalPatternUnavailability.


        :param start: The start of this PersonalPatternUnavailability.
        :type start: str
        """
        if start is None:
            raise ValueError("Invalid value for `start`, must not be `None`")  # noqa: E501

        self._start = start

    @property
    def end(self):
        """Gets the end of this PersonalPatternUnavailability.


        :return: The end of this PersonalPatternUnavailability.
        :rtype: str
        """
        return self._end

    @end.setter
    def end(self, end):
        """Sets the end of this PersonalPatternUnavailability.


        :param end: The end of this PersonalPatternUnavailability.
        :type end: str
        """
        if end is None:
            raise ValueError("Invalid value for `end`, must not be `None`")  # noqa: E501

        self._end = end

    @property
    def external_unavailability_identifier(self):
        """Gets the external_unavailability_identifier of this PersonalPatternUnavailability.


        :return: The external_unavailability_identifier of this PersonalPatternUnavailability.
        :rtype: str
        """
        return self._external_unavailability_identifier

    @external_unavailability_identifier.setter
    def external_unavailability_identifier(self, external_unavailability_identifier):
        """Sets the external_unavailability_identifier of this PersonalPatternUnavailability.


        :param external_unavailability_identifier: The external_unavailability_identifier of this PersonalPatternUnavailability.
        :type external_unavailability_identifier: str
        """
        if external_unavailability_identifier is None:
            raise ValueError("Invalid value for `external_unavailability_identifier`, must not be `None`")  # noqa: E501

        self._external_unavailability_identifier = external_unavailability_identifier