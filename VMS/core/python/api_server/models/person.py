# coding: utf-8

"""
    VMS API

    ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class Person(object):
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
        'universal_id': 'str',
        'first_name': 'str',
        'surname': 'str',
        'email': 'str',
        'telephone_number': 'str',
        'links': 'list[Link]'
    }

    attribute_map = {
        'id': 'id',
        'universal_id': 'universalId',
        'first_name': 'firstName',
        'surname': 'surname',
        'email': 'email',
        'telephone_number': 'telephoneNumber',
        'links': 'links'
    }

    def __init__(self, id=None, universal_id=None, first_name=None, surname=None, email=None, telephone_number=None, links=None, local_vars_configuration=None):  # noqa: E501
        """Person - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._universal_id = None
        self._first_name = None
        self._surname = None
        self._email = None
        self._telephone_number = None
        self._links = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if universal_id is not None:
            self.universal_id = universal_id
        if first_name is not None:
            self.first_name = first_name
        if surname is not None:
            self.surname = surname
        if email is not None:
            self.email = email
        if telephone_number is not None:
            self.telephone_number = telephone_number
        if links is not None:
            self.links = links

    @property
    def id(self):
        """Gets the id of this Person.  # noqa: E501

        identifier of the person (worker) within the VMS  # noqa: E501

        :return: The id of this Person.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Person.

        identifier of the person (worker) within the VMS  # noqa: E501

        :param id: The id of this Person.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def universal_id(self):
        """Gets the universal_id of this Person.  # noqa: E501

        Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.  # noqa: E501

        :return: The universal_id of this Person.  # noqa: E501
        :rtype: str
        """
        return self._universal_id

    @universal_id.setter
    def universal_id(self, universal_id):
        """Sets the universal_id of this Person.

        Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.  # noqa: E501

        :param universal_id: The universal_id of this Person.  # noqa: E501
        :type: str
        """

        self._universal_id = universal_id

    @property
    def first_name(self):
        """Gets the first_name of this Person.  # noqa: E501


        :return: The first_name of this Person.  # noqa: E501
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this Person.


        :param first_name: The first_name of this Person.  # noqa: E501
        :type: str
        """

        self._first_name = first_name

    @property
    def surname(self):
        """Gets the surname of this Person.  # noqa: E501


        :return: The surname of this Person.  # noqa: E501
        :rtype: str
        """
        return self._surname

    @surname.setter
    def surname(self, surname):
        """Sets the surname of this Person.


        :param surname: The surname of this Person.  # noqa: E501
        :type: str
        """

        self._surname = surname

    @property
    def email(self):
        """Gets the email of this Person.  # noqa: E501


        :return: The email of this Person.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this Person.


        :param email: The email of this Person.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def telephone_number(self):
        """Gets the telephone_number of this Person.  # noqa: E501


        :return: The telephone_number of this Person.  # noqa: E501
        :rtype: str
        """
        return self._telephone_number

    @telephone_number.setter
    def telephone_number(self, telephone_number):
        """Sets the telephone_number of this Person.


        :param telephone_number: The telephone_number of this Person.  # noqa: E501
        :type: str
        """

        self._telephone_number = telephone_number

    @property
    def links(self):
        """Gets the links of this Person.  # noqa: E501

        Array of HATEOAS-style references that may be followed by the client. This may include a 'worker.profile' URL, which will return an HTML page representing the worker profile within the VMS.  # noqa: E501

        :return: The links of this Person.  # noqa: E501
        :rtype: list[Link]
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this Person.

        Array of HATEOAS-style references that may be followed by the client. This may include a 'worker.profile' URL, which will return an HTML page representing the worker profile within the VMS.  # noqa: E501

        :param links: The links of this Person.  # noqa: E501
        :type: list[Link]
        """

        self._links = links

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
        if not isinstance(other, Person):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Person):
            return True

        return self.to_dict() != other.to_dict()