package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.Accident;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccidentService {
    Accident saveAccident (Accident accident) ;
    Accident updateAccident (Accident accident) ;
    void deleteAccidentById (Long Id);
    void deleteAllAccidents () ;
    Accident getAccidentById (Long Id);
    List <Accident> getAllAccidents ();

}
