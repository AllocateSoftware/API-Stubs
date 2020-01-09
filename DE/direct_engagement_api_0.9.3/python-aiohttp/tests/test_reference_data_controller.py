# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.reference_data_response import ReferenceDataResponse
from api_server.models.unit_reference_data_response import UnitReferenceDataResponse


async def test_get_all_agencies(client):
    """Test case for get_all_agencies

    Get all agencies
    """
    params = [('page', 56),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/{version}/trustcode/{trust_code}/referenceData/agency'.format(version='version_example', trust_code='trust_code_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_contract_statuses(client):
    """Test case for get_all_contract_statuses

    Get all contract statuses
    """
    params = [('page', 56),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/{version}/trustcode/{trust_code}/referenceData/contractStatus'.format(version='version_example', trust_code='trust_code_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_grades(client):
    """Test case for get_all_grades

    Get all grades
    """
    params = [('page', 56),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/{version}/trustcode/{trust_code}/referenceData/grade'.format(version='version_example', trust_code='trust_code_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_reasons_for_vacancy(client):
    """Test case for get_all_reasons_for_vacancy

    Get all reasons for vacancy
    """
    params = [('page', 56),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/{version}/trustcode/{trust_code}/referenceData/reasonForVacancy'.format(version='version_example', trust_code='trust_code_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_staff_groups(client):
    """Test case for get_all_staff_groups

    Get all staff groups
    """
    params = [('page', 56),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/{version}/trustcode/{trust_code}/referenceData/staffGroup'.format(version='version_example', trust_code='trust_code_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_units(client):
    """Test case for get_all_units

    Get all units
    """
    params = [('page', 56),
                    ('pageSize', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/{version}/trustcode/{trust_code}/referenceData/unit'.format(version='version_example', trust_code='trust_code_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

