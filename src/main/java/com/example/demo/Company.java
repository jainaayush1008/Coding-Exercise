package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
//Company.java
@Entity
public class Company {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @OneToMany(mappedBy = "company")
 private List<User> users;

 @OneToOne(mappedBy = "company")
 private Client client;

 private String name;

 // Other fields and relationships

 // Getters and setters
}
