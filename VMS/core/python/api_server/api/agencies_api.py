# coding: utf-8

"""
    VMS API

    ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
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


class AgenciesApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_costings(self, duty, **kwargs):  # noqa: E501
        """get_costings  # noqa: E501

        Returns a list of agencies and their costs for the supplied duty.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_costings(duty, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param Duty duty: Duty to be costed (required)
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: AgencyCostings
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.get_costings_with_http_info(duty, **kwargs)  # noqa: E501

    def get_costings_with_http_info(self, duty, **kwargs):  # noqa: E501
        """get_costings  # noqa: E501

        Returns a list of agencies and their costs for the supplied duty.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_costings_with_http_info(duty, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param Duty duty: Duty to be costed (required)
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(AgencyCostings, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['duty']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_costings" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'duty' is set
        if self.api_client.client_side_validation and ('duty' not in local_var_params or  # noqa: E501
                                                        local_var_params['duty'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `duty` when calling `get_costings`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'duty' in local_var_params:
            body_params = local_var_params['duty']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/agencies/costings', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='AgencyCostings',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def send_duty_to_agencies(self, duty_request, **kwargs):  # noqa: E501
        """send_duty_to_agencies  # noqa: E501

        Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_duty_to_agencies(duty_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param DutyRequest duty_request: Duty to be sent to agency (required)
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.send_duty_to_agencies_with_http_info(duty_request, **kwargs)  # noqa: E501

    def send_duty_to_agencies_with_http_info(self, duty_request, **kwargs):  # noqa: E501
        """send_duty_to_agencies  # noqa: E501

        Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_duty_to_agencies_with_http_info(duty_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param DutyRequest duty_request: Duty to be sent to agency (required)
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(str, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['duty_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method send_duty_to_agencies" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'duty_request' is set
        if self.api_client.client_side_validation and ('duty_request' not in local_var_params or  # noqa: E501
                                                        local_var_params['duty_request'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `duty_request` when calling `send_duty_to_agencies`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'duty_request' in local_var_params:
            body_params = local_var_params['duty_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['text/plain'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/agencies', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def send_duty_to_agency(self, agency_id, duty_request, **kwargs):  # noqa: E501
        """send_duty_to_agency  # noqa: E501

        Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_duty_to_agency(agency_id, duty_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str agency_id: ID of the agency to send the request to. (required)
        :param DutyRequest duty_request: Duty to be sent to agency (required)
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.send_duty_to_agency_with_http_info(agency_id, duty_request, **kwargs)  # noqa: E501

    def send_duty_to_agency_with_http_info(self, agency_id, duty_request, **kwargs):  # noqa: E501
        """send_duty_to_agency  # noqa: E501

        Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_duty_to_agency_with_http_info(agency_id, duty_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str agency_id: ID of the agency to send the request to. (required)
        :param DutyRequest duty_request: Duty to be sent to agency (required)
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(str, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['agency_id', 'duty_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method send_duty_to_agency" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'agency_id' is set
        if self.api_client.client_side_validation and ('agency_id' not in local_var_params or  # noqa: E501
                                                        local_var_params['agency_id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `agency_id` when calling `send_duty_to_agency`")  # noqa: E501
        # verify the required parameter 'duty_request' is set
        if self.api_client.client_side_validation and ('duty_request' not in local_var_params or  # noqa: E501
                                                        local_var_params['duty_request'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `duty_request` when calling `send_duty_to_agency`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'agency_id' in local_var_params:
            path_params['agencyId'] = local_var_params['agency_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'duty_request' in local_var_params:
            body_params = local_var_params['duty_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['text/plain'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['bearerAuth']  # noqa: E501

        return self.api_client.call_api(
            '/agencies/{agencyId}', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
