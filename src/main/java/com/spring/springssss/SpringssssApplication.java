package com.spring.springssss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringssssApplication {
	@GetMapping
	
public String Msg()
{
		return "this is my first deployement";
}
	public static void main(String[] args) {
		SpringApplication.run(SpringssssApplication.class, args);
		
	}

}
