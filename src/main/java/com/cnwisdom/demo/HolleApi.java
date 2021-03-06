package com.cnwisdom.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HolleApi {

	@GetMapping("/")  
    public String home() {  
        return "Hello";  
    }
	
	
	@PostMapping("/word")
	public String word(){
		return "Word";
	}
}
