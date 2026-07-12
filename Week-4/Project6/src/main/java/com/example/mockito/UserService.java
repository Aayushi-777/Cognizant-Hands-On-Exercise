package com.example.mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    UserRepository repository;
    public User getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }
}