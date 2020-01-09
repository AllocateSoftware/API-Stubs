# coding: utf-8

"""
    Worker API and Events

         ## API and events for providing workers.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: support@allocatesoftware.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from api_server.configuration import Configuration


class WorkingRestrictionHoursOfWork(object):
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
        'mon': 'TimeSpan',
        'tue': 'TimeSpan',
        'wed': 'TimeSpan',
        'thu': 'TimeSpan',
        'fri': 'TimeSpan',
        'sat': 'TimeSpan',
        'sun': 'TimeSpan'
    }

    attribute_map = {
        'mon': 'mon',
        'tue': 'tue',
        'wed': 'wed',
        'thu': 'thu',
        'fri': 'fri',
        'sat': 'sat',
        'sun': 'sun'
    }

    def __init__(self, mon=None, tue=None, wed=None, thu=None, fri=None, sat=None, sun=None, local_vars_configuration=None):  # noqa: E501
        """WorkingRestrictionHoursOfWork - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._mon = None
        self._tue = None
        self._wed = None
        self._thu = None
        self._fri = None
        self._sat = None
        self._sun = None
        self.discriminator = None

        if mon is not None:
            self.mon = mon
        if tue is not None:
            self.tue = tue
        if wed is not None:
            self.wed = wed
        if thu is not None:
            self.thu = thu
        if fri is not None:
            self.fri = fri
        if sat is not None:
            self.sat = sat
        if sun is not None:
            self.sun = sun

    @property
    def mon(self):
        """Gets the mon of this WorkingRestrictionHoursOfWork.  # noqa: E501


        :return: The mon of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :rtype: TimeSpan
        """
        return self._mon

    @mon.setter
    def mon(self, mon):
        """Sets the mon of this WorkingRestrictionHoursOfWork.


        :param mon: The mon of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :type: TimeSpan
        """

        self._mon = mon

    @property
    def tue(self):
        """Gets the tue of this WorkingRestrictionHoursOfWork.  # noqa: E501


        :return: The tue of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :rtype: TimeSpan
        """
        return self._tue

    @tue.setter
    def tue(self, tue):
        """Sets the tue of this WorkingRestrictionHoursOfWork.


        :param tue: The tue of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :type: TimeSpan
        """

        self._tue = tue

    @property
    def wed(self):
        """Gets the wed of this WorkingRestrictionHoursOfWork.  # noqa: E501


        :return: The wed of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :rtype: TimeSpan
        """
        return self._wed

    @wed.setter
    def wed(self, wed):
        """Sets the wed of this WorkingRestrictionHoursOfWork.


        :param wed: The wed of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :type: TimeSpan
        """

        self._wed = wed

    @property
    def thu(self):
        """Gets the thu of this WorkingRestrictionHoursOfWork.  # noqa: E501


        :return: The thu of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :rtype: TimeSpan
        """
        return self._thu

    @thu.setter
    def thu(self, thu):
        """Sets the thu of this WorkingRestrictionHoursOfWork.


        :param thu: The thu of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :type: TimeSpan
        """

        self._thu = thu

    @property
    def fri(self):
        """Gets the fri of this WorkingRestrictionHoursOfWork.  # noqa: E501


        :return: The fri of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :rtype: TimeSpan
        """
        return self._fri

    @fri.setter
    def fri(self, fri):
        """Sets the fri of this WorkingRestrictionHoursOfWork.


        :param fri: The fri of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :type: TimeSpan
        """

        self._fri = fri

    @property
    def sat(self):
        """Gets the sat of this WorkingRestrictionHoursOfWork.  # noqa: E501


        :return: The sat of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :rtype: TimeSpan
        """
        return self._sat

    @sat.setter
    def sat(self, sat):
        """Sets the sat of this WorkingRestrictionHoursOfWork.


        :param sat: The sat of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :type: TimeSpan
        """

        self._sat = sat

    @property
    def sun(self):
        """Gets the sun of this WorkingRestrictionHoursOfWork.  # noqa: E501


        :return: The sun of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :rtype: TimeSpan
        """
        return self._sun

    @sun.setter
    def sun(self, sun):
        """Sets the sun of this WorkingRestrictionHoursOfWork.


        :param sun: The sun of this WorkingRestrictionHoursOfWork.  # noqa: E501
        :type: TimeSpan
        """

        self._sun = sun

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
        if not isinstance(other, WorkingRestrictionHoursOfWork):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, WorkingRestrictionHoursOfWork):
            return True

        return self.to_dict() != other.to_dict()
