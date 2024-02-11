package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Company;

//CompanyRepository.java
public interface CompanyRepository1 extends JpaRepository<Company, Long> {
 @Query(value = "SELECT c.* FROM Company c JOIN (SELECT industry, MAX(revenue) as maxRevenue FROM Company GROUP BY industry) c2 ON c.industry = c2.industry AND c.revenue = c2.maxRevenue", nativeQuery = true)
 List<Company> findCompaniesWithMaxRevenueInIndustry();
}

