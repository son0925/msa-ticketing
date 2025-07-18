package com.ticketing.common.status;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuthStatusCode implements StatusCodeIfs {

    LOGIN_SUCCESS(110200, 200, "Login Success"),
    LOGIN_BAD_REQUEST(110400, 400, "Login Bad Request"),
    REGISTER_SUCCESS(100200, 200, "Register Success"),
    REGISTER_BAD_REQUEST(100400, 400, "Register Bad Request"),

    ;

    private final int statusCode;
    private final int httpCode;
    private final String description;

}
