# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.agency_costings import AgencyCostings  # noqa: E501
from api_server.models.duty import Duty  # noqa: E501
from api_server.models.duty_request import DutyRequest  # noqa: E501
from api_server.test import BaseTestCase


class TestAgenciesController(BaseTestCase):
    """AgenciesController integration test stubs"""

    def test_get_costings(self):
        """Test case for get_costings

        
        """
        duty = {
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
        response = self.client.open(
            '/vms/api/v1/agencies/costings',
            method='POST',
            headers=headers,
            data=json.dumps(duty),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_duty_to_agencies(self):
        """Test case for send_duty_to_agencies

        
        """
        duty_request = {
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
        response = self.client.open(
            '/vms/api/v1/agencies',
            method='POST',
            headers=headers,
            data=json.dumps(duty_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_send_duty_to_agency(self):
        """Test case for send_duty_to_agency

        
        """
        duty_request = {
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
        response = self.client.open(
            '/vms/api/v1/agencies/{agency_id}'.format(agency_id='agency_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(duty_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
