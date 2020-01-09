# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.create_proposal_response import CreateProposalResponse  # noqa: E501
from api_server.models.create_vacancy_response import CreateVacancyResponse  # noqa: E501
from api_server.models.error_response import ErrorResponse  # noqa: E501
from api_server.models.inline_object import InlineObject  # noqa: E501
from api_server.models.proposal_details import ProposalDetails  # noqa: E501
from api_server.models.vacancy import Vacancy  # noqa: E501
from api_server.test import BaseTestCase


class TestVacancyController(BaseTestCase):
    """VacancyController integration test stubs"""

    def test_create_proposal(self):
        """Test case for create_proposal

        
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
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vacancies/{vacancy_id}/proposals'.format(vacancy_id=33C33192-7B8D-4EE0-AD41-47AACF240A29),
            method='POST',
            headers=headers,
            data=json.dumps(proposal_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_vacancy(self):
        """Test case for create_vacancy

        
        """
        vacancy = {
  "reason" : "reason",
  "personRequirements" : {
    "gender" : "gender",
    "grade" : "grade",
    "gradeType" : "gradeType",
    "gradeTypeCategory" : "gradeTypeCategory"
  },
  "where" : {
    "trustId" : "trustId",
    "location" : {
      "name" : "name",
      "id" : "id"
    }
  },
  "id" : "D6540039-97B6-4D38-9837-29AA1C02302F",
  "when" : {
    "planned" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    }
  }
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vacancies',
            method='POST',
            headers=headers,
            data=json.dumps(vacancy),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_submit_timesheet(self):
        """Test case for submit_timesheet

        
        """
        inline_object = {}
        headers = { 
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vacancies/{vacancy_id}/timesheet'.format(vacancy_id=33C33192-7B8D-4EE0-AD41-47AACF240A29),
            method='POST',
            headers=headers,
            data=json.dumps(inline_object),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
