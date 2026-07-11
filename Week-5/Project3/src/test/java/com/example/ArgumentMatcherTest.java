package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
public class ArgumentMatcherTest {
    @Test
    void testArgumentMatcher() {
        UserRepository mockRepository = mock(UserRepository.class);
        when(mockRepository.findUserById(anyInt()))
                .thenReturn("Aayushi");
        UserService service = new UserService(mockRepository);
        String result = service.getUser(101);
        assertEquals("Aayushi", result);
        verify(mockRepository).findUserById(anyInt());
    }
}