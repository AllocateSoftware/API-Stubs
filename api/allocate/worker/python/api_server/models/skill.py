# coding: utf-8

"""
    Worker API and Events

         ## API and events for providing workers.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class Skill(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'skill_group': 'str',
        'cluster': 'str',
        'skill': 'str',
        'validity': 'DateSpan',
        'date_gained': 'str',
        'obtained_from_reason': 'str',
        'certificate_number': 'str',
        'notes': 'str'
    }

    attribute_map = {
        'skill_group': 'skillGroup',
        'cluster': 'cluster',
        'skill': 'skill',
        'validity': 'validity',
        'date_gained': 'dateGained',
        'obtained_from_reason': 'obtainedFromReason',
        'certificate_number': 'certificateNumber',
        'notes': 'notes'
    }

    def __init__(self, skill_group=None, cluster=None, skill=None, validity=None, date_gained=None, obtained_from_reason=None, certificate_number=None, notes=None, local_vars_configuration=None):  # noqa: E501
        """Skill - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._skill_group = None
        self._cluster = None
        self._skill = None
        self._validity = None
        self._date_gained = None
        self._obtained_from_reason = None
        self._certificate_number = None
        self._notes = None
        self.discriminator = None

        if skill_group is not None:
            self.skill_group = skill_group
        if cluster is not None:
            self.cluster = cluster
        if skill is not None:
            self.skill = skill
        self.validity = validity
        if date_gained is not None:
            self.date_gained = date_gained
        if obtained_from_reason is not None:
            self.obtained_from_reason = obtained_from_reason
        if certificate_number is not None:
            self.certificate_number = certificate_number
        if notes is not None:
            self.notes = notes

    @property
    def skill_group(self):
        """Gets the skill_group of this Skill.  # noqa: E501


        :return: The skill_group of this Skill.  # noqa: E501
        :rtype: str
        """
        return self._skill_group

    @skill_group.setter
    def skill_group(self, skill_group):
        """Sets the skill_group of this Skill.


        :param skill_group: The skill_group of this Skill.  # noqa: E501
        :type: str
        """

        self._skill_group = skill_group

    @property
    def cluster(self):
        """Gets the cluster of this Skill.  # noqa: E501


        :return: The cluster of this Skill.  # noqa: E501
        :rtype: str
        """
        return self._cluster

    @cluster.setter
    def cluster(self, cluster):
        """Sets the cluster of this Skill.


        :param cluster: The cluster of this Skill.  # noqa: E501
        :type: str
        """

        self._cluster = cluster

    @property
    def skill(self):
        """Gets the skill of this Skill.  # noqa: E501


        :return: The skill of this Skill.  # noqa: E501
        :rtype: str
        """
        return self._skill

    @skill.setter
    def skill(self, skill):
        """Sets the skill of this Skill.


        :param skill: The skill of this Skill.  # noqa: E501
        :type: str
        """

        self._skill = skill

    @property
    def validity(self):
        """Gets the validity of this Skill.  # noqa: E501


        :return: The validity of this Skill.  # noqa: E501
        :rtype: DateSpan
        """
        return self._validity

    @validity.setter
    def validity(self, validity):
        """Sets the validity of this Skill.


        :param validity: The validity of this Skill.  # noqa: E501
        :type: DateSpan
        """
        if self.local_vars_configuration.client_side_validation and validity is None:  # noqa: E501
            raise ValueError("Invalid value for `validity`, must not be `None`")  # noqa: E501

        self._validity = validity

    @property
    def date_gained(self):
        """Gets the date_gained of this Skill.  # noqa: E501


        :return: The date_gained of this Skill.  # noqa: E501
        :rtype: str
        """
        return self._date_gained

    @date_gained.setter
    def date_gained(self, date_gained):
        """Sets the date_gained of this Skill.


        :param date_gained: The date_gained of this Skill.  # noqa: E501
        :type: str
        """

        self._date_gained = date_gained

    @property
    def obtained_from_reason(self):
        """Gets the obtained_from_reason of this Skill.  # noqa: E501


        :return: The obtained_from_reason of this Skill.  # noqa: E501
        :rtype: str
        """
        return self._obtained_from_reason

    @obtained_from_reason.setter
    def obtained_from_reason(self, obtained_from_reason):
        """Sets the obtained_from_reason of this Skill.


        :param obtained_from_reason: The obtained_from_reason of this Skill.  # noqa: E501
        :type: str
        """

        self._obtained_from_reason = obtained_from_reason

    @property
    def certificate_number(self):
        """Gets the certificate_number of this Skill.  # noqa: E501


        :return: The certificate_number of this Skill.  # noqa: E501
        :rtype: str
        """
        return self._certificate_number

    @certificate_number.setter
    def certificate_number(self, certificate_number):
        """Sets the certificate_number of this Skill.


        :param certificate_number: The certificate_number of this Skill.  # noqa: E501
        :type: str
        """

        self._certificate_number = certificate_number

    @property
    def notes(self):
        """Gets the notes of this Skill.  # noqa: E501


        :return: The notes of this Skill.  # noqa: E501
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this Skill.


        :param notes: The notes of this Skill.  # noqa: E501
        :type: str
        """

        self._notes = notes

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Skill):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Skill):
            return True

        return self.to_dict() != other.to_dict()
