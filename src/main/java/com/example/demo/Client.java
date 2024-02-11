package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Client.java
@Entity
public class Client {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;

 @ManyToOne
 @JoinColumn(name = "user_id")
 private User user;

 @ManyToOne
 @JoinColumn(name = "company_id")
 private Company company;

 @Column(unique = true)
 @Email
 private String email;

 @Pattern(regexp = "\\d+")
 private String phone;

 // Getters and setters
}
