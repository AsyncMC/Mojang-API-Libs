import com.google.inject.AbstractModule;

import com.github.asyncmc.mojang.status.java.play.framework.api.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(DefaultApiControllerImpInterface.class).to(DefaultApiControllerImp.class);
    }
}