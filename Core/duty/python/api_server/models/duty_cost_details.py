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


class DutyCostDetails(object):
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
        'costing_type': 'str',
        'amount': 'float'
    }

    attribute_map = {
        'costing_type': 'costingType',
        'amount': 'amount'
    }

    def __init__(self, costing_type=None, amount=None, local_vars_configuration=None):  # noqa: E501
        """DutyCostDetails - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._costing_type = None
        self._amount = None
        self.discriminator = None

        if costing_type is not None:
            self.costing_type = costing_type
        if amount is not None:
            self.amount = amount

    @property
    def costing_type(self):
        """Gets the costing_type of this DutyCostDetails.  # noqa: E501

        Whether this cost is estimated, or actual  # noqa: E501

        :return: The costing_type of this DutyCostDetails.  # noqa: E501
        :rtype: str
        """
        return self._costing_type

    @costing_type.setter
    def costing_type(self, costing_type):
        """Sets the costing_type of this DutyCostDetails.

        Whether this cost is estimated, or actual  # noqa: E501

        :param costing_type: The costing_type of this DutyCostDetails.  # noqa: E501
        :type: str
        """
        allowed_values = ["estimated", "actual"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and costing_type not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `costing_type` ({0}), must be one of {1}"  # noqa: E501
                .format(costing_type, allowed_values)
            )

        self._costing_type = costing_type

    @property
    def amount(self):
        """Gets the amount of this DutyCostDetails.  # noqa: E501

        The amount (sterling)  # noqa: E501

        :return: The amount of this DutyCostDetails.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this DutyCostDetails.

        The amount (sterling)  # noqa: E501

        :param amount: The amount of this DutyCostDetails.  # noqa: E501
        :type: float
        """

        self._amount = amount

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
        if not isinstance(other, DutyCostDetails):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DutyCostDetails):
            return True

        return self.to_dict() != other.to_dict()
