import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { Configuration } from './configuration';
import { HttpClient } from '@angular/common/http';


import { MiscellaneousService } from './com.github.asyncmc.mojang.api.typescript.angular.api/miscellaneous.service';
import { NameHistoryService } from './com.github.asyncmc.mojang.api.typescript.angular.api/nameHistory.service';
import { SecurityQuestionAnswerService } from './com.github.asyncmc.mojang.api.typescript.angular.api/securityQuestionAnswer.service';
import { SkinOperationsService } from './com.github.asyncmc.mojang.api.typescript.angular.api/skinOperations.service';

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: [
    MiscellaneousService,
    NameHistoryService,
    SecurityQuestionAnswerService,
    SkinOperationsService ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): ModuleWithProviders {
        return {
            ngModule: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: ApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('ApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}
