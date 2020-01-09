# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.booking_info import BookingInfo  # noqa: E501
from api_server.models.booking_response import BookingResponse  # noqa: E501
from api_server.models.contract_status import ContractStatus  # noqa: E501
from api_server.models.duty import Duty  # noqa: E501
from api_server.models.inline_object import InlineObject  # noqa: E501
from api_server.test import BaseTestCase


class TestDutyController(BaseTestCase):
    """DutyController integration test stubs"""

    def test_cancel_duty(self):
        """Test case for cancel_duty

        Cancel a duty
        """
        headers = { 
            'Accept': 'text/plain',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/duty/{duty_id}/cancel'.format(version='version_example', trust_code='trust_code_example', duty_id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fill_duty(self):
        """Test case for fill_duty

        Creates booking for duty
        """
        booking_info = {
  "agency" : 1135,
  "person" : {
    "allocatePersonId" : "TrustA.1123",
    "firstName" : "Doe",
    "telephoneNumber" : "+223504938839",
    "surname" : "John",
    "extSystemId" : "123e4567-e89b-12d3-a456-426655440000",
    "personGender" : "male",
    "dateOfBirth" : "2000-01-23",
    "matchId" : "E124RT562.john.doe@mail.com",
    "email" : "john.doe@mail.com"
  },
  "grade" : "TrustA.234",
  "rates" : [ {
    "reference" : "basic_commission",
    "rate" : 50.00
  }, {
    "reference" : "basic_commission",
    "rate" : 50.00
  } ],
  "contractId" : "123e4567-e89b-12d3-a456-426655440000"
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/duty/{duty_id}/booking'.format(version='version_example', trust_code='trust_code_example', duty_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(booking_info),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_duty_details(self):
        """Test case for get_duty_details

        Returns details about a duties.
        """
        query_string = [('id', 56),
                        ('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/duty'.format(version='version_example', trust_code='trust_code_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_single_duty_details(self):
        """Test case for get_single_duty_details

        Returns details about a duties.
        """
        query_string = [('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/duty/{duty_id}'.format(version='version_example', trust_code='trust_code_example', duty_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_contract_status(self):
        """Test case for update_contract_status

        Updates DE Contract status
        """
        headers = { 
            'Accept': 'text/plain',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/duty/{duty_id}/contract/{contract_id}/status/{status_id}'.format(version='version_example', trust_code='trust_code_example', duty_id=56, contract_id=77135e23-af51-4714-b854-d8df9e64aa63, status_id={}),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_timesheets(self):
        """Test case for update_timesheets

        Updates timesheet for duty
        """
        inline_object = {}
        headers = { 
            'Accept': 'text/plain',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/duty/{duty_id}/timesheet'.format(version='version_example', trust_code='trust_code_example', duty_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(inline_object),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
