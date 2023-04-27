package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

	public String getGreet() {
		return "여러분 안녕?";
	}

}
