package com.cod.oauth2.repository;

import org.springframework.data.repository.CrudRepository;

import com.cod.oauth2.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
