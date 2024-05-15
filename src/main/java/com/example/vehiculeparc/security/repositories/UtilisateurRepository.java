package com.example.vehiculeparc.security.repositories;

import com.example.vehiculeparc.security.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {
    Utilisateur findByUsername(String username);
}
