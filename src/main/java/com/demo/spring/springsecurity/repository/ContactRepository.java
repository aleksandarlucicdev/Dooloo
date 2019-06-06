package com.demo.spring.springsecurity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.springsecurity.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long > {

	

}
