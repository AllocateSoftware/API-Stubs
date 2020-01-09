# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.mapping import Mapping
from api_server.models.mapping_set import MappingSet


async def test_create_mapping(client):
    """Test case for create_mapping

    
    """
    body = {
  "mappingSetId" : "mappingSetId",
  "from" : {
    "code" : "ABCD",
    "title" : "ABCD"
  },
  "id" : "id",
  "to" : {
    "code" : "ABCD",
    "title" : "ABCD"
  }
}
    headers = { 
        'Accept': 'text/plain',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/mappingSets/{set_id}/mappings'.format(set_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_delete_mapping(client):
    """Test case for delete_mapping

    
    """
    headers = { 
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/mappingSets/{id}/mappings/{mapping_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, mapping_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_mapping(client):
    """Test case for get_mapping

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/mappingSets/{id}/mappings/{mapping_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, mapping_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_mapping_set_by_id(client):
    """Test case for get_mapping_set_by_id

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/mappingSets/{set_id}'.format(set_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_mapping_sets(client):
    """Test case for get_mapping_sets

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/mappingSets',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_mappings(client):
    """Test case for get_mappings

    
    """
    params = [('fromCode', Band 4)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/mappingSets/{set_id}/mappings'.format(set_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_put_mapping(client):
    """Test case for put_mapping

    
    """
    body = {
  "mappingSetId" : "mappingSetId",
  "from" : {
    "code" : "ABCD",
    "title" : "ABCD"
  },
  "id" : "id",
  "to" : {
    "code" : "ABCD",
    "title" : "ABCD"
  }
}
    headers = { 
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/api/v1/mappingSets/{id}/mappings/{mapping_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, mapping_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

