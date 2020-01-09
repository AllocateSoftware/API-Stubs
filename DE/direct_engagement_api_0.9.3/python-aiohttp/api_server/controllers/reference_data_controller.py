from typing import List, Dict
from aiohttp import web

from api_server.models.reference_data_response import ReferenceDataResponse
from api_server.models.unit_reference_data_response import UnitReferenceDataResponse
from api_server import util


async def get_all_agencies(request: web.Request, version, trust_code, page=None, page_size=None) -> web.Response:
    """Get all agencies

    Returns an array of agencies

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    """
    return web.Response(status=200)


async def get_all_contract_statuses(request: web.Request, version, trust_code, page=None, page_size=None) -> web.Response:
    """Get all contract statuses

    Returns an array of contract statuses.

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    """
    return web.Response(status=200)


async def get_all_grades(request: web.Request, version, trust_code, page=None, page_size=None) -> web.Response:
    """Get all grades

    Returns an array of grades

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    """
    return web.Response(status=200)


async def get_all_reasons_for_vacancy(request: web.Request, version, trust_code, page=None, page_size=None) -> web.Response:
    """Get all reasons for vacancy

    Returns an array of reasons for vacancy

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    """
    return web.Response(status=200)


async def get_all_staff_groups(request: web.Request, version, trust_code, page=None, page_size=None) -> web.Response:
    """Get all staff groups

    Returns an array of staff groups

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    """
    return web.Response(status=200)


async def get_all_units(request: web.Request, version, trust_code, page=None, page_size=None) -> web.Response:
    """Get all units

    Returns an array of units

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    """
    return web.Response(status=200)
