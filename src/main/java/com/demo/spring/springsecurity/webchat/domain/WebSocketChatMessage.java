package com.demo.spring.springsecurity.webchat.domain;

public class WebSocketChatMessage {
	
	private String type;
	private String contnent;
	private String sender;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContnent() {
		return contnent;
	}
	public void setContnent(String contnent) {
		this.contnent = contnent;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	
	
}
