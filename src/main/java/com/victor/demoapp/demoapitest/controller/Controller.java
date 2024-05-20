package com.victor.demoapp.demoapitest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.demoapp.demoapitest.controller.dto.PersonResponse;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/controller")
@RequiredArgsConstructor
public class Controller {

	@GetMapping("/hello")
	public PersonResponse getMethodName() {
		return new PersonResponse(0, "Victor Hernandez", "vic@mail.com", "Java", "Venus");
	}
	
	
}
