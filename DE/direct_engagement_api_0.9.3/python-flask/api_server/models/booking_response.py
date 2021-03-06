# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class BookingResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, duty_id=None, booking_id=None, allocate_person_id=None, master_duty_id=None, slave_duty_id=None):  # noqa: E501
        """BookingResponse - a model defined in OpenAPI

        :param duty_id: The duty_id of this BookingResponse.  # noqa: E501
        :type duty_id: str
        :param booking_id: The booking_id of this BookingResponse.  # noqa: E501
        :type booking_id: str
        :param allocate_person_id: The allocate_person_id of this BookingResponse.  # noqa: E501
        :type allocate_person_id: str
        :param master_duty_id: The master_duty_id of this BookingResponse.  # noqa: E501
        :type master_duty_id: str
        :param slave_duty_id: The slave_duty_id of this BookingResponse.  # noqa: E501
        :type slave_duty_id: str
        """
        self.openapi_types = {
            'duty_id': str,
            'booking_id': str,
            'allocate_person_id': str,
            'master_duty_id': str,
            'slave_duty_id': str
        }

        self.attribute_map = {
            'duty_id': 'dutyId',
            'booking_id': 'bookingId',
            'allocate_person_id': 'allocatePersonId',
            'master_duty_id': 'masterDutyId',
            'slave_duty_id': 'slaveDutyId'
        }

        self._duty_id = duty_id
        self._booking_id = booking_id
        self._allocate_person_id = allocate_person_id
        self._master_duty_id = master_duty_id
        self._slave_duty_id = slave_duty_id

    @classmethod
    def from_dict(cls, dikt) -> 'BookingResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BookingResponse of this BookingResponse.  # noqa: E501
        :rtype: BookingResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def duty_id(self):
        """Gets the duty_id of this BookingResponse.

        Trust identifier of the booked duty  # noqa: E501

        :return: The duty_id of this BookingResponse.
        :rtype: str
        """
        return self._duty_id

    @duty_id.setter
    def duty_id(self, duty_id):
        """Sets the duty_id of this BookingResponse.

        Trust identifier of the booked duty  # noqa: E501

        :param duty_id: The duty_id of this BookingResponse.
        :type duty_id: str
        """

        self._duty_id = duty_id

    @property
    def booking_id(self):
        """Gets the booking_id of this BookingResponse.

        Trust identifier of the booking in BankStaff  # noqa: E501

        :return: The booking_id of this BookingResponse.
        :rtype: str
        """
        return self._booking_id

    @booking_id.setter
    def booking_id(self, booking_id):
        """Sets the booking_id of this BookingResponse.

        Trust identifier of the booking in BankStaff  # noqa: E501

        :param booking_id: The booking_id of this BookingResponse.
        :type booking_id: str
        """

        self._booking_id = booking_id

    @property
    def allocate_person_id(self):
        """Gets the allocate_person_id of this BookingResponse.

        Trust identifier of the booked person in BankStaff  # noqa: E501

        :return: The allocate_person_id of this BookingResponse.
        :rtype: str
        """
        return self._allocate_person_id

    @allocate_person_id.setter
    def allocate_person_id(self, allocate_person_id):
        """Sets the allocate_person_id of this BookingResponse.

        Trust identifier of the booked person in BankStaff  # noqa: E501

        :param allocate_person_id: The allocate_person_id of this BookingResponse.
        :type allocate_person_id: str
        """

        self._allocate_person_id = allocate_person_id

    @property
    def master_duty_id(self):
        """Gets the master_duty_id of this BookingResponse.

        Trust identifier of the master duty if the duty is part of the consolidated duty  # noqa: E501

        :return: The master_duty_id of this BookingResponse.
        :rtype: str
        """
        return self._master_duty_id

    @master_duty_id.setter
    def master_duty_id(self, master_duty_id):
        """Sets the master_duty_id of this BookingResponse.

        Trust identifier of the master duty if the duty is part of the consolidated duty  # noqa: E501

        :param master_duty_id: The master_duty_id of this BookingResponse.
        :type master_duty_id: str
        """

        self._master_duty_id = master_duty_id

    @property
    def slave_duty_id(self):
        """Gets the slave_duty_id of this BookingResponse.

        Trust identifier of the slave duty if the duty is part of the consolidated duty  # noqa: E501

        :return: The slave_duty_id of this BookingResponse.
        :rtype: str
        """
        return self._slave_duty_id

    @slave_duty_id.setter
    def slave_duty_id(self, slave_duty_id):
        """Sets the slave_duty_id of this BookingResponse.

        Trust identifier of the slave duty if the duty is part of the consolidated duty  # noqa: E501

        :param slave_duty_id: The slave_duty_id of this BookingResponse.
        :type slave_duty_id: str
        """

        self._slave_duty_id = slave_duty_id
