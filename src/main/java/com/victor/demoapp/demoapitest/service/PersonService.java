package com.victor.demoapp.demoapitest.service;

import java.util.List;

import com.victor.demoapp.demoapitest.controller.dto.PersonResponse;

public interface PersonService {

	List<PersonResponse> list();

	PersonResponse findById(int id);

//	PersonResponse create(PersonRequest value);
//
//	PersonResponse update(Long id, PersonRequest value);

	void delete(int id);
	
}
