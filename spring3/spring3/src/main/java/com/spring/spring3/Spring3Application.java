package com.spring.spring3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class Spring3Application
{
	ArrayList<String>  nn = new ArrayList<>();

	public static void main(String[] args)
	{
		SpringApplication.run(Spring3Application.class, args);
	}




	@GetMapping("/")
	public ArrayList<String> rent()
	{
		nn.add("Helck");
		nn.add("Kent");
		nn.add("Jojo");
		return nn;
	}

}
