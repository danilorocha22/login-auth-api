package com.danilo.login_auth_api.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class UserAuth {

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
}