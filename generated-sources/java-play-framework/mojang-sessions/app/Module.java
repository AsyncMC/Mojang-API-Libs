import com.google.inject.AbstractModule;

import controllers.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(BansApiControllerImpInterface.class).to(BansApiControllerImp.class);
        bind(LoginApiControllerImpInterface.class).to(LoginApiControllerImp.class);
    }
}