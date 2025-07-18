package com.ticketing.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserLoginRequest(
        @Email
        String email,

        @NotBlank
        @Size(min = 7, max = 15)
        String password
){}