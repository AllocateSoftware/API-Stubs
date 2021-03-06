# coding: utf-8

"""
    DE Provider Direct Engagement API

    description  # noqa: E501

    The version of the OpenAPI document: 1.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from api_server.api_client import ApiClient
from api_server.exceptions import (
    ApiTypeError,
    ApiValueError
)


class EventApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_events(self, version, trust_code, date_time_from, **kwargs):  # noqa: E501
        """Get all events older than input timestamp  # noqa: E501

        Returns an array of events  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_events(version, trust_code, date_time_from, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str version: API version (required)
        :param str trust_code: Trust code from BankStaff (required)
        :param datetime date_time_from: Timestamp (required)
        :param int page: Result page
        :param int page_size: Count of records per page
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: Duty
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.get_events_with_http_info(version, trust_code, date_time_from, **kwargs)  # noqa: E501

    def get_events_with_http_info(self, version, trust_code, date_time_from, **kwargs):  # noqa: E501
        """Get all events older than input timestamp  # noqa: E501

        Returns an array of events  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_events_with_http_info(version, trust_code, date_time_from, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str version: API version (required)
        :param str trust_code: Trust code from BankStaff (required)
        :param datetime date_time_from: Timestamp (required)
        :param int page: Result page
        :param int page_size: Count of records per page
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(Duty, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['version', 'trust_code', 'date_time_from', 'page', 'page_size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_events" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'version' is set
        if self.api_client.client_side_validation and ('version' not in local_var_params or  # noqa: E501
                                                        local_var_params['version'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `version` when calling `get_events`")  # noqa: E501
        # verify the required parameter 'trust_code' is set
        if self.api_client.client_side_validation and ('trust_code' not in local_var_params or  # noqa: E501
                                                        local_var_params['trust_code'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `trust_code` when calling `get_events`")  # noqa: E501
        # verify the required parameter 'date_time_from' is set
        if self.api_client.client_side_validation and ('date_time_from' not in local_var_params or  # noqa: E501
                                                        local_var_params['date_time_from'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `date_time_from` when calling `get_events`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'version' in local_var_params:
            path_params['version'] = local_var_params['version']  # noqa: E501
        if 'trust_code' in local_var_params:
            path_params['trustCode'] = local_var_params['trust_code']  # noqa: E501

        query_params = []
        if 'date_time_from' in local_var_params and local_var_params['date_time_from'] is not None:  # noqa: E501
            query_params.append(('dateTimeFrom', local_var_params['date_time_from']))  # noqa: E501
        if 'page' in local_var_params and local_var_params['page'] is not None:  # noqa: E501
            query_params.append(('page', local_var_params['page']))  # noqa: E501
        if 'page_size' in local_var_params and local_var_params['page_size'] is not None:  # noqa: E501
            query_params.append(('pageSize', local_var_params['page_size']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json', 'text/plain'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/{version}/trustcode/{trustCode}/event', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Duty',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
