package com.cognizant.spring_learn.controller;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.spring_learn.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;
@RestController
public class CountryController {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);
    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("in", Country.class);
        context.close();
        LOGGER.debug("Country : {}", country);
        LOGGER.info("END");
        return country;
    }
    @SuppressWarnings("unchecked")
    @RequestMapping("/countries")
    public ArrayList<Country> getAllCountries() {
        LOGGER.info("START");
        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml")) {
            ArrayList<Country> countries =
                    (ArrayList<Country>) context.getBean("countryList");
            LOGGER.debug("Countries : {}", countries);
            LOGGER.info("END");
            return countries;
        }
    }
    @Autowired
    private CountryService countryService;
    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException{
        LOGGER.info("START");
        Country country = countryService.getCountry(code);
        LOGGER.debug("{}", country);
        LOGGER.info("END");
        return country;
    }
}