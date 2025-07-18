package com.ticketing.common.api;

import com.ticketing.common.error.ApiException;
import com.ticketing.common.status.StatusCodeIfs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Api<T> {

    private int statusCode;
    private int httpCode;
    private String description;
    private T data;

    public static <T> Api<T> ok() {
        return Api.<T>builder()
                .statusCode(200)
                .httpCode(200)
                .description("ok")
                .build()
                ;
    }

    public static <T> Api<T> ok(T data) {
        return Api.<T>builder()
                .statusCode(200)
                .httpCode(200)
                .description("ok")
                .data(data)
                .build()
                ;
    }

    public static <T> Api<T> ok(T data, StatusCodeIfs statusCode) {
        return Api.<T>builder()
                .statusCode(statusCode.getStatusCode())
                .httpCode(statusCode.getHttpCode())
                .description(statusCode.getDescription())
                .data(data)
                .build()
                ;
    }

    public static <T> Api<T> ok(T data, StatusCodeIfs statusCode, String description) {
        return Api.<T>builder()
                .statusCode(statusCode.getStatusCode())
                .httpCode(statusCode.getHttpCode())
                .description(description)
                .data(data)
                .build()
                ;
    }

    public static <T> Api<T> ok(StatusCodeIfs statusCode) {
        return Api.<T>builder()
                .statusCode(statusCode.getStatusCode())
                .httpCode(statusCode.getHttpCode())
                .description(statusCode.getDescription())
                .build()
                ;
    }

    public static <T> Api<T> error() {
        return Api.<T>builder()
                .statusCode(500)
                .httpCode(500)
                .description("error")
                .build()
                ;
    }

    public static <T> Api<T> error(StatusCodeIfs statusCodeIfs) {
        return Api.<T>builder()
                .statusCode(statusCodeIfs.getStatusCode())
                .httpCode(statusCodeIfs.getHttpCode())
                .description(statusCodeIfs.getDescription())
                .build()
                ;
    }

}
