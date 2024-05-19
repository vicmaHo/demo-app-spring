package com.victor.demoapp.demoapitest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.demoapp.demoapitest.controller.dto.PersonResponse;
import com.victor.demoapp.demoapitest.service.imp.PersonServiceImpl;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("api/persons")
@RequiredArgsConstructor
public class PersonController {
	
	private final PersonServiceImpl service;
	
	@GetMapping
	public List<PersonResponse> getAllPersons() {
		return service.list();
	}
	
}
