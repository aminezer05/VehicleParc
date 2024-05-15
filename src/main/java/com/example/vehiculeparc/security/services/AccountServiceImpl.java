package com.example.vehiculeparc.security.services;

import com.example.vehiculeparc.Repositories.UserRepository;
import com.example.vehiculeparc.security.entities.Rolee;
import com.example.vehiculeparc.security.entities.Utilisateur;
import com.example.vehiculeparc.security.repositories.RoleeRepository;
import com.example.vehiculeparc.security.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    RoleeRepository roleeRepository;
    @Override
    public Utilisateur createUtilisateur(String username, String password, String email, String confirmpassword) {
        /*
        Utilisateur utilisateur1 = new Utilisateur();
        utilisateur1.setUserId(UUID.randomUUID().toString());
        utilisateur1.setUsername(username);
        utilisateur1.setPassword(bCryptPasswordEncoder.encode(password));
        utilisateur1.setEmail(email);
        utilisateurRepository.save(utilisateur1);*/

        Utilisateur utilisateur1= utilisateurRepository.findByUsername(username);
        if (utilisateur1 != null) throw new RuntimeException("User already exists");
        if (!password.equals(confirmpassword)) throw new RuntimeException("Passwords do not match"); {};
                utilisateur1 = Utilisateur.builder()
                .userId(UUID.randomUUID().toString())
                .username(username)
                .password(bCryptPasswordEncoder.encode(password))
                .email(email)
                .build();
        return utilisateurRepository.save(utilisateur1);

    }

    @Override
    public Rolee createRole(String newRolee) {
    Rolee role1 = roleeRepository.findByRole(newRolee);
    if (role1 != null) throw new RuntimeException("Role already exists");
            role1 = Rolee.builder()
            .role(newRolee)
            .build();
    return roleeRepository.save(role1);
    }

    @Override
    public void addRoleeToUtilisateur(String username, String newRolee) {

    }

    @Override
    public void removeRoleeFromUtilisateur(String username, String newRolee) {

    }

    @Override
    public Utilisateur loadUtilisateurByUsername(String username) {
        return null;
    }
}
