package com.spring.sping21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class Application
{
	ArrayList<stuff> hj = new ArrayList<>();


	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@PostMapping("/gento")
	public String post(@RequestBody stuff Stuff)
	{
		hj.add(Stuff);
		return "Recieved "+Stuff.getName();
	}

	@GetMapping("/gento")
	public ArrayList<stuff> get()
	{
		stuff io = new stuff();
		io.setName("henshin");
		io.setNumber(90);
		hj.add(io);
		return hj;
	}



}
