export * from './miscellaneous.service';
import { MiscellaneousService } from './miscellaneous.service';
export * from './nameHistory.service';
import { NameHistoryService } from './nameHistory.service';
export * from './securityQuestionAnswer.service';
import { SecurityQuestionAnswerService } from './securityQuestionAnswer.service';
export * from './skinOperations.service';
import { SkinOperationsService } from './skinOperations.service';
export const APIS = [MiscellaneousService, NameHistoryService, SecurityQuestionAnswerService, SkinOperationsService];
