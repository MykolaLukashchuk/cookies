package com.game.cookies.login.impl;

import akka.NotUsed;
import com.game.cookies.login.api.LoginService;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.persistence.PersistentEntityRef;
import com.lightbend.lagom.javadsl.persistence.PersistentEntityRegistry;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;

public class LoginServiceImpl implements LoginService {

    private final PersistentEntityRegistry persistentEntityRegistry;

    @Inject
    public LoginServiceImpl(PersistentEntityRegistry persistentEntityRegistry) {
        this.persistentEntityRegistry = persistentEntityRegistry;
    }

    @Override
    public ServiceCall<NotUsed, String> login(String id) {
        return request -> {
           return CompletableFuture.completedFuture(id + "hi");
        };
    }
}
