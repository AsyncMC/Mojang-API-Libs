import {interfaces} from "inversify";

import { BansService } from './api/bans.service';
import { LoginService } from './api/login.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<BansService>("BansService").to(BansService).inSingletonScope();
        container.bind<LoginService>("LoginService").to(LoginService).inSingletonScope();
    }
}
