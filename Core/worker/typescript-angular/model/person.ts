/**
 * Workers
 * ## Workers and events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { EmploymentDetails } from './employmentDetails';
import { WorkLocations } from './workLocations';
import { Attribute } from './attribute';
import { Posting } from './posting';
import { Visa } from './visa';
import { Identification } from './identification';
import { Specialty } from './specialty';
import { Skill } from './skill';
import { PersonalInfo } from './personalInfo';
import { WorkingRestriction } from './workingRestriction';
import { Contract } from './contract';
import { PersonalPattern } from './personalPattern';
import { Availabilities } from './availabilities';


export interface Person { 
    identification?: Identification;
    personalInfo?: PersonalInfo;
    employmentDetails?: EmploymentDetails;
    workLocations?: WorkLocations;
    postings?: Array<Posting>;
    contracts?: Array<Contract>;
    skills?: Array<Skill>;
    specialties?: Array<Specialty>;
    attributes?: Array<Attribute>;
    visas?: Array<Visa>;
    workingRestrictions?: Array<WorkingRestriction>;
    availabilities?: Availabilities;
    personalPattern?: PersonalPattern;
}
