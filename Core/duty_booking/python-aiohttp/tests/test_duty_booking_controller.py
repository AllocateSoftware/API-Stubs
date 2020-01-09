# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.proposal_details import ProposalDetails


async def test_cancel_proposal(client):
    """Test case for cancel_proposal

    
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/booking/v1/proposals/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_proposal(client):
    """Test case for create_proposal

    
    """
    body = {
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
    response = await client.request(
        method='POST',
        path='/api/booking/v1/vacancy/{vacancy_id}/proposals'.format(vacancy_id='vacancy_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_proposal(client):
    """Test case for update_proposal

    
    """
    body = {
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
    response = await client.request(
        method='PUT',
        path='/api/booking/v1/proposals/{id}'.format(id='id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

