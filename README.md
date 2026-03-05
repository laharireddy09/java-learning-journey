# Java Learning Journey 🚀

## About
My structured Java learning path with the goal of becoming
an AI/ML Engineer. Building HireTrack Pro — a Job Application
Management System.

---

## Project — HireTrack Pro
A full-stack job application tracking system with:
- REST APIs (Spring Boot)
- Database (PostgreSQL)
- Authentication (JWT)
- Gmail notifications
- LinkedIn job sync
- AI resume analyzer

---

## Tech Stack
- Java 17
- Spring Boot
- Spring Security
- PostgreSQL
- Hibernate/JPA
- Maven
- Docker

---

## Learning Progress

### ✅ Day 1 — Setup + Hello World
- Installed JDK 17
- Configured IntelliJ
- Connected GitHub via SSH
- **Key concept:** JVM compiles Java to bytecode —
  write once run anywhere

### ✅ Day 2 — Variables + Data Types
- 8 primitive types: byte, short, int, long,
  float, double, char, boolean
- Wrapper classes: Integer, Double, Boolean
- **Key concept:** Java is not pure OOP because
  of primitive types
- **Project:** Created JobApplication.java

### ✅ Day 3 — Operators + Conditions
- Arithmetic, comparison, logical operators
- if/else/else if
- **Key concept:** Use .equals() not == for Strings
- **Key concept:** && short circuit evaluation
- **Project:** Added salary and FAANG logic
  to JobApplication

### ✅ Day 4 — Loops
- for loop → when count is known
- while loop → when count unknown, checks first
- do-while → runs at least once, checks after
- **Key concept:** Array index starts at 0
  because it represents memory offset
- **Project:** Added company loop to JobApplication

### ✅ Day 5 — Methods
- 4 types: no input/no return, input/no return,
  no input/return, input/return
- **Key concept:** DRY — Don't Repeat Yourself
- **Key concept:** Parameter = definition,
  Argument = actual value passed
- **Project:** Refactored JobApplication with
  reusable methods

### ✅ Day 6 — Arrays
- Fixed size container, same type elements
- Index starts at 0
- Normal vs enhanced for loop
- **Key concept:** ArrayIndexOutOfBoundsException
- **Project:** Arrays used in JobApplication

---

## Folder Structure
```
src/
├── basics/
│   ├── Variables.java
│   ├── Operators.java
│   ├── Conditions.java
│   ├── Loops.java
│   ├── Methods.java
│   └── Arrays.java
├── oop/
├── collections/
├── java8/
└── hiretrackpro/
    ├── JobApplication.java
    ├── User.java
    └── Interview.java
```

---

## Interview Q&A

**Q: Why is Java not pure OOP?**
A: Because it has primitive types like int, double
which are not objects. Pure OOP means everything
is an object.

**Q: Why use .equals() not == for Strings?**
A: == compares memory addresses. .equals()
compares actual values.

**Q: What is DRY principle?**
A: Don't Repeat Yourself — extract duplicate
code into reusable methods.

**Q: Difference between parameter and argument?**
A: Parameter is variable in method definition.
Argument is actual value passed when calling.

**Q: What is short circuit evaluation?**
A: In &&, if first condition is false, Java skips
second condition. In ||, if first is true,
skips second.

**Q: What is ArrayIndexOutOfBoundsException?**
A: Accessing array index that doesn't exist.
Array of size 3 has indexes 0,1,2 only.

---

## Git Workflow
- One branch per day/feature
- Branch naming: day1-setup, day2-variables
- Always PR → merge to main
- Never commit directly to main

---

## Weekly Schedule
- 30 min → Learn concept
- 60 min → Code hands on
- 30 min → Apply to HireTrack Pro
- 30 min → LeetCode (starts Week 3)
- 30 min → Review + commit
```

---

## Commit the Documentation
```
git branch
git add .
git commit -m "Added README - learning documentation"
git push