package com.demo.SpringBootWebService1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootWebService1.dto.UserDto;
import com.demo.SpringBootWebService1.utility.JwtUtil;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/loginuser")
	public ResponseEntity<String> authenticateUser(@RequestBody UserDto userdto){
		
		if(userdto.getUsername().equals("admin1") && userdto.getPassword().equals("admin1")) {
			String token = jwtUtil.generateToken("admin", "ROLE_ADMIN");
			return ResponseEntity.ok(token);
		}
	    if(userdto.getUsername().equals("user1") && userdto.getPassword().equals("user1")) {
		    String token = jwtUtil.generateToken("user", "ROLE_USER");
			return ResponseEntity.ok(token);
		}
		 return ResponseEntity.status(401).body("Invalid Credentials");
	
		
	}

}
