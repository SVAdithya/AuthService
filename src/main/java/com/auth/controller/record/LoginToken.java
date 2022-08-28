package com.auth.controller.record;

public record LoginToken (String accessToken, String refreshToken) implements ResponsesObj {
}
