//package com.example;

import controller.UserController;
import repository.impl.UserRepositoryImpl;
import service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // Assemblage manuel des dépendances (ce que Spring fait automatiquement)
        var userRepository = new UserRepositoryImpl();
        var userService = new UserServiceImpl(userRepository);
        var controller = new UserController(userService);

        // Test
        controller.addUser("Alice", "alice@mail.com");
        controller.addUser("Bob", "bob@mail.com");
        controller.showAllUsers();
        controller.showUser(1L);
        controller.deleteUser(1L);
        controller.showAllUsers();
    }
}