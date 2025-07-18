package com.ticketing.user.controller;

import com.ticketing.common.api.Api;
import com.ticketing.dto.auth.UserLoginResponse;
import com.ticketing.user.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class UserAuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public Api<UserLoginResponse> login() {

        return Api.ok();
    }
}
