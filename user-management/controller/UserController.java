package controller;

import model.User;
import service.UserService;
import java.util.List;

// Le contrôleur orchestre les actions de l'utilisateur.
// Ici, on va interagir via la console.
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Ajouter un utilisateur
    public void addUser(String name, String email) {
        User user = new User(name, email);
        userService.addUser(user);
        System.out.println("Utilisateur ajouté : " + user);
    }

    // Afficher un utilisateur par id
    public void showUser(Long id) {
        try {
            User user = userService.getUser(id);
            System.out.println("Utilisateur trouvé : " + user);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    // Afficher tous les utilisateurs
    public void showAllUsers() {
        List<User> users = userService.getAllUsers();
        if (users.isEmpty()) {
            System.out.println("Aucun utilisateur.");
        } else {
            users.forEach(System.out::println);
        }
    }

    // Supprimer un utilisateur
    public void deleteUser(Long id) {
        userService.deleteUser(id);
        System.out.println("Utilisateur avec id " + id + " supprimé (s'il existait).");
    }
}