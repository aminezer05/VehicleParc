package com.example.vehiculeparc.services;

import com.example.vehiculeparc.Repositories.ContratRepository;
import com.example.vehiculeparc.entities.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratServiceImpl implements ContratService {
    private final ContratRepository contratRepository;

    @Autowired
    public ContratServiceImpl(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public Contrat saveContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContratById(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public void deleteAllContrats() {
        contratRepository.deleteAll();
    }

    @Override
    public Contrat getContratById(Long id) {
        Optional<Contrat> contratOptional = contratRepository.findById(id);
        return contratOptional.orElse(null);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }
}
