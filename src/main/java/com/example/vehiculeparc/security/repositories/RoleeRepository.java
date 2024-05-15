package com.example.vehiculeparc.security.repositories;

import com.example.vehiculeparc.security.entities.Rolee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleeRepository extends JpaRepository<Rolee, String> {
    Rolee findByRole(String role);
}
