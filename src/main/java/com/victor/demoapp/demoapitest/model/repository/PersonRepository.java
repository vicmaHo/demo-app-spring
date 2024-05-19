package com.victor.demoapp.demoapitest.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.demoapp.demoapitest.model.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
