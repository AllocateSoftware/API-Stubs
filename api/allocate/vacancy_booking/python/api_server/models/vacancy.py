# coding: utf-8

"""
    Vacancy Booking API and Events

         ## Duty Booking API and events and Events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class Vacancy(object):
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
        'id': 'str',
        'when': 'VacancyWhen',
        'where': 'VacancyWhere',
        'reason': 'str',
        'person_requirements': 'VacancyPersonRequirements'
    }

    attribute_map = {
        'id': 'id',
        'when': 'when',
        'where': 'where',
        'reason': 'reason',
        'person_requirements': 'personRequirements'
    }

    def __init__(self, id=None, when=None, where=None, reason=None, person_requirements=None, local_vars_configuration=None):  # noqa: E501
        """Vacancy - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._when = None
        self._where = None
        self._reason = None
        self._person_requirements = None
        self.discriminator = None

        self.id = id
        if when is not None:
            self.when = when
        if where is not None:
            self.where = where
        if reason is not None:
            self.reason = reason
        if person_requirements is not None:
            self.person_requirements = person_requirements

    @property
    def id(self):
        """Gets the id of this Vacancy.  # noqa: E501

        Identifier for this vacancy  # noqa: E501

        :return: The id of this Vacancy.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Vacancy.

        Identifier for this vacancy  # noqa: E501

        :param id: The id of this Vacancy.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and id is None:  # noqa: E501
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def when(self):
        """Gets the when of this Vacancy.  # noqa: E501


        :return: The when of this Vacancy.  # noqa: E501
        :rtype: VacancyWhen
        """
        return self._when

    @when.setter
    def when(self, when):
        """Sets the when of this Vacancy.


        :param when: The when of this Vacancy.  # noqa: E501
        :type: VacancyWhen
        """

        self._when = when

    @property
    def where(self):
        """Gets the where of this Vacancy.  # noqa: E501


        :return: The where of this Vacancy.  # noqa: E501
        :rtype: VacancyWhere
        """
        return self._where

    @where.setter
    def where(self, where):
        """Sets the where of this Vacancy.


        :param where: The where of this Vacancy.  # noqa: E501
        :type: VacancyWhere
        """

        self._where = where

    @property
    def reason(self):
        """Gets the reason of this Vacancy.  # noqa: E501

        Reason for the request  # noqa: E501

        :return: The reason of this Vacancy.  # noqa: E501
        :rtype: str
        """
        return self._reason

    @reason.setter
    def reason(self, reason):
        """Sets the reason of this Vacancy.

        Reason for the request  # noqa: E501

        :param reason: The reason of this Vacancy.  # noqa: E501
        :type: str
        """

        self._reason = reason

    @property
    def person_requirements(self):
        """Gets the person_requirements of this Vacancy.  # noqa: E501


        :return: The person_requirements of this Vacancy.  # noqa: E501
        :rtype: VacancyPersonRequirements
        """
        return self._person_requirements

    @person_requirements.setter
    def person_requirements(self, person_requirements):
        """Sets the person_requirements of this Vacancy.


        :param person_requirements: The person_requirements of this Vacancy.  # noqa: E501
        :type: VacancyPersonRequirements
        """

        self._person_requirements = person_requirements

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
        if not isinstance(other, Vacancy):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Vacancy):
            return True

        return self.to_dict() != other.to_dict()
