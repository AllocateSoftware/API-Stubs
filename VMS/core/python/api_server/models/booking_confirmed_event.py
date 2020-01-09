# coding: utf-8

"""
    VMS API

    ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class BookingConfirmedEvent(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'booking_request_id': 'str',
        'booking_id': 'str',
        'agency_id': 'str',
        'cost': 'float'
    }

    attribute_map = {
        'booking_request_id': 'bookingRequestId',
        'booking_id': 'bookingId',
        'agency_id': 'agencyId',
        'cost': 'cost'
    }

    def __init__(self, booking_request_id=None, booking_id=None, agency_id=None, cost=None, local_vars_configuration=None):  # noqa: E501
        """BookingConfirmedEvent - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._booking_request_id = None
        self._booking_id = None
        self._agency_id = None
        self._cost = None
        self.discriminator = None

        self.booking_request_id = booking_request_id
        self.booking_id = booking_id
        self.agency_id = agency_id
        if cost is not None:
            self.cost = cost

    @property
    def booking_request_id(self):
        """Gets the booking_request_id of this BookingConfirmedEvent.  # noqa: E501


        :return: The booking_request_id of this BookingConfirmedEvent.  # noqa: E501
        :rtype: str
        """
        return self._booking_request_id

    @booking_request_id.setter
    def booking_request_id(self, booking_request_id):
        """Sets the booking_request_id of this BookingConfirmedEvent.


        :param booking_request_id: The booking_request_id of this BookingConfirmedEvent.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and booking_request_id is None:  # noqa: E501
            raise ValueError("Invalid value for `booking_request_id`, must not be `None`")  # noqa: E501

        self._booking_request_id = booking_request_id

    @property
    def booking_id(self):
        """Gets the booking_id of this BookingConfirmedEvent.  # noqa: E501


        :return: The booking_id of this BookingConfirmedEvent.  # noqa: E501
        :rtype: str
        """
        return self._booking_id

    @booking_id.setter
    def booking_id(self, booking_id):
        """Sets the booking_id of this BookingConfirmedEvent.


        :param booking_id: The booking_id of this BookingConfirmedEvent.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and booking_id is None:  # noqa: E501
            raise ValueError("Invalid value for `booking_id`, must not be `None`")  # noqa: E501

        self._booking_id = booking_id

    @property
    def agency_id(self):
        """Gets the agency_id of this BookingConfirmedEvent.  # noqa: E501


        :return: The agency_id of this BookingConfirmedEvent.  # noqa: E501
        :rtype: str
        """
        return self._agency_id

    @agency_id.setter
    def agency_id(self, agency_id):
        """Sets the agency_id of this BookingConfirmedEvent.


        :param agency_id: The agency_id of this BookingConfirmedEvent.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and agency_id is None:  # noqa: E501
            raise ValueError("Invalid value for `agency_id`, must not be `None`")  # noqa: E501

        self._agency_id = agency_id

    @property
    def cost(self):
        """Gets the cost of this BookingConfirmedEvent.  # noqa: E501


        :return: The cost of this BookingConfirmedEvent.  # noqa: E501
        :rtype: float
        """
        return self._cost

    @cost.setter
    def cost(self, cost):
        """Sets the cost of this BookingConfirmedEvent.


        :param cost: The cost of this BookingConfirmedEvent.  # noqa: E501
        :type: float
        """

        self._cost = cost

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, BookingConfirmedEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BookingConfirmedEvent):
            return True

        return self.to_dict() != other.to_dict()
