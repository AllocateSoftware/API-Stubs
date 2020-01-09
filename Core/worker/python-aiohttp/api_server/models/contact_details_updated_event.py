# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.contact_information import ContactInformation
from api_server import util


class ContactDetailsUpdatedEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, person_id: str=None, contact_information: Dict[str, ContactInformation]=None):
        """ContactDetailsUpdatedEvent - a model defined in OpenAPI

        :param person_id: The person_id of this ContactDetailsUpdatedEvent.
        :param contact_information: The contact_information of this ContactDetailsUpdatedEvent.
        """
        self.openapi_types = {
            'person_id': str,
            'contact_information': Dict[str, ContactInformation]
        }

        self.attribute_map = {
            'person_id': 'personId',
            'contact_information': 'contactInformation'
        }

        self._person_id = person_id
        self._contact_information = contact_information

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ContactDetailsUpdatedEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ContactDetailsUpdatedEvent of this ContactDetailsUpdatedEvent.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def person_id(self):
        """Gets the person_id of this ContactDetailsUpdatedEvent.

        ASWid of the person

        :return: The person_id of this ContactDetailsUpdatedEvent.
        :rtype: str
        """
        return self._person_id

    @person_id.setter
    def person_id(self, person_id):
        """Sets the person_id of this ContactDetailsUpdatedEvent.

        ASWid of the person

        :param person_id: The person_id of this ContactDetailsUpdatedEvent.
        :type person_id: str
        """
        if person_id is None:
            raise ValueError("Invalid value for `person_id`, must not be `None`")

        self._person_id = person_id

    @property
    def contact_information(self):
        """Gets the contact_information of this ContactDetailsUpdatedEvent.


        :return: The contact_information of this ContactDetailsUpdatedEvent.
        :rtype: Dict[str, ContactInformation]
        """
        return self._contact_information

    @contact_information.setter
    def contact_information(self, contact_information):
        """Sets the contact_information of this ContactDetailsUpdatedEvent.


        :param contact_information: The contact_information of this ContactDetailsUpdatedEvent.
        :type contact_information: Dict[str, ContactInformation]
        """
        if contact_information is None:
            raise ValueError("Invalid value for `contact_information`, must not be `None`")

        self._contact_information = contact_information
