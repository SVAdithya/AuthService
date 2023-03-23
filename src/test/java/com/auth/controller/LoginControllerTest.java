package com.auth.controller;

import com.auth.controller.record.Response;
import com.auth.service.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class LoginControllerTest {

    @InjectMocks
    private LoginController loginController;

    @Mock
    private LoginService loginService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void createUser( ) {
		// val
		String username = "";
        String pwd = "";

        /* // mock
        doNothing().when(loginService).createUser(anyString(), anyString());

        // run test
        Response actual = loginController.createUser();

        // verify
        verify(loginService).createUser(username, pwd); */
    }
}
