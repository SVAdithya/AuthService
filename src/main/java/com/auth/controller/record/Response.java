package com.auth.controller.record;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class Response {
    private Status status;
    private ResponsesObj responseBody;
    public Response(Status status, ResponsesObj responseBody) {
        this.status= status;
        this.responseBody = responseBody;
    }

    public Response(ResponsesObj obj) {
        this(new Status(HttpStatus.OK, "SUCCESS"), obj);
    }
}

interface ResponsesObj {
}
