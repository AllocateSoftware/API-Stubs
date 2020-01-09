# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.error_response import ErrorResponse
from api_server.models.inline_object import InlineObject


async def test_onboard_worker_to_trust(client):
    """Test case for onboard_worker_to_trust

    
    """
    body = {}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/workers/{id}/onboardToTrust'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

