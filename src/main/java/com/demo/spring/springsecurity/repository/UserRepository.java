package com.demo.spring.springsecurity.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.springsecurity.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	User findByEmailIgnoreCase(String username);
	
	 Optional<User> findByResetToken(String resetToken);
	 Optional<User> findByEmail(String email);

}
