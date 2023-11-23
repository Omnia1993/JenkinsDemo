package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Jenkins;
import com.example.demo.repo.JenkinsRepo;



@RestController
public class JenkinsController {
	
	@Autowired
	JenkinsRepo jenkinsRepo;
	
     @PostMapping("/add")
	public void  hello(@RequestBody Jenkins jenkins) {
		
	jenkinsRepo.save(jenkins);
		
	}

     
@GetMapping("/hi")
 	public String  hello() {
 		
 	return"hellllllo";
 		
 	}


@GetMapping("/hi2")
public String  hello2() {
	
return"hellllllo2";
}

}
