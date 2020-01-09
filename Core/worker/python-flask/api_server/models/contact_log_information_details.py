# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class ContactLogInformationDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, successful=None, notes=None):  # noqa: E501
        """ContactLogInformationDetails - a model defined in OpenAPI

        :param successful: The successful of this ContactLogInformationDetails.  # noqa: E501
        :type successful: bool
        :param notes: The notes of this ContactLogInformationDetails.  # noqa: E501
        :type notes: str
        """
        self.openapi_types = {
            'successful': bool,
            'notes': str
        }

        self.attribute_map = {
            'successful': 'successful',
            'notes': 'notes'
        }

        self._successful = successful
        self._notes = notes

    @classmethod
    def from_dict(cls, dikt) -> 'ContactLogInformationDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ContactLogInformation_details of this ContactLogInformationDetails.  # noqa: E501
        :rtype: ContactLogInformationDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def successful(self):
        """Gets the successful of this ContactLogInformationDetails.

        Was this contact successful? (e.g: Call was answered)   # noqa: E501

        :return: The successful of this ContactLogInformationDetails.
        :rtype: bool
        """
        return self._successful

    @successful.setter
    def successful(self, successful):
        """Sets the successful of this ContactLogInformationDetails.

        Was this contact successful? (e.g: Call was answered)   # noqa: E501

        :param successful: The successful of this ContactLogInformationDetails.
        :type successful: bool
        """

        self._successful = successful

    @property
    def notes(self):
        """Gets the notes of this ContactLogInformationDetails.

        Notes on the contact  # noqa: E501

        :return: The notes of this ContactLogInformationDetails.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this ContactLogInformationDetails.

        Notes on the contact  # noqa: E501

        :param notes: The notes of this ContactLogInformationDetails.
        :type notes: str
        """

        self._notes = notes
