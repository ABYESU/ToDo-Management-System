package com.dmm.task;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
	@GetMapping("/login")
	String login() {
		return "login";
	}
}
