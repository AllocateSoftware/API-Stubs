# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.contact_log_information_details import ContactLogInformationDetails
from api_server.models.identifier import Identifier
from api_server import util


class ContactLogInformation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, when: datetime=None, who: Dict[str, Identifier]=None, details: ContactLogInformationDetails=None):
        """ContactLogInformation - a model defined in OpenAPI

        :param type: The type of this ContactLogInformation.
        :param when: The when of this ContactLogInformation.
        :param who: The who of this ContactLogInformation.
        :param details: The details of this ContactLogInformation.
        """
        self.openapi_types = {
            'type': str,
            'when': datetime,
            'who': Dict[str, Identifier],
            'details': ContactLogInformationDetails
        }

        self.attribute_map = {
            'type': 'type',
            'when': 'when',
            'who': 'who',
            'details': 'details'
        }

        self._type = type
        self._when = when
        self._who = who
        self._details = details

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ContactLogInformation':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ContactLogInformation of this ContactLogInformation.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self):
        """Gets the type of this ContactLogInformation.


        :return: The type of this ContactLogInformation.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this ContactLogInformation.


        :param type: The type of this ContactLogInformation.
        :type type: str
        """
        allowed_values = ["telephone", "email", "IM", "faceToFace"]
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def when(self):
        """Gets the when of this ContactLogInformation.


        :return: The when of this ContactLogInformation.
        :rtype: datetime
        """
        return self._when

    @when.setter
    def when(self, when):
        """Sets the when of this ContactLogInformation.


        :param when: The when of this ContactLogInformation.
        :type when: datetime
        """

        self._when = when

    @property
    def who(self):
        """Gets the who of this ContactLogInformation.


        :return: The who of this ContactLogInformation.
        :rtype: Dict[str, Identifier]
        """
        return self._who

    @who.setter
    def who(self, who):
        """Sets the who of this ContactLogInformation.


        :param who: The who of this ContactLogInformation.
        :type who: Dict[str, Identifier]
        """

        self._who = who

    @property
    def details(self):
        """Gets the details of this ContactLogInformation.


        :return: The details of this ContactLogInformation.
        :rtype: ContactLogInformationDetails
        """
        return self._details

    @details.setter
    def details(self, details):
        """Sets the details of this ContactLogInformation.


        :param details: The details of this ContactLogInformation.
        :type details: ContactLogInformationDetails
        """

        self._details = details
