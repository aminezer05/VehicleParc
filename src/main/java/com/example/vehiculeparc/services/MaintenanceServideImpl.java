package com.example.vehiculeparc.services;

import com.example.vehiculeparc.Repositories.MaintenanceRepository;
import com.example.vehiculeparc.entities.Maintenance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceServideImpl implements MaintenanceService{
    private MaintenanceRepository maintenanceRepository;
    @Override
    public Maintenance saveMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteMaintenanceById(Long Id) {
        maintenanceRepository.deleteById(Id);
    }

    @Override
    public void deleteAllMaintenances() {

    }

    @Override
    public Maintenance getMaintenanceById(Long Id) {
        return maintenanceRepository.findById(Id).get();
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }
    @Override
    public List<Maintenance> getMaintenancesByVehicleId(Long vehicleId) {
        // Utilisez le repository MaintenanceRepository pour récupérer les maintenances par ID de véhicule
        return maintenanceRepository.findByVehiculeId(vehicleId);
    }
}
