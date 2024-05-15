package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.Maintenance;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface MaintenanceService {
    Maintenance saveMaintenance (Maintenance maintenance) ;
    Maintenance updateMaintenance (Maintenance maintenance) ;
    void deleteMaintenanceById (Long Id);
    void deleteAllMaintenances () ;
    Maintenance getMaintenanceById (Long Id);
    List<Maintenance> getAllMaintenances ();
    List<Maintenance> getMaintenancesByVehicleId(Long vehicleId);
}
