package com.example.vehiculeparc.services;

import com.example.vehiculeparc.Repositories.AccidentRepository;
import com.example.vehiculeparc.entities.Accident;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccidentServiceImpl implements AccidentService{
    private AccidentRepository accidentRepository;
    @Override
    public Accident saveAccident(Accident accident) {
        return accidentRepository.save(accident);
    }

    @Override
    public Accident updateAccident(Accident accident) {
        return accidentRepository.save(accident);
    }

    @Override
    public void deleteAccidentById(Long Id) {
     accidentRepository.deleteById(Id);
    }

    @Override
    public void deleteAllAccidents() {

    }

    @Override
    public Accident getAccidentById(Long Id) {
        return accidentRepository.findById(Id).get();
    }

    @Override
    public List<Accident> getAllAccidents() {
        return accidentRepository.findAll();
    }
}
