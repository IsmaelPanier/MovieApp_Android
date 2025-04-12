# � TV Shows App [![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg?logo=kotlin)](https://kotlinlang.org) [![Compose](https://img.shields.io/badge/Jetpack%20Compose-1.5.0-brightgreen)](https://developer.android.com/jetpack/compose)

Application mobile Android pour découvrir les séries TV populaires utilisant l'API Episodate, construite avec les meilleures pratiques modernes Android.

<p align="center">
  <img src="https://via.placeholder.com/300x600/5C6BC0/FFFFFF?text=App+Preview" width="200" alt="App Preview">
  <img src="https://via.placeholder.com/300x600/42A5F5/FFFFFF?text=Search+Feature" width="200" alt="Search Feature">
</p>

## 🌟 Fonctionnalités

### 🚀 Core Features
- 📺 Liste des séries populaires avec pagination
- 🔍 Système de recherche en temps réel
- 🖼️ Chargement optimisé des images avec Coil
- 📱 UI 100% Jetpack Compose + Material 3
- 💾 Architecture Clean (MVVM, Repository Pattern)

### ✨ Features Ajoutées
| Fonctionnalité | Description | 
|----------------|-------------|
| **Recherche Intelligente** | Filtrage dynamique avec feedback visuel |
| **Empty State** | Illustration personnalisée quand aucun résultat | 
| **UI/UX Optimisée** | Animations fluides et indicateurs de chargement |

## � Architecture

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
