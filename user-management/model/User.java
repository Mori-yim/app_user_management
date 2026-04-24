package model;

// Un modèle représente une entité métier (ici un utilisateur)
public class User {
    // Attributs privés : on cache les détails
    private Long id;
    private String name;
    private String email;

    // Constructeur sans id (on peut générer l'id automatiquement)
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Constructeur complet (utile pour recréer depuis la Map)
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters et Setters : permettent de lire/modifier les attributs en toute sécurité
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // toString : pour afficher proprement un utilisateur
    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}