import com.google.inject.AbstractModule;

import com.github.asyncmc.mojang.sessions.java.play.framework.api.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(BansApiControllerImpInterface.class).to(BansApiControllerImp.class);
        bind(LoginApiControllerImpInterface.class).to(LoginApiControllerImp.class);
    }
}