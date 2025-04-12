# 🎬 TV Shows App [![Kotlin](https://img.shields.io/badge/Kotlin-2.0.0-blue.svg?logo=kotlin)](https://kotlinlang.org) [![Compose](https://img.shields.io/badge/Jetpack%20Compose-1.5.0-brightgreen)](https://developer.android.com/jetpack/compose)

Application mobile Android pour découvrir les séries TV populaires en utilisant l'API [Episodate](https://www.episodate.com), construite avec les meilleures pratiques modernes Android et Jetpack Compose.

---

## 🌟 Fonctionnalités

### 🚀 Core Features
- 📺 Liste des séries populaires avec pagination
- 🔍 Système de recherche en temps réel
- 🖼️ Chargement optimisé des images avec **Coil**
- 📱 UI 100% **Jetpack Compose** + **Material 3**
- 💾 Architecture Clean (MVVM, Repository Pattern)
- 🔄 Chargement dynamique avec `CircularProgressIndicator`
- 📝 Affichage des détails enrichis (description, pays, date, chaîne TV)

---

### ✨ Features Ajoutées
| Fonctionnalité              | Description                                                     |
|----------------------------|-----------------------------------------------------------------|
| 🔍 **Recherche Intelligente** | Filtrage dynamique avec feedback visuel dans la barre supérieure |
| ❌ **Empty State**            | Message stylé lorsqu'aucune série ne correspond à la recherche  |
| 🎨 **UI/UX Optimisée**        | Animations fluides, transitions douces et indicateurs clairs     |
| 📝 **Résumé des séries**      | Description textuelle intégrée dans l'écran de détails           |

---

## 🧱 Architecture

```plaintext
tvshows/
├── data/               # Couche Data
│   ├── api/            # Sources externes
│   ├── repository/     # Mediateur data/domain
│   └── dto/            # Objects API
│
├── domain/             # Business Logic
│   ├── model/          # Entities métier  
│   └── usecase/        # Cas d'utilisation
│
└── presentation/       # UI Layer
    ├── ui/             # Composables
    └── viewmodel/      # ViewModels

tvshows_details/
├── data/
│   ├── api/            # API de détails (show-details)
│   ├── repository/
│   └── dto/
│
├── domain/
│   ├── model/
│   └── usecase/
│
└── presentation/
    ├── ui/             # Écran de détails d'une série
    └── viewmodel/

```
### 🛠 Technologies clés

* **Langage** :  🛠️ Kotlin
* **UI** : 🎨  Jetpack Compose, Material 3
* **Architecture**  🧱: Clean Architecture + MVVM
* **Networking** : Retrofit, Gson
* **Async** : Coroutines, StateFlow
* **Image Loading** : Coil


### Développé par 

* **Ismael Panier** 
* **Senthooran Thayaparan**   
* **Abdoulaye Wane**

### 📦 Prochaines améliorations possibles

* **⭐ Système de favoris**
* **Mode sombre / clair** 
* **Swipe-to-refresh** 
* **🎯 Filtrage par pays ou statut**

