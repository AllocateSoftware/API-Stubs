# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.person_gender import PersonGender
from api_server import util


class Person(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, first_name: str=None, surname: str=None, date_of_birth: date=None, person_gender: PersonGender=None, match_id: str=None, allocate_person_id: str=None, email: str=None, telephone_number: str=None, ext_system_id: str=None):
        """Person - a model defined in OpenAPI

        :param first_name: The first_name of this Person.
        :param surname: The surname of this Person.
        :param date_of_birth: The date_of_birth of this Person.
        :param person_gender: The person_gender of this Person.
        :param match_id: The match_id of this Person.
        :param allocate_person_id: The allocate_person_id of this Person.
        :param email: The email of this Person.
        :param telephone_number: The telephone_number of this Person.
        :param ext_system_id: The ext_system_id of this Person.
        """
        self.openapi_types = {
            'first_name': str,
            'surname': str,
            'date_of_birth': date,
            'person_gender': PersonGender,
            'match_id': str,
            'allocate_person_id': str,
            'email': str,
            'telephone_number': str,
            'ext_system_id': str
        }

        self.attribute_map = {
            'first_name': 'firstName',
            'surname': 'surname',
            'date_of_birth': 'dateOfBirth',
            'person_gender': 'personGender',
            'match_id': 'matchId',
            'allocate_person_id': 'allocatePersonId',
            'email': 'email',
            'telephone_number': 'telephoneNumber',
            'ext_system_id': 'extSystemId'
        }

        self._first_name = first_name
        self._surname = surname
        self._date_of_birth = date_of_birth
        self._person_gender = person_gender
        self._match_id = match_id
        self._allocate_person_id = allocate_person_id
        self._email = email
        self._telephone_number = telephone_number
        self._ext_system_id = ext_system_id

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Person':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Person of this Person.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def first_name(self):
        """Gets the first_name of this Person.


        :return: The first_name of this Person.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this Person.


        :param first_name: The first_name of this Person.
        :type first_name: str
        """

        self._first_name = first_name

    @property
    def surname(self):
        """Gets the surname of this Person.


        :return: The surname of this Person.
        :rtype: str
        """
        return self._surname

    @surname.setter
    def surname(self, surname):
        """Sets the surname of this Person.


        :param surname: The surname of this Person.
        :type surname: str
        """

        self._surname = surname

    @property
    def date_of_birth(self):
        """Gets the date_of_birth of this Person.

        Date of birth

        :return: The date_of_birth of this Person.
        :rtype: date
        """
        return self._date_of_birth

    @date_of_birth.setter
    def date_of_birth(self, date_of_birth):
        """Sets the date_of_birth of this Person.

        Date of birth

        :param date_of_birth: The date_of_birth of this Person.
        :type date_of_birth: date
        """

        self._date_of_birth = date_of_birth

    @property
    def person_gender(self):
        """Gets the person_gender of this Person.


        :return: The person_gender of this Person.
        :rtype: PersonGender
        """
        return self._person_gender

    @person_gender.setter
    def person_gender(self, person_gender):
        """Sets the person_gender of this Person.


        :param person_gender: The person_gender of this Person.
        :type person_gender: PersonGender
        """

        self._person_gender = person_gender

    @property
    def match_id(self):
        """Gets the match_id of this Person.

        NINumber.e-mail 

        :return: The match_id of this Person.
        :rtype: str
        """
        return self._match_id

    @match_id.setter
    def match_id(self, match_id):
        """Sets the match_id of this Person.

        NINumber.e-mail 

        :param match_id: The match_id of this Person.
        :type match_id: str
        """

        self._match_id = match_id

    @property
    def allocate_person_id(self):
        """Gets the allocate_person_id of this Person.

        Business Key

        :return: The allocate_person_id of this Person.
        :rtype: str
        """
        return self._allocate_person_id

    @allocate_person_id.setter
    def allocate_person_id(self, allocate_person_id):
        """Sets the allocate_person_id of this Person.

        Business Key

        :param allocate_person_id: The allocate_person_id of this Person.
        :type allocate_person_id: str
        """

        self._allocate_person_id = allocate_person_id

    @property
    def email(self):
        """Gets the email of this Person.


        :return: The email of this Person.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this Person.


        :param email: The email of this Person.
        :type email: str
        """

        self._email = email

    @property
    def telephone_number(self):
        """Gets the telephone_number of this Person.


        :return: The telephone_number of this Person.
        :rtype: str
        """
        return self._telephone_number

    @telephone_number.setter
    def telephone_number(self, telephone_number):
        """Sets the telephone_number of this Person.


        :param telephone_number: The telephone_number of this Person.
        :type telephone_number: str
        """

        self._telephone_number = telephone_number

    @property
    def ext_system_id(self):
        """Gets the ext_system_id of this Person.


        :return: The ext_system_id of this Person.
        :rtype: str
        """
        return self._ext_system_id

    @ext_system_id.setter
    def ext_system_id(self, ext_system_id):
        """Sets the ext_system_id of this Person.


        :param ext_system_id: The ext_system_id of this Person.
        :type ext_system_id: str
        """

        self._ext_system_id = ext_system_id
