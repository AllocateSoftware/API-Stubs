# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.leave_claim import LeaveClaim  # noqa: E501
from api_server.test import BaseTestCase


class TestAnnualLeaveClaimsController(BaseTestCase):
    """AnnualLeaveClaimsController integration test stubs"""

    def test_submit_annual_leave_claim(self):
        """Test case for submit_annual_leave_claim

        
        """
        leave_claim = {
  "reason" : "annualLeave",
  "when" : {
    "from" : "2000-01-23",
    "to" : "2000-01-23"
  }
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/worker/v1/worker/{id}/leave'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(leave_claim),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
