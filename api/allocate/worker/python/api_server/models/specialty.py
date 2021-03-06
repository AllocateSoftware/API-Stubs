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


class Specialty(object):
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
        'temp_staff_speciality': 'str',
        'validity': 'DateSpan',
        'notes': 'str'
    }

    attribute_map = {
        'temp_staff_speciality': 'tempStaffSpeciality',
        'validity': 'validity',
        'notes': 'notes'
    }

    def __init__(self, temp_staff_speciality=None, validity=None, notes=None, local_vars_configuration=None):  # noqa: E501
        """Specialty - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._temp_staff_speciality = None
        self._validity = None
        self._notes = None
        self.discriminator = None

        if temp_staff_speciality is not None:
            self.temp_staff_speciality = temp_staff_speciality
        self.validity = validity
        if notes is not None:
            self.notes = notes

    @property
    def temp_staff_speciality(self):
        """Gets the temp_staff_speciality of this Specialty.  # noqa: E501


        :return: The temp_staff_speciality of this Specialty.  # noqa: E501
        :rtype: str
        """
        return self._temp_staff_speciality

    @temp_staff_speciality.setter
    def temp_staff_speciality(self, temp_staff_speciality):
        """Sets the temp_staff_speciality of this Specialty.


        :param temp_staff_speciality: The temp_staff_speciality of this Specialty.  # noqa: E501
        :type: str
        """

        self._temp_staff_speciality = temp_staff_speciality

    @property
    def validity(self):
        """Gets the validity of this Specialty.  # noqa: E501


        :return: The validity of this Specialty.  # noqa: E501
        :rtype: DateSpan
        """
        return self._validity

    @validity.setter
    def validity(self, validity):
        """Sets the validity of this Specialty.


        :param validity: The validity of this Specialty.  # noqa: E501
        :type: DateSpan
        """
        if self.local_vars_configuration.client_side_validation and validity is None:  # noqa: E501
            raise ValueError("Invalid value for `validity`, must not be `None`")  # noqa: E501

        self._validity = validity

    @property
    def notes(self):
        """Gets the notes of this Specialty.  # noqa: E501


        :return: The notes of this Specialty.  # noqa: E501
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this Specialty.


        :param notes: The notes of this Specialty.  # noqa: E501
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
        if not isinstance(other, Specialty):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Specialty):
            return True

        return self.to_dict() != other.to_dict()
