package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.Reparation;

import java.util.List;

public interface ReparationService {

    Reparation saveReparation(Reparation reparation);

    Reparation updateReparation(Reparation reparation);


    void deleteAllReparations();


    List<Reparation> getAllReparations();


}
