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
from api_server.api.agency_api import AgencyApi  # noqa: E501
from api_server.rest import ApiException


class TestAgencyApi(unittest.TestCase):
    """AgencyApi unit test stubs"""

    def setUp(self):
        self.api = api_server.api.agency_api.AgencyApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_offer_worker(self):
        """Test case for offer_worker

        """
        pass


if __name__ == '__main__':
    unittest.main()
