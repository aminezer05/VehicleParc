package com.example.vehiculeparc.services;

import com.example.vehiculeparc.entities.Services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.vehiculeparc.Repositories.serviceRepository;


import java.util.List;

@Service
@AllArgsConstructor
public class serviceServiceImpl implements serviceService{
    private serviceRepository serviceRepository;
    @Override
    public Services saveservice(Services service) {
        return serviceRepository.save(service);
    }

    @Override
    public Services updateservice(Services service) {
        return serviceRepository.save(service);
    }

    @Override
    public void deleteserviceById(Long Id) {
        serviceRepository.deleteById(Id);
    }

    @Override
    public void deleteAllservices() {

    }

    @Override
    public Services getserviceById(Long Id) {
        return serviceRepository.findById(Id).get();
    }

    @Override
    public List<Services> getAllservices() {
        return serviceRepository.findAll();
    }
}
