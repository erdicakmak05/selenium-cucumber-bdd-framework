# Selenium Cucumber BDD Framework

A comprehensive Selenium WebDriver test automation framework using Cucumber BDD with Page Object Model design pattern.

## Tech Stack

- **Java 17**
- **Selenium 4.27** - Browser automation
- **Cucumber 7.20** - BDD framework with Gherkin syntax
- **JUnit** - Test runner
- **Maven** - Build and dependency management
- **Log4j2** - Logging framework
- **Docker / Selenium Grid** - Distributed test execution

## Project Structure

```
src/test/
├── java/
│   ├── pages/                # Page Object classes (8 pages)
│   ├── runners/              # Cucumber test runners (parallel support)
│   ├── stepdefinitions/      # Step definitions + Hooks
│   └── utilities/            # Driver, ConfigReader, ReusableMethods
└── resources/
    ├── features/             # Gherkin feature files (14 scenarios)
    └── log4j2.xml            # Logging configuration
```

## Features

- **14 Test Scenarios** covering search, login, form submission, web tables, dynamic elements
- **Thread-safe WebDriver** with `ThreadLocal` for parallel execution
- **Page Object Model** with 8 page classes
- **Parallel execution** via Maven Surefire plugin
- **Screenshot on failure** with automatic attachment to Cucumber reports
- **Reusable utilities** - explicit waits, hover, window switching, fluent wait
- **Docker support** with Selenium Grid (Hub + Chrome/Firefox nodes)
- **CI/CD ready** with GitHub Actions workflow

## Prerequisites

- Java 17+
- Maven 3.8+
- Chrome / Firefox browser (for local execution)
- Docker & Docker Compose (for grid execution)

## Running Tests

```bash
# Local execution
mvn clean test

# Headless mode (CI/CD)
mvn clean test -Dbrowser=chrome-headless

# With Docker Selenium Grid
docker-compose up -d
docker-compose run test-runner
docker-compose down
```

## Reports

After test execution, reports are available at:
- `target/cucumber-reports.html` - Cucumber HTML Report
