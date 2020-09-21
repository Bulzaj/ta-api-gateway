package com.talkactive.taapigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()

                .route(p -> p.path("/api/user-details")
                    .uri("lb://ta-current-user"))

                .route(p -> p.path("/**")
                    .uri("lb://ta-message-exchange"))

                .route(p -> p.path("/api/conversation")
                    .uri("lb://ta-conversation-storage"))

                .build();
    }
}
