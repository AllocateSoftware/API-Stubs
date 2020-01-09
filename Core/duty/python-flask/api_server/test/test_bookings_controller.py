# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.duty_cost_details import DutyCostDetails  # noqa: E501
from api_server.test import BaseTestCase


class TestBookingsController(BaseTestCase):
    """BookingsController integration test stubs"""

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


if __name__ == '__main__':
    unittest.main()
