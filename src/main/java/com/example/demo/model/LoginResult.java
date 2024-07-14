package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LoginResult {
	private int resultcode;
	private String message;
}
