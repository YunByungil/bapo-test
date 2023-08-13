package com.example.bapo.dto;

import com.example.bapo.domain.entity.Member;
import lombok.Getter;

@Getter
public class SignUpRequest {

    private String email;
    private String password;

    public SignUpRequest(final String email, final String password) {
        this.email = email;
        this.password = password;
    }

    public Member toMember() {
        return new Member(0L, email, password);
    }
}
