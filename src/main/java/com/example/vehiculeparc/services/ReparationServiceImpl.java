package com.example.vehiculeparc.services;

import com.example.vehiculeparc.Repositories.ReparationRepository;
import com.example.vehiculeparc.entities.Reparation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReparationServiceImpl implements ReparationService {

    private final ReparationRepository reparationRepository;

    @Autowired
    public ReparationServiceImpl(ReparationRepository reparationRepository) {
        this.reparationRepository = reparationRepository;
    }

    @Override
    public Reparation saveReparation(Reparation reparation) {
        return reparationRepository.save(reparation);
    }

    @Override
    public Reparation updateReparation(Reparation reparation) {
        // Implémentez la logique de mise à jour de la réparation ici
        return null;
    }



    @Override
    public void deleteAllReparations() {
        reparationRepository.deleteAll();
    }



    @Override
    public List<Reparation> getAllReparations() {
        return reparationRepository.findAll();
    }


}
