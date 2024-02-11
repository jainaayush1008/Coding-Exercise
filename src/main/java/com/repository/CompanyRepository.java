package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Company;

//CompanyRepository.java
public interface CompanyRepository extends JpaRepository<Company, Long> {
 List<Company> findByNumberOfEmployeesBetween(int minEmployees, int maxEmployees);
}


