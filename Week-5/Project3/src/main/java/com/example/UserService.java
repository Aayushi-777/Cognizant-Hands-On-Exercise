package com.example;
public class UserService {
    private UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public String getUser(int id) {
        return repository.findUserById(id);
    }

}