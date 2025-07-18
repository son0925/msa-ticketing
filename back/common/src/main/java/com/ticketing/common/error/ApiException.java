package com.ticketing.common.error;

import com.ticketing.common.status.StatusCodeIfs;
import lombok.Getter;

@Getter
public class ApiException extends Exception {

    private final StatusCodeIfs statusCode;

    public ApiException(StatusCodeIfs statusCode) {
        this.statusCode = statusCode;
    }

}
