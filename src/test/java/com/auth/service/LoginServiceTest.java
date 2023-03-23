package com.auth.service;

//import com.auth.dao.UserInfoRepository;
//import com.auth.dao.entity.UserInfoDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class LoginServiceTest {
	@InjectMocks
	private LoginService loginService;

	/* @Mock
	private UserInfoRepository userInfoRepository; */

	/* @Captor
	private ArgumentCaptor<UserInfoDao> userInfoDaoArgumentCaptor; */

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void createUser( ) {
		// val
		String username = "uname";
		String pwd = "pwd";
		//UserInfoDao userInfoDao = new UserInfoDao(username, pwd, username);

		// mock
		//when(userInfoRepository.save(userInfoDaoArgumentCaptor.capture())).thenReturn(userInfoDao);

		// run test
		loginService.createUser(username, pwd);

		// verify
		//verify(userInfoRepository).save(userInfoDaoArgumentCaptor.getValue());
	}
}
