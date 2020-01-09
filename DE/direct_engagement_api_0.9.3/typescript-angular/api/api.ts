export * from './duty.service';
import { DutyService } from './duty.service';
export * from './event.service';
import { EventService } from './event.service';
export * from './referenceData.service';
import { ReferenceDataService } from './referenceData.service';
export const APIS = [DutyService, EventService, ReferenceDataService];
