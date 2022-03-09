package com.antasyuk.crud.exeption;

import java.time.LocalDateTime;

public class ErrorDto {
    private LocalDateTime localDateTime;

    private String message;

    public ErrorDto() {
    }

    public ErrorDto(String message) {
        this.localDateTime = LocalDateTime.now();
        this.message = message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
