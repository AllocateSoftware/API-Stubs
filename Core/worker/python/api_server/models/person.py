# coding: utf-8

"""
    Workers

    ## Workers and events   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class Person(object):
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
        'identification': 'Identification',
        'personal_info': 'PersonalInfo',
        'employment_details': 'EmploymentDetails',
        'work_locations': 'WorkLocations',
        'postings': 'list[Posting]',
        'contracts': 'list[Contract]',
        'skills': 'list[Skill]',
        'specialties': 'list[Specialty]',
        'attributes': 'list[Attribute]',
        'visas': 'list[Visa]',
        'working_restrictions': 'list[WorkingRestriction]',
        'availabilities': 'Availabilities',
        'personal_pattern': 'PersonalPattern'
    }

    attribute_map = {
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

    def __init__(self, identification=None, personal_info=None, employment_details=None, work_locations=None, postings=None, contracts=None, skills=None, specialties=None, attributes=None, visas=None, working_restrictions=None, availabilities=None, personal_pattern=None, local_vars_configuration=None):  # noqa: E501
        """Person - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._identification = None
        self._personal_info = None
        self._employment_details = None
        self._work_locations = None
        self._postings = None
        self._contracts = None
        self._skills = None
        self._specialties = None
        self._attributes = None
        self._visas = None
        self._working_restrictions = None
        self._availabilities = None
        self._personal_pattern = None
        self.discriminator = None

        if identification is not None:
            self.identification = identification
        if personal_info is not None:
            self.personal_info = personal_info
        if employment_details is not None:
            self.employment_details = employment_details
        if work_locations is not None:
            self.work_locations = work_locations
        if postings is not None:
            self.postings = postings
        if contracts is not None:
            self.contracts = contracts
        if skills is not None:
            self.skills = skills
        if specialties is not None:
            self.specialties = specialties
        if attributes is not None:
            self.attributes = attributes
        if visas is not None:
            self.visas = visas
        if working_restrictions is not None:
            self.working_restrictions = working_restrictions
        if availabilities is not None:
            self.availabilities = availabilities
        if personal_pattern is not None:
            self.personal_pattern = personal_pattern

    @property
    def identification(self):
        """Gets the identification of this Person.  # noqa: E501


        :return: The identification of this Person.  # noqa: E501
        :rtype: Identification
        """
        return self._identification

    @identification.setter
    def identification(self, identification):
        """Sets the identification of this Person.


        :param identification: The identification of this Person.  # noqa: E501
        :type: Identification
        """

        self._identification = identification

    @property
    def personal_info(self):
        """Gets the personal_info of this Person.  # noqa: E501


        :return: The personal_info of this Person.  # noqa: E501
        :rtype: PersonalInfo
        """
        return self._personal_info

    @personal_info.setter
    def personal_info(self, personal_info):
        """Sets the personal_info of this Person.


        :param personal_info: The personal_info of this Person.  # noqa: E501
        :type: PersonalInfo
        """

        self._personal_info = personal_info

    @property
    def employment_details(self):
        """Gets the employment_details of this Person.  # noqa: E501


        :return: The employment_details of this Person.  # noqa: E501
        :rtype: EmploymentDetails
        """
        return self._employment_details

    @employment_details.setter
    def employment_details(self, employment_details):
        """Sets the employment_details of this Person.


        :param employment_details: The employment_details of this Person.  # noqa: E501
        :type: EmploymentDetails
        """

        self._employment_details = employment_details

    @property
    def work_locations(self):
        """Gets the work_locations of this Person.  # noqa: E501


        :return: The work_locations of this Person.  # noqa: E501
        :rtype: WorkLocations
        """
        return self._work_locations

    @work_locations.setter
    def work_locations(self, work_locations):
        """Sets the work_locations of this Person.


        :param work_locations: The work_locations of this Person.  # noqa: E501
        :type: WorkLocations
        """

        self._work_locations = work_locations

    @property
    def postings(self):
        """Gets the postings of this Person.  # noqa: E501


        :return: The postings of this Person.  # noqa: E501
        :rtype: list[Posting]
        """
        return self._postings

    @postings.setter
    def postings(self, postings):
        """Sets the postings of this Person.


        :param postings: The postings of this Person.  # noqa: E501
        :type: list[Posting]
        """

        self._postings = postings

    @property
    def contracts(self):
        """Gets the contracts of this Person.  # noqa: E501


        :return: The contracts of this Person.  # noqa: E501
        :rtype: list[Contract]
        """
        return self._contracts

    @contracts.setter
    def contracts(self, contracts):
        """Sets the contracts of this Person.


        :param contracts: The contracts of this Person.  # noqa: E501
        :type: list[Contract]
        """

        self._contracts = contracts

    @property
    def skills(self):
        """Gets the skills of this Person.  # noqa: E501


        :return: The skills of this Person.  # noqa: E501
        :rtype: list[Skill]
        """
        return self._skills

    @skills.setter
    def skills(self, skills):
        """Sets the skills of this Person.


        :param skills: The skills of this Person.  # noqa: E501
        :type: list[Skill]
        """

        self._skills = skills

    @property
    def specialties(self):
        """Gets the specialties of this Person.  # noqa: E501


        :return: The specialties of this Person.  # noqa: E501
        :rtype: list[Specialty]
        """
        return self._specialties

    @specialties.setter
    def specialties(self, specialties):
        """Sets the specialties of this Person.


        :param specialties: The specialties of this Person.  # noqa: E501
        :type: list[Specialty]
        """

        self._specialties = specialties

    @property
    def attributes(self):
        """Gets the attributes of this Person.  # noqa: E501


        :return: The attributes of this Person.  # noqa: E501
        :rtype: list[Attribute]
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes):
        """Sets the attributes of this Person.


        :param attributes: The attributes of this Person.  # noqa: E501
        :type: list[Attribute]
        """

        self._attributes = attributes

    @property
    def visas(self):
        """Gets the visas of this Person.  # noqa: E501


        :return: The visas of this Person.  # noqa: E501
        :rtype: list[Visa]
        """
        return self._visas

    @visas.setter
    def visas(self, visas):
        """Sets the visas of this Person.


        :param visas: The visas of this Person.  # noqa: E501
        :type: list[Visa]
        """

        self._visas = visas

    @property
    def working_restrictions(self):
        """Gets the working_restrictions of this Person.  # noqa: E501


        :return: The working_restrictions of this Person.  # noqa: E501
        :rtype: list[WorkingRestriction]
        """
        return self._working_restrictions

    @working_restrictions.setter
    def working_restrictions(self, working_restrictions):
        """Sets the working_restrictions of this Person.


        :param working_restrictions: The working_restrictions of this Person.  # noqa: E501
        :type: list[WorkingRestriction]
        """

        self._working_restrictions = working_restrictions

    @property
    def availabilities(self):
        """Gets the availabilities of this Person.  # noqa: E501


        :return: The availabilities of this Person.  # noqa: E501
        :rtype: Availabilities
        """
        return self._availabilities

    @availabilities.setter
    def availabilities(self, availabilities):
        """Sets the availabilities of this Person.


        :param availabilities: The availabilities of this Person.  # noqa: E501
        :type: Availabilities
        """

        self._availabilities = availabilities

    @property
    def personal_pattern(self):
        """Gets the personal_pattern of this Person.  # noqa: E501


        :return: The personal_pattern of this Person.  # noqa: E501
        :rtype: PersonalPattern
        """
        return self._personal_pattern

    @personal_pattern.setter
    def personal_pattern(self, personal_pattern):
        """Sets the personal_pattern of this Person.


        :param personal_pattern: The personal_pattern of this Person.  # noqa: E501
        :type: PersonalPattern
        """

        self._personal_pattern = personal_pattern

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
        if not isinstance(other, Person):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Person):
            return True

        return self.to_dict() != other.to_dict()
