# Java Maven String Processor

A lightweight Java utility that capitalizes strings and generates MD5 hashes, built with Maven and fully tested with JUnit 5.

---

## What it does

- Takes a string input from the user
- Capitalizes the first letter
- Generates the MD5 hex hash of the result
- Runs as a standalone executable jar

## Tech Stack

- **Java 17**
- **Maven** — build & dependency management
- **Apache Commons Lang3** — string utilities
- **Apache Commons Codec** — MD5 hashing
- **JUnit 5** — unit testing
- **maven-shade-plugin** — fat jar packaging

## Getting Started

### Prerequisites
- Java 17+
- Maven 3.x

### Build
```bash
mvn clean package
```

### Run
```bash
java -jar target/MavenAssingment-1.0-SNAPSHOT.jar
```

### Example
```
This program will capitalize the input string and generate MD5 hex!
Enter a string: smu

 Capitalized string is: Smu
 MD5 Hex is: 6850c0ee0db4626bbdda5660167f0d4c
```

## Tests

```bash
mvn test
```
```
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
```

| Test | Description |
|---|---|
| `testCapitalizeString` | Verifies first-letter capitalization |
| `testGenerateMD5` | Verifies MD5 hex output against known hash |
