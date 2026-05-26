package com.spring.spring2;

import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class Spring2Application {

	public static void main(String[] args)
	{
		SpringApplication.run(Spring2Application.class, args);

	}
	@GetMapping("/")
	public ArrayList<String> get()
	{
		ArrayList<String> jk = new ArrayList<>();

		jk.add("A");
		jk.add("B");
		jk.add("C");

		return jk;
	}

}
