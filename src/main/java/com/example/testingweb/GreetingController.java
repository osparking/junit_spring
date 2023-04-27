package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
	private final MessageService service;

	public GreetingController(MessageService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public @ResponseBody String greeting() {
		return service.getGreet();
	}
}
