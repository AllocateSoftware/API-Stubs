# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.duty_details import DutyDetails


async def test_cancel_duty(client):
    """Test case for cancel_duty

    
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/duty/v1/duties/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_cancel_duty_booking(client):
    """Test case for cancel_duty_booking

    
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/api/duty/v1/duties/{id}/booking'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_duty(client):
    """Test case for create_duty

    
    """
    body = {
  "requirements" : "{}",
  "where" : {
    "locationId" : "TRST.101"
  },
  "when" : {
    "from" : "2000-01-23T04:56:07.000+00:00",
    "to" : "2000-01-23T04:56:07.000+00:00"
  }
}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/duty/v1/duties',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_send_duty_for_fulfillment(client):
    """Test case for send_duty_for_fulfillment

    
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/duty/v1/duties/{id}/sendTo/{destination}'.format(id='id_example', destination='destination_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

