from typing import List, Dict
from aiohttp import web

from api_server.models.duty import Duty
from api_server import util


async def get_events(request: web.Request, version, trust_code, date_time_from, page=None, page_size=None) -> web.Response:
    """Get all events older than input timestamp

    Returns an array of events

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param date_time_from: Timestamp
    :type date_time_from: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    """
    date_time_from = util.deserialize_datetime(date_time_from)
    return web.Response(status=200)
