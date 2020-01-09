import connexion
import six

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.create_proposal_response import CreateProposalResponse  # noqa: E501
from api_server.models.create_vacancy_response import CreateVacancyResponse  # noqa: E501
from api_server.models.error_response import ErrorResponse  # noqa: E501
from api_server.models.inline_object import InlineObject  # noqa: E501
from api_server.models.proposal_details import ProposalDetails  # noqa: E501
from api_server.models.vacancy import Vacancy  # noqa: E501
from api_server import util


def create_proposal(vacancy_id, proposal_details):  # noqa: E501
    """create_proposal

    Offer a worker for filling a duty # noqa: E501

    :param vacancy_id: The ID of the vacancy
    :type vacancy_id: str
    :param proposal_details: Details of the proposal for filling the vacancy (worker, costs, etc)
    :type proposal_details: dict | bytes

    :rtype: CreateProposalResponse
    """
    if connexion.request.is_json:
        proposal_details = ProposalDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_vacancy(vacancy):  # noqa: E501
    """create_vacancy

    Create a new vacancy # noqa: E501

    :param vacancy: Details of the vacancy
    :type vacancy: dict | bytes

    :rtype: CreateVacancyResponse
    """
    if connexion.request.is_json:
        vacancy = Vacancy.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def submit_timesheet(vacancy_id, inline_object):  # noqa: E501
    """submit_timesheet

    Send timesheet information for a completed activity # noqa: E501

    :param vacancy_id: The ID of the vacancy
    :type vacancy_id: str
    :param inline_object: 
    :type inline_object: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        inline_object = InlineObject.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
