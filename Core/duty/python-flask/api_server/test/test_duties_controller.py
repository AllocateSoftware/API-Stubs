# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.duty_cost_details import DutyCostDetails  # noqa: E501
from api_server.models.duty_details import DutyDetails  # noqa: E501
from api_server.test import BaseTestCase


class TestDutiesController(BaseTestCase):
    """DutiesController integration test stubs"""

    def test_cancel_duty(self):
        """Test case for cancel_duty

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/duty/v1/duties/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cancel_duty_booking(self):
        """Test case for cancel_duty_booking

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/duty/v1/duties/{id}/booking'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_duty(self):
        """Test case for create_duty

        
        """
        duty_details = {
  "requirements" : "{}",
  "where" : {
    "locationId" : "TRST.101"
  },
  "when" : {
    "from" : "2000-01-23T04:56:07.000+00:00",
    "to" : "2000-01-23T04:56:07.000+00:00"
  }
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/duty/v1/duties',
            method='POST',
            headers=headers,
            data=json.dumps(duty_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_duty_costing(self):
        """Test case for send_duty_costing

        
        """
        duty_cost_details = {
  "amount" : 0.8008281904610115,
  "costingType" : "estimated"
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/duty/v1/duties/{id}/costing'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(duty_cost_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_duty_for_fulfillment(self):
        """Test case for send_duty_for_fulfillment

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/duty/v1/duties/{id}/sendTo/{destination}'.format(id='id_example', destination='destination_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
