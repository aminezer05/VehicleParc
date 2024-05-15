package com.example.vehiculeparc.Repositories;

import com.example.vehiculeparc.entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance,Long> {
    List<Maintenance> findByVehiculeId(Long vehiculeId);

}
