package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.Services;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface serviceService {
    Services saveservice (Services service) ;
    Services updateservice (Services service) ;
    void deleteserviceById (Long Id);
    void deleteAllservices () ;
    Services getserviceById (Long Id);
    List<Services> getAllservices ();
}
