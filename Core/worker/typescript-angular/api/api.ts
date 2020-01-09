export * from './annualLeaveClaims.service';
import { AnnualLeaveClaimsService } from './annualLeaveClaims.service';
export * from './workerData.service';
import { WorkerDataService } from './workerData.service';
export * from './workers.service';
import { WorkersService } from './workers.service';
export const APIS = [AnnualLeaveClaimsService, WorkerDataService, WorkersService];
