package com.example.tfappapi;

import jakarta.persistence.*;

@Entity
@Table(name = "details")
public class DetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    String name;
    int age;
    String email;

    public DetailsEntity(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public DetailsEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
