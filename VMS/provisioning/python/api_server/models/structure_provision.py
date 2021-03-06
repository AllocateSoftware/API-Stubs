# coding: utf-8

"""
    VMS Provisioning API

    ## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class StructureProvision(object):
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
        'customer_code': 'str',
        'units': 'list[Unit]'
    }

    attribute_map = {
        'customer_code': 'customerCode',
        'units': 'units'
    }

    def __init__(self, customer_code=None, units=None, local_vars_configuration=None):  # noqa: E501
        """StructureProvision - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._customer_code = None
        self._units = None
        self.discriminator = None

        if customer_code is not None:
            self.customer_code = customer_code
        if units is not None:
            self.units = units

    @property
    def customer_code(self):
        """Gets the customer_code of this StructureProvision.  # noqa: E501

        ID of the Customer (Trust)  # noqa: E501

        :return: The customer_code of this StructureProvision.  # noqa: E501
        :rtype: str
        """
        return self._customer_code

    @customer_code.setter
    def customer_code(self, customer_code):
        """Sets the customer_code of this StructureProvision.

        ID of the Customer (Trust)  # noqa: E501

        :param customer_code: The customer_code of this StructureProvision.  # noqa: E501
        :type: str
        """

        self._customer_code = customer_code

    @property
    def units(self):
        """Gets the units of this StructureProvision.  # noqa: E501

        List of units present within the customer's system  # noqa: E501

        :return: The units of this StructureProvision.  # noqa: E501
        :rtype: list[Unit]
        """
        return self._units

    @units.setter
    def units(self, units):
        """Sets the units of this StructureProvision.

        List of units present within the customer's system  # noqa: E501

        :param units: The units of this StructureProvision.  # noqa: E501
        :type: list[Unit]
        """

        self._units = units

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
        if not isinstance(other, StructureProvision):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, StructureProvision):
            return True

        return self.to_dict() != other.to_dict()
