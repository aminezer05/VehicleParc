package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.Contrat;

import java.util.List;

public interface ContratService {
    Contrat saveContrat(Contrat contrat);

    Contrat updateContrat(Contrat contrat);

    void deleteContratById(Long id);

    void deleteAllContrats();

    Contrat getContratById(Long id);

    List<Contrat> getAllContrats();
}
