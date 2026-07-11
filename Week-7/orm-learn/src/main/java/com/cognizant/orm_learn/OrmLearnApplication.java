package com.cognizant.orm_learn;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
@SpringBootApplication
public class OrmLearnApplication {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;
    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        testGetAllCountries();
        testGetCountry();
		testAddCountry();
		testGetAllCountries();
		testUpdateCountry();
		testDeleteCountry();
		testGetAllCountries();
		testSearchCountry();
    }
    private static void testGetAllCountries() {
        LOGGER.info("ALL COUNTRIES");
        List<Country> countries = countryService.getAllCountries();
        countries.forEach(System.out::println);
    }
    private static void testGetCountry() {
        LOGGER.info("FIND COUNTRY");
        Country country = countryService.getCountry("IN");
        System.out.println(country);
    }
	private static void testAddCountry() {
    	LOGGER.info("ADD COUNTRY");
    	Country country = new Country("BR", "Brazil");
    	countryService.addCountry(country);
    	System.out.println("Country Added Successfully");
	}
	private static void testUpdateCountry() {
    	LOGGER.info("UPDATE COUNTRY");
		Country country = new Country("BR", "Brazil Updated");
		countryService.updateCountry(country);
		System.out.println("Country Updated Successfully");
	}
	private static void testDeleteCountry() {
		LOGGER.info("DELETE COUNTRY");
		countryService.deleteCountry("BR");
		System.out.println("Country Deleted Successfully");
	}
	private static void testSearchCountry() {
    	LOGGER.info("SEARCH COUNTRY");
		List<Country> countries = countryService.searchCountry("Ind");
		countries.forEach(System.out::println);
}
}