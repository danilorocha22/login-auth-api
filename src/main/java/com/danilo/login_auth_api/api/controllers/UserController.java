package com.danilo.login_auth_api.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping
    public ResponseEntity<?> user() {
        return ResponseEntity.ok("Sucesso!");
    }

}