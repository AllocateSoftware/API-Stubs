# coding: utf-8

"""
    Worker API and Events

         ## API and events for providing workers.   # noqa: E501

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


class WorkerApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def onboard_worker_to_trust(self, id, inline_object, **kwargs):  # noqa: E501
        """onboard_worker_to_trust  # noqa: E501

        On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to 'on-board' that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.    # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.onboard_worker_to_trust(id, inline_object, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str id: The Allocate Worker ID (required)
        :param InlineObject inline_object: (required)
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.onboard_worker_to_trust_with_http_info(id, inline_object, **kwargs)  # noqa: E501

    def onboard_worker_to_trust_with_http_info(self, id, inline_object, **kwargs):  # noqa: E501
        """onboard_worker_to_trust  # noqa: E501

        On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to 'on-board' that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.    # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.onboard_worker_to_trust_with_http_info(id, inline_object, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str id: The Allocate Worker ID (required)
        :param InlineObject inline_object: (required)
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['id', 'inline_object']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method onboard_worker_to_trust" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'id' is set
        if self.api_client.client_side_validation and ('id' not in local_var_params or  # noqa: E501
                                                        local_var_params['id'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `id` when calling `onboard_worker_to_trust`")  # noqa: E501
        # verify the required parameter 'inline_object' is set
        if self.api_client.client_side_validation and ('inline_object' not in local_var_params or  # noqa: E501
                                                        local_var_params['inline_object'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `inline_object` when calling `onboard_worker_to_trust`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in local_var_params:
            path_params['id'] = local_var_params['id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'inline_object' in local_var_params:
            body_params = local_var_params['inline_object']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['jwt']  # noqa: E501

        return self.api_client.call_api(
            '/workers/{id}/onboardToTrust', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
