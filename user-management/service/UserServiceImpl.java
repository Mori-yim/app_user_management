package service;

import model.User;
import repository.UserRepository;
import repository.UserRepositoryImpl;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    // Injection par constructeur : on donne le repository au service
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        // Ici, on pourrait vérifier que email n'existe pas déjà (exercice)
        userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        // Si absent, on lève une exception explicite
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec id : " + id));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }
}