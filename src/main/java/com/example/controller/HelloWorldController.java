package com.example.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pojo.Student;

@Controller
public class HelloWorldController {
	
	@GetMapping("/hello")
	@ResponseBody
	public Student sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
		return new Student(name, "CG");
	}

	@PostMapping("/batch")
	@ResponseBody
	public Student newBatch(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
		return new Student(name, "TCS");
	}

}
