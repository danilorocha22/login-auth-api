package com.danilo.login_auth_api.domain.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danilo.login_auth_api.domain.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);

}