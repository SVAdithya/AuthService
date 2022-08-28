package com.auth.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "user_info")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserInfoDao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "uname")
    private String uname;

    @Column(name= "pass")
    private String pass;

    @Column(name = "name")
    private String name;

    public UserInfoDao(String uname, String pass, String name) {
        this.uname = uname;
        this.pass = pass;
        this.name = name;
    }
}
