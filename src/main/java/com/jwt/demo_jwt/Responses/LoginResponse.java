package com.jwt.demo_jwt.Responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String token;

    private long expiresIn;

    public LoginResponse(String token, long expiresIn) {
        System.out.println(token + "||||||||||||||||| " + expiresIn);
        this.token = token;
        this.expiresIn = expiresIn;
    }
}
