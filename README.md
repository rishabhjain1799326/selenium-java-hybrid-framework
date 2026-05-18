# Selenium Java Hybrid Framework

## Overview

This project is an enterprise-level Selenium automation framework developed using Java, TestNG, Maven, and Page Object Model (POM) architecture.

The framework is designed for scalable UI automation with reusable components, utilities, listeners, data-driven testing, and maintainable test structure following industry-standard automation practices.

---

## Key Features

- Selenium WebDriver Automation
- Java-based Test Automation Framework
- TestNG Framework Integration
- Maven Build Management
- Page Object Model (POM) Design Pattern
- Reusable Utility Classes
- Configurable Framework using Properties File
- Data-Driven Testing with TestNG DataProvider
- Screenshot Utility for Failure Handling
- Explicit Wait Utilities
- TestNG Listeners Integration
- Scalable Framework Architecture
- CI/CD Ready Framework Structure

---

## Framework Architecture

```text
src
├── main
│   ├── java
│   │   └── com.rishabh
│   │       ├── base
│   │       ├── pages
│   │       ├── utilities
│   │       ├── listeners
│   │       ├── dataProviders
│   │       └── api
│   │
│   └── resources
│       ├── config.properties
│       ├── log4j2.xml
│       └── testdata.xlsx
│
└── test
    └── java
        └── com.rishabh.tests
```

---

## Tech Stack

| Technology | Usage |
|---|---|
| Java | Programming Language |
| Selenium WebDriver | UI Automation |
| TestNG | Test Execution Framework |
| Maven | Build Tool |
| WebDriverManager | Driver Management |
| Apache POI | Excel Data Handling |
| Log4j2 | Logging |
| Git & GitHub | Version Control |
| VS Code | IDE |

---

## Implemented Components

### Base Layer
- Browser initialization
- WebDriver setup
- Common test configuration

### Page Layer
- HomePage
- LoginPage

### Utilities
- ConfigReader
- WaitUtils
- ScreenshotUtils

### Listeners
- TestNG Listener implementation

### Data Providers
- Test data management using TestNG DataProvider

---

## Current Test Scenarios

- Login navigation flow
- Data-driven login execution
- Reusable page object implementation

---

## Future Enhancements

- Extent Reports Integration
- Parallel Execution
- Cross Browser Execution
- GitHub Actions CI/CD
- Jenkins Pipeline Integration
- Docker Execution
- Selenium Grid Support
- API Automation using REST Assured
- AI-assisted automation utilities

---

## Run Framework

```bash
mvn clean test
```

---

## Author

Rishabh Jain
SDET | Automation Engineer | Selenium | Playwright | API Testing | CI/CD
