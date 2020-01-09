# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.error_response import ErrorResponse
from api_server.models.person import Person
from api_server.models.worker_registration_response import WorkerRegistrationResponse


async def test_get_worker(client):
    """Test case for get_worker

    
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v1/workers/{id}'.format(id=2CBC7FF9-38FB-4F0A-835A-324D9CF4800C),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_register_worker(client):
    """Test case for register_worker

    
    """
    body = {
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
    response = await client.request(
        method='POST',
        path='/api/v1/workers',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

