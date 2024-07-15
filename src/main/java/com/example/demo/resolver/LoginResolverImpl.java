package com.example.demo.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.LoginResult;

@Component
public class LoginResolverImpl implements GraphQLQueryResolver{
	public LoginResult login(String username, String password) {
		LoginResult loginResult = new LoginResult();
		
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
