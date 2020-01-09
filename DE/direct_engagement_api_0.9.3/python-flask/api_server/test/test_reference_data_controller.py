# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.reference_data_response import ReferenceDataResponse  # noqa: E501
from api_server.models.unit_reference_data_response import UnitReferenceDataResponse  # noqa: E501
from api_server.test import BaseTestCase


class TestReferenceDataController(BaseTestCase):
    """ReferenceDataController integration test stubs"""

    def test_get_all_agencies(self):
        """Test case for get_all_agencies

        Get all agencies
        """
        query_string = [('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/referenceData/agency'.format(version='version_example', trust_code='trust_code_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_contract_statuses(self):
        """Test case for get_all_contract_statuses

        Get all contract statuses
        """
        query_string = [('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/referenceData/contractStatus'.format(version='version_example', trust_code='trust_code_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_grades(self):
        """Test case for get_all_grades

        Get all grades
        """
        query_string = [('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/referenceData/grade'.format(version='version_example', trust_code='trust_code_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_reasons_for_vacancy(self):
        """Test case for get_all_reasons_for_vacancy

        Get all reasons for vacancy
        """
        query_string = [('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/referenceData/reasonForVacancy'.format(version='version_example', trust_code='trust_code_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_staff_groups(self):
        """Test case for get_all_staff_groups

        Get all staff groups
        """
        query_string = [('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/referenceData/staffGroup'.format(version='version_example', trust_code='trust_code_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_units(self):
        """Test case for get_all_units

        Get all units
        """
        query_string = [('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/{version}/trustcode/{trust_code}/referenceData/unit'.format(version='version_example', trust_code='trust_code_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
