package com.example;

/**
 * Created by Raghu on 08-Mar-16.
 */
public class Login {

    private long UserId;
    private String password;
    int accountNumber = 10_1222_2323;


    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }



    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
