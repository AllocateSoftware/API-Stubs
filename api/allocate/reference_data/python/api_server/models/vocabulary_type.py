# coding: utf-8

"""
    Reference data and Mappings API

         ## API for accessing reference data and mapping information   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class VocabularyType(object):
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
        'name': 'str',
        'description': 'str',
        'tags': 'dict(str, str)'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'description': 'description',
        'tags': 'tags'
    }

    def __init__(self, id=None, name=None, description=None, tags=None, local_vars_configuration=None):  # noqa: E501
        """VocabularyType - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._name = None
        self._description = None
        self._tags = None
        self.discriminator = None

        self.id = id
        self.name = name
        self.description = description
        if tags is not None:
            self.tags = tags

    @property
    def id(self):
        """Gets the id of this VocabularyType.  # noqa: E501

        ID of this vocabulary type  # noqa: E501

        :return: The id of this VocabularyType.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this VocabularyType.

        ID of this vocabulary type  # noqa: E501

        :param id: The id of this VocabularyType.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and id is None:  # noqa: E501
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self):
        """Gets the name of this VocabularyType.  # noqa: E501

        Name of the vocabulary. Usually would not contain spaces (as this will be used in URLs).  # noqa: E501

        :return: The name of this VocabularyType.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this VocabularyType.

        Name of the vocabulary. Usually would not contain spaces (as this will be used in URLs).  # noqa: E501

        :param name: The name of this VocabularyType.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and name is None:  # noqa: E501
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def description(self):
        """Gets the description of this VocabularyType.  # noqa: E501

        Description of the vocabulary  # noqa: E501

        :return: The description of this VocabularyType.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this VocabularyType.

        Description of the vocabulary  # noqa: E501

        :param description: The description of this VocabularyType.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and description is None:  # noqa: E501
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def tags(self):
        """Gets the tags of this VocabularyType.  # noqa: E501

        Optional array of tags which may be applied  # noqa: E501

        :return: The tags of this VocabularyType.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this VocabularyType.

        Optional array of tags which may be applied  # noqa: E501

        :param tags: The tags of this VocabularyType.  # noqa: E501
        :type: dict(str, str)
        """

        self._tags = tags

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
        if not isinstance(other, VocabularyType):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, VocabularyType):
            return True

        return self.to_dict() != other.to_dict()
