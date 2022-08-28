package com.auth.controller.record;

import org.springframework.http.HttpStatus;

public record Status(HttpStatus responseCode, String responseMsg) {
}
