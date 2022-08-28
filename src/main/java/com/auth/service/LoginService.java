package com.auth.service;

import com.auth.dao.UserInfoRepository;
import com.auth.dao.entity.UserInfoDao;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
@AllArgsConstructor
public class LoginService {
    private UserInfoRepository userInfoRepository;

    public void createUser(String username, String pass) {
        UserInfoDao a = userInfoRepository.save(
                new UserInfoDao(username, encrypt(pass), username)
        );
    }

    private String encrypt(String val) {
        int strength = 10; // work factor of bcrypt
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(strength, new SecureRandom());
        return bCryptPasswordEncoder.encode(val);
    }
}
