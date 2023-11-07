package com.example.tfappapi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TfAppApiApplication implements ApplicationRunner {

    static DetailsService detailsService;

    final DetailsRepository detailsRepository;

    public TfAppApiApplication(DetailsService detailsService, DetailsRepository detailsRepository) {
        TfAppApiApplication.detailsService = detailsService;
        this.detailsRepository = detailsRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TfAppApiApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        DetailsEntity detailsEntity = new DetailsEntity();
        if (detailsRepository.count() == 0) {
            detailsEntity.setName("admin");
            detailsEntity.setAge(23);
            detailsEntity.setEmail("admin@tf.com");
            detailsService.addDetails(detailsEntity);
        }
    }
}
