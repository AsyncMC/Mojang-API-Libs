import {interfaces} from "inversify";

import { MiscellaneousService } from './com.github.asyncmc.mojang.api.typescript.inversify.api/miscellaneous.service';
import { NameHistoryService } from './com.github.asyncmc.mojang.api.typescript.inversify.api/nameHistory.service';
import { SecurityQuestionAnswerService } from './com.github.asyncmc.mojang.api.typescript.inversify.api/securityQuestionAnswer.service';
import { SkinOperationsService } from './com.github.asyncmc.mojang.api.typescript.inversify.api/skinOperations.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<MiscellaneousService>("MiscellaneousService").to(MiscellaneousService).inSingletonScope();
        container.bind<NameHistoryService>("NameHistoryService").to(NameHistoryService).inSingletonScope();
        container.bind<SecurityQuestionAnswerService>("SecurityQuestionAnswerService").to(SecurityQuestionAnswerService).inSingletonScope();
        container.bind<SkinOperationsService>("SkinOperationsService").to(SkinOperationsService).inSingletonScope();
    }
}
