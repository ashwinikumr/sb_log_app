package com.luv2code.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.service.MsgService;

@RestController
public class MsgRestController {
	
	@Autowired
	private MsgService msgService;
	
	
	@GetMapping("/welcome")
	public String getMsg() {
		return msgService.getWelcomeMsg();
	}
	

}
