# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.proposal_details import ProposalDetails  # noqa: E501
from api_server.test import BaseTestCase


class TestProposalController(BaseTestCase):
    """ProposalController integration test stubs"""

    def test_accept_proposal(self):
        """Test case for accept_proposal

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/proposals/{id}/accept'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cancel_proposal(self):
        """Test case for cancel_proposal

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/proposals/{id}'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_proposal(self):
        """Test case for get_proposal

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/proposals/{id}'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_proposal(self):
        """Test case for update_proposal

        
        """
        proposal_details = {
  "cost" : 0.8008281904610115,
  "engagementRoute" : "substantive",
  "personId" : "personId",
  "agencyId" : "agencyId",
  "cancellationCosts" : [ {
    "amount" : 6.027456183070403,
    "afterDate" : "2000-01-23T04:56:07.000+00:00"
  }, {
    "amount" : 6.027456183070403,
    "afterDate" : "2000-01-23T04:56:07.000+00:00"
  } ]
}
        headers = { 
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/proposals/{id}'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
            method='PUT',
            headers=headers,
            data=json.dumps(proposal_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
