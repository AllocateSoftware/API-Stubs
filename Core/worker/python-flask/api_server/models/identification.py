# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class Identification(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, staff_number=None, title=None, forenames=None, surname=None, middle_initials=None, known_as=None, gender=None, date_of_birth=None, ssn=None):  # noqa: E501
        """Identification - a model defined in OpenAPI

        :param staff_number: The staff_number of this Identification.  # noqa: E501
        :type staff_number: str
        :param title: The title of this Identification.  # noqa: E501
        :type title: str
        :param forenames: The forenames of this Identification.  # noqa: E501
        :type forenames: str
        :param surname: The surname of this Identification.  # noqa: E501
        :type surname: str
        :param middle_initials: The middle_initials of this Identification.  # noqa: E501
        :type middle_initials: str
        :param known_as: The known_as of this Identification.  # noqa: E501
        :type known_as: str
        :param gender: The gender of this Identification.  # noqa: E501
        :type gender: str
        :param date_of_birth: The date_of_birth of this Identification.  # noqa: E501
        :type date_of_birth: date
        :param ssn: The ssn of this Identification.  # noqa: E501
        :type ssn: str
        """
        self.openapi_types = {
            'staff_number': str,
            'title': str,
            'forenames': str,
            'surname': str,
            'middle_initials': str,
            'known_as': str,
            'gender': str,
            'date_of_birth': date,
            'ssn': str
        }

        self.attribute_map = {
            'staff_number': 'staffNumber',
            'title': 'title',
            'forenames': 'forenames',
            'surname': 'surname',
            'middle_initials': 'middleInitials',
            'known_as': 'knownAs',
            'gender': 'gender',
            'date_of_birth': 'dateOfBirth',
            'ssn': 'ssn'
        }

        self._staff_number = staff_number
        self._title = title
        self._forenames = forenames
        self._surname = surname
        self._middle_initials = middle_initials
        self._known_as = known_as
        self._gender = gender
        self._date_of_birth = date_of_birth
        self._ssn = ssn

    @classmethod
    def from_dict(cls, dikt) -> 'Identification':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Identification of this Identification.  # noqa: E501
        :rtype: Identification
        """
        return util.deserialize_model(dikt, cls)

    @property
    def staff_number(self):
        """Gets the staff_number of this Identification.

        Unique and unchanging staff number to use as the constant reference for a Person  # noqa: E501

        :return: The staff_number of this Identification.
        :rtype: str
        """
        return self._staff_number

    @staff_number.setter
    def staff_number(self, staff_number):
        """Sets the staff_number of this Identification.

        Unique and unchanging staff number to use as the constant reference for a Person  # noqa: E501

        :param staff_number: The staff_number of this Identification.
        :type staff_number: str
        """
        if staff_number is None:
            raise ValueError("Invalid value for `staff_number`, must not be `None`")  # noqa: E501

        self._staff_number = staff_number

    @property
    def title(self):
        """Gets the title of this Identification.

        This value is subject to mapping in the Gateway. If unavailable, provide a constant value e.g. UNKNOWN, which can be mapped to an empty value in HealthRoster Optima  # noqa: E501

        :return: The title of this Identification.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this Identification.

        This value is subject to mapping in the Gateway. If unavailable, provide a constant value e.g. UNKNOWN, which can be mapped to an empty value in HealthRoster Optima  # noqa: E501

        :param title: The title of this Identification.
        :type title: str
        """

        self._title = title

    @property
    def forenames(self):
        """Gets the forenames of this Identification.


        :return: The forenames of this Identification.
        :rtype: str
        """
        return self._forenames

    @forenames.setter
    def forenames(self, forenames):
        """Sets the forenames of this Identification.


        :param forenames: The forenames of this Identification.
        :type forenames: str
        """
        if forenames is None:
            raise ValueError("Invalid value for `forenames`, must not be `None`")  # noqa: E501

        self._forenames = forenames

    @property
    def surname(self):
        """Gets the surname of this Identification.


        :return: The surname of this Identification.
        :rtype: str
        """
        return self._surname

    @surname.setter
    def surname(self, surname):
        """Sets the surname of this Identification.


        :param surname: The surname of this Identification.
        :type surname: str
        """
        if surname is None:
            raise ValueError("Invalid value for `surname`, must not be `None`")  # noqa: E501

        self._surname = surname

    @property
    def middle_initials(self):
        """Gets the middle_initials of this Identification.


        :return: The middle_initials of this Identification.
        :rtype: str
        """
        return self._middle_initials

    @middle_initials.setter
    def middle_initials(self, middle_initials):
        """Sets the middle_initials of this Identification.


        :param middle_initials: The middle_initials of this Identification.
        :type middle_initials: str
        """

        self._middle_initials = middle_initials

    @property
    def known_as(self):
        """Gets the known_as of this Identification.


        :return: The known_as of this Identification.
        :rtype: str
        """
        return self._known_as

    @known_as.setter
    def known_as(self, known_as):
        """Sets the known_as of this Identification.


        :param known_as: The known_as of this Identification.
        :type known_as: str
        """

        self._known_as = known_as

    @property
    def gender(self):
        """Gets the gender of this Identification.


        :return: The gender of this Identification.
        :rtype: str
        """
        return self._gender

    @gender.setter
    def gender(self, gender):
        """Sets the gender of this Identification.


        :param gender: The gender of this Identification.
        :type gender: str
        """
        allowed_values = ["male", "female", "other"]  # noqa: E501
        if gender not in allowed_values:
            raise ValueError(
                "Invalid value for `gender` ({0}), must be one of {1}"
                .format(gender, allowed_values)
            )

        self._gender = gender

    @property
    def date_of_birth(self):
        """Gets the date_of_birth of this Identification.


        :return: The date_of_birth of this Identification.
        :rtype: date
        """
        return self._date_of_birth

    @date_of_birth.setter
    def date_of_birth(self, date_of_birth):
        """Sets the date_of_birth of this Identification.


        :param date_of_birth: The date_of_birth of this Identification.
        :type date_of_birth: date
        """
        if date_of_birth is None:
            raise ValueError("Invalid value for `date_of_birth`, must not be `None`")  # noqa: E501

        self._date_of_birth = date_of_birth

    @property
    def ssn(self):
        """Gets the ssn of this Identification.

        National Insurance \\ Social Security Number.  # noqa: E501

        :return: The ssn of this Identification.
        :rtype: str
        """
        return self._ssn

    @ssn.setter
    def ssn(self, ssn):
        """Sets the ssn of this Identification.

        National Insurance \\ Social Security Number.  # noqa: E501

        :param ssn: The ssn of this Identification.
        :type ssn: str
        """

        self._ssn = ssn
