# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.error_response import ErrorResponse  # noqa: E501
from api_server.models.inline_object import InlineObject  # noqa: E501
from api_server.test import BaseTestCase


class TestWorkerController(BaseTestCase):
    """WorkerController integration test stubs"""

    def test_onboard_worker_to_trust(self):
        """Test case for onboard_worker_to_trust

        
        """
        inline_object = {}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/workers/{id}/onboardToTrust'.format(id=EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440),
            method='POST',
            headers=headers,
            data=json.dumps(inline_object),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
