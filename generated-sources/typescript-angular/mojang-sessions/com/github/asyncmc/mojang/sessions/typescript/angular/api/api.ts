export * from './bans.service';
import { BansService } from './bans.service';
export * from './login.service';
import { LoginService } from './login.service';
export const APIS = [BansService, LoginService];
