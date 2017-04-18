package com.example;

import javax.persistence.*;

/**
 * Created by nara1016 on 10-04-2017.
 */
@Entity
@Table(name = "users")
public class RegisterUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long UserId;
    private String password;
    private String name;
    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() { return email;    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getUserId() { return UserId;  }

    public void setUserId(long userId) {      UserId = userId;   }

    public String getPassword() {      return password;    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RegisterUser() {

    }

}
