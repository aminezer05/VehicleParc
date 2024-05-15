package com.example.vehiculeparc.security.services;

import com.example.vehiculeparc.security.entities.Rolee;
import com.example.vehiculeparc.security.entities.Utilisateur;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    Utilisateur createUtilisateur(String username ,String password , String email , String confirmpassword  );
    Rolee createRole(String newRolee);
    void addRoleeToUtilisateur(String username , String newRolee);
    void removeRoleeFromUtilisateur(String username , String newRolee);
    Utilisateur loadUtilisateurByUsername(String username);
}
