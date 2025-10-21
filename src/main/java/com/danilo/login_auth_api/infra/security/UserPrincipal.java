package com.danilo.login_auth_api.infra.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.danilo.login_auth_api.domain.entities.User;

public class UserPrincipal implements UserDetails {

    private final User user;

    public UserPrincipal(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return this.user.getUserAuth().getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUserAuth().getEmail();
    }

    public User getUser() {
        return this.user;
    }

}