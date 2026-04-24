package repository;

import com.example.model.User;
import java.util.List;
import java.util.Optional;

// Interface = contrat. Toute implémentation DOIT avoir ces méthodes.
public interface UserRepository {
    void save(User user);                 // ajouter ou mettre à jour
    Optional<User> findById(Long id);    // chercher un utilisateur (peut ne pas exister)
    List<User> findAll();                // lister tous les utilisateurs
    void delete(Long id);                // supprimer par id
}