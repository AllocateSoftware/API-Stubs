# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.proposal_details import ProposalDetails


async def test_accept_proposal(client):
    """Test case for accept_proposal

    
    """
    headers = { 
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/proposals/{id}/accept'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_cancel_proposal(client):
    """Test case for cancel_proposal

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/proposals/{id}'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_proposal(client):
    """Test case for get_proposal

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/proposals/{id}'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_proposal(client):
    """Test case for update_proposal

    
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
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/api/v1/proposals/{id}'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

