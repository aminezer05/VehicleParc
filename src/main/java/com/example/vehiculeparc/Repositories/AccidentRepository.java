package com.example.vehiculeparc.Repositories;

import com.example.vehiculeparc.entities.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccidentRepository extends JpaRepository<Accident,Long> {
}
