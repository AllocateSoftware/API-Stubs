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


class Unit(object):
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
        'cost_centre': 'CostCentre',
        'staff_groups': 'list[StaffGroup]',
        'children': 'list[Unit]'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'cost_centre': 'costCentre',
        'staff_groups': 'staffGroups',
        'children': 'children'
    }

    def __init__(self, id=None, name=None, cost_centre=None, staff_groups=None, children=None, local_vars_configuration=None):  # noqa: E501
        """Unit - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._name = None
        self._cost_centre = None
        self._staff_groups = None
        self._children = None
        self.discriminator = None

        self.id = id
        self.name = name
        if cost_centre is not None:
            self.cost_centre = cost_centre
        if staff_groups is not None:
            self.staff_groups = staff_groups
        if children is not None:
            self.children = children

    @property
    def id(self):
        """Gets the id of this Unit.  # noqa: E501


        :return: The id of this Unit.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Unit.


        :param id: The id of this Unit.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and id is None:  # noqa: E501
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self):
        """Gets the name of this Unit.  # noqa: E501


        :return: The name of this Unit.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Unit.


        :param name: The name of this Unit.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and name is None:  # noqa: E501
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def cost_centre(self):
        """Gets the cost_centre of this Unit.  # noqa: E501


        :return: The cost_centre of this Unit.  # noqa: E501
        :rtype: CostCentre
        """
        return self._cost_centre

    @cost_centre.setter
    def cost_centre(self, cost_centre):
        """Sets the cost_centre of this Unit.


        :param cost_centre: The cost_centre of this Unit.  # noqa: E501
        :type: CostCentre
        """

        self._cost_centre = cost_centre

    @property
    def staff_groups(self):
        """Gets the staff_groups of this Unit.  # noqa: E501


        :return: The staff_groups of this Unit.  # noqa: E501
        :rtype: list[StaffGroup]
        """
        return self._staff_groups

    @staff_groups.setter
    def staff_groups(self, staff_groups):
        """Sets the staff_groups of this Unit.


        :param staff_groups: The staff_groups of this Unit.  # noqa: E501
        :type: list[StaffGroup]
        """

        self._staff_groups = staff_groups

    @property
    def children(self):
        """Gets the children of this Unit.  # noqa: E501

        Children of this unit. This may be an arbitarily deep tree structure.  # noqa: E501

        :return: The children of this Unit.  # noqa: E501
        :rtype: list[Unit]
        """
        return self._children

    @children.setter
    def children(self, children):
        """Sets the children of this Unit.

        Children of this unit. This may be an arbitarily deep tree structure.  # noqa: E501

        :param children: The children of this Unit.  # noqa: E501
        :type: list[Unit]
        """

        self._children = children

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
        if not isinstance(other, Unit):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Unit):
            return True

        return self.to_dict() != other.to_dict()
