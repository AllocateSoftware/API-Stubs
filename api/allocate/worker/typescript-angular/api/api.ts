export * from './default.service';
import { DefaultService } from './default.service';
export * from './worker.service';
import { WorkerService } from './worker.service';
export const APIS = [DefaultService, WorkerService];
