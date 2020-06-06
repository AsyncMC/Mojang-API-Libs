import {interfaces} from "inversify";

import { DefaultService } from './com.github.asyncmc.mojang.authentication.typescript.inversify.api/default.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<DefaultService>("DefaultService").to(DefaultService).inSingletonScope();
    }
}
