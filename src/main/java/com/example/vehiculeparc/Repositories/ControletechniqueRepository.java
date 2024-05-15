package com.example.vehiculeparc.Repositories;

import com.example.vehiculeparc.entities.Controletechnique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ControletechniqueRepository extends JpaRepository<Controletechnique,Long> {
}
