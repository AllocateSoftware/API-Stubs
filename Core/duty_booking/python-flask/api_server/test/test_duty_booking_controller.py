# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.proposal_details import ProposalDetails  # noqa: E501
from api_server.test import BaseTestCase


class TestDutyBookingController(BaseTestCase):
    """DutyBookingController integration test stubs"""

    def test_cancel_proposal(self):
        """Test case for cancel_proposal

        
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/booking/v1/proposals/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_proposal(self):
        """Test case for create_proposal

        
        """
        proposal_details = {
  "cost" : 0.8008281904610115,
  "options" : [ [ "directBook", "directBook" ], [ "directBook", "directBook" ] ],
  "engagementRoute" : "substantive",
  "personId" : "personId",
  "agencyId" : "",
  "cancellationCosts" : [ {
    "amount" : 6.027456183070403,
    "afterDate" : "2000-01-23T04:56:07.000+00:00"
  }, {
    "amount" : 6.027456183070403,
    "afterDate" : "2000-01-23T04:56:07.000+00:00"
  } ]
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/booking/v1/vacancy/{vacancy_id}/proposals'.format(vacancy_id='vacancy_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(proposal_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_proposal(self):
        """Test case for update_proposal

        
        """
        proposal_details = {
  "cost" : 0.8008281904610115,
  "options" : [ [ "directBook", "directBook" ], [ "directBook", "directBook" ] ],
  "engagementRoute" : "substantive",
  "personId" : "personId",
  "agencyId" : "",
  "cancellationCosts" : [ {
    "amount" : 6.027456183070403,
    "afterDate" : "2000-01-23T04:56:07.000+00:00"
  }, {
    "amount" : 6.027456183070403,
    "afterDate" : "2000-01-23T04:56:07.000+00:00"
  } ]
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/booking/v1/proposals/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(proposal_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
