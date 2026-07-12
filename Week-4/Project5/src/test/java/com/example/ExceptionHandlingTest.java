package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ExceptionHandlingTest {
    @Test
    void testException() {
        Exception exception =
                assertThrows(RuntimeException.class,
                        () -> {
                            throw new RuntimeException(
                                    "Sample Exception");
                        });
        assertEquals("Sample Exception",
                exception.getMessage());
    }
}