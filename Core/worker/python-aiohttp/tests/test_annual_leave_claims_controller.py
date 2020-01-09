# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.leave_claim import LeaveClaim


async def test_submit_annual_leave_claim(client):
    """Test case for submit_annual_leave_claim

    
    """
    body = {
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
    response = await client.request(
        method='POST',
        path='/api/worker/v1/worker/{id}/leave'.format(id='id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

