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


class ReferenceDataResponse(object):
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
        'ref_id': 'str',
        'description': 'str'
    }

    attribute_map = {
        'ref_id': 'refId',
        'description': 'description'
    }

    def __init__(self, ref_id=None, description=None, local_vars_configuration=None):  # noqa: E501
        """ReferenceDataResponse - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._ref_id = None
        self._description = None
        self.discriminator = None

        if ref_id is not None:
            self.ref_id = ref_id
        if description is not None:
            self.description = description

    @property
    def ref_id(self):
        """Gets the ref_id of this ReferenceDataResponse.  # noqa: E501

        Reference data trust identifier from BankStaff  # noqa: E501

        :return: The ref_id of this ReferenceDataResponse.  # noqa: E501
        :rtype: str
        """
        return self._ref_id

    @ref_id.setter
    def ref_id(self, ref_id):
        """Sets the ref_id of this ReferenceDataResponse.

        Reference data trust identifier from BankStaff  # noqa: E501

        :param ref_id: The ref_id of this ReferenceDataResponse.  # noqa: E501
        :type: str
        """

        self._ref_id = ref_id

    @property
    def description(self):
        """Gets the description of this ReferenceDataResponse.  # noqa: E501

        Reference data description from BankStaff  # noqa: E501

        :return: The description of this ReferenceDataResponse.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this ReferenceDataResponse.

        Reference data description from BankStaff  # noqa: E501

        :param description: The description of this ReferenceDataResponse.  # noqa: E501
        :type: str
        """

        self._description = description

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
        if not isinstance(other, ReferenceDataResponse):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ReferenceDataResponse):
            return True

        return self.to_dict() != other.to_dict()
