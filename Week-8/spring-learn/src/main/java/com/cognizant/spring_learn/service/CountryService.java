package com.cognizant.spring_learn.service;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;
@Service
public class CountryService {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryService.class);
    @SuppressWarnings("unchecked")
    public Country getCountry(String code) throws CountryNotFoundException{
        LOGGER.info("START");
        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml")) {
            ArrayList<Country> countries =
                    (ArrayList<Country>) context.getBean("countryList");
            for (Country country : countries) {
                if (country.getCode().equalsIgnoreCase(code)) {
                    LOGGER.debug("Country Found : {}", country);
                    LOGGER.info("END");
                    return country;
                }
            }
        }
        LOGGER.info("END");
        throw new CountryNotFoundException();
    }
}