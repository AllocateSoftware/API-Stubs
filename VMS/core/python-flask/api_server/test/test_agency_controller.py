# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.person_identifier import PersonIdentifier  # noqa: E501
from api_server.test import BaseTestCase


class TestAgencyController(BaseTestCase):
    """AgencyController integration test stubs"""

    def test_offer_worker(self):
        """Test case for offer_worker

        
        """
        person_identifier = {
  "universalId" : "QQ123456C",
  "id" : "123e4567-e89b-12d3-a456-426655440000"
}
        headers = { 
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vms/api/v1/bookingRequests/{booking_request_id}/offers'.format(booking_request_id='booking_request_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(person_identifier),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
