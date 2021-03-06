# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from api_server.models.base_model_ import Model
from api_server import util


class BookingCancelledEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, booking_request_id: str=None, booking_id: str=None, agency_id: str=None, cost: float=None):
        """BookingCancelledEvent - a model defined in OpenAPI

        :param booking_request_id: The booking_request_id of this BookingCancelledEvent.
        :param booking_id: The booking_id of this BookingCancelledEvent.
        :param agency_id: The agency_id of this BookingCancelledEvent.
        :param cost: The cost of this BookingCancelledEvent.
        """
        self.openapi_types = {
            'booking_request_id': str,
            'booking_id': str,
            'agency_id': str,
            'cost': float
        }

        self.attribute_map = {
            'booking_request_id': 'bookingRequestId',
            'booking_id': 'bookingId',
            'agency_id': 'agencyId',
            'cost': 'cost'
        }

        self._booking_request_id = booking_request_id
        self._booking_id = booking_id
        self._agency_id = agency_id
        self._cost = cost

    @classmethod
    def from_dict(cls, dikt: dict) -> 'BookingCancelledEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The BookingCancelledEvent of this BookingCancelledEvent.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def booking_request_id(self):
        """Gets the booking_request_id of this BookingCancelledEvent.


        :return: The booking_request_id of this BookingCancelledEvent.
        :rtype: str
        """
        return self._booking_request_id

    @booking_request_id.setter
    def booking_request_id(self, booking_request_id):
        """Sets the booking_request_id of this BookingCancelledEvent.


        :param booking_request_id: The booking_request_id of this BookingCancelledEvent.
        :type booking_request_id: str
        """
        if booking_request_id is None:
            raise ValueError("Invalid value for `booking_request_id`, must not be `None`")

        self._booking_request_id = booking_request_id

    @property
    def booking_id(self):
        """Gets the booking_id of this BookingCancelledEvent.


        :return: The booking_id of this BookingCancelledEvent.
        :rtype: str
        """
        return self._booking_id

    @booking_id.setter
    def booking_id(self, booking_id):
        """Sets the booking_id of this BookingCancelledEvent.


        :param booking_id: The booking_id of this BookingCancelledEvent.
        :type booking_id: str
        """
        if booking_id is None:
            raise ValueError("Invalid value for `booking_id`, must not be `None`")

        self._booking_id = booking_id

    @property
    def agency_id(self):
        """Gets the agency_id of this BookingCancelledEvent.


        :return: The agency_id of this BookingCancelledEvent.
        :rtype: str
        """
        return self._agency_id

    @agency_id.setter
    def agency_id(self, agency_id):
        """Sets the agency_id of this BookingCancelledEvent.


        :param agency_id: The agency_id of this BookingCancelledEvent.
        :type agency_id: str
        """
        if agency_id is None:
            raise ValueError("Invalid value for `agency_id`, must not be `None`")

        self._agency_id = agency_id

    @property
    def cost(self):
        """Gets the cost of this BookingCancelledEvent.


        :return: The cost of this BookingCancelledEvent.
        :rtype: float
        """
        return self._cost

    @cost.setter
    def cost(self, cost):
        """Sets the cost of this BookingCancelledEvent.


        :param cost: The cost of this BookingCancelledEvent.
        :type cost: float
        """

        self._cost = cost
