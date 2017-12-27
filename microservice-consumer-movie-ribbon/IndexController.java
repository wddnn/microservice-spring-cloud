package com.example.cloud.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.entity.User;



@RestController
@RequestMapping(value="/index")
public class IndexController {
	
	
	  @Value(value = "${roncoo.secret}")
	  private String secret;
	  
	  @Value(value = "${roncoo.number}")
	  private int number;
	  @Value(value = "${roncoo.name}")
	  private String name;
	  @Value(value = "${roncoo.desc}")
	  private String desc;
	
	
	@RequestMapping
	public String index() {
		return "hello world";
	}
	
	@RequestMapping(value="get")
	public Map<String,Object> get() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("secret", secret);
		map.put("value", number);
		map.put("name", name);
		map.put("desc", desc);
		return map;
	}
	
	@RequestMapping(value="find/{id}/{name}")
	public User get(@PathVariable String name) {
		User user =new 	User();
		
		user.setName(name);
	
		return user;
	}
}
