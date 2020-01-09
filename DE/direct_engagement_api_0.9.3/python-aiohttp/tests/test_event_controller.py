# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.duty import Duty


async def test_get_events(client):
    """Test case for get_events

    Get all events older than input timestamp
    """
    params = [('dateTimeFrom', '2013-10-20T19:20:30+01:00'),
                    ('page', 56),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/{version}/trustcode/{trust_code}/event'.format(version='version_example', trust_code='trust_code_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

