export * from './proposal.service';
import { ProposalService } from './proposal.service';
export * from './vacancy.service';
import { VacancyService } from './vacancy.service';
export const APIS = [ProposalService, VacancyService];
