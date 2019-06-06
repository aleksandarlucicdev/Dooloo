package com.demo.spring.springsecurity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.spring.springsecurity.model.Contact;

@Service
public interface ContactService {

	List<Contact> findAll();

	

	Contact save(Contact contact);

	void deleteById(Long id_contact);

}
