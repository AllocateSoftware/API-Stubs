# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server import util


class XPaginationHeader(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, current_page=None, page_size=None, total_count=None, total_pages=None, previous_page_input_parameters=None, next_page_input_parameters=None):  # noqa: E501
        """XPaginationHeader - a model defined in OpenAPI

        :param current_page: The current_page of this XPaginationHeader.  # noqa: E501
        :type current_page: int
        :param page_size: The page_size of this XPaginationHeader.  # noqa: E501
        :type page_size: int
        :param total_count: The total_count of this XPaginationHeader.  # noqa: E501
        :type total_count: int
        :param total_pages: The total_pages of this XPaginationHeader.  # noqa: E501
        :type total_pages: int
        :param previous_page_input_parameters: The previous_page_input_parameters of this XPaginationHeader.  # noqa: E501
        :type previous_page_input_parameters: str
        :param next_page_input_parameters: The next_page_input_parameters of this XPaginationHeader.  # noqa: E501
        :type next_page_input_parameters: str
        """
        self.openapi_types = {
            'current_page': int,
            'page_size': int,
            'total_count': int,
            'total_pages': int,
            'previous_page_input_parameters': str,
            'next_page_input_parameters': str
        }

        self.attribute_map = {
            'current_page': 'currentPage',
            'page_size': 'pageSize',
            'total_count': 'totalCount',
            'total_pages': 'totalPages',
            'previous_page_input_parameters': 'previousPageInputParameters',
            'next_page_input_parameters': 'nextPageInputParameters'
        }

        self._current_page = current_page
        self._page_size = page_size
        self._total_count = total_count
        self._total_pages = total_pages
        self._previous_page_input_parameters = previous_page_input_parameters
        self._next_page_input_parameters = next_page_input_parameters

    @classmethod
    def from_dict(cls, dikt) -> 'XPaginationHeader':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The XPaginationHeader of this XPaginationHeader.  # noqa: E501
        :rtype: XPaginationHeader
        """
        return util.deserialize_model(dikt, cls)

    @property
    def current_page(self):
        """Gets the current_page of this XPaginationHeader.

        Current page of the response  # noqa: E501

        :return: The current_page of this XPaginationHeader.
        :rtype: int
        """
        return self._current_page

    @current_page.setter
    def current_page(self, current_page):
        """Sets the current_page of this XPaginationHeader.

        Current page of the response  # noqa: E501

        :param current_page: The current_page of this XPaginationHeader.
        :type current_page: int
        """

        self._current_page = current_page

    @property
    def page_size(self):
        """Gets the page_size of this XPaginationHeader.

        Number of rows per page  # noqa: E501

        :return: The page_size of this XPaginationHeader.
        :rtype: int
        """
        return self._page_size

    @page_size.setter
    def page_size(self, page_size):
        """Sets the page_size of this XPaginationHeader.

        Number of rows per page  # noqa: E501

        :param page_size: The page_size of this XPaginationHeader.
        :type page_size: int
        """

        self._page_size = page_size

    @property
    def total_count(self):
        """Gets the total_count of this XPaginationHeader.

        Total number of rows in the response  # noqa: E501

        :return: The total_count of this XPaginationHeader.
        :rtype: int
        """
        return self._total_count

    @total_count.setter
    def total_count(self, total_count):
        """Sets the total_count of this XPaginationHeader.

        Total number of rows in the response  # noqa: E501

        :param total_count: The total_count of this XPaginationHeader.
        :type total_count: int
        """

        self._total_count = total_count

    @property
    def total_pages(self):
        """Gets the total_pages of this XPaginationHeader.

        Total number of pages of the response  # noqa: E501

        :return: The total_pages of this XPaginationHeader.
        :rtype: int
        """
        return self._total_pages

    @total_pages.setter
    def total_pages(self, total_pages):
        """Sets the total_pages of this XPaginationHeader.

        Total number of pages of the response  # noqa: E501

        :param total_pages: The total_pages of this XPaginationHeader.
        :type total_pages: int
        """

        self._total_pages = total_pages

    @property
    def previous_page_input_parameters(self):
        """Gets the previous_page_input_parameters of this XPaginationHeader.

        Input parameter values for getting the previous page of the response  # noqa: E501

        :return: The previous_page_input_parameters of this XPaginationHeader.
        :rtype: str
        """
        return self._previous_page_input_parameters

    @previous_page_input_parameters.setter
    def previous_page_input_parameters(self, previous_page_input_parameters):
        """Sets the previous_page_input_parameters of this XPaginationHeader.

        Input parameter values for getting the previous page of the response  # noqa: E501

        :param previous_page_input_parameters: The previous_page_input_parameters of this XPaginationHeader.
        :type previous_page_input_parameters: str
        """

        self._previous_page_input_parameters = previous_page_input_parameters

    @property
    def next_page_input_parameters(self):
        """Gets the next_page_input_parameters of this XPaginationHeader.

        Input parameter values for calling the next page of the response  # noqa: E501

        :return: The next_page_input_parameters of this XPaginationHeader.
        :rtype: str
        """
        return self._next_page_input_parameters

    @next_page_input_parameters.setter
    def next_page_input_parameters(self, next_page_input_parameters):
        """Sets the next_page_input_parameters of this XPaginationHeader.

        Input parameter values for calling the next page of the response  # noqa: E501

        :param next_page_input_parameters: The next_page_input_parameters of this XPaginationHeader.
        :type next_page_input_parameters: str
        """

        self._next_page_input_parameters = next_page_input_parameters
