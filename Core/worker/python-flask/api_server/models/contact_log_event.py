# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.contact_log_information import ContactLogInformation
from api_server import util

from api_server.models.contact_log_information import ContactLogInformation  # noqa: E501

class ContactLogEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, person_id=None, contact_log_information=None):  # noqa: E501
        """ContactLogEvent - a model defined in OpenAPI

        :param person_id: The person_id of this ContactLogEvent.  # noqa: E501
        :type person_id: str
        :param contact_log_information: The contact_log_information of this ContactLogEvent.  # noqa: E501
        :type contact_log_information: Dict[str, ContactLogInformation]
        """
        self.openapi_types = {
            'person_id': str,
            'contact_log_information': Dict[str, ContactLogInformation]
        }

        self.attribute_map = {
            'person_id': 'personId',
            'contact_log_information': 'contactLogInformation'
        }

        self._person_id = person_id
        self._contact_log_information = contact_log_information

    @classmethod
    def from_dict(cls, dikt) -> 'ContactLogEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ContactLogEvent of this ContactLogEvent.  # noqa: E501
        :rtype: ContactLogEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def person_id(self):
        """Gets the person_id of this ContactLogEvent.

        ASWid of the person  # noqa: E501

        :return: The person_id of this ContactLogEvent.
        :rtype: str
        """
        return self._person_id

    @person_id.setter
    def person_id(self, person_id):
        """Sets the person_id of this ContactLogEvent.

        ASWid of the person  # noqa: E501

        :param person_id: The person_id of this ContactLogEvent.
        :type person_id: str
        """
        if person_id is None:
            raise ValueError("Invalid value for `person_id`, must not be `None`")  # noqa: E501

        self._person_id = person_id

    @property
    def contact_log_information(self):
        """Gets the contact_log_information of this ContactLogEvent.


        :return: The contact_log_information of this ContactLogEvent.
        :rtype: Dict[str, ContactLogInformation]
        """
        return self._contact_log_information

    @contact_log_information.setter
    def contact_log_information(self, contact_log_information):
        """Sets the contact_log_information of this ContactLogEvent.


        :param contact_log_information: The contact_log_information of this ContactLogEvent.
        :type contact_log_information: Dict[str, ContactLogInformation]
        """
        if contact_log_information is None:
            raise ValueError("Invalid value for `contact_log_information`, must not be `None`")  # noqa: E501

        self._contact_log_information = contact_log_information
