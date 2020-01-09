export * from './agencies.service';
import { AgenciesService } from './agencies.service';
export * from './agency.service';
import { AgencyService } from './agency.service';
export * from './bookings.service';
import { BookingsService } from './bookings.service';
export * from './workers.service';
import { WorkersService } from './workers.service';
export const APIS = [AgenciesService, AgencyService, BookingsService, WorkersService];
