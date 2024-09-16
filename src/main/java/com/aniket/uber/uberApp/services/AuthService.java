package com.aniket.uber.uberApp.services;

import com.aniket.uber.uberApp.dto.DriverDto;
import com.aniket.uber.uberApp.dto.SignupDto;
import com.aniket.uber.uberApp.dto.UserDto;

public interface AuthService {

    String login(String email,String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);

}
