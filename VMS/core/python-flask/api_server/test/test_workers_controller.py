# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.person import Person  # noqa: E501
from api_server.test import BaseTestCase


class TestWorkersController(BaseTestCase):
    """WorkersController integration test stubs"""

    def test_get_worker(self):
        """Test case for get_worker

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vms/api/v1/workers/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
