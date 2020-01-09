# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.person import Person


async def test_get_worker(client):
    """Test case for get_worker

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/vms/api/v1/workers/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

