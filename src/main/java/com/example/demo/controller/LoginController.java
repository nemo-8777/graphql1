package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.model.LoginResult;
import com.example.demo.resolver.LoginResolverImpl;

@Controller
public class LoginController {
	@Autowired
	LoginResolverImpl loginResolverImpl;
	
	@QueryMapping
	public LoginResult login(@Argument String username, @Argument String password) {
		return loginResolverImpl.login(username, password);
	}
}
