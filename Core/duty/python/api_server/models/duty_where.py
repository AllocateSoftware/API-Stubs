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


class DutyWhere(object):
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
        'trust_id': 'str',
        'unit_code': 'str'
    }

    attribute_map = {
        'trust_id': 'trustId',
        'unit_code': 'unitCode'
    }

    def __init__(self, trust_id=None, unit_code=None, local_vars_configuration=None):  # noqa: E501
        """DutyWhere - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._trust_id = None
        self._unit_code = None
        self.discriminator = None

        if trust_id is not None:
            self.trust_id = trust_id
        if unit_code is not None:
            self.unit_code = unit_code

    @property
    def trust_id(self):
        """Gets the trust_id of this DutyWhere.  # noqa: E501

        name of the trust  # noqa: E501

        :return: The trust_id of this DutyWhere.  # noqa: E501
        :rtype: str
        """
        return self._trust_id

    @trust_id.setter
    def trust_id(self, trust_id):
        """Sets the trust_id of this DutyWhere.

        name of the trust  # noqa: E501

        :param trust_id: The trust_id of this DutyWhere.  # noqa: E501
        :type: str
        """

        self._trust_id = trust_id

    @property
    def unit_code(self):
        """Gets the unit_code of this DutyWhere.  # noqa: E501

        Code for the unit within the trust  # noqa: E501

        :return: The unit_code of this DutyWhere.  # noqa: E501
        :rtype: str
        """
        return self._unit_code

    @unit_code.setter
    def unit_code(self, unit_code):
        """Sets the unit_code of this DutyWhere.

        Code for the unit within the trust  # noqa: E501

        :param unit_code: The unit_code of this DutyWhere.  # noqa: E501
        :type: str
        """

        self._unit_code = unit_code

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
        if not isinstance(other, DutyWhere):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DutyWhere):
            return True

        return self.to_dict() != other.to_dict()
