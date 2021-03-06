# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server.models.date_span import DateSpan
from api_server import util


class Specialty(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, temp_staff_speciality: str=None, validity: DateSpan=None, notes: str=None):
        """Specialty - a model defined in OpenAPI

        :param temp_staff_speciality: The temp_staff_speciality of this Specialty.
        :param validity: The validity of this Specialty.
        :param notes: The notes of this Specialty.
        """
        self.openapi_types = {
            'temp_staff_speciality': str,
            'validity': DateSpan,
            'notes': str
        }

        self.attribute_map = {
            'temp_staff_speciality': 'tempStaffSpeciality',
            'validity': 'validity',
            'notes': 'notes'
        }

        self._temp_staff_speciality = temp_staff_speciality
        self._validity = validity
        self._notes = notes

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Specialty':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Specialty of this Specialty.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def temp_staff_speciality(self):
        """Gets the temp_staff_speciality of this Specialty.


        :return: The temp_staff_speciality of this Specialty.
        :rtype: str
        """
        return self._temp_staff_speciality

    @temp_staff_speciality.setter
    def temp_staff_speciality(self, temp_staff_speciality):
        """Sets the temp_staff_speciality of this Specialty.


        :param temp_staff_speciality: The temp_staff_speciality of this Specialty.
        :type temp_staff_speciality: str
        """

        self._temp_staff_speciality = temp_staff_speciality

    @property
    def validity(self):
        """Gets the validity of this Specialty.


        :return: The validity of this Specialty.
        :rtype: DateSpan
        """
        return self._validity

    @validity.setter
    def validity(self, validity):
        """Sets the validity of this Specialty.


        :param validity: The validity of this Specialty.
        :type validity: DateSpan
        """
        if validity is None:
            raise ValueError("Invalid value for `validity`, must not be `None`")

        self._validity = validity

    @property
    def notes(self):
        """Gets the notes of this Specialty.


        :return: The notes of this Specialty.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this Specialty.


        :param notes: The notes of this Specialty.
        :type notes: str
        """

        self._notes = notes
