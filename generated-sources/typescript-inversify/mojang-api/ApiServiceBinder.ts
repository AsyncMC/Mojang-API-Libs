import {interfaces} from "inversify";

import { MiscellaneousService } from './api/miscellaneous.service';
import { NameHistoryService } from './api/nameHistory.service';
import { SecurityQuestionAnswerService } from './api/securityQuestionAnswer.service';
import { SkinOperationsService } from './api/skinOperations.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<MiscellaneousService>("MiscellaneousService").to(MiscellaneousService).inSingletonScope();
        container.bind<NameHistoryService>("NameHistoryService").to(NameHistoryService).inSingletonScope();
        container.bind<SecurityQuestionAnswerService>("SecurityQuestionAnswerService").to(SecurityQuestionAnswerService).inSingletonScope();
        container.bind<SkinOperationsService>("SkinOperationsService").to(SkinOperationsService).inSingletonScope();
    }
}
