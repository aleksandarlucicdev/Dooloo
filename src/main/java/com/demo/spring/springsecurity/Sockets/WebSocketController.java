package com.demo.spring.springsecurity.Sockets;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class WebSocketController {

	
		private final SimpMessagingTemplate template;
		
		
		@Autowired
		WebSocketController(SimpMessagingTemplate template){
			this.template = template;
		}
		
		@MessageMapping("/send/message")
		public void onRecivedMessage(String message) {
			this.template.convertAndSend("/chat", new SimpleDateFormat("HH:mm:ss").format(new Date())+ "-"+ message);
		}
		
}
