package com.example.vehiculeparc.Repositories;

import com.example.vehiculeparc.entities.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface serviceRepository extends JpaRepository<Services,Long> {
}
