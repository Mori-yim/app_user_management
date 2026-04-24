# app_user_management
#  Gestion d'utilisateurs - Application MVC avec Map 

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://adoptium.net/)
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)

>  **Projet pédagogique** : implémentation pure du pattern MVC sans framework, avec migration d’un stockage mémoire (Map) vers une base de données relationnelle (MySQL).  
> Idéal pour comprendre les couches : **Modèle**, **Repository**, **Service**, **Contrôleur**.

---

##  Objectif

Développer une application de gestion d’utilisateurs :

1. **Version 1** : stockage dans une `Map<Long, User>` (pas de base de données).
2. **Version 2** : migration vers **MySQL** sans modifier les interfaces métier.

---

## 🧠 Architecture MVC expliquée simplement

| Couche | Rôle | Exemple dans le projet |
|--------|------|------------------------|
| **Modèle** | Représente les données métier | `User.java` (id, name, email) |
| **Repository** | Accès aux données (CRUD) | `UserRepository` + implémentations (Map / MySQL) |
| **Service** | Logique métier | `UserService` (validation, orchestration) |
| **Contrôleur** | Interface avec l’utilisateur (console ici) | `UserController` |

>  Avantage : on peut changer le **mode de stockage** sans toucher au Service ni au Contrôleur.

---

## 🔧 Prérequis

- **Java 17** ou supérieur
- **Maven 3.8+**
- **MySQL 8** (uniquement pour la version 2)
- Git (optionnel, pour cloner)

---

##  Base de données (version MySQL)

1. Créez une base de données :

```sql
CREATE DATABASE userdb CHARACTER SET utf8mb4;