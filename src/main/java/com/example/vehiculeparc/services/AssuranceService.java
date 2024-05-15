package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.Assurance;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssuranceService {
    Assurance saveAssurance (Assurance assurance) ;
    Assurance updateAssurance (Assurance assurance) ;
    void deleteAssuranceById (Long Id);
    void deleteAllAssurances () ;
    Assurance getAssuranceById (Long Id);
    List<Assurance> getAllAssurances ();
}
