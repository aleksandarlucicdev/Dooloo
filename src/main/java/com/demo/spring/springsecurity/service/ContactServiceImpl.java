package com.demo.spring.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.springsecurity.model.Contact;
import com.demo.spring.springsecurity.repository.ContactRepository;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	
	
	@Autowired ContactRepository contactRepository;

	@Override
	public List<Contact> findAll() {
		return (List<Contact>)contactRepository.findAll();
	}

	

	@Override
	public Contact save(Contact contact) {
		return contactRepository.save(contact);
	}

	@Override
	public void deleteById(Long id_contact) {
		contactRepository.deleteById(id_contact);
		
	}




}
