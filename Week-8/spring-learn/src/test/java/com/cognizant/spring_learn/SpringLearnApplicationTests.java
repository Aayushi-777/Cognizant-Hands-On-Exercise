package com.cognizant.spring_learn;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import com.cognizant.spring_learn.controller.CountryController;
@SpringBootTest
@AutoConfigureMockMvc
class SpringLearnApplicationTests {
    @Autowired
    private CountryController countryController;
    @Autowired
    private MockMvc mvc;
    @Test
    void contextLoads() {
        assertNotNull(countryController);
    }
    @Test
    void testGetCountry() throws Exception {
        mvc.perform(get("/country/in"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.code").value("IN"))
                .andExpect(jsonPath("$.name").value("India"));
    }
	@Test
	void testGetAllCountries() throws Exception {
    	mvc.perform(get("/countries"))
            	.andExpect(status().isOk())
            	.andExpect(jsonPath("$[0].code").value("IN"))
            	.andExpect(jsonPath("$[0].name").value("India"));

	}
	@Test
	void testCountryNotFound() throws Exception {
    	mvc.perform(get("/country/az"))
            	.andExpect(status().isNotFound());
	}
}