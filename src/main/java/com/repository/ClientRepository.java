package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Client;
import com.example.demo.User;

//ClientRepository.java
public interface ClientRepository extends JpaRepository<Client, Long> {
 List<Client> findByUser(User user);
 List<Client> findByCompany_NameContaining(String companyName);
}

