package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.Optional;
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    UserRepository repository;
    @InjectMocks
    UserService service;
    @Test
    void testGetUser() {
        User user = new User("Aayushi");
        when(repository.findById(1L))
                .thenReturn(Optional.of(user));
        User result = service.getUser(1L);
        assertEquals("Aayushi", result.getName());
        verify(repository).findById(1L);
    }
    @Test
    void testSaveUser() {
        User user = new User("Rahul");
        when(repository.save(user))
                .thenReturn(user);
        User saved = service.saveUser(user);
        assertEquals("Rahul", saved.getName());
        verify(repository).save(user);
    }
}