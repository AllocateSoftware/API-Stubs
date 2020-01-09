# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.duty_request import DutyRequest


async def test_accept_agency_offer(client):
    """Test case for accept_agency_offer

    
    """
    headers = { 
        'Accept': 'text/plain',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/vms/api/v1/bookingRequests/{booking_request_id}/offers/{offer_id}/accept'.format(booking_request_id='booking_request_id_example', offer_id='offer_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_cancel_booking(client):
    """Test case for cancel_booking

    
    """
    headers = { 
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/vms/api/v1/bookings/{booking_id}'.format(booking_id='booking_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_cancel_booking_request(client):
    """Test case for cancel_booking_request

    
    """
    headers = { 
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/vms/api/v1/bookingRequests/{booking_request_id}'.format(booking_request_id='booking_request_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_booking(client):
    """Test case for get_booking

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/vms/api/v1/bookings/{booking_id}'.format(booking_id='booking_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

