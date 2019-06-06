package com.demo.spring.springsecurity.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.springsecurity.repository.UserRepository;
import com.demo.spring.springsecurity.model.User;
import com.demo.spring.springsecurity.util.PasswordUtil;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	
	@Autowired UserRepository userRepository;

	@Override
	public User save(User user) {
		String password = PasswordUtil.getPasswordHash(user.getPassword());
		user.setPassword(password);
		user.setCreateDate(new Date());
		return userRepository.save(user);
	}

	@Override
	public List<User> findAll(){
		return (List<User>)userRepository.findAll();
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepository.findByEmailIgnoreCase(email);
	}

	@Override
	public User getUserById(Long id) {
		User user = getUserById(id);
		
		return user;
	}

	@Override
	public void deleteById(Long id) {
		userRepository.deleteById(id);
		
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public boolean requestPasswordReset(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	@Override
	public Optional<User> findUserByEmail(String email) {
		return userRepository.findByEmail(email);
		
	}

	@Override
	public Optional<User> findUserByResetToken(String resetToken) {
		return userRepository.findByResetToken(resetToken);
	}

	
	
	
}