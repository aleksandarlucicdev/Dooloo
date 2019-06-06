package com.demo.spring.springsecurity.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.spring.springsecurity.model.Korisnik;
import com.demo.spring.springsecurity.model.User;

public class RegistrationController {
	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping("/notification")
	public String signupSuccess() {
		
		
		
		Korisnik korisnik = new Korisnik();
		korisnik.setIme("Dan");
		korisnik.setPrezime("Dan");
		korisnik.setMejl("aleksandarlink@gmail.com");   
		
		
		
		 try {
			 notificationService.sendNotification(korisnik);
			 
		 }catch(MailException e) {
			 //catch error
		 }
		
		
		
		
		return "Thank you for joining us";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}