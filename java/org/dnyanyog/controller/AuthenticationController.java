package org.dnyanyog.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AuthenticationController {
	@GetMapping("/hello")
	public String hello()
	{
		return "Hellow";
	}
	
	public String challo()
	{
		long date=System.currentTimeMillis();
		return "Hi There,chalo chalo"+date;
		
	}

}
