package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//"say-hello" => "Hello! what are you learning today?"
	
	//say-hello
	//http://localhost:8080/say-hello
	@RequestMapping("/say-hello")
	@ResponseBody 
	public String sayHello() {
		return "Hello! what are you learning today?";
	}

	@RequestMapping("/say-hello-html")
	@ResponseBody 
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		return sb.toString();
	}
	
	// sayHello.jsp
	// "say-hello-jsp"
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
