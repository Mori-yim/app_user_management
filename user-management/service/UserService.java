package service;

import model.User;
import java.util.List;

// Service = couche métier. Ici, on ne fait que rediriger vers repository,
// mais on pourrait ajouter des règles (ex: email unique, validation...)
public interface UserService {
    void addUser(User user);
    User getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}