# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class BookingConfirmedEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, booking_request_id=None, booking_id=None, agency_id=None, cost=None):  # noqa: E501
        """BookingConfirmedEvent - a model defined in OpenAPI

        :param booking_request_id: The booking_request_id of this BookingConfirmedEvent.  # noqa: E501
        :type booking_request_id: str
        :param booking_id: The booking_id of this BookingConfirmedEvent.  # noqa: E501
        :type booking_id: str
        :param agency_id: The agency_id of this BookingConfirmedEvent.  # noqa: E501
        :type agency_id: str
        :param cost: The cost of this BookingConfirmedEvent.  # noqa: E501
        :type cost: float
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
    def from_dict(cls, dikt) -> 'BookingConfirmedEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BookingConfirmedEvent of this BookingConfirmedEvent.  # noqa: E501
        :rtype: BookingConfirmedEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def booking_request_id(self):
        """Gets the booking_request_id of this BookingConfirmedEvent.


        :return: The booking_request_id of this BookingConfirmedEvent.
        :rtype: str
        """
        return self._booking_request_id

    @booking_request_id.setter
    def booking_request_id(self, booking_request_id):
        """Sets the booking_request_id of this BookingConfirmedEvent.


        :param booking_request_id: The booking_request_id of this BookingConfirmedEvent.
        :type booking_request_id: str
        """
        if booking_request_id is None:
            raise ValueError("Invalid value for `booking_request_id`, must not be `None`")  # noqa: E501

        self._booking_request_id = booking_request_id

    @property
    def booking_id(self):
        """Gets the booking_id of this BookingConfirmedEvent.


        :return: The booking_id of this BookingConfirmedEvent.
        :rtype: str
        """
        return self._booking_id

    @booking_id.setter
    def booking_id(self, booking_id):
        """Sets the booking_id of this BookingConfirmedEvent.


        :param booking_id: The booking_id of this BookingConfirmedEvent.
        :type booking_id: str
        """
        if booking_id is None:
            raise ValueError("Invalid value for `booking_id`, must not be `None`")  # noqa: E501

        self._booking_id = booking_id

    @property
    def agency_id(self):
        """Gets the agency_id of this BookingConfirmedEvent.


        :return: The agency_id of this BookingConfirmedEvent.
        :rtype: str
        """
        return self._agency_id

    @agency_id.setter
    def agency_id(self, agency_id):
        """Sets the agency_id of this BookingConfirmedEvent.


        :param agency_id: The agency_id of this BookingConfirmedEvent.
        :type agency_id: str
        """
        if agency_id is None:
            raise ValueError("Invalid value for `agency_id`, must not be `None`")  # noqa: E501

        self._agency_id = agency_id

    @property
    def cost(self):
        """Gets the cost of this BookingConfirmedEvent.


        :return: The cost of this BookingConfirmedEvent.
        :rtype: float
        """
        return self._cost

    @cost.setter
    def cost(self, cost):
        """Sets the cost of this BookingConfirmedEvent.


        :param cost: The cost of this BookingConfirmedEvent.
        :type cost: float
        """

        self._cost = cost
