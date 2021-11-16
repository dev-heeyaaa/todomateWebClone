package com.example.demo.web.service;

import com.example.demo.web.dto.auth.SignupDto;

public interface AuthService {
	public int signup(SignupDto signupDto);
}
