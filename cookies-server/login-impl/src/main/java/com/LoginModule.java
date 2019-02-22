package com;

import com.game.cookies.login.api.LoginService;
import com.game.cookies.login.impl.LoginServiceImpl;
import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

/**
 * The module that binds the HelloService so that it can be served.
 */
public class LoginModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {
        bindService(LoginService.class, LoginServiceImpl.class);
    }
}
