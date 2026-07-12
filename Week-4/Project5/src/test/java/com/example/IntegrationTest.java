package com.example;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class IntegrationTest {
    @Autowired
    CalculatorService calculatorService;
    @Test
    void contextLoads() {
        assertEquals(30,
                calculatorService.add(10,20));
    }
}