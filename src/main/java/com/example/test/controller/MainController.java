package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.test.domain.User;


@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
}
