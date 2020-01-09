from typing import List, Dict
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.create_proposal_response import CreateProposalResponse
from api_server.models.create_vacancy_response import CreateVacancyResponse
from api_server.models.error_response import ErrorResponse
from api_server.models.inline_object import InlineObject
from api_server.models.proposal_details import ProposalDetails
from api_server.models.vacancy import Vacancy
from api_server import util


async def create_proposal(request: web.Request, vacancy_id, body) -> web.Response:
    """create_proposal

    Offer a worker for filling a duty

    :param vacancy_id: The ID of the vacancy
    :type vacancy_id: str
    :param body: Details of the proposal for filling the vacancy (worker, costs, etc)
    :type body: dict | bytes

    """
    body = ProposalDetails.from_dict(body)
    return web.Response(status=200)


async def create_vacancy(request: web.Request, body) -> web.Response:
    """create_vacancy

    Create a new vacancy

    :param body: Details of the vacancy
    :type body: dict | bytes

    """
    body = Vacancy.from_dict(body)
    return web.Response(status=200)


async def submit_timesheet(request: web.Request, vacancy_id, body) -> web.Response:
    """submit_timesheet

    Send timesheet information for a completed activity

    :param vacancy_id: The ID of the vacancy
    :type vacancy_id: str
    :param body: 
    :type body: dict | bytes

    """
    body = InlineObject.from_dict(body)
    return web.Response(status=200)
