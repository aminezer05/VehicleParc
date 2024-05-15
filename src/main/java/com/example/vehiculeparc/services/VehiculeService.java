package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.User;
import com.example.vehiculeparc.entities.Vehicule;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface VehiculeService {
    Vehicule saveVehicule(Vehicule vehicule);

    Vehicule updateVehicule(Vehicule vehicule);

    void deleteVehiculeById(Long id);

    void deleteAllVehicules();

    Optional<Vehicule> getVehiculeById(Long id);

    List<Vehicule> getVehicules();

    Page<Vehicule> getAllVehiclesByPage(int page , int size);

    List<Vehicule> getAllVehicules();
}
