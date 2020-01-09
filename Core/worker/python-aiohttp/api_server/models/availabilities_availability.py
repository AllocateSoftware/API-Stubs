# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class AvailabilitiesAvailability(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, date: date=None, availability_type: str=None, start: str=None, end: str=None, number_of_occurrences: float=None, notes: str=None):
        """AvailabilitiesAvailability - a model defined in OpenAPI

        :param date: The date of this AvailabilitiesAvailability.
        :param availability_type: The availability_type of this AvailabilitiesAvailability.
        :param start: The start of this AvailabilitiesAvailability.
        :param end: The end of this AvailabilitiesAvailability.
        :param number_of_occurrences: The number_of_occurrences of this AvailabilitiesAvailability.
        :param notes: The notes of this AvailabilitiesAvailability.
        """
        self.openapi_types = {
            'date': date,
            'availability_type': str,
            'start': str,
            'end': str,
            'number_of_occurrences': float,
            'notes': str
        }

        self.attribute_map = {
            'date': 'date',
            'availability_type': 'availabilityType',
            'start': 'start',
            'end': 'end',
            'number_of_occurrences': 'numberOfOccurrences',
            'notes': 'notes'
        }

        self._date = date
        self._availability_type = availability_type
        self._start = start
        self._end = end
        self._number_of_occurrences = number_of_occurrences
        self._notes = notes

    @classmethod
    def from_dict(cls, dikt: dict) -> 'AvailabilitiesAvailability':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Availabilities_Availability of this AvailabilitiesAvailability.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def date(self):
        """Gets the date of this AvailabilitiesAvailability.


        :return: The date of this AvailabilitiesAvailability.
        :rtype: date
        """
        return self._date

    @date.setter
    def date(self, date):
        """Sets the date of this AvailabilitiesAvailability.


        :param date: The date of this AvailabilitiesAvailability.
        :type date: date
        """

        self._date = date

    @property
    def availability_type(self):
        """Gets the availability_type of this AvailabilitiesAvailability.


        :return: The availability_type of this AvailabilitiesAvailability.
        :rtype: str
        """
        return self._availability_type

    @availability_type.setter
    def availability_type(self, availability_type):
        """Sets the availability_type of this AvailabilitiesAvailability.


        :param availability_type: The availability_type of this AvailabilitiesAvailability.
        :type availability_type: str
        """

        self._availability_type = availability_type

    @property
    def start(self):
        """Gets the start of this AvailabilitiesAvailability.


        :return: The start of this AvailabilitiesAvailability.
        :rtype: str
        """
        return self._start

    @start.setter
    def start(self, start):
        """Sets the start of this AvailabilitiesAvailability.


        :param start: The start of this AvailabilitiesAvailability.
        :type start: str
        """

        self._start = start

    @property
    def end(self):
        """Gets the end of this AvailabilitiesAvailability.


        :return: The end of this AvailabilitiesAvailability.
        :rtype: str
        """
        return self._end

    @end.setter
    def end(self, end):
        """Sets the end of this AvailabilitiesAvailability.


        :param end: The end of this AvailabilitiesAvailability.
        :type end: str
        """

        self._end = end

    @property
    def number_of_occurrences(self):
        """Gets the number_of_occurrences of this AvailabilitiesAvailability.


        :return: The number_of_occurrences of this AvailabilitiesAvailability.
        :rtype: float
        """
        return self._number_of_occurrences

    @number_of_occurrences.setter
    def number_of_occurrences(self, number_of_occurrences):
        """Sets the number_of_occurrences of this AvailabilitiesAvailability.


        :param number_of_occurrences: The number_of_occurrences of this AvailabilitiesAvailability.
        :type number_of_occurrences: float
        """

        self._number_of_occurrences = number_of_occurrences

    @property
    def notes(self):
        """Gets the notes of this AvailabilitiesAvailability.


        :return: The notes of this AvailabilitiesAvailability.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this AvailabilitiesAvailability.


        :param notes: The notes of this AvailabilitiesAvailability.
        :type notes: str
        """

        self._notes = notes
