# coding: utf-8

"""
    VMS API

    ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import api_server
from api_server.api.agencies_api import AgenciesApi  # noqa: E501
from api_server.rest import ApiException


class TestAgenciesApi(unittest.TestCase):
    """AgenciesApi unit test stubs"""

    def setUp(self):
        self.api = api_server.api.agencies_api.AgenciesApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_costings(self):
        """Test case for get_costings

        """
        pass

    def test_send_duty_to_agencies(self):
        """Test case for send_duty_to_agencies

        """
        pass

    def test_send_duty_to_agency(self):
        """Test case for send_duty_to_agency

        """
        pass


if __name__ == '__main__':
    unittest.main()
