package com.example;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    UserRepository repository;
    @Test
    void testFindByName() {
        repository.save(new User("Aayushi"));
        List<User> users =
                repository.findByName("Aayushi");
        assertEquals(1, users.size());
        assertEquals("Aayushi",
                users.get(0).getName());
    }
}