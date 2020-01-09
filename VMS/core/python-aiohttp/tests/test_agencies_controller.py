# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.agency_costings import AgencyCostings
from api_server.models.duty import Duty
from api_server.models.duty_request import DutyRequest


async def test_get_costings(client):
    """Test case for get_costings

    
    """
    body = {
  "requirements" : {
    "specialty" : "Speciality",
    "fallbackSpeciality" : "Fallback speciality",
    "skill" : "Skill",
    "fallbackSkill" : "Fallback skill"
  },
  "clientDeptId" : "TrustA.667899",
  "agency" : "Liberty Resourcing Admin",
  "subDiscipline" : "TrustA.1323",
  "grade" : "TrustA.77889",
  "fallbackGrade" : "TrustA.9989",
  "where" : {
    "name" : "name",
    "id" : "id"
  },
  "id" : "ABD.1210",
  "uniqueNumber" : 112233,
  "when" : {
    "date" : "2018-07-29T00:00:00.000+0000",
    "breakDuration" : 30,
    "startTime" : "12:40",
    "endTime" : "01:25"
  },
  "vacancyReason" : "TrustA.12",
  "poNumber" : 0
}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/vms/api/v1/agencies/costings',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_send_duty_to_agencies(client):
    """Test case for send_duty_to_agencies

    
    """
    body = {
  "workerId" : "workerId",
  "duty" : {
    "requirements" : {
      "specialty" : "Speciality",
      "fallbackSpeciality" : "Fallback speciality",
      "skill" : "Skill",
      "fallbackSkill" : "Fallback skill"
    },
    "clientDeptId" : "TrustA.667899",
    "agency" : "Liberty Resourcing Admin",
    "subDiscipline" : "TrustA.1323",
    "grade" : "TrustA.77889",
    "fallbackGrade" : "TrustA.9989",
    "where" : {
      "name" : "name",
      "id" : "id"
    },
    "id" : "ABD.1210",
    "uniqueNumber" : 112233,
    "when" : {
      "date" : "2018-07-29T00:00:00.000+0000",
      "breakDuration" : 30,
      "startTime" : "12:40",
      "endTime" : "01:25"
    },
    "vacancyReason" : "TrustA.12",
    "poNumber" : 0
  }
}
    headers = { 
        'Accept': 'text/plain',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/vms/api/v1/agencies',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_send_duty_to_agency(client):
    """Test case for send_duty_to_agency

    
    """
    body = {
  "workerId" : "workerId",
  "duty" : {
    "requirements" : {
      "specialty" : "Speciality",
      "fallbackSpeciality" : "Fallback speciality",
      "skill" : "Skill",
      "fallbackSkill" : "Fallback skill"
    },
    "clientDeptId" : "TrustA.667899",
    "agency" : "Liberty Resourcing Admin",
    "subDiscipline" : "TrustA.1323",
    "grade" : "TrustA.77889",
    "fallbackGrade" : "TrustA.9989",
    "where" : {
      "name" : "name",
      "id" : "id"
    },
    "id" : "ABD.1210",
    "uniqueNumber" : 112233,
    "when" : {
      "date" : "2018-07-29T00:00:00.000+0000",
      "breakDuration" : 30,
      "startTime" : "12:40",
      "endTime" : "01:25"
    },
    "vacancyReason" : "TrustA.12",
    "poNumber" : 0
  }
}
    headers = { 
        'Accept': 'text/plain',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/vms/api/v1/agencies/{agency_id}'.format(agency_id='agency_id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

