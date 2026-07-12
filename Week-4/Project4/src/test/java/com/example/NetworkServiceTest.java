package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class NetworkServiceTest {
    @Test
    void testNetworkConnection() {
        NetworkClient mockClient = mock(NetworkClient.class);
        when(mockClient.connect()).thenReturn("Connected");
        NetworkService service = new NetworkService(mockClient);
        String result = service.establishConnection();
        assertEquals("Connected", result);
        verify(mockClient).connect();
    }
}