package com.spring.spring23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@SpringBootApplication
@RestController
public class Application
{
	ArrayList<cars> j1 = new ArrayList<>();
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/factory")
	public ArrayList<cars> get()
	{
		return j1;
	}

	@PostMapping("/factory")
	public String post(@RequestBody cars ars)
	{
		j1.add(ars);
		return ars.getModel();
	}

	@PutMapping("/factory/{num}")
	public int put(@PathVariable("num") int num, @RequestBody cars c )
	{
		j1.set(num,c);
		return num;
	}

	@DeleteMapping("/factory/{num}")
	public int delete(@PathVariable("num") int num)
	{
		j1.remove(num);
		return num;
	}

}
