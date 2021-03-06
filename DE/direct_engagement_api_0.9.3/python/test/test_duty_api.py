# coding: utf-8

"""
    DE Provider Direct Engagement API

    description  # noqa: E501

    The version of the OpenAPI document: 1.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import api_server
from api_server.api.duty_api import DutyApi  # noqa: E501
from api_server.rest import ApiException


class TestDutyApi(unittest.TestCase):
    """DutyApi unit test stubs"""

    def setUp(self):
        self.api = api_server.api.duty_api.DutyApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_cancel_duty(self):
        """Test case for cancel_duty

        Cancel a duty  # noqa: E501
        """
        pass

    def test_fill_duty(self):
        """Test case for fill_duty

        Creates booking for duty  # noqa: E501
        """
        pass

    def test_get_duty_details(self):
        """Test case for get_duty_details

        Returns details about a duties.  # noqa: E501
        """
        pass

    def test_get_single_duty_details(self):
        """Test case for get_single_duty_details

        Returns details about a duties.  # noqa: E501
        """
        pass

    def test_update_contract_status(self):
        """Test case for update_contract_status

        Updates DE Contract status  # noqa: E501
        """
        pass

    def test_update_timesheets(self):
        """Test case for update_timesheets

        Updates timesheet for duty  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
