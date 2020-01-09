# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.booking_info import BookingInfo
from api_server.models.booking_response import BookingResponse
from api_server.models.contract_status import ContractStatus
from api_server.models.duty import Duty
from api_server.models.inline_object import InlineObject


async def test_cancel_duty(client):
    """Test case for cancel_duty

    Cancel a duty
    """
    headers = { 
        'Accept': 'text/plain',
    }
    response = await client.request(
        method='POST',
        path='/{version}/trustcode/{trust_code}/duty/{duty_id}/cancel'.format(version='version_example', trust_code='trust_code_example', duty_id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_fill_duty(client):
    """Test case for fill_duty

    Creates booking for duty
    """
    body = {
  "agency" : 1135,
  "person" : {
    "allocatePersonId" : "TrustA.1123",
    "firstName" : "Doe",
    "telephoneNumber" : "+223504938839",
    "surname" : "John",
    "extSystemId" : "123e4567-e89b-12d3-a456-426655440000",
    "personGender" : "male",
    "dateOfBirth" : "2000-01-23",
    "matchId" : "E124RT562.john.doe@mail.com",
    "email" : "john.doe@mail.com"
  },
  "grade" : "TrustA.234",
  "rates" : [ {
    "reference" : "basic_commission",
    "rate" : 50.00
  }, {
    "reference" : "basic_commission",
    "rate" : 50.00
  } ],
  "contractId" : "123e4567-e89b-12d3-a456-426655440000"
}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/{version}/trustcode/{trust_code}/duty/{duty_id}/booking'.format(version='version_example', trust_code='trust_code_example', duty_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_duty_details(client):
    """Test case for get_duty_details

    Returns details about a duties.
    """
    params = [('id', 56),
                    ('page', 56),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/{version}/trustcode/{trust_code}/duty'.format(version='version_example', trust_code='trust_code_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_single_duty_details(client):
    """Test case for get_single_duty_details

    Returns details about a duties.
    """
    params = [('page', 56),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/{version}/trustcode/{trust_code}/duty/{duty_id}'.format(version='version_example', trust_code='trust_code_example', duty_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_contract_status(client):
    """Test case for update_contract_status

    Updates DE Contract status
    """
    headers = { 
        'Accept': 'text/plain',
    }
    response = await client.request(
        method='PUT',
        path='/{version}/trustcode/{trust_code}/duty/{duty_id}/contract/{contract_id}/status/{status_id}'.format(version='version_example', trust_code='trust_code_example', duty_id=56, contract_id=77135e23-af51-4714-b854-d8df9e64aa63, status_id={}),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_timesheets(client):
    """Test case for update_timesheets

    Updates timesheet for duty
    """
    body = {}
    headers = { 
        'Accept': 'text/plain',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='PUT',
        path='/{version}/trustcode/{trust_code}/duty/{duty_id}/timesheet'.format(version='version_example', trust_code='trust_code_example', duty_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

