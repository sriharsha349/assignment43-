package com.harsha.spring.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello this is Sriharsha Gadamsetty";
	}

}
