// package com.cognizant.countrymanagement.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.cognizant.countrymanagement.model.Country;
// import com.cognizant.countrymanagement.repository.CountryRepository;

// @Service
// public class CountryService {

//     @Autowired
//     private CountryRepository countryRepository;

//     public List<Country> getAllCountries() {
//         return countryRepository.findAll();
//     }
// }


package com.cognizant.countrymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.countrymanagement.model.Country;
import com.cognizant.countrymanagement.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Find country by code
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    // Add new country
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }
}