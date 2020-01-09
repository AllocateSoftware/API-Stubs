# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.vocabulary import Vocabulary  # noqa: E501
from api_server.models.vocabulary_entry import VocabularyEntry  # noqa: E501
from api_server.models.vocabulary_type import VocabularyType  # noqa: E501
from api_server.test import BaseTestCase


class TestReferenceDataController(BaseTestCase):
    """ReferenceDataController integration test stubs"""

    def test_create_vocabulary_entry(self):
        """Test case for create_vocabulary_entry

        
        """
        vocabulary_entry = {
  "code" : "ABCD",
  "title" : "ABCD"
}
        headers = { 
            'Accept': 'text/plain',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vocabularies/{id}/entries'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='POST',
            headers=headers,
            data=json.dumps(vocabulary_entry),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_vocabulary_entry(self):
        """Test case for delete_vocabulary_entry

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vocabularies/{id}/entries/{element_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, element_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vocabularies(self):
        """Test case for get_vocabularies

        
        """
        query_string = [('vocabularyTypeId', 4A4C8447-F66E-464F-BBB1-2DEE4971CF28),
                        ('page', 'page_example'),
                        ('pageSize', 'page_size_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vocabularies',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vocabulary(self):
        """Test case for get_vocabulary

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vocabularies/{id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vocabulary_element(self):
        """Test case for get_vocabulary_element

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vocabularies/{id}/entries/{element_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, element_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vocabulary_entries(self):
        """Test case for get_vocabulary_entries

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vocabularies/{id}/entries'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vocabulary_type_by_id(self):
        """Test case for get_vocabulary_type_by_id

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vocabularyTypes/{id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vocabulary_types(self):
        """Test case for get_vocabulary_types

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vocabularyTypes',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_vocabulary_entry(self):
        """Test case for put_vocabulary_entry

        
        """
        vocabulary_entry = {
  "code" : "ABCD",
  "title" : "ABCD"
}
        headers = { 
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/vocabularies/{id}/entries/{element_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, element_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='PUT',
            headers=headers,
            data=json.dumps(vocabulary_entry),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
