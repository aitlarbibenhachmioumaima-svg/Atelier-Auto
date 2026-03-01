#  🚗 Gestion d’un Atelier Auto :
## AtelierAuto :
Application de gestion d’un atelier de réparation automobile permettant de gérer les clients, les véhicules et les réparations avec suivi statistique.

---


## 📁 Table de matières

- [🗂 Contexte](#-contexte)
- [❓ Problématique](#-problématique)
- [🎯 Objectif](#-objectif)
- [📊 Diagrammes](#-diagrammes)
- [🗃 Tables de Données](#-tables-de-données)
- [✨ Fonctionnalités Principales](#-fonctionnalités-principales)
- [🔍 Requêtes SQL](#-requêtes-sql)
- [🏛 Architecture](#-architecture)
- [🛠 Technologies Utilisées](#-technologies-utilisées)
- [🎥 Démo Vidéo](#-démo-video)

  ---
  ## 🗂 Contexte
  
Dans un atelier automobile, la gestion manuelle des clients, véhicules et réparations peut entraîner :

- Perte d’informations

- Difficulté de suivi des interventions

- Mauvaise organisation

- Absence de statistiques financières

Une application informatique permet d’optimiser la gestion et d’améliorer la productivité.


  ---
  ## ❓ Problématique
  
  Les ateliers automobiles rencontrent plusieurs problèmes :

- Difficulté à suivre les réparations effectuées

- Mauvaise organisation des données clients

- Manque de visibilité sur les coûts mensuels

- Recherche lente des informations

  ---
## 🎯 Objectif

Développer une application permettant :

- Une gestion complète des clients

- Un suivi précis des véhicules

- Une gestion efficace des réparations

- Un calcul automatique des coûts mensuels

- Une visualisation graphique des statistiques

  ---
## 📊 Diagrammes

##  Diagramme use case:
<img width="1474" height="933" alt="UseCase" src="https://github.com/user-attachments/assets/bf691c91-916c-4494-9c23-9d609ef68ec5" />

---
##  Diagramme de classe :
<img width="1052" height="334" alt="ClassDiagramme" src="https://github.com/user-attachments/assets/c2ffc336-1ee2-4a5c-b66c-08bd7b8ea727" />

---
## 🗃 Tables de Données:

Client (id, nom, telephone)

Vehicule (id, immatriculation, marque, modele)

Reparation (id, type, date, cout)

---
## ✨ Fonctionnalités Principales

### 1️⃣ Gestion des Clients 

- Ajouter un client

- Modifier un client

- Supprimer un client

- Afficher la liste des clients
  
### 2️⃣ Gestion des Véhicules

- Ajouter un véhicule

- Modifier un véhicule

- Supprimer un véhicule

- Filtrer les véhicules par marque

- Afficher la liste des véhicules

 ### 3️⃣ Gestion des Réparations

- Enregistrer une réparation

- Modifier une réparation

- Supprimer une réparation

- Filtrer les réparations par type

  ### 4️⃣ Statistiques

 - Calculer le coût mensuel des réparations

- Afficher un graphique des statistiques

  ---
##  🔍 Requêtes sql 


### Tables

```sql
CREATE TABLE Client (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    telephone VARCHAR(20)
);

CREATE TABLE Vehicule (
    id INT AUTO_INCREMENT PRIMARY KEY,
    immatriculation VARCHAR(50) UNIQUE NOT NULL,
    marque VARCHAR(50),
    modele VARCHAR(50),
    client_id INT,
    FOREIGN KEY (client_id) REFERENCES Client(id)
);

CREATE TABLE Reparation (
    id INT AUTO_INCREMENT PRIMARY KEY,
    vehicule_id INT,
    date DATE,
    type VARCHAR(100),
    cout DOUBLE,
    FOREIGN KEY (vehicule_id) REFERENCES Vehicule(id)
);

CREATE TABLE Utilisateur (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255)
);
```

## 🏛  Architecture


![Architecture](https://github.com/user-attachments/assets/b9f7b1c3-9d13-452a-aae7-692ad75af9cf)

---
## 🛠 Technologies Utilisées


- **Framework d'interface graphique :** Java Swing
- **Base de données :** MySQL
- **Accès aux données :** JDBC
- **Outils de développement :**
NetBeans (IDE Java)
StarUml (Outil de diagramme)
- **Gestion de base de données :** phpMyAdmin


---

## 🎥 Démo video 

