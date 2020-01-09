import connexion
import six

from api_server.models.reference_data_response import ReferenceDataResponse  # noqa: E501
from api_server.models.unit_reference_data_response import UnitReferenceDataResponse  # noqa: E501
from api_server import util


def get_all_agencies(version, trust_code, page=None, page_size=None):  # noqa: E501
    """Get all agencies

    Returns an array of agencies # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    :rtype: List[ReferenceDataResponse]
    """
    return 'do some magic!'


def get_all_contract_statuses(version, trust_code, page=None, page_size=None):  # noqa: E501
    """Get all contract statuses

    Returns an array of contract statuses. # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    :rtype: List[ReferenceDataResponse]
    """
    return 'do some magic!'


def get_all_grades(version, trust_code, page=None, page_size=None):  # noqa: E501
    """Get all grades

    Returns an array of grades # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    :rtype: List[ReferenceDataResponse]
    """
    return 'do some magic!'


def get_all_reasons_for_vacancy(version, trust_code, page=None, page_size=None):  # noqa: E501
    """Get all reasons for vacancy

    Returns an array of reasons for vacancy # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    :rtype: List[ReferenceDataResponse]
    """
    return 'do some magic!'


def get_all_staff_groups(version, trust_code, page=None, page_size=None):  # noqa: E501
    """Get all staff groups

    Returns an array of staff groups # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    :rtype: List[ReferenceDataResponse]
    """
    return 'do some magic!'


def get_all_units(version, trust_code, page=None, page_size=None):  # noqa: E501
    """Get all units

    Returns an array of units # noqa: E501

    :param version: API version
    :type version: str
    :param trust_code: Trust code from BankStaff
    :type trust_code: str
    :param page: Result page
    :type page: int
    :param page_size: Count of records per page
    :type page_size: int

    :rtype: List[UnitReferenceDataResponse]
    """
    return 'do some magic!'
