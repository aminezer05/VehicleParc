package com.example.vehiculeparc.services;

import com.example.vehiculeparc.Repositories.VehiculeRepository;
import com.example.vehiculeparc.entities.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class VehiculeServiceImpl implements VehiculeService {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule saveVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehiculeById(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public void deleteAllVehicules() {
        vehiculeRepository.deleteAll();
    }

    @Override
    public Optional<Vehicule> getVehiculeById(Long id) {
        return vehiculeRepository.findById(id);
    }

    @Override
    public List<Vehicule> getVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Page<Vehicule> getAllVehiclesByPage(int page, int size) {
        return vehiculeRepository.findAll(PageRequest.of(page, size));
    }
    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }
}
