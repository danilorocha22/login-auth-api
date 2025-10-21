package com.danilo.login_auth_api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danilo.login_auth_api.domain.entities.UserAuth;

public interface UserAuthRepository extends JpaRepository<UserAuth, String> {
}