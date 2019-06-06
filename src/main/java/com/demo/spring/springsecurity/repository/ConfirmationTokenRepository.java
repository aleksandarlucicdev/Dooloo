package com.demo.spring.springsecurity.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.spring.springsecurity.model.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {  
    ConfirmationToken findByConfirmationToken(String confirmationToken);
}