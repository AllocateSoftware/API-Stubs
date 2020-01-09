# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.error_response import ErrorResponse
from api_server.models.hours_assignment import HoursAssignment


async def test_get_activities(client):
    """Test case for get_activities

    
    """
    params = [('customerCode', ASPH),
                    ('format', short)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/activities',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

