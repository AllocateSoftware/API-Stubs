# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.date_span import DateSpan
from api_server import util

from api_server.models.date_span import DateSpan  # noqa: E501

class Skill(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, skill_group=None, cluster=None, skill=None, validity=None, date_gained=None, obtained_from_reason=None, certificate_number=None, notes=None):  # noqa: E501
        """Skill - a model defined in OpenAPI

        :param skill_group: The skill_group of this Skill.  # noqa: E501
        :type skill_group: str
        :param cluster: The cluster of this Skill.  # noqa: E501
        :type cluster: str
        :param skill: The skill of this Skill.  # noqa: E501
        :type skill: str
        :param validity: The validity of this Skill.  # noqa: E501
        :type validity: DateSpan
        :param date_gained: The date_gained of this Skill.  # noqa: E501
        :type date_gained: str
        :param obtained_from_reason: The obtained_from_reason of this Skill.  # noqa: E501
        :type obtained_from_reason: str
        :param certificate_number: The certificate_number of this Skill.  # noqa: E501
        :type certificate_number: str
        :param notes: The notes of this Skill.  # noqa: E501
        :type notes: str
        """
        self.openapi_types = {
            'skill_group': str,
            'cluster': str,
            'skill': str,
            'validity': DateSpan,
            'date_gained': str,
            'obtained_from_reason': str,
            'certificate_number': str,
            'notes': str
        }

        self.attribute_map = {
            'skill_group': 'skillGroup',
            'cluster': 'cluster',
            'skill': 'skill',
            'validity': 'validity',
            'date_gained': 'dateGained',
            'obtained_from_reason': 'obtainedFromReason',
            'certificate_number': 'certificateNumber',
            'notes': 'notes'
        }

        self._skill_group = skill_group
        self._cluster = cluster
        self._skill = skill
        self._validity = validity
        self._date_gained = date_gained
        self._obtained_from_reason = obtained_from_reason
        self._certificate_number = certificate_number
        self._notes = notes

    @classmethod
    def from_dict(cls, dikt) -> 'Skill':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Skill of this Skill.  # noqa: E501
        :rtype: Skill
        """
        return util.deserialize_model(dikt, cls)

    @property
    def skill_group(self):
        """Gets the skill_group of this Skill.


        :return: The skill_group of this Skill.
        :rtype: str
        """
        return self._skill_group

    @skill_group.setter
    def skill_group(self, skill_group):
        """Sets the skill_group of this Skill.


        :param skill_group: The skill_group of this Skill.
        :type skill_group: str
        """

        self._skill_group = skill_group

    @property
    def cluster(self):
        """Gets the cluster of this Skill.


        :return: The cluster of this Skill.
        :rtype: str
        """
        return self._cluster

    @cluster.setter
    def cluster(self, cluster):
        """Sets the cluster of this Skill.


        :param cluster: The cluster of this Skill.
        :type cluster: str
        """

        self._cluster = cluster

    @property
    def skill(self):
        """Gets the skill of this Skill.


        :return: The skill of this Skill.
        :rtype: str
        """
        return self._skill

    @skill.setter
    def skill(self, skill):
        """Sets the skill of this Skill.


        :param skill: The skill of this Skill.
        :type skill: str
        """

        self._skill = skill

    @property
    def validity(self):
        """Gets the validity of this Skill.


        :return: The validity of this Skill.
        :rtype: DateSpan
        """
        return self._validity

    @validity.setter
    def validity(self, validity):
        """Sets the validity of this Skill.


        :param validity: The validity of this Skill.
        :type validity: DateSpan
        """
        if validity is None:
            raise ValueError("Invalid value for `validity`, must not be `None`")  # noqa: E501

        self._validity = validity

    @property
    def date_gained(self):
        """Gets the date_gained of this Skill.


        :return: The date_gained of this Skill.
        :rtype: str
        """
        return self._date_gained

    @date_gained.setter
    def date_gained(self, date_gained):
        """Sets the date_gained of this Skill.


        :param date_gained: The date_gained of this Skill.
        :type date_gained: str
        """

        self._date_gained = date_gained

    @property
    def obtained_from_reason(self):
        """Gets the obtained_from_reason of this Skill.


        :return: The obtained_from_reason of this Skill.
        :rtype: str
        """
        return self._obtained_from_reason

    @obtained_from_reason.setter
    def obtained_from_reason(self, obtained_from_reason):
        """Sets the obtained_from_reason of this Skill.


        :param obtained_from_reason: The obtained_from_reason of this Skill.
        :type obtained_from_reason: str
        """

        self._obtained_from_reason = obtained_from_reason

    @property
    def certificate_number(self):
        """Gets the certificate_number of this Skill.


        :return: The certificate_number of this Skill.
        :rtype: str
        """
        return self._certificate_number

    @certificate_number.setter
    def certificate_number(self, certificate_number):
        """Sets the certificate_number of this Skill.


        :param certificate_number: The certificate_number of this Skill.
        :type certificate_number: str
        """

        self._certificate_number = certificate_number

    @property
    def notes(self):
        """Gets the notes of this Skill.


        :return: The notes of this Skill.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this Skill.


        :param notes: The notes of this Skill.
        :type notes: str
        """

        self._notes = notes