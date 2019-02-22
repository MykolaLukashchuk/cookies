package com.game.cookies.login.impl;

import akka.NotUsed;
import com.game.cookies.login.api.LoginService;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;

public class LoginServiceImpl implements LoginService {

    @Inject
    public LoginServiceImpl() {
    }

    @Override
    public ServiceCall<NotUsed, String> login(String id) {
        return request -> CompletableFuture.completedFuture(id + "hi");
    }
}
