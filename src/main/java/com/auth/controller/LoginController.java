package com.auth.controller;

import com.auth.controller.record.LoginToken;
import com.auth.controller.record.Response;
import com.auth.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @GetMapping("/v1/create")
    public Response createUser() {
        //loginService.createUser(username, pass);
        return new Response(new LoginToken(UUID.randomUUID().toString(), UUID.randomUUID().toString()));
    }
}
