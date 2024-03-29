package com.fynesy.n1.n1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class N1Application {

	public static void main(String[] args) {
		SpringApplication.run(N1Application.class, args);
	}

	@RequestMapping("/")
	public String index() {
		String s = "hi there\n";
		System.out.println(s);
		return s;
	}

}
