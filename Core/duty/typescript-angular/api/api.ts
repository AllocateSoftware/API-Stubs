export * from './bookings.service';
import { BookingsService } from './bookings.service';
export * from './class3rdPartyRostering.service';
import { Class3rdPartyRosteringService } from './class3rdPartyRostering.service';
export * from './costing.service';
import { CostingService } from './costing.service';
export * from './duties.service';
import { DutiesService } from './duties.service';
export const APIS = [BookingsService, Class3rdPartyRosteringService, CostingService, DutiesService];
