import {interfaces} from "inversify";

import { BansService } from './com.github.asyncmc.mojang.sessions.typescript.inversify.api/bans.service';
import { LoginService } from './com.github.asyncmc.mojang.sessions.typescript.inversify.api/login.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<BansService>("BansService").to(BansService).inSingletonScope();
        container.bind<LoginService>("LoginService").to(LoginService).inSingletonScope();
    }
}
