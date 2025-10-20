package com.danilo.login_auth_api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danilo.login_auth_api.domain.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}