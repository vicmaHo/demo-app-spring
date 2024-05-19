package com.victor.demoapp.demoapitest.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	private int id;
	private String name;
	private String email;
	private String company;
	private String city;
	
	
	
}
