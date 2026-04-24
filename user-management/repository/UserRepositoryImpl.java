package com.example.repository.impl;

import model.User;
import repository.UserRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

// Implémentation concrète avec Map
public class UserRepositoryImpl implements UserRepository {
    // La Map : clé = id (Long) et valeur = User
    private final Map<Long, User> storage = new HashMap<>();
    // Générateur automatique d'id (thread-safe ici)
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public void save(User user) {
        // Si l'utilisateur n'a pas d'id, on lui en donne un nouveau
        if (user.getId() == null) {
            user.setId(idGenerator.getAndIncrement());
        }
        // put insère ou remplace
        storage.put(user.getId(), user);
    }

    @Override
    public Optional<User> findById(Long id) {
        // ofNullable : si la valeur est null, ça donne Optional.empty()
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<User> findAll() {
        // Retourne une nouvelle ArrayList contenant tous les users
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(Long id) {
        storage.remove(id);
    }
}