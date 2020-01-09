# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.user import User
from api_server.models.user_provision_item import UserProvisionItem
from api_server import util


class UserProvision(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user: User=None, access: List[UserProvisionItem]=None):
        """UserProvision - a model defined in OpenAPI

        :param user: The user of this UserProvision.
        :param access: The access of this UserProvision.
        """
        self.openapi_types = {
            'user': User,
            'access': List[UserProvisionItem]
        }

        self.attribute_map = {
            'user': 'user',
            'access': 'access'
        }

        self._user = user
        self._access = access

    @classmethod
    def from_dict(cls, dikt: dict) -> 'UserProvision':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The UserProvision of this UserProvision.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user(self):
        """Gets the user of this UserProvision.


        :return: The user of this UserProvision.
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this UserProvision.


        :param user: The user of this UserProvision.
        :type user: User
        """

        self._user = user

    @property
    def access(self):
        """Gets the access of this UserProvision.


        :return: The access of this UserProvision.
        :rtype: List[UserProvisionItem]
        """
        return self._access

    @access.setter
    def access(self, access):
        """Sets the access of this UserProvision.


        :param access: The access of this UserProvision.
        :type access: List[UserProvisionItem]
        """

        self._access = access
