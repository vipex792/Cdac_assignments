package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
@GetMapping("/hello")
public String sayHello() {
	return "hello";
	
}

@GetMapping("/welcome")
public ModelAndView sayWelcome() {
	String msg = "Welcome message from controller";
	return new ModelAndView("welcome,message, msg");
	//hello is a logical viewname
	
}
@GetMapping("/test")
public String testdata(Model mymodel) {
	mymodel.addAttribute("name", "Tushar");
	mymodel.addAttribute("email", "tt@gmail.com");
	
	return "testdata";
	
}
}
