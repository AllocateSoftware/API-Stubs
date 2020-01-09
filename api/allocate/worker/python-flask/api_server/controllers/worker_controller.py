import connexion
import six

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.error_response import ErrorResponse  # noqa: E501
from api_server.models.inline_object import InlineObject  # noqa: E501
from api_server import util


def onboard_worker_to_trust(id, inline_object):  # noqa: E501
    """onboard_worker_to_trust

    On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to &#39;on-board&#39; that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.   # noqa: E501

    :param id: The Allocate Worker ID
    :type id: str
    :param inline_object: 
    :type inline_object: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        inline_object = InlineObject.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
