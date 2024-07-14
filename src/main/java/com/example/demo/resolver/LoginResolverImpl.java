package com.example.demo.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.LoginResult;

@Component
public class LoginResolverImpl implements GraphQLQueryResolver{
	
	@Autowired
	LoginResult loginResult;
	
	public LoginResult login(String username, String password) {
		if(username == "username" && password == "password") {
			loginResult.setResultcode(1);
			loginResult.setMessage("success");
		}else {
			loginResult.setResultcode(0);
			loginResult.setMessage("failure");
		}
		System.out.println(loginResult);
		
		return loginResult;
	}
}
