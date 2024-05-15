package com.example.vehiculeparc.Repositories;


import com.example.vehiculeparc.entities.Reparation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReparationRepository extends JpaRepository<Reparation, Integer> {
    // Vous pouvez ajouter des méthodes de requête personnalisées ici si nécessaire
}
