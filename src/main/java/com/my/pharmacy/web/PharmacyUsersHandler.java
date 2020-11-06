package com.my.pharmacy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.my.pharmacy.repository.UsersRepository;
import com.my.pharmacy.repository.entity.Users;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
import static org.springframework.web.reactive.function.server.ServerResponse.*;

import reactor.core.publisher.Mono;

@Component
public class PharmacyUsersHandler {

	@Autowired
	UsersRepository reactiveUserRepository;

	public Mono<ServerResponse> hello(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromValue("Hello Spring"));

	}

	public Mono<ServerResponse> users(ServerRequest request) {

		return ok().contentType(APPLICATION_JSON)
				.body(fromPublisher(reactiveUserRepository.findAll(), Users.class));
	}
}
