package com.demo.spring.springsecurity.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.demo.spring.springsecurity.model.Korisnik;
import com.demo.spring.springsecurity.model.User;

public class NotificationService {

	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public NotificationService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	
	public void sendNotification(Korisnik korisnik) throws MailException {
		SimpleMailMessage mejl = new SimpleMailMessage();
		mejl.setTo(korisnik.getMejl());
		mejl.setFrom("aleksandarlink@gmail.com");
		mejl.setSubject("Greeting message");
		mejl.setText("Thanks for using our application");
		
		javaMailSender.send(mejl);
		
		}
	}
	

