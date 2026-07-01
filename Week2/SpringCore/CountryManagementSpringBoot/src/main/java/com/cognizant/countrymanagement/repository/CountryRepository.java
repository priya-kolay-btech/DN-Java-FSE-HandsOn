package com.cognizant.countrymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.countrymanagement.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}