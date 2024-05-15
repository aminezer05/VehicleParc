package com.example.vehiculeparc.services;

import com.example.vehiculeparc.Repositories.ControletechniqueRepository;
import com.example.vehiculeparc.entities.Controletechnique;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@AllArgsConstructor
public class ControletechniqueServiceImpl implements ControletechniqueService {
    private ControletechniqueRepository controletechniqueRepository;
    @Override
    public Controletechnique saveControletechnique(Controletechnique Controletechnique) {
        return controletechniqueRepository.save(Controletechnique);
    }

    @Override
    public Controletechnique updateControletechnique(Controletechnique controletechnique) {
        return controletechniqueRepository.save(controletechnique);
    }

    @Override
    public void deleteControletechniqueById(Long Id) {
        controletechniqueRepository.deleteById(Id);
    }

    @Override
    public void deleteAllControletechniques() {

    }

    @Override
    public Controletechnique getControletechniqueById(Long Id) {
        return controletechniqueRepository.findById(Id).get();
    }

    @Override
    public List<Controletechnique> getAllControletechniques() {
        return controletechniqueRepository.findAll();
    }
}
