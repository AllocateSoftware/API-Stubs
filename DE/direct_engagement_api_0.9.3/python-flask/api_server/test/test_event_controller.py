# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.duty import Duty  # noqa: E501
from api_server.test import BaseTestCase


class TestEventController(BaseTestCase):
    """EventController integration test stubs"""

    def test_get_events(self):
        """Test case for get_events

        Get all events older than input timestamp
        """
        query_string = [('dateTimeFrom', '2013-10-20T19:20:30+01:00'),
                        ('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/event'.format(version='version_example', trust_code='trust_code_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
