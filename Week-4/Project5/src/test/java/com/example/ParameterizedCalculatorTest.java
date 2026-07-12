package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
public class ParameterizedCalculatorTest {
    CalculatorService calculator =
            new CalculatorService();
    @ParameterizedTest
    @CsvSource({
            "2,3,5",
            "10,20,30",
            "15,15,30"
    })
    void testAddition(
            int a,
            int b,
            int result) {
        assertEquals(result,
                calculator.add(a,b));
    }
}