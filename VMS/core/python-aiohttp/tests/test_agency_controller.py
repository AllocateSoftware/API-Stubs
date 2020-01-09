# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.person_identifier import PersonIdentifier


async def test_offer_worker(client):
    """Test case for offer_worker

    
    """
    body = {
  "universalId" : "QQ123456C",
  "id" : "123e4567-e89b-12d3-a456-426655440000"
}
    headers = { 
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/vms/api/v1/bookingRequests/{booking_request_id}/offers'.format(booking_request_id='booking_request_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

