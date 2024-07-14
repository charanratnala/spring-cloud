package com.example.springclouddemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SonarCloudDemo {

	@RequestMapping("/sonarCloud")
	public String get() {
		return " Hii from Sonar Cloud";
	}

}
