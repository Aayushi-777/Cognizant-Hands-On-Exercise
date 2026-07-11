package com.example.mockito;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;
public class UserControllerTest {
    @Test
    void testGetUser() {
        UserService service = Mockito.mock(UserService.class);
        UserController controller = new UserController();
        controller.service = service;
        User user = new User(1L, "John");
        Mockito.when(service.getUserById(1L)).thenReturn(user);
        ResponseEntity<User> response = controller.getUser(1L);
        assertEquals("John", response.getBody().getName());
    }
}