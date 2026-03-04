# MCDA 5512 – Maven Assignment

## Overview
A Java Maven project that takes a string input from the user, **capitalizes** it, and generates its **MD5 hex hash**.

Built as part of the MCDA 5512 coursework to demonstrate Maven project setup, dependency management, JUnit 5 testing, and packaging.

---

## Features
- Accepts a lowercase string from the user
- Capitalizes the first letter using **Apache Commons Lang3**
- Generates MD5 hex hash using **Apache Commons Codec**
- Two JUnit 5 unit tests (capitalize + MD5)
- Packaged as a standalone fat jar using **maven-shade-plugin**

---

## Project Structure
```
MavenAssignment/
├── src/
│   ├── main/java/com/smu/mscda/
│   │   └── MainApp.java          # Main application logic
│   └── test/java/com/smu/mscda/
│       └── MainAppTest.java      # JUnit 5 tests
└── pom.xml                       # Maven build config
```

---

## Maven Dependencies
| Dependency | Purpose |
|---|---|
| `commons-lang3` | `StringUtils.capitalize()` |
| `commons-codec` | `DigestUtils.md5Hex()` |
| `junit-jupiter-api` | JUnit 5 test annotations |
| `junit-jupiter-engine` | JUnit 5 test runtime |

---

## How to Build & Run

### Build (compile + test + package)
```bash
mvn clean package
```

### Run the program
```bash
java -cp target/MavenAssingment-1.0-SNAPSHOT.jar com.smu.mscda.MainApp
```

### Run as standalone jar (Bonus)
```bash
java -jar target/MavenAssingment-1.0-SNAPSHOT.jar
```

---

## Expected Output
```
This program will capitalize the input string and generate MD5 hex!
Enter a string: smu

 Capitalized string is: Smu
 MD5 Hex is: 6850c0ee0db4626bbdda5660167f0d4c
```

---

## Test Results
```
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
```
- `testCapitalizeString` — verifies `"smu"` → `"Smu"`
- `testGenerateMD5` — verifies MD5 of `"Smu"` == `6850c0ee0db4626bbdda5660167f0d4c`

---

**Student ID:** A00494129  
**Course:** MCDA 5512 – Cloud and Platform Computing 2  
**Due:** March 8, 2026
