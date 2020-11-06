package com.my.pharmacy.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class PharmacyUsersRouter {

	@Bean
	public RouterFunction<ServerResponse> route(PharmacyUsersHandler greetingHandler) {

		return RouterFunctions.route(
				RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
				greetingHandler::hello);
	}

	@Bean
	public RouterFunction<ServerResponse> getAllUser(PharmacyUsersHandler greetingHandler) {

		return RouterFunctions.route(
				RequestPredicates.GET("/users").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
				greetingHandler::users);
	}

}