# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from api_server.models.async_response import AsyncResponse  # noqa: E501
from api_server.models.error_response import ErrorResponse  # noqa: E501
from api_server.models.person import Person  # noqa: E501
from api_server.models.worker_registration_response import WorkerRegistrationResponse  # noqa: E501
from api_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_worker(self):
        """Test case for get_worker

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/workers/{id}'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_register_worker(self):
        """Test case for register_worker

        
        """
        person = {
  "personalInfo" : {
    "additionalID" : "additionalID",
    "placeOfBirth" : "placeOfBirth",
    "nationality" : "nationality",
    "visaRequired" : "visaRequired",
    "disability" : "disability",
    "maidenName" : "maidenName",
    "ethnicOrigin" : "ethnicOrigin",
    "disabledNo" : "disabledNo",
    "maritalStatus" : "maritalStatus"
  },
  "workLocations" : {
    "homeTrust" : "homeTrust",
    "workingTrusts" : [ "", "" ]
  },
  "visas" : [ {
    "number" : "number",
    "country" : "country",
    "entries" : "entries",
    "issuingOffice" : "issuingOffice",
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    },
    "type" : "type"
  }, {
    "number" : "number",
    "country" : "country",
    "entries" : "entries",
    "issuingOffice" : "issuingOffice",
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    },
    "type" : "type"
  } ],
  "availabilities" : {
    "Availability" : [ "{}", "{}" ],
    "NoBank" : [ "{}", "{}" ]
  },
  "employmentDetails" : {
    "employeeType" : "employeeType",
    "dateJoinedNHS" : "dateJoinedNHS",
    "hireDetails" : "hireDetails",
    "agencies" : "agencies",
    "employmentStatus" : "employmentStatus",
    "prevEmployer" : "prevEmployer",
    "alAccrualPlan" : "alAccrualPlan"
  },
  "personalPattern" : {
    "duty" : [ "{}", "{}" ],
    "unavailability" : [ "{}", "{}" ]
  },
  "contracts" : [ {
    "wtdOptOut" : true,
    "salaryAmount" : 0.8008281904610115,
    "staffGroup" : "staffGroup",
    "contractType" : "contractType",
    "salaryFrequency" : "salaryFrequency",
    "grade" : "grade",
    "contract" : "contract",
    "contractedTime" : "contractedTime",
    "defaultUnavailabilityHours" : "defaultUnavailabilityHours",
    "payscale" : "payscale"
  }, {
    "wtdOptOut" : true,
    "salaryAmount" : 0.8008281904610115,
    "staffGroup" : "staffGroup",
    "contractType" : "contractType",
    "salaryFrequency" : "salaryFrequency",
    "grade" : "grade",
    "contract" : "contract",
    "contractedTime" : "contractedTime",
    "defaultUnavailabilityHours" : "defaultUnavailabilityHours",
    "payscale" : "payscale"
  } ],
  "skills" : [ {
    "skillGroup" : "skillGroup",
    "dateGained" : "dateGained",
    "cluster" : "cluster",
    "notes" : "notes",
    "obtainedFromReason" : "obtainedFromReason",
    "certificateNumber" : "certificateNumber",
    "skill" : "skill",
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    }
  }, {
    "skillGroup" : "skillGroup",
    "dateGained" : "dateGained",
    "cluster" : "cluster",
    "notes" : "notes",
    "obtainedFromReason" : "obtainedFromReason",
    "certificateNumber" : "certificateNumber",
    "skill" : "skill",
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    }
  } ],
  "specialties" : [ {
    "notes" : "notes",
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    },
    "tempStaffSpeciality" : "tempStaffSpeciality"
  }, {
    "notes" : "notes",
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    },
    "tempStaffSpeciality" : "tempStaffSpeciality"
  } ],
  "identification" : {
    "middleInitials" : "middleInitials",
    "gender" : "male",
    "surname" : "Smith",
    "knownAs" : "knownAs",
    "dateOfBirth" : "2000-01-23",
    "title" : "Mr",
    "forenames" : "['Fred','Jim']"
  },
  "workingRestrictions" : [ {
    "hoursOfWork" : {
      "thu" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "tue" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "wed" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "sat" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "fri" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "mon" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "sun" : {
        "from" : "01:00",
        "to" : "08:30"
      }
    },
    "restrictions" : {
      "maxConsecutiveDaysRequested" : "maxConsecutiveDaysRequested",
      "maxOvertimePerWeek" : "maxOvertimePerWeek",
      "minBreakBetweenShifts" : 6.027456183070403,
      "notes" : "notes",
      "wtdWeekTimeStart" : "wtdWeekTimeStart",
      "additionalHoursPerWeek" : "additionalHoursPerWeek",
      "maxConsecutiveDays" : "maxConsecutiveDays",
      "maxOvertimePerDay" : "maxOvertimePerDay",
      "wtdWeekDayStart" : "wtdWeekDayStart",
      "maxShiftsPerWeek" : "maxShiftsPerWeek",
      "wtdDayStart" : "wtdDayStart",
      "maxDurationPerShift" : "maxDurationPerShift",
      "maxOvertimePerCalendarMonth" : "maxOvertimePerCalendarMonth",
      "effectiveFrom" : "effectiveFrom",
      "maxWorkTimePerDay" : "maxWorkTimePerDay",
      "daysPerWeek" : "daysPerWeek",
      "maxDaysPerWeek" : "maxDaysPerWeek"
    },
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    },
    "title" : "title",
    "defaultLeaveHours" : {
      "fridayTime" : "fridayTime",
      "useWorkingDay" : "useWorkingDay",
      "tuesdayTime" : "tuesdayTime",
      "mondayTime" : "mondayTime",
      "sundayTime" : "sundayTime",
      "saturdayTime" : "saturdayTime",
      "wednesdayTime" : "wednesdayTime"
    }
  }, {
    "hoursOfWork" : {
      "thu" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "tue" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "wed" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "sat" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "fri" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "mon" : {
        "from" : "01:00",
        "to" : "08:30"
      },
      "sun" : {
        "from" : "01:00",
        "to" : "08:30"
      }
    },
    "restrictions" : {
      "maxConsecutiveDaysRequested" : "maxConsecutiveDaysRequested",
      "maxOvertimePerWeek" : "maxOvertimePerWeek",
      "minBreakBetweenShifts" : 6.027456183070403,
      "notes" : "notes",
      "wtdWeekTimeStart" : "wtdWeekTimeStart",
      "additionalHoursPerWeek" : "additionalHoursPerWeek",
      "maxConsecutiveDays" : "maxConsecutiveDays",
      "maxOvertimePerDay" : "maxOvertimePerDay",
      "wtdWeekDayStart" : "wtdWeekDayStart",
      "maxShiftsPerWeek" : "maxShiftsPerWeek",
      "wtdDayStart" : "wtdDayStart",
      "maxDurationPerShift" : "maxDurationPerShift",
      "maxOvertimePerCalendarMonth" : "maxOvertimePerCalendarMonth",
      "effectiveFrom" : "effectiveFrom",
      "maxWorkTimePerDay" : "maxWorkTimePerDay",
      "daysPerWeek" : "daysPerWeek",
      "maxDaysPerWeek" : "maxDaysPerWeek"
    },
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    },
    "title" : "title",
    "defaultLeaveHours" : {
      "fridayTime" : "fridayTime",
      "useWorkingDay" : "useWorkingDay",
      "tuesdayTime" : "tuesdayTime",
      "mondayTime" : "mondayTime",
      "sundayTime" : "sundayTime",
      "saturdayTime" : "saturdayTime",
      "wednesdayTime" : "wednesdayTime"
    }
  } ],
  "ids" : [ {
    "namespace" : "NI",
    "id" : "QQ123456C"
  }, {
    "namespace" : "NI",
    "id" : "QQ123456C"
  } ],
  "postings" : [ {
    "unit" : "unit",
    "post" : "post",
    "isPrimary" : true,
    "team" : "team",
    "assignmentNumber" : "assignmentNumber",
    "postingType" : "postingType"
  }, {
    "unit" : "unit",
    "post" : "post",
    "isPrimary" : true,
    "team" : "team",
    "assignmentNumber" : "assignmentNumber",
    "postingType" : "postingType"
  } ],
  "attributes" : [ {
    "name" : "name",
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    },
    "value" : "value"
  }, {
    "name" : "name",
    "validity" : {
      "from" : "2000-01-23T04:56:07.000+00:00",
      "to" : "2000-01-23T04:56:07.000+00:00"
    },
    "value" : "value"
  } ]
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/workers',
            method='POST',
            headers=headers,
            data=json.dumps(person),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
