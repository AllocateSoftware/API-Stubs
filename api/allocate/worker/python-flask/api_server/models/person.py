# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from api_server.models.base_model_ import Model
from api_server.models.attribute import Attribute
from api_server.models.availabilities import Availabilities
from api_server.models.contract import Contract
from api_server.models.employment_details import EmploymentDetails
from api_server.models.identification import Identification
from api_server.models.identifier import Identifier
from api_server.models.personal_info import PersonalInfo
from api_server.models.personal_pattern import PersonalPattern
from api_server.models.posting import Posting
from api_server.models.skill import Skill
from api_server.models.specialty import Specialty
from api_server.models.visa import Visa
from api_server.models.work_locations import WorkLocations
from api_server.models.working_restriction import WorkingRestriction
from api_server import util

from api_server.models.attribute import Attribute  # noqa: E501
from api_server.models.availabilities import Availabilities  # noqa: E501
from api_server.models.contract import Contract  # noqa: E501
from api_server.models.employment_details import EmploymentDetails  # noqa: E501
from api_server.models.identification import Identification  # noqa: E501
from api_server.models.identifier import Identifier  # noqa: E501
from api_server.models.personal_info import PersonalInfo  # noqa: E501
from api_server.models.personal_pattern import PersonalPattern  # noqa: E501
from api_server.models.posting import Posting  # noqa: E501
from api_server.models.skill import Skill  # noqa: E501
from api_server.models.specialty import Specialty  # noqa: E501
from api_server.models.visa import Visa  # noqa: E501
from api_server.models.work_locations import WorkLocations  # noqa: E501
from api_server.models.working_restriction import WorkingRestriction  # noqa: E501

class Person(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, ids=None, identification=None, personal_info=None, employment_details=None, work_locations=None, postings=None, contracts=None, skills=None, specialties=None, attributes=None, visas=None, working_restrictions=None, availabilities=None, personal_pattern=None):  # noqa: E501
        """Person - a model defined in OpenAPI

        :param ids: The ids of this Person.  # noqa: E501
        :type ids: List[Identifier]
        :param identification: The identification of this Person.  # noqa: E501
        :type identification: Identification
        :param personal_info: The personal_info of this Person.  # noqa: E501
        :type personal_info: PersonalInfo
        :param employment_details: The employment_details of this Person.  # noqa: E501
        :type employment_details: EmploymentDetails
        :param work_locations: The work_locations of this Person.  # noqa: E501
        :type work_locations: WorkLocations
        :param postings: The postings of this Person.  # noqa: E501
        :type postings: List[Posting]
        :param contracts: The contracts of this Person.  # noqa: E501
        :type contracts: List[Contract]
        :param skills: The skills of this Person.  # noqa: E501
        :type skills: List[Skill]
        :param specialties: The specialties of this Person.  # noqa: E501
        :type specialties: List[Specialty]
        :param attributes: The attributes of this Person.  # noqa: E501
        :type attributes: List[Attribute]
        :param visas: The visas of this Person.  # noqa: E501
        :type visas: List[Visa]
        :param working_restrictions: The working_restrictions of this Person.  # noqa: E501
        :type working_restrictions: List[WorkingRestriction]
        :param availabilities: The availabilities of this Person.  # noqa: E501
        :type availabilities: Availabilities
        :param personal_pattern: The personal_pattern of this Person.  # noqa: E501
        :type personal_pattern: PersonalPattern
        """
        self.openapi_types = {
            'ids': List[Identifier],
            'identification': Identification,
            'personal_info': PersonalInfo,
            'employment_details': EmploymentDetails,
            'work_locations': WorkLocations,
            'postings': List[Posting],
            'contracts': List[Contract],
            'skills': List[Skill],
            'specialties': List[Specialty],
            'attributes': List[Attribute],
            'visas': List[Visa],
            'working_restrictions': List[WorkingRestriction],
            'availabilities': Availabilities,
            'personal_pattern': PersonalPattern
        }

        self.attribute_map = {
            'ids': 'ids',
            'identification': 'identification',
            'personal_info': 'personalInfo',
            'employment_details': 'employmentDetails',
            'work_locations': 'workLocations',
            'postings': 'postings',
            'contracts': 'contracts',
            'skills': 'skills',
            'specialties': 'specialties',
            'attributes': 'attributes',
            'visas': 'visas',
            'working_restrictions': 'workingRestrictions',
            'availabilities': 'availabilities',
            'personal_pattern': 'personalPattern'
        }

        self._ids = ids
        self._identification = identification
        self._personal_info = personal_info
        self._employment_details = employment_details
        self._work_locations = work_locations
        self._postings = postings
        self._contracts = contracts
        self._skills = skills
        self._specialties = specialties
        self._attributes = attributes
        self._visas = visas
        self._working_restrictions = working_restrictions
        self._availabilities = availabilities
        self._personal_pattern = personal_pattern

    @classmethod
    def from_dict(cls, dikt) -> 'Person':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Person of this Person.  # noqa: E501
        :rtype: Person
        """
        return util.deserialize_model(dikt, cls)

    @property
    def ids(self):
        """Gets the ids of this Person.

         Array of identifiers. This should contain as much information as possible in on-boarding in order to facilitate automatic matching where possible. Possible namespaces include - ESR:<trustId>:StaffNumber - The staff number (Where ESR is the system of record, and <trustId> is the Allocate Identifier for the trust) - NI  - the UK National Insurance number - SSN - Social Security    # noqa: E501

        :return: The ids of this Person.
        :rtype: List[Identifier]
        """
        return self._ids

    @ids.setter
    def ids(self, ids):
        """Sets the ids of this Person.

         Array of identifiers. This should contain as much information as possible in on-boarding in order to facilitate automatic matching where possible. Possible namespaces include - ESR:<trustId>:StaffNumber - The staff number (Where ESR is the system of record, and <trustId> is the Allocate Identifier for the trust) - NI  - the UK National Insurance number - SSN - Social Security    # noqa: E501

        :param ids: The ids of this Person.
        :type ids: List[Identifier]
        """

        self._ids = ids

    @property
    def identification(self):
        """Gets the identification of this Person.


        :return: The identification of this Person.
        :rtype: Identification
        """
        return self._identification

    @identification.setter
    def identification(self, identification):
        """Sets the identification of this Person.


        :param identification: The identification of this Person.
        :type identification: Identification
        """

        self._identification = identification

    @property
    def personal_info(self):
        """Gets the personal_info of this Person.


        :return: The personal_info of this Person.
        :rtype: PersonalInfo
        """
        return self._personal_info

    @personal_info.setter
    def personal_info(self, personal_info):
        """Sets the personal_info of this Person.


        :param personal_info: The personal_info of this Person.
        :type personal_info: PersonalInfo
        """

        self._personal_info = personal_info

    @property
    def employment_details(self):
        """Gets the employment_details of this Person.


        :return: The employment_details of this Person.
        :rtype: EmploymentDetails
        """
        return self._employment_details

    @employment_details.setter
    def employment_details(self, employment_details):
        """Sets the employment_details of this Person.


        :param employment_details: The employment_details of this Person.
        :type employment_details: EmploymentDetails
        """

        self._employment_details = employment_details

    @property
    def work_locations(self):
        """Gets the work_locations of this Person.


        :return: The work_locations of this Person.
        :rtype: WorkLocations
        """
        return self._work_locations

    @work_locations.setter
    def work_locations(self, work_locations):
        """Sets the work_locations of this Person.


        :param work_locations: The work_locations of this Person.
        :type work_locations: WorkLocations
        """

        self._work_locations = work_locations

    @property
    def postings(self):
        """Gets the postings of this Person.


        :return: The postings of this Person.
        :rtype: List[Posting]
        """
        return self._postings

    @postings.setter
    def postings(self, postings):
        """Sets the postings of this Person.


        :param postings: The postings of this Person.
        :type postings: List[Posting]
        """

        self._postings = postings

    @property
    def contracts(self):
        """Gets the contracts of this Person.


        :return: The contracts of this Person.
        :rtype: List[Contract]
        """
        return self._contracts

    @contracts.setter
    def contracts(self, contracts):
        """Sets the contracts of this Person.


        :param contracts: The contracts of this Person.
        :type contracts: List[Contract]
        """

        self._contracts = contracts

    @property
    def skills(self):
        """Gets the skills of this Person.


        :return: The skills of this Person.
        :rtype: List[Skill]
        """
        return self._skills

    @skills.setter
    def skills(self, skills):
        """Sets the skills of this Person.


        :param skills: The skills of this Person.
        :type skills: List[Skill]
        """

        self._skills = skills

    @property
    def specialties(self):
        """Gets the specialties of this Person.


        :return: The specialties of this Person.
        :rtype: List[Specialty]
        """
        return self._specialties

    @specialties.setter
    def specialties(self, specialties):
        """Sets the specialties of this Person.


        :param specialties: The specialties of this Person.
        :type specialties: List[Specialty]
        """

        self._specialties = specialties

    @property
    def attributes(self):
        """Gets the attributes of this Person.


        :return: The attributes of this Person.
        :rtype: List[Attribute]
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes):
        """Sets the attributes of this Person.


        :param attributes: The attributes of this Person.
        :type attributes: List[Attribute]
        """

        self._attributes = attributes

    @property
    def visas(self):
        """Gets the visas of this Person.


        :return: The visas of this Person.
        :rtype: List[Visa]
        """
        return self._visas

    @visas.setter
    def visas(self, visas):
        """Sets the visas of this Person.


        :param visas: The visas of this Person.
        :type visas: List[Visa]
        """

        self._visas = visas

    @property
    def working_restrictions(self):
        """Gets the working_restrictions of this Person.


        :return: The working_restrictions of this Person.
        :rtype: List[WorkingRestriction]
        """
        return self._working_restrictions

    @working_restrictions.setter
    def working_restrictions(self, working_restrictions):
        """Sets the working_restrictions of this Person.


        :param working_restrictions: The working_restrictions of this Person.
        :type working_restrictions: List[WorkingRestriction]
        """

        self._working_restrictions = working_restrictions

    @property
    def availabilities(self):
        """Gets the availabilities of this Person.


        :return: The availabilities of this Person.
        :rtype: Availabilities
        """
        return self._availabilities

    @availabilities.setter
    def availabilities(self, availabilities):
        """Sets the availabilities of this Person.


        :param availabilities: The availabilities of this Person.
        :type availabilities: Availabilities
        """

        self._availabilities = availabilities

    @property
    def personal_pattern(self):
        """Gets the personal_pattern of this Person.


        :return: The personal_pattern of this Person.
        :rtype: PersonalPattern
        """
        return self._personal_pattern

    @personal_pattern.setter
    def personal_pattern(self, personal_pattern):
        """Sets the personal_pattern of this Person.


        :param personal_pattern: The personal_pattern of this Person.
        :type personal_pattern: PersonalPattern
        """

        self._personal_pattern = personal_pattern
