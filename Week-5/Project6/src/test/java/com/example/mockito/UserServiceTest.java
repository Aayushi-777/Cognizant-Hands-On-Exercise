package com.example.mockito;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
public class UserServiceTest {
    @Test
    void testGetUserById() {
        UserRepository repository = Mockito.mock(UserRepository.class);
        UserService service = new UserService();
        service.repository = repository;
        User user = new User(1L, "John");
        Mockito.when(repository.findById(1L))
                .thenReturn(Optional.of(user));
        User result = service.getUserById(1L);
        assertEquals("John", result.getName());
    }
}