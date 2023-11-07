package com.example.tfappapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<DetailsEntity, Long> {
    DetailsEntity findByName(String admin);
}
