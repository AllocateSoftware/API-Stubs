import connexion
import six

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.proposal_details import ProposalDetails  # noqa: E501
from api_server import util


def accept_proposal(id):  # noqa: E501
    """accept_proposal

    Accept the proposal (possibly on behalf of the trust). Note that it is not neccessary to call this API in the case of direct-book scenarios as it will be assumed as a part of the workflow. # noqa: E501

    :param id: The ID of the proposal
    :type id: str

    :rtype: None
    """
    return 'do some magic!'


def cancel_proposal(id):  # noqa: E501
    """cancel_proposal

    Cancel the proposal (and the booking, if it has been accepted) # noqa: E501

    :param id: The ID of the proposal
    :type id: str

    :rtype: None
    """
    return 'do some magic!'


def get_proposal(id):  # noqa: E501
    """get_proposal

     # noqa: E501

    :param id: The ID of the proposal
    :type id: str

    :rtype: ProposalDetails
    """
    return 'do some magic!'


def update_proposal(id, proposal_details):  # noqa: E501
    """update_proposal

     # noqa: E501

    :param id: The ID of the proposal
    :type id: str
    :param proposal_details: Details of the proposal for filling the duty (worker)
    :type proposal_details: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        proposal_details = ProposalDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
