# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.create_proposal_response import CreateProposalResponse
from api_server.models.create_vacancy_response import CreateVacancyResponse
from api_server.models.error_response import ErrorResponse
from api_server.models.inline_object import InlineObject
from api_server.models.proposal_details import ProposalDetails
from api_server.models.vacancy import Vacancy


async def test_create_proposal(client):
    """Test case for create_proposal

    
    """
    body = {
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
    response = await client.request(
        method='POST',
        path='/api/v1/vacancies/{vacancy_id}/proposals'.format(vacancy_id=33C33192-7B8D-4EE0-AD41-47AACF240A29),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_vacancy(client):
    """Test case for create_vacancy

    
    """
    body = {
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
    response = await client.request(
        method='POST',
        path='/api/v1/vacancies',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_submit_timesheet(client):
    """Test case for submit_timesheet

    
    """
    body = {}
    headers = { 
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/vacancies/{vacancy_id}/timesheet'.format(vacancy_id=33C33192-7B8D-4EE0-AD41-47AACF240A29),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

