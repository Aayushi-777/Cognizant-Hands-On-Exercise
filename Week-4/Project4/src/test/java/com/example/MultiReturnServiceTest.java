package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class MultiReturnServiceTest {
    @Test
    void testMultipleReturnValues() {
        Repository mockRepository = mock(Repository.class);
        when(mockRepository.getData())
                .thenReturn("One")
                .thenReturn("Two")
                .thenReturn("Three");
        Service service = new Service(mockRepository);
        assertEquals("Processed One", service.processData());
        assertEquals("Processed Two", service.processData());
        assertEquals("Processed Three", service.processData());
        verify(mockRepository, times(3)).getData();
    }
}