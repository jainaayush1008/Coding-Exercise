package com.example.demo;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//ClientUsers.java
@Entity
public class ClientUsers {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @ManyToOne
 @JoinColumn(name = "client_id")
 private Client client;

 @ManyToOne
 @JoinColumn(name = "user_id")
 private User user;

 private LocalDateTime createdAt;

 private LocalDateTime updatedAt;

 private LocalDateTime deletedAt;

 private boolean active;

 // Getters and setters
}

