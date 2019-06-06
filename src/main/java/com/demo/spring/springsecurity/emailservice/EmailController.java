package com.demo.spring.springsecurity.emailservice;

import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@Value("$gmail.username")
	private String username;
	
	@Value("$gmail.password")
	private String password;
	
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public String sendEmail(@RequestBody EmailMessage emailMessage) throws AddressException, MessagingException {
		sendmail(emailMessage);
		return "Email sent sueccessfull";
		
	}
	
	private void sendmail(EmailMessage emailMessage) throws AddressException, MessagingException {
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(username, password);
			}
		});
		
		
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(username,false));
		
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("aleksandartelnetcacak@gmail.com"));
		msg.setSubject(emailMessage.getSubject());
		msg.setContent(emailMessage.getBody(), "text/html");
		msg.setSentDate(new Date());
		
		
		
		
		
		
	}
	
	
	
}
