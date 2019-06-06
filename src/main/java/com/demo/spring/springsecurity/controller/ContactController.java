package com.demo.spring.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.springsecurity.model.Contact;
import com.demo.spring.springsecurity.service.ContactService;

@RestController
public class ContactController {
	
	
	@Autowired private ContactService contactService;
	
	
	
	
	@GetMapping(value="/contacts")
	public ResponseEntity<List<Contact>> getAllcontacts(){
		List<Contact> contacts = contactService.findAll();
		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
	}
	
	

	
	
	@PostMapping(path="/contacts")
	Contact addContact(@RequestBody Contact contact) {
		return contactService.save(contact);
	}
	
	@DeleteMapping(path="/{id_contact}")
	public ResponseEntity<Void> deleteContact(@PathVariable(value="id_contact") Long id_contact){
		contactService.deleteById(id_contact);
		return ResponseEntity.noContent().build();
	}
	
	
	
	
	
	

	
	

}
