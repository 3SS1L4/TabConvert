# 📱 TabConvert — Convertisseur avec Onglets (Fragments)

> **LAB 5 — Programmation Mobile : Android avec Java**  
> Application de conversion de **température** et **distance** utilisant **Fragments + TabLayout + ViewPager2**.




---

## 📸 Aperçu

| Température | Distance |
|:---:|:---:|
| Conversion °C ↔ °F | Conversion Km ↔ Miles |

---

## 🛠️ Technologies utilisées

- **Langage** : Java
- **Plateforme** : Android (Min SDK 24+)
- **IDE** : Android Studio
- **UI** : XML Layouts (LinearLayout, EditText, Button, RadioGroup)
- **Navigation** : TabLayout + ViewPager2 + Fragments
- **Design** : Material Components

---

## 📁 Structure du projet

```

tabconvert/
├── app/src/main/
│   ├── java/com/example/tabconvert/
│   │   ├── MainActivity.java
│   │   ├── ViewPagerAdapter.java
│   │   ├── TempFragment.java
│   │   └── DistanceFragment.java
│   ├── res/layout/
│   │   ├── activity_main.xml
│   │   ├── fragment_temp.xml
│   │   └── fragment_distance.xml
│   └── AndroidManifest.xml

````

---

## ✨ Fonctionnalités

- ✅ Conversion **Celsius ↔ Fahrenheit**
- ✅ Conversion **Kilomètres ↔ Miles**
- ✅ Navigation entre deux onglets (Température / Distance)
- ✅ Interface simple et unifiée
- ✅ Validation de saisie utilisateur
- ✅ Affichage dynamique des résultats
- ✅ Boîte de dialogue de confirmation lors de la fermeture

---

## 🚀 Comment lancer le projet

1. Clone le dépôt :
   ```bash
   git clone https://github.com/yourusername/tabconvert.git
   ````

2. Ouvre le projet dans **Android Studio**
3. Attends la synchronisation Gradle
4. Lance l’application sur un émulateur ou appareil réel (**Min SDK 24**)

---

## 🧠 Concepts appris

| Concept                   | Description                                      |
| ------------------------- | ------------------------------------------------ |
| `Fragment`                | Composant UI réutilisable dans une Activity      |
| `ViewPager2`              | Permet de naviguer entre plusieurs pages (swipe) |
| `TabLayout`               | Barre d’onglets pour organiser l’interface       |
| `TabLayoutMediator`       | Synchronise les onglets avec les fragments       |
| `FragmentStateAdapter`    | Gère les fragments dans le ViewPager             |
| `findViewById` (Fragment) | Accès aux vues via `view.findViewById`           |
| `RadioGroup`              | Sélection unique entre plusieurs options         |
| `TextUtils.isEmpty()`     | Vérification des champs vides                    |
| `Double.parseDouble()`    | Conversion String → nombre                       |
| `String.format()`         | Formatage du résultat (2 décimales)              |
| `Toast`                   | Affichage de message rapide                      |
| `AlertDialog`             | Boîte de confirmation avant fermeture            |
| `onBackPressed()`         | Interception du bouton retour                    |

---

## 📝 Détail des fichiers

### `MainActivity.java`

* Initialise `TabLayout` et `ViewPager2`
* Configure l’adaptateur des fragments
* Lie les onglets avec `TabLayoutMediator`
* Gère le bouton retour avec une boîte de confirmation

---

### `ViewPagerAdapter.java`

* Définit quel fragment afficher selon l’onglet
* Gère le nombre total de pages (2 fragments)

---

### `TempFragment.java`

* Récupère la valeur saisie
* Vérifie si le champ est vide
* Effectue la conversion °C ↔ °F
* Affiche le résultat formaté

---

### `DistanceFragment.java`

* Même logique que TempFragment
* Conversion Km ↔ Miles
* Gestion simple et indépendante

---

### `activity_main.xml`

* Contient `TabLayout` (onglets)
* Contient `ViewPager2` (contenu dynamique)

---

### `fragment_temp.xml` & `fragment_distance.xml`

* Interface utilisateur pour chaque conversion
* Utilisation de `EditText`, `RadioGroup`, `Button`, `TextView`
* Design simple et cohérent

---

## 🎯 Ce que j’ai appris dans ce LAB

* Structurer une application avec **Activity + Fragments**
* Implémenter une navigation moderne avec **onglets**
* Séparer la logique en composants indépendants
* Gérer les interactions utilisateur (clic, saisie)
* Appliquer des conversions mathématiques dans une app
* Améliorer l’expérience utilisateur avec des validations et messages

---

## 👨‍💻 Auteur

**AMSOU ISMAIL** — Lab de développement mobile
