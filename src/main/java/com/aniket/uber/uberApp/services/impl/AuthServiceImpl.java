package com.aniket.uber.uberApp.services.impl;

import com.aniket.uber.uberApp.dto.DriverDto;
import com.aniket.uber.uberApp.dto.SignupDto;
import com.aniket.uber.uberApp.dto.UserDto;
import com.aniket.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
