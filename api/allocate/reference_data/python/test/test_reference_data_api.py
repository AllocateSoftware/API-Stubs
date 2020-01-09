# coding: utf-8

"""
    Reference data and Mappings API

         ## API for accessing reference data and mapping information   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import api_server
from api_server.api.reference_data_api import ReferenceDataApi  # noqa: E501
from api_server.rest import ApiException


class TestReferenceDataApi(unittest.TestCase):
    """ReferenceDataApi unit test stubs"""

    def setUp(self):
        self.api = api_server.api.reference_data_api.ReferenceDataApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_vocabulary_entry(self):
        """Test case for create_vocabulary_entry

        """
        pass

    def test_delete_vocabulary_entry(self):
        """Test case for delete_vocabulary_entry

        """
        pass

    def test_get_vocabularies(self):
        """Test case for get_vocabularies

        """
        pass

    def test_get_vocabulary(self):
        """Test case for get_vocabulary

        """
        pass

    def test_get_vocabulary_element(self):
        """Test case for get_vocabulary_element

        """
        pass

    def test_get_vocabulary_entries(self):
        """Test case for get_vocabulary_entries

        """
        pass

    def test_get_vocabulary_type_by_id(self):
        """Test case for get_vocabulary_type_by_id

        """
        pass

    def test_get_vocabulary_types(self):
        """Test case for get_vocabulary_types

        """
        pass

    def test_put_vocabulary_entry(self):
        """Test case for put_vocabulary_entry

        """
        pass


if __name__ == '__main__':
    unittest.main()