package com.example.vehiculeparc.Repositories;

import com.example.vehiculeparc.entities.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuranceRepository extends JpaRepository<Assurance,Long> {

}
