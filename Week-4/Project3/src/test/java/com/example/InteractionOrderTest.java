package com.example;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import static org.mockito.Mockito.*;
public class InteractionOrderTest {
    @Test
    void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");
        MyService service = new MyService(mockApi);
        service.fetchData();
        service.fetchData();
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi, times(2)).getData();
        verify(mockApi, times(2)).getData();
    }
}