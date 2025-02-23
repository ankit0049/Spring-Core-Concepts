package com.demo.springconcepts.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetings(){
	   return "Hello Ankit Rajput";
    }

}