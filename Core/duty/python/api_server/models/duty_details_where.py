# coding: utf-8

"""
    Duties and Events

    ## Duties and Events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class DutyDetailsWhere(object):
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
        'location_id': 'str'
    }

    attribute_map = {
        'location_id': 'locationId'
    }

    def __init__(self, location_id=None, local_vars_configuration=None):  # noqa: E501
        """DutyDetailsWhere - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._location_id = None
        self.discriminator = None

        if location_id is not None:
            self.location_id = location_id

    @property
    def location_id(self):
        """Gets the location_id of this DutyDetailsWhere.  # noqa: E501


        :return: The location_id of this DutyDetailsWhere.  # noqa: E501
        :rtype: str
        """
        return self._location_id

    @location_id.setter
    def location_id(self, location_id):
        """Sets the location_id of this DutyDetailsWhere.


        :param location_id: The location_id of this DutyDetailsWhere.  # noqa: E501
        :type: str
        """

        self._location_id = location_id

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
        if not isinstance(other, DutyDetailsWhere):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DutyDetailsWhere):
            return True

        return self.to_dict() != other.to_dict()