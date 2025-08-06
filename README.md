# Android Expense Tracker App

A modern Android expense tracking application built with **Kotlin**, **Jetpack Compose**, **MVVM architecture**, **Hilt dependency injection**, and **Apollo GraphQL** integration.

## 🚀 Features

- **Modern UI**: Built with Jetpack Compose and Material3 design
- **Multi-module Architecture**: Clean separation of concerns with core and feature modules
- **MVVM Pattern**: ViewModels with StateFlow for reactive UI updates
- **Dependency Injection**: Hilt for clean dependency management
- **GraphQL Integration**: Apollo client for server communication
- **Coroutines**: Asynchronous data flows and operations
- **Navigation**: Bottom navigation with multiple screens

## 📱 Screens

### 1. Expenses Screen
- List of all expenses with amounts and categories
- Floating action button to add new expenses
- Color-coded amounts (green for income, red for expenses)
- Loading states and error handling

### 2. Categories Screen
- Grid layout of expense categories
- Visual icons and colors for each category
- Easy category management

### 3. Reports Screen
- Monthly summary with income vs expenses
- Category breakdown with percentages
- Net savings calculation
- Placeholder for charts and trends

### 4. Settings Screen
- Dark mode toggle
- Notification preferences
- Currency selection
- Data export options
- App version and privacy policy

## 🏗️ Architecture

### Multi-Module Structure
```
android-expense-tracker/
├── app/                    # Main application module
├── core/
│   ├── ui/                # Shared UI components and theme
│   ├── data/              # Data layer with repositories
│   ├── domain/            # Domain models and use cases
│   └── network/           # GraphQL API integration
└── feature/
    ├── expenses/          # Expenses feature
    ├── categories/        # Categories feature
    ├── reports/          # Reports and analytics
    └── settings/         # App settings
```

### Technology Stack
- **Kotlin**: Primary language
- **Jetpack Compose**: Modern declarative UI
- **Material3**: Latest Material Design components
- **Hilt**: Dependency injection
- **Apollo GraphQL**: Network layer
- **Coroutines & Flow**: Asynchronous programming
- **Navigation Compose**: Screen navigation
- **MVVM**: Architecture pattern

## 🛠️ Setup Instructions

### Prerequisites
- Android Studio Arctic Fox or later
- Kotlin 1.9.10+
- Android SDK 34
- Minimum SDK 24

### Installation
1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle files
4. Build and run the project

### Dependencies
The project uses the following key dependencies:
- Jetpack Compose 1.5.4
- Material3 1.1.2
- Hilt 2.48
- Apollo GraphQL 3.8.2
- Navigation Compose 2.7.6
- Coroutines 1.7.3

## 📊 Data Flow

1. **Domain Layer**: Contains business logic and use cases
2. **Data Layer**: Implements repositories and data sources
3. **Network Layer**: Handles GraphQL API communication
4. **UI Layer**: Compose screens with ViewModels

### Sample Data Flow
```
UI (Compose) → ViewModel → UseCase → Repository → API (GraphQL)
```

## 🎨 UI Components

### Theme
- Material3 color scheme
- Dynamic color support
- Dark/light theme compatibility
- Custom typography

### Components
- Expense cards with detailed information
- Category grid with icons
- Settings switches and items
- Loading indicators and error states

## 🔧 Configuration

### GraphQL Setup
The app includes Apollo GraphQL client configuration for server-driven UI layouts. Sample queries and mutations are provided for:
- Fetching expenses
- Adding new expenses
- Updating expenses
- Deleting expenses

### Hilt Modules
- `NetworkModule`: Provides API and repository dependencies
- Feature-specific modules for each screen

## 📈 Future Enhancements

- [ ] Real-time expense synchronization
- [ ] Advanced charts and analytics
- [ ] Budget planning features
- [ ] Export to PDF/CSV
- [ ] Cloud backup integration
- [ ] Multi-currency support
- [ ] Receipt scanning with ML
- [ ] Push notifications for budget alerts

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🏆 Showcase Features

This project demonstrates:
- **Modern Android Development**: Latest Kotlin and Compose practices
- **Clean Architecture**: Proper separation of concerns
- **Dependency Injection**: Professional DI setup with Hilt
- **GraphQL Integration**: Modern API communication
- **Reactive Programming**: Coroutines and StateFlow
- **Material Design**: Beautiful and accessible UI
- **Multi-module Structure**: Scalable project organization

Perfect for showcasing advanced Android development skills in your portfolio! 