# coding: utf-8

import pytest
import json
from aiohttp import web

from api_server.models.async_response import AsyncResponse
from api_server.models.error_response import ErrorResponse
from api_server.models.leave_claim import LeaveClaim
from api_server.models.person import Person
from api_server.models.worker_registration_response import WorkerRegistrationResponse


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
    "workingTrusts" : [ "workingTrusts", "workingTrusts" ]
  },
  "visas" : [ {
    "number" : "number",
    "country" : "country",
    "entries" : "entries",
    "issuingOffice" : "issuingOffice",
    "validity" : {
      "from" : "2000-01-23",
      "to" : "2000-01-23"
    },
    "type" : "type"
  }, {
    "number" : "number",
    "country" : "country",
    "entries" : "entries",
    "issuingOffice" : "issuingOffice",
    "validity" : {
      "from" : "2000-01-23",
      "to" : "2000-01-23"
    },
    "type" : "type"
  } ],
  "availabilities" : {
    "Availability" : [ {
      "date" : "2000-01-23",
      "availabilityType" : "availabilityType",
      "notes" : "notes",
      "numberOfOccurrences" : 1.4658129805029452,
      "start" : "start",
      "end" : "end"
    }, {
      "date" : "2000-01-23",
      "availabilityType" : "availabilityType",
      "notes" : "notes",
      "numberOfOccurrences" : 1.4658129805029452,
      "start" : "start",
      "end" : "end"
    } ],
    "NoBank" : [ {
      "notes" : "notes",
      "start" : "start",
      "numberOfOccurances" : 5.962133916683182
    }, {
      "notes" : "notes",
      "start" : "start",
      "numberOfOccurances" : 5.962133916683182
    } ]
  },
  "employmentDetails" : {
    "employeeType" : "employeeType",
    "dateJoinedNHS" : "2000-01-23",
    "hireDetails" : "hireDetails",
    "agencies" : "agencies",
    "employmentStatus" : "employmentStatus",
    "prevEmployer" : "prevEmployer",
    "alAccrualPlan" : "alAccrualPlan"
  },
  "personalPattern" : {
    "duty" : [ {
      "activityCategory" : "activityCategory",
      "monthlyReccurrance" : true,
      "activityBenchmark" : "activityBenchmark",
      "work" : "work",
      "shift" : "shift",
      "start" : "start",
      "end" : "end",
      "team" : "team",
      "activityType" : "activityType",
      "rosterLocation" : "rosterLocation",
      "shiftGroup" : "shiftGroup",
      "activityProfile" : "activityProfile"
    }, {
      "activityCategory" : "activityCategory",
      "monthlyReccurrance" : true,
      "activityBenchmark" : "activityBenchmark",
      "work" : "work",
      "shift" : "shift",
      "start" : "start",
      "end" : "end",
      "team" : "team",
      "activityType" : "activityType",
      "rosterLocation" : "rosterLocation",
      "shiftGroup" : "shiftGroup",
      "activityProfile" : "activityProfile"
    } ],
    "unavailability" : [ {
      "unavailabilityGroup" : "unavailabilityGroup",
      "unavailabilityReason" : "unavailabilityReason",
      "work" : "work",
      "start" : "start",
      "externalUnavailabilityIdentifier" : "externalUnavailabilityIdentifier",
      "end" : "end"
    }, {
      "unavailabilityGroup" : "unavailabilityGroup",
      "unavailabilityReason" : "unavailabilityReason",
      "work" : "work",
      "start" : "start",
      "externalUnavailabilityIdentifier" : "externalUnavailabilityIdentifier",
      "end" : "end"
    } ]
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
    "dateGained" : "2000-01-23",
    "cluster" : "cluster",
    "notes" : "notes",
    "obtainedFromReason" : "obtainedFromReason",
    "certificateNumber" : "certificateNumber",
    "skill" : "skill",
    "validity" : {
      "from" : "2000-01-23",
      "to" : "2000-01-23"
    }
  }, {
    "skillGroup" : "skillGroup",
    "dateGained" : "2000-01-23",
    "cluster" : "cluster",
    "notes" : "notes",
    "obtainedFromReason" : "obtainedFromReason",
    "certificateNumber" : "certificateNumber",
    "skill" : "skill",
    "validity" : {
      "from" : "2000-01-23",
      "to" : "2000-01-23"
    }
  } ],
  "specialties" : [ {
    "notes" : "notes",
    "validity" : {
      "from" : "2000-01-23",
      "to" : "2000-01-23"
    },
    "tempStaffSpeciality" : "tempStaffSpeciality"
  }, {
    "notes" : "notes",
    "validity" : {
      "from" : "2000-01-23",
      "to" : "2000-01-23"
    },
    "tempStaffSpeciality" : "tempStaffSpeciality"
  } ],
  "identification" : {
    "middleInitials" : "middleInitials",
    "gender" : "male",
    "surname" : "surname",
    "knownAs" : "knownAs",
    "dateOfBirth" : "2000-01-23",
    "staffNumber" : "staffNumber",
    "title" : "title",
    "forenames" : "forenames",
    "ssn" : "ssn"
  },
  "workingRestrictions" : [ {
    "hoursOfWork" : {
      "thu" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "tue" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "wed" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "sat" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "fri" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "mon" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "sun" : {
        "from" : "07:00",
        "to" : "17:30"
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
      "from" : "2000-01-23",
      "to" : "2000-01-23"
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
        "from" : "07:00",
        "to" : "17:30"
      },
      "tue" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "wed" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "sat" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "fri" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "mon" : {
        "from" : "07:00",
        "to" : "17:30"
      },
      "sun" : {
        "from" : "07:00",
        "to" : "17:30"
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
      "from" : "2000-01-23",
      "to" : "2000-01-23"
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
  "postings" : [ {
    "unit" : "unit",
    "post" : "post",
    "isPrimary" : true,
    "assignmentNo" : "assignmentNo",
    "team" : "team",
    "postingType" : "postingType"
  }, {
    "unit" : "unit",
    "post" : "post",
    "isPrimary" : true,
    "assignmentNo" : "assignmentNo",
    "team" : "team",
    "postingType" : "postingType"
  } ],
  "attributes" : [ {
    "name" : "name",
    "validity" : {
      "from" : "2000-01-23",
      "to" : "2000-01-23"
    },
    "value" : "value"
  }, {
    "name" : "name",
    "validity" : {
      "from" : "2000-01-23",
      "to" : "2000-01-23"
    },
    "value" : "value"
  } ]
}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/worker/v1/workers',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_submit_annual_leave_claim(client):
    """Test case for submit_annual_leave_claim

    
    """
    body = {
  "reason" : "annualLeave",
  "when" : {
    "from" : "2000-01-23",
    "to" : "2000-01-23"
  }
}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/api/worker/v1/worker/{id}/leave'.format(id='id_example'),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

