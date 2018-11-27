package com.webapp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	//@ResponseBody
	//when responsebody commented then view resolver configured in todo-servlet.xml called
	//else string login is displayed in web page
	public String sayHello()
	{
		return "login";
	}
}
