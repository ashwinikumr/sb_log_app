package com.luv2code.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MsgService {
	
	private Logger logger = LoggerFactory.getLogger(MsgService.class);
	
	public String getWelcomeMsg() {
		logger.trace("this is the trace level");
		logger.debug("this is the debug method");
		logger.info("getWelcomeMsg()    - stated....");
		
		
		String msg = "Welcome to Ashok It...";
		
		logger.info("getWelcomeMsg()     - ended.....");
		
		logger.warn("this is the warning method  ");
		logger.error("this is the error method");
		
		return msg;
	}

}
