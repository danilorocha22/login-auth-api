package com.danilo.login_auth_api.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danilo.login_auth_api.api.input.LoginRequest;
import com.danilo.login_auth_api.api.output.LoginResponse;
import com.danilo.login_auth_api.domain.entities.User;
import com.danilo.login_auth_api.domain.repositories.UserRepository;
import com.danilo.login_auth_api.infra.security.service.TokenService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        var userOpt = userRepository.findByEmail(loginRequest.email());

        if (userOpt.isEmpty() ||
                !passwordEncoder.matches(loginRequest.password(), userOpt.get().getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Credenciais inválidas.");
        }

        var user = userOpt.get();
        var token = tokenService.generateToken(user);
        return ResponseEntity.ok(new LoginResponse(user.getEmail(), token));
    }
}
