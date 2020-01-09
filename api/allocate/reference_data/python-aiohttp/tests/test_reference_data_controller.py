# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.vocabulary import Vocabulary
from api_server.models.vocabulary_entry import VocabularyEntry
from api_server.models.vocabulary_type import VocabularyType


async def test_create_vocabulary_entry(client):
    """Test case for create_vocabulary_entry

    
    """
    body = {
  "code" : "ABCD",
  "title" : "ABCD"
}
    headers = { 
        'Accept': 'text/plain',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/api/v1/vocabularies/{id}/entries'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_delete_vocabulary_entry(client):
    """Test case for delete_vocabulary_entry

    
    """
    headers = { 
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/api/v1/vocabularies/{id}/entries/{element_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, element_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vocabularies(client):
    """Test case for get_vocabularies

    
    """
    params = [('vocabularyTypeId', 4A4C8447-F66E-464F-BBB1-2DEE4971CF28),
                    ('page', 'page_example'),
                    ('pageSize', 'page_size_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/vocabularies',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vocabulary(client):
    """Test case for get_vocabulary

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/vocabularies/{id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vocabulary_element(client):
    """Test case for get_vocabulary_element

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/vocabularies/{id}/entries/{element_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, element_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vocabulary_entries(client):
    """Test case for get_vocabulary_entries

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/vocabularies/{id}/entries'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vocabulary_type_by_id(client):
    """Test case for get_vocabulary_type_by_id

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/vocabularyTypes/{id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vocabulary_types(client):
    """Test case for get_vocabulary_types

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/vocabularyTypes',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_put_vocabulary_entry(client):
    """Test case for put_vocabulary_entry

    
    """
    body = {
  "code" : "ABCD",
  "title" : "ABCD"
}
    headers = { 
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='PUT',
        path='/api/v1/vocabularies/{id}/entries/{element_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, element_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

