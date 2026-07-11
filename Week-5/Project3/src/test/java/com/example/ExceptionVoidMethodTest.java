package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
public class ExceptionVoidMethodTest {
    @Test
    void testVoidMethodException() {
        NotificationService mockService =
                mock(NotificationService.class);
        doThrow(new RuntimeException("Notification Failed"))
                .when(mockService)
                .sendNotification(anyString());
        RuntimeException exception =
                assertThrows(RuntimeException.class,
                        () -> mockService.sendNotification("Hello"));
        assertThrows(RuntimeException.class,
                () -> {
                    throw exception;
                });
        verify(mockService)
                .sendNotification("Hello");
    }
}