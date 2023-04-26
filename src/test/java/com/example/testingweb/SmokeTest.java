package com.example.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmokeTest {

	@Autowired
	private HomeController homeController;

	@Test
	@DisplayName("HomeController 빈 생성됨")
	void testHomeControllerLoads() {
		assertThat(homeController).isNotNull();
	}

}
