package com.example.vehiculeparc.services;

import com.example.vehiculeparc.Repositories.AssuranceRepository;
import com.example.vehiculeparc.entities.Assurance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class AssuranceServiceImpl implements AssuranceService{
    private AssuranceRepository assuranceRepository;
    @Override
    public Assurance saveAssurance(Assurance assurance) {
        return assuranceRepository.save(assurance);
    }

    @Override
    public Assurance updateAssurance(Assurance assurance) {
        return assuranceRepository.save(assurance);
    }

    @Override
    public void deleteAssuranceById(Long Id) {
        assuranceRepository.deleteById(Id);
    }

    @Override
    public void deleteAllAssurances() {

    }

    @Override
    public Assurance getAssuranceById(Long Id) {
        return assuranceRepository.findById(Id).get();
    }

    @Override
    public List<Assurance> getAllAssurances() {
        return assuranceRepository.findAll();
    }
}
