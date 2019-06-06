package com.demo.spring.springsecurity.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.springsecurity.model.User;

import com.demo.spring.springsecurity.service.UserService;



@RestController
public class UserController {
	
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired private UserService userService;
	
	
	
	@GetMapping(value="/users")
	public ResponseEntity<List<User>> getAllusers() {
		log.info("Admin is checking /users endpoint");
		List<User> users = userService.findAll();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
}
	
	@GetMapping(value="/getuser")
	
	public ResponseEntity<User> getUser(Principal principal){
		log.info("User is checking /getuser endpoint");
		User user = userService.getUserByEmail(principal.getName());
		return new ResponseEntity<User>(user, HttpStatus.OK);
}
	
	@DeleteMapping(path="/{id}")
	public  ResponseEntity<Void> deleteUser(@PathVariable(value ="id") Long id) 	{
		
		userService.deleteById(id);
		log.info("Delete method is used by user");
		return ResponseEntity.noContent().build();	
	}
	
	
	@PutMapping("users")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		
		if(user != null) {
		userService.updateUser(user);
		return new	ResponseEntity<User>(HttpStatus.OK);
	}else {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}}

	
	
	//Kod vezan za FORGOT PASSWORD (ISKOMENTARISATI PO POTREBI)
	
	
	
	/*
	 @PostMapping(path="/password-reset-request")
	 public OperationStatusModel requestReset(@RequestBody PasswordResetRequestModel passwordResetRequestModel){
	  		OperationStatusModel returnValue = new OperationStatusModel();
	  
	 
		boolean operationResult = userService.requestPasswordReset(passwordResetRequestModel.getEmail());
	  
	  
	  	returnValue.setOperationName(RequestOperationName.REQUEST_PASSWORD_RESET.name());
	  	returnValue.setOperationResult(RequestOperationStatus.ERROR.name());
	  	
	  
	  	if(operationResult){
	  
	  		returnValue.setOperationResult(RequestOperationStatus.SUCCESS.name());
	  
	 }
	  
	  return returnValue;
	  
	 }
	 
	 */
	
	
	
	 
	 
	 
	 
	 
	 
	 
}
