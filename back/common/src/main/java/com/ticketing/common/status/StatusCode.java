package com.ticketing.common.status;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusCode implements StatusCodeIfs{

    OK(200, 200, "Success"),
    BAD_REQUEST(400, 400, "Bad Request"),
    SERVER_ERROR(500, 500, "Server Error")
    ;

    private final int statusCode;
    private final int httpCode;
    private final String description;

}
