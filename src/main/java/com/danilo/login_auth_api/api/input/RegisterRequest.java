package com.danilo.login_auth_api.api.input;

public record RegisterRequest(String name, String email, String password) {
}