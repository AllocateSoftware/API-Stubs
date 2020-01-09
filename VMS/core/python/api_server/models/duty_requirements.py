# coding: utf-8

"""
    VMS API

    ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class DutyRequirements(object):
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
        'skill': 'str',
        'specialty': 'str',
        'fallback_skill': 'str',
        'fallback_speciality': 'str'
    }

    attribute_map = {
        'skill': 'skill',
        'specialty': 'specialty',
        'fallback_skill': 'fallbackSkill',
        'fallback_speciality': 'fallbackSpeciality'
    }

    def __init__(self, skill=None, specialty=None, fallback_skill=None, fallback_speciality=None, local_vars_configuration=None):  # noqa: E501
        """DutyRequirements - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._skill = None
        self._specialty = None
        self._fallback_skill = None
        self._fallback_speciality = None
        self.discriminator = None

        if skill is not None:
            self.skill = skill
        if specialty is not None:
            self.specialty = specialty
        if fallback_skill is not None:
            self.fallback_skill = fallback_skill
        if fallback_speciality is not None:
            self.fallback_speciality = fallback_speciality

    @property
    def skill(self):
        """Gets the skill of this DutyRequirements.  # noqa: E501

        Text description  # noqa: E501

        :return: The skill of this DutyRequirements.  # noqa: E501
        :rtype: str
        """
        return self._skill

    @skill.setter
    def skill(self, skill):
        """Sets the skill of this DutyRequirements.

        Text description  # noqa: E501

        :param skill: The skill of this DutyRequirements.  # noqa: E501
        :type: str
        """

        self._skill = skill

    @property
    def specialty(self):
        """Gets the specialty of this DutyRequirements.  # noqa: E501

        Text description  # noqa: E501

        :return: The specialty of this DutyRequirements.  # noqa: E501
        :rtype: str
        """
        return self._specialty

    @specialty.setter
    def specialty(self, specialty):
        """Sets the specialty of this DutyRequirements.

        Text description  # noqa: E501

        :param specialty: The specialty of this DutyRequirements.  # noqa: E501
        :type: str
        """

        self._specialty = specialty

    @property
    def fallback_skill(self):
        """Gets the fallback_skill of this DutyRequirements.  # noqa: E501

        Text description  # noqa: E501

        :return: The fallback_skill of this DutyRequirements.  # noqa: E501
        :rtype: str
        """
        return self._fallback_skill

    @fallback_skill.setter
    def fallback_skill(self, fallback_skill):
        """Sets the fallback_skill of this DutyRequirements.

        Text description  # noqa: E501

        :param fallback_skill: The fallback_skill of this DutyRequirements.  # noqa: E501
        :type: str
        """

        self._fallback_skill = fallback_skill

    @property
    def fallback_speciality(self):
        """Gets the fallback_speciality of this DutyRequirements.  # noqa: E501

        Text description  # noqa: E501

        :return: The fallback_speciality of this DutyRequirements.  # noqa: E501
        :rtype: str
        """
        return self._fallback_speciality

    @fallback_speciality.setter
    def fallback_speciality(self, fallback_speciality):
        """Sets the fallback_speciality of this DutyRequirements.

        Text description  # noqa: E501

        :param fallback_speciality: The fallback_speciality of this DutyRequirements.  # noqa: E501
        :type: str
        """

        self._fallback_speciality = fallback_speciality

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
        if not isinstance(other, DutyRequirements):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DutyRequirements):
            return True

        return self.to_dict() != other.to_dict()