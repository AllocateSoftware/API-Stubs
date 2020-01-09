# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.structure_provision import StructureProvision
from api_server.models.user_provision import UserProvision


async def test_provision_structure(client):
    """Test case for provision_structure

    
    """
    body = {
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
    response = await client.request(
        method='PUT',
        path='/vms/provisioning/v1/provision/customer/{id}'.format(id='id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_provision_user(client):
    """Test case for provision_user

    
    """
    body = {
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
    response = await client.request(
        method='PUT',
        path='/vms/provisioning/v1/provision/user/{id}'.format(id='id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

