package com.example.tfappapi;

import org.springframework.stereotype.Service;

@Service
public class DetailsService {

    private final DetailsRepository detailsRepository;

    public DetailsService(DetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }

    public DetailsEntity getDetails() {
        return detailsRepository.findByName("admin");
    }

    public void addDetails(DetailsEntity detailsEntity) {
        detailsRepository.save(detailsEntity);
    }
}
