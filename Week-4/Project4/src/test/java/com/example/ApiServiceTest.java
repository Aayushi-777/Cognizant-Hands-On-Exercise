package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class ApiServiceTest {
    @Test
    void testRestClientMock() {
        RestClient mockClient = mock(RestClient.class);
        when(mockClient.getData())
                .thenReturn("REST Response");
        ApiService service = new ApiService(mockClient);
        String result = service.fetchData();
        assertEquals("REST Response", result);
        verify(mockClient).getData();
    }
}