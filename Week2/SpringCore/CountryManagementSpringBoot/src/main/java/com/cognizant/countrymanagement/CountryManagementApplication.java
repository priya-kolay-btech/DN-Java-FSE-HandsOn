// package com.cognizant.countrymanagement;

// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class CountryManagementApplication {








package com.cognizant.countrymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.countrymanagement.model.Country;
import com.cognizant.countrymanagement.service.CountryService;

@SpringBootApplication
public class CountryManagementApplication {








    // public static void main(String[] args) {

    //     ApplicationContext context =
    //             SpringApplication.run(CountryManagementApplication.class, args);

    //     CountryService countryService =
    //             context.getBean(CountryService.class);

    //     List<Country> countries = countryService.getAllCountries();

    //     System.out.println("Countries:");
    //     countries.forEach(System.out::println);
    // }

public static void main(String[] args) {

    ApplicationContext context =
            SpringApplication.run(CountryManagementApplication.class, args);

    CountryService countryService =
            context.getBean(CountryService.class);

    Country country = countryService.getCountry("IN");
    System.out.println(country);

    Country newCountry = new Country();
    newCountry.setCode("NP");
    newCountry.setName("Nepal");

    countryService.addCountry(newCountry);

    System.out.println(countryService.getCountry("NP"));
}
}