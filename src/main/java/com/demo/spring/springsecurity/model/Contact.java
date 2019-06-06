package com.demo.spring.springsecurity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="contact")
public class Contact {
	
	
	public Contact() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_contact")
	private Long id_contact;
	
	@Column(name="contact_name")
	private String contact_name;
	
	@Column(name="contact_mail")
	private String contact_mail;
	
	@Column(name="message")
	private String message;
	
	
	
	
	
	public Long getId_contact() {
		return id_contact;
	}
	public void setId_contact(Long id_contact) {
		this.id_contact = id_contact;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_mail() {
		return contact_mail;
	}
	public void setContact_mail(String contact_mail) {
		this.contact_mail = contact_mail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	public Contact(Long id_contact, String contact_name, String contact_mail, String message) {
		super();
		this.id_contact = id_contact;
		this.contact_name = contact_name;
		this.contact_mail = contact_mail;
		this.message = message;
	}
	
	
	
	
	
	
	
}
