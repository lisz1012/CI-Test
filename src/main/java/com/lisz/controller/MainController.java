package com.lisz.controller;

import com.lisz.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired
	private MyService service;

	@GetMapping("/add")
	public int add(int a, int b) {
		return service.add(a, b);
	}
}
