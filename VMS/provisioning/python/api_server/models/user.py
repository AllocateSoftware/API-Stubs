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


class User(object):
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
        'uri': 'str',
        'name': 'str',
        'roles': 'list[str]'
    }

    attribute_map = {
        'uri': 'uri',
        'name': 'name',
        'roles': 'roles'
    }

    def __init__(self, uri=None, name=None, roles=None, local_vars_configuration=None):  # noqa: E501
        """User - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._uri = None
        self._name = None
        self._roles = None
        self.discriminator = None

        if uri is not None:
            self.uri = uri
        if name is not None:
            self.name = name
        if roles is not None:
            self.roles = roles

    @property
    def uri(self):
        """Gets the uri of this User.  # noqa: E501

        Identifier of the user within the HealthSuite ecosystem  # noqa: E501

        :return: The uri of this User.  # noqa: E501
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri):
        """Sets the uri of this User.

        Identifier of the user within the HealthSuite ecosystem  # noqa: E501

        :param uri: The uri of this User.  # noqa: E501
        :type: str
        """

        self._uri = uri

    @property
    def name(self):
        """Gets the name of this User.  # noqa: E501

        Name for the user  # noqa: E501

        :return: The name of this User.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this User.

        Name for the user  # noqa: E501

        :param name: The name of this User.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def roles(self):
        """Gets the roles of this User.  # noqa: E501

        Optional list of textual roles that the user has in relation to the unit  # noqa: E501

        :return: The roles of this User.  # noqa: E501
        :rtype: list[str]
        """
        return self._roles

    @roles.setter
    def roles(self, roles):
        """Sets the roles of this User.

        Optional list of textual roles that the user has in relation to the unit  # noqa: E501

        :param roles: The roles of this User.  # noqa: E501
        :type: list[str]
        """

        self._roles = roles

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
        if not isinstance(other, User):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, User):
            return True

        return self.to_dict() != other.to_dict()
