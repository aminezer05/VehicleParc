package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.Controletechnique;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface ControletechniqueService {
    Controletechnique saveControletechnique (Controletechnique Controletechnique) ;
    Controletechnique updateControletechnique (Controletechnique controletechnique) ;
    void deleteControletechniqueById (Long Id);
    void deleteAllControletechniques () ;
    Controletechnique getControletechniqueById (Long Id);
    List<Controletechnique> getAllControletechniques ();
}
