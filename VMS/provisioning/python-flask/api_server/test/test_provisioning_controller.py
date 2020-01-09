# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.structure_provision import StructureProvision  # noqa: E501
from api_server.models.user_provision import UserProvision  # noqa: E501
from api_server.test import BaseTestCase


class TestProvisioningController(BaseTestCase):
    """ProvisioningController integration test stubs"""

    def test_provision_structure(self):
        """Test case for provision_structure

        
        """
        structure_provision = {
  "customerCode" : "NCUH",
  "units" : [ {
    "staffGroups" : [ {
      "name" : "Medics",
      "id" : "1121",
      "grades" : [ {
        "name" : "Band 5 RN",
        "id" : "1121"
      }, {
        "name" : "Band 5 RN",
        "id" : "1121"
      } ]
    }, {
      "name" : "Medics",
      "id" : "1121",
      "grades" : [ {
        "name" : "Band 5 RN",
        "id" : "1121"
      }, {
        "name" : "Band 5 RN",
        "id" : "1121"
      } ]
    } ],
    "children" : [ null, null ],
    "name" : "Opal Ward",
    "id" : "12345",
    "costCentre" : {
      "code" : "CC100"
    }
  }, {
    "staffGroups" : [ {
      "name" : "Medics",
      "id" : "1121",
      "grades" : [ {
        "name" : "Band 5 RN",
        "id" : "1121"
      }, {
        "name" : "Band 5 RN",
        "id" : "1121"
      } ]
    }, {
      "name" : "Medics",
      "id" : "1121",
      "grades" : [ {
        "name" : "Band 5 RN",
        "id" : "1121"
      }, {
        "name" : "Band 5 RN",
        "id" : "1121"
      } ]
    } ],
    "children" : [ null, null ],
    "name" : "Opal Ward",
    "id" : "12345",
    "costCentre" : {
      "code" : "CC100"
    }
  } ]
}
        headers = { 
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/vms/provisioning/v1/provision/customer/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(structure_provision),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_provision_user(self):
        """Test case for provision_user

        
        """
        user_provision = {
  "access" : [ {
    "roles" : [ "roles", "roles" ],
    "unitId" : "NCUH.1121"
  }, {
    "roles" : [ "roles", "roles" ],
    "unitId" : "NCUH.1121"
  } ],
  "user" : {
    "roles" : [ "roles", "roles" ],
    "name" : "name",
    "uri" : "user@email.com"
  }
}
        headers = { 
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/vms/provisioning/v1/provision/user/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(user_provision),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
