package com.controller;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Client;

//ClientController.java
@RestController
@RequestMapping("/clients")
public class ClientController {

 @Autowired
 private ClientService clientService;

 @PreAuthorize("hasRole('ROLE_ADMIN')")
 @PostMapping
 public ResponseEntity<Client> createClient(@RequestBody Client client) {
     Client createdClient = clientService.createClient(client);
     return ResponseEntity.status(HttpStatus.SC_CREATED).body(createdClient);
 }
}

