package com.victor.demoapp.demoapitest.service.imp;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.victor.demoapp.demoapitest.controller.dto.PersonResponse;
import com.victor.demoapp.demoapitest.model.entity.Person;
import com.victor.demoapp.demoapitest.model.repository.PersonRepository;
import com.victor.demoapp.demoapitest.service.PersonService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{
	
	private final PersonRepository repository;

	@Override
	public List<PersonResponse> list() {
		
		var data = repository.findAll();
		
		List<PersonResponse> response = new ArrayList<>();
		
		for (Person person : data) {
			PersonResponse tempData = new PersonResponse(person.getId(),
					person.getName(), 
					person.getEmail(), 
					person.getCompany(), 
					person.getCity());
			response.add(tempData);
		}
		
		return response;
	}

	@Override
	public PersonResponse findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
