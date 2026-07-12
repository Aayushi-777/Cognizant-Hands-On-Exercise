package com.example.junitbasic;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setup() {
        calculator = new Calculator();
        System.out.println("Before Each Test");

    }
    @AfterEach
    void teardown() {
        System.out.println("After Each Test");

    }
    @Test
    void testAddition() {
        int a = 10;
        int b = 20;
        int result = calculator.add(a, b);
        assertEquals(30, result);

    }
    @Test
    void testSubtraction() {
        int result = calculator.subtract(20, 10);
        assertEquals(10, result);

    }
    @Test
    void testMultiplication() {
        int result = calculator.multiply(10, 5);
        assertEquals(50, result);

    }
    @Test
    void testDivision() {
        int result = calculator.divide(20, 5);
        assertEquals(4, result);

    }
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0));
    }
}