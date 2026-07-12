package com.example;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class VoidMethodTest {
    @Test
    void testVoidMethod() {
        NotificationService mockService =
                mock(NotificationService.class);
        doNothing().when(mockService)
                   .sendNotification(anyString());
        mockService.sendNotification("Hello");
        verify(mockService)
                .sendNotification("Hello");
    }
}