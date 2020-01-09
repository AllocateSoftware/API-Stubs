# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.duty_cost_details import DutyCostDetails


async def test_send_duty_costing(client):
    """Test case for send_duty_costing

    
    """
    body = {
  "amount" : 0.8008281904610115,
  "costingType" : "estimated"
}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/duty/v1/duties/{id}/costing'.format(id='id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

