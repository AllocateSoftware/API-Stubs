# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.duty_request import DutyRequest  # noqa: E501
from api_server.test import BaseTestCase


class TestBookingsController(BaseTestCase):
    """BookingsController integration test stubs"""

    def test_accept_agency_offer(self):
        """Test case for accept_agency_offer

        
        """
        headers = { 
            'Accept': 'text/plain',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vms/api/v1/bookingRequests/{booking_request_id}/offers/{offer_id}/accept'.format(booking_request_id='booking_request_id_example', offer_id='offer_id_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cancel_booking(self):
        """Test case for cancel_booking

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vms/api/v1/bookings/{booking_id}'.format(booking_id='booking_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cancel_booking_request(self):
        """Test case for cancel_booking_request

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vms/api/v1/bookingRequests/{booking_request_id}'.format(booking_request_id='booking_request_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_booking(self):
        """Test case for get_booking

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vms/api/v1/bookings/{booking_id}'.format(booking_id='booking_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
