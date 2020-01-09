# coding: utf-8

"""
    DE Provider Direct Engagement API

    description  # noqa: E501

    The version of the OpenAPI document: 1.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class Rates(object):
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
        'reference': 'str',
        'rate': 'float'
    }

    attribute_map = {
        'reference': 'reference',
        'rate': 'rate'
    }

    def __init__(self, reference=None, rate=None, local_vars_configuration=None):  # noqa: E501
        """Rates - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._reference = None
        self._rate = None
        self.discriminator = None

        if reference is not None:
            self.reference = reference
        if rate is not None:
            self.rate = rate

    @property
    def reference(self):
        """Gets the reference of this Rates.  # noqa: E501


        :return: The reference of this Rates.  # noqa: E501
        :rtype: str
        """
        return self._reference

    @reference.setter
    def reference(self, reference):
        """Sets the reference of this Rates.


        :param reference: The reference of this Rates.  # noqa: E501
        :type: str
        """
        allowed_values = ["basic_worker_pay", "basic_commission", "basic_ni", "enhanced_worker_pay", "enhanced_commission", "enhanced_ni", "fixed_worker_pay", "fixed_commission", "fixed_ni", "enhanced_night_worker_pay", "enhanced_night_commission", "enhanced_night_ni", "enhanced_saturday_worker_pay", "enhanced_saturday_commission", "enhanced_saturday_ni", "enhanced_sunday_worker_pay", "enhanced_sunday_commission", "enhanced_sunday_ni", "enhanced_holiday_worker_pay", "enhanced_holiday_commission", "enhanced_holiday_ni"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and reference not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `reference` ({0}), must be one of {1}"  # noqa: E501
                .format(reference, allowed_values)
            )

        self._reference = reference

    @property
    def rate(self):
        """Gets the rate of this Rates.  # noqa: E501


        :return: The rate of this Rates.  # noqa: E501
        :rtype: float
        """
        return self._rate

    @rate.setter
    def rate(self, rate):
        """Sets the rate of this Rates.


        :param rate: The rate of this Rates.  # noqa: E501
        :type: float
        """

        self._rate = rate

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
        if not isinstance(other, Rates):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Rates):
            return True

        return self.to_dict() != other.to_dict()
