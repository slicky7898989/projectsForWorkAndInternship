package com.spring.spring22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class Application
{
	ArrayList<buildings> jh = new ArrayList<>();


	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@PostMapping("/henshin")
	public String post(@RequestBody buildings dings)
	{
		jh.add(dings);
		return dings.getUltras();
	}

	@PutMapping("/henshin/{id}")
	public String put(@PathVariable("id") int id, @RequestBody buildings dingss)
	{
		jh.set(id,dingss);

		return dingss.getUltras();
	}

	@DeleteMapping("/henshin/{id}")
	public String delete(@PathVariable("id") int a)
	{
		jh.remove(a);
		return "Deleted: "+ a;
	}



}
