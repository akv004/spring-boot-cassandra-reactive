package com.my.pharmacy.repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.my.pharmacy.repository.entity.Users;
public interface UsersRepository extends ReactiveCrudRepository<Users, String> {

	/**
	 * Derived query selecting by {@code lastname}.
	 *
	 * @param lastname
	 * @return
	 */
	Flux<Users> findByLastname(String lastname);


}
