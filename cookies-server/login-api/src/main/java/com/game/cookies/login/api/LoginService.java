package com.game.cookies.login.api;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static com.lightbend.lagom.javadsl.api.Service.named;

public interface LoginService extends Service {

    ServiceCall<NotUsed, String> login(String id);

    @Override
    default Descriptor descriptor() {
        return named("login").withCalls(Service.pathCall("/api/login/:id", this::login))
                .withAutoAcl(true);
    }
}