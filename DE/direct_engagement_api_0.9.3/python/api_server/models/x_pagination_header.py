# coding: utf-8

"""
    DE Provider Direct Engagement API

    description  # noqa: E501

    The version of the OpenAPI document: 1.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class XPaginationHeader(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'current_page': 'int',
        'page_size': 'int',
        'total_count': 'int',
        'total_pages': 'int',
        'previous_page_input_parameters': 'str',
        'next_page_input_parameters': 'str'
    }

    attribute_map = {
        'current_page': 'currentPage',
        'page_size': 'pageSize',
        'total_count': 'totalCount',
        'total_pages': 'totalPages',
        'previous_page_input_parameters': 'previousPageInputParameters',
        'next_page_input_parameters': 'nextPageInputParameters'
    }

    def __init__(self, current_page=None, page_size=None, total_count=None, total_pages=None, previous_page_input_parameters=None, next_page_input_parameters=None, local_vars_configuration=None):  # noqa: E501
        """XPaginationHeader - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._current_page = None
        self._page_size = None
        self._total_count = None
        self._total_pages = None
        self._previous_page_input_parameters = None
        self._next_page_input_parameters = None
        self.discriminator = None

        if current_page is not None:
            self.current_page = current_page
        if page_size is not None:
            self.page_size = page_size
        if total_count is not None:
            self.total_count = total_count
        if total_pages is not None:
            self.total_pages = total_pages
        if previous_page_input_parameters is not None:
            self.previous_page_input_parameters = previous_page_input_parameters
        if next_page_input_parameters is not None:
            self.next_page_input_parameters = next_page_input_parameters

    @property
    def current_page(self):
        """Gets the current_page of this XPaginationHeader.  # noqa: E501

        Current page of the response  # noqa: E501

        :return: The current_page of this XPaginationHeader.  # noqa: E501
        :rtype: int
        """
        return self._current_page

    @current_page.setter
    def current_page(self, current_page):
        """Sets the current_page of this XPaginationHeader.

        Current page of the response  # noqa: E501

        :param current_page: The current_page of this XPaginationHeader.  # noqa: E501
        :type: int
        """

        self._current_page = current_page

    @property
    def page_size(self):
        """Gets the page_size of this XPaginationHeader.  # noqa: E501

        Number of rows per page  # noqa: E501

        :return: The page_size of this XPaginationHeader.  # noqa: E501
        :rtype: int
        """
        return self._page_size

    @page_size.setter
    def page_size(self, page_size):
        """Sets the page_size of this XPaginationHeader.

        Number of rows per page  # noqa: E501

        :param page_size: The page_size of this XPaginationHeader.  # noqa: E501
        :type: int
        """

        self._page_size = page_size

    @property
    def total_count(self):
        """Gets the total_count of this XPaginationHeader.  # noqa: E501

        Total number of rows in the response  # noqa: E501

        :return: The total_count of this XPaginationHeader.  # noqa: E501
        :rtype: int
        """
        return self._total_count

    @total_count.setter
    def total_count(self, total_count):
        """Sets the total_count of this XPaginationHeader.

        Total number of rows in the response  # noqa: E501

        :param total_count: The total_count of this XPaginationHeader.  # noqa: E501
        :type: int
        """

        self._total_count = total_count

    @property
    def total_pages(self):
        """Gets the total_pages of this XPaginationHeader.  # noqa: E501

        Total number of pages of the response  # noqa: E501

        :return: The total_pages of this XPaginationHeader.  # noqa: E501
        :rtype: int
        """
        return self._total_pages

    @total_pages.setter
    def total_pages(self, total_pages):
        """Sets the total_pages of this XPaginationHeader.

        Total number of pages of the response  # noqa: E501

        :param total_pages: The total_pages of this XPaginationHeader.  # noqa: E501
        :type: int
        """

        self._total_pages = total_pages

    @property
    def previous_page_input_parameters(self):
        """Gets the previous_page_input_parameters of this XPaginationHeader.  # noqa: E501

        Input parameter values for getting the previous page of the response  # noqa: E501

        :return: The previous_page_input_parameters of this XPaginationHeader.  # noqa: E501
        :rtype: str
        """
        return self._previous_page_input_parameters

    @previous_page_input_parameters.setter
    def previous_page_input_parameters(self, previous_page_input_parameters):
        """Sets the previous_page_input_parameters of this XPaginationHeader.

        Input parameter values for getting the previous page of the response  # noqa: E501

        :param previous_page_input_parameters: The previous_page_input_parameters of this XPaginationHeader.  # noqa: E501
        :type: str
        """

        self._previous_page_input_parameters = previous_page_input_parameters

    @property
    def next_page_input_parameters(self):
        """Gets the next_page_input_parameters of this XPaginationHeader.  # noqa: E501

        Input parameter values for calling the next page of the response  # noqa: E501

        :return: The next_page_input_parameters of this XPaginationHeader.  # noqa: E501
        :rtype: str
        """
        return self._next_page_input_parameters

    @next_page_input_parameters.setter
    def next_page_input_parameters(self, next_page_input_parameters):
        """Sets the next_page_input_parameters of this XPaginationHeader.

        Input parameter values for calling the next page of the response  # noqa: E501

        :param next_page_input_parameters: The next_page_input_parameters of this XPaginationHeader.  # noqa: E501
        :type: str
        """

        self._next_page_input_parameters = next_page_input_parameters

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, XPaginationHeader):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, XPaginationHeader):
            return True

        return self.to_dict() != other.to_dict()