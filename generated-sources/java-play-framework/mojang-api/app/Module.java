import com.google.inject.AbstractModule;

import controllers.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(MiscellaneousApiControllerImpInterface.class).to(MiscellaneousApiControllerImp.class);
        bind(NameHistoryApiControllerImpInterface.class).to(NameHistoryApiControllerImp.class);
        bind(SecurityQuestionAnswerApiControllerImpInterface.class).to(SecurityQuestionAnswerApiControllerImp.class);
        bind(SkinOperationsApiControllerImpInterface.class).to(SkinOperationsApiControllerImp.class);
    }
}