package com.learning.expensetrackerapi.resource;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserResource {
	@PostMapping("/register")
	public String registerUser(@RequestBody Map<String, Object> userMap) {
		
	}
}
