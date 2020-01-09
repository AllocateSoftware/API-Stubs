# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.mapping import Mapping  # noqa: E501
from api_server.models.mapping_set import MappingSet  # noqa: E501
from api_server.test import BaseTestCase


class TestMappingsController(BaseTestCase):
    """MappingsController integration test stubs"""

    def test_create_mapping(self):
        """Test case for create_mapping

        
        """
        mapping = {
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
        response = self.client.open(
            '/api/v1/mappingSets/{set_id}/mappings'.format(set_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='POST',
            headers=headers,
            data=json.dumps(mapping),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_mapping(self):
        """Test case for delete_mapping

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/mappingSets/{id}/mappings/{mapping_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, mapping_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_mapping(self):
        """Test case for get_mapping

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/mappingSets/{id}/mappings/{mapping_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, mapping_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_mapping_set_by_id(self):
        """Test case for get_mapping_set_by_id

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/mappingSets/{set_id}'.format(set_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_mapping_sets(self):
        """Test case for get_mapping_sets

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/mappingSets',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_mappings(self):
        """Test case for get_mappings

        
        """
        query_string = [('fromCode', Band 4)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/mappingSets/{set_id}/mappings'.format(set_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_mapping(self):
        """Test case for put_mapping

        
        """
        mapping = {
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
        response = self.client.open(
            '/api/v1/mappingSets/{id}/mappings/{mapping_id}'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440, mapping_id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='PUT',
            headers=headers,
            data=json.dumps(mapping),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
