package com.demo.spring.springsecurity.service;

import java.util.List;
import java.util.Optional;

import com.demo.spring.springsecurity.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	User getUserByEmail(String email);

	User getUserById(Long id);

	void deleteById(Long id);

	void updateUser(User user);

	boolean requestPasswordReset(String email);


	public Optional<User> findUserByEmail(String email);
    public Optional<User> findUserByResetToken(String resetToken);
    


}
