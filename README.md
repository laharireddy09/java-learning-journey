# Java Learning Journey 🚀
**By Lahari | Goal: AI/ML Engineer**

---

## About This Repository
My structured Java learning path from complete beginner to job-ready developer.
Building **HireTrack Pro** — a real, AI-powered Job Application Management System
that I use during my own job search.

---

## 🎯 Goal
- **Short term (6 months):** Job-ready Java developer for product-based companies
- **Long term (1-2 years):** AI/ML Engineer

---

## 🏗️ Project — HireTrack Pro
A full-stack, AI-powered job application tracking system.

### What It Does
- Track every job application — status, interviews, notes, deadlines
- Auto sync applied jobs from LinkedIn
- Automatic Gmail notifications for status updates
- Dashboard with application stats
- AI-powered resume vs job description match score
- Skill gap analysis and job recommendations
- Salary prediction using ML model

### Final Architecture
```
User → Spring Boot API
            ↓
      PostgreSQL DB
            ↓
      Python ML Service → Resume analyzer, Job recommendations
            ↓
      Gmail Service → Auto notifications
            ↓
      LinkedIn API → Auto job sync
            ↓
      Docker → Packages and runs everything together
```

---

## 🛠️ Complete Tech Stack

| Technology | Purpose |
|-----------|---------|
| Java 17 | Core language |
| Spring Boot | Backend framework, REST APIs |
| Spring Security | Authentication |
| PostgreSQL | Database |
| Hibernate/JPA | Database connection layer |
| Maven | Build tool |
| Postman | API testing |
| Git/GitHub | Version control |
| Docker | Deployment — runs entire app in one command |
| Python + Scikit-learn/PyTorch | ML models for AI features |
| LinkedIn API | Auto sync applied jobs |
| Gmail API | Automatic status notifications |
| Spring Scheduler | Daily auto updates |

---

## 🗄️ Database Design

```
users
─────────────────────────
id          (PK)
name
email
password    (encrypted)
created_at

job_applications
─────────────────────────
id          (PK)
user_id     (FK → users)
company_name
role
status      (APPLIED/INTERVIEW/OFFER/REJECTED)
applied_date
notes
expected_salary

interviews
─────────────────────────
id          (PK)
job_id      (FK → job_applications)
round_number
interview_date
interviewer_name
feedback
result
```

---

## 📁 Folder Structure

```
java-learning-journey/
└── src/
    ├── basics/
    │   ├── Variables.java
    │   ├── Operators.java
    │   ├── Conditions.java
    │   ├── Loops.java
    │   ├── Methods.java
    │   └── Arrays.java
    ├── oop/
    │   ├── Classes.java
    │   ├── Inheritance.java
    │   ├── Polymorphism.java
    │   └── Interfaces.java
    ├── collections/
    │   ├── ListDemo.java
    │   ├── MapDemo.java
    │   └── SetDemo.java
    ├── java8/
    │   ├── LambdaDemo.java
    │   ├── StreamsDemo.java
    │   └── OptionalDemo.java
    └── hiretrackpro/
        ├── JobApplication.java
        ├── User.java
        └── Interview.java
```

---

## 🗺️ 6 Month Roadmap

| Month | Focus | Project Milestone |
|-------|-------|-------------------|
| Month 1 | Core Java — OOP, Collections, Exception Handling | Data models and business logic |
| Month 2 | Java 8 — Streams, Lambdas + DSA starts | Cleaner service layer |
| Month 3 | Spring Boot — REST APIs | Full working API |
| Month 4 | PostgreSQL + Hibernate/JPA | Data saved to real database |
| Month 5 | Spring Security + JWT | Login, Register, protected routes |
| Month 6 | Polish + Microservices + Docker | Live deployed app |

### After Month 6 → AI/ML Journey
- Python (2-3 weeks)
- ML fundamentals (Andrew Ng)
- Deep Learning (PyTorch)
- LLMs and GenAI
- Add AI features to HireTrack Pro

---

## 📅 LeetCode Plan

| Month | Difficulty | Target |
|-------|-----------|--------|
| Month 1-2 | Easy only | 30 problems |
| Month 3 | Easy + Medium | 60 problems |
| Month 4-6 | Medium focus | 100+ problems |

**Starts Week 3. 1 problem per day.**

Topics: Arrays → HashMap → Two Pointers → Sliding Window → Linked Lists → Trees → Recursion → DP

---

## 📚 Learning Progress

### ✅ Week 1 — Java Basics

#### Day 1 — Setup + Hello World
- Installed JDK 17 (Adoptium)
- Configured IntelliJ IDEA
- Connected GitHub via SSH
- First commit pushed
- **Key concept:** JVM compiles Java to bytecode — write once run anywhere
- **Interview Q:** Why is Java platform independent?
  > Java compiles to bytecode not machine code. JVM on any OS reads the same bytecode and runs it.

---

#### Day 2 — Variables + Data Types
- 8 primitive types: byte, short, int, long, float, double, char, boolean
- Wrapper classes: Integer, Double, Boolean, Character
- String literals, type casting (widening vs narrowing)
- **Key concept:** Java is not pure OOP because of primitive types
- **Key concept:** int → Stack memory (fast), Object → Heap memory (slower)
- **Project:** Created `JobApplication.java` with all data types
- **Interview Q:** Why is Java not pure OOP?
  > Because it has primitive types like int, double which are not objects. Java made this trade-off for performance — primitives stored in stack memory are faster.
- **Interview Q:** Difference between int and Integer?
  > int is primitive — stores value directly, faster. Integer is object — has methods like parseInt(), can be null.

---

#### Day 3 — Operators + Conditions
- Arithmetic: +, -, *, /, %
- Comparison: ==, !=, >, <, >=, <=
- Logical: &&, ||, !
- if / else if / else
- **Key concept:** Use .equals() not == for String comparison
- **Key concept:** && short circuit evaluation
- **Project:** Added salary threshold, FAANG detection, remote work logic
- **Interview Q:** Why use .equals() not == for Strings?
  > == compares memory addresses. .equals() compares actual values. Two String variables can have same value but different memory locations.
- **Interview Q:** What is short circuit evaluation?
  > In &&, if first condition is false, Java skips second condition — result is already false. In ||, if first is true, Java skips second.

---

#### Day 4 — Loops
- for loop → when count is known upfront
- while loop → checks condition first, may never run
- do-while → runs at least once, then checks condition
- Enhanced for loop (for-each)
- **Key concept:** Array index starts at 0 — represents memory offset from start
- **Project:** Added company array loop to JobApplication
- **Interview Q:** Difference between while and do-while?
  > while checks condition before running — if false from start, never runs. do-while checks condition after running — always runs at least once.

---

#### Day 5 — Methods
- 4 types: no input/no return, input/no return, no input/return, input/return
- Parameters vs Arguments
- Return types
- DRY principle
- **Key concept:** DRY — Don't Repeat Yourself
- **Key concept:** Parameter = variable in definition, Argument = actual value passed
- **Project:** Refactored JobApplication with printJobDetails(), getJobStatus(), isFAANG()
- **Interview Q:** What is DRY principle?
  > Don't Repeat Yourself — if you write same code more than once, extract it into a reusable method.
- **Interview Q:** Difference between parameter and argument?
  > Parameter is the variable in method definition. Argument is the actual value passed when calling the method.

---

#### Day 6 — Arrays
- Fixed size container, same type elements
- 3 ways to create arrays
- Normal for loop vs enhanced for loop
- Common array operations: length, access, update
- **Key concept:** ArrayIndexOutOfBoundsException — accessing index that doesn't exist
- **Key concept:** Normal for loop when you need index, enhanced for loop when you just need values
- **Project:** Arrays used in JobApplication for company list
- **Interview Q:** What is ArrayIndexOutOfBoundsException?
  > Accessing an array index that doesn't exist. Array of size 3 has indexes 0,1,2 only — accessing index 3 causes this error.

---

## 🔀 Git Workflow
```
# Start of every day
git checkout main
git pull
git checkout -b day7-topic
git branch  ← always verify branch!

# After coding
git branch  ← check before every commit!
git add .
git commit -m "Day X - Topic"
git push --set-upstream origin branchname

# Create PR on GitHub → Merge to main
git checkout main
git pull
```

**Rules:**
- One branch per day/feature
- Naming: day1-setup, day2-variables, feature-auth
- Always PR → merge to main
- Never commit directly to main

---

## ⏱️ Daily Schedule (3 hours)
```
30 min → Learn concept
60 min → Code hands on
30 min → Apply to HireTrack Pro
30 min → LeetCode (starts Week 3)
30 min → Review + Git commit
```

---

## 🤖 AI/ML Integration Plan

### AI Features
| Feature | Technology |
|---------|-----------|
| Resume vs JD match score | NLP + Scikit-learn |
| Skill gap analysis | ML classification model |
| Job recommendations | Collaborative filtering |
| Salary prediction | Regression model |

### How Java + AI/ML Connect
```
Spring Boot (Java)     → Backend, REST APIs, business logic
PostgreSQL             → Stores all user and job data
Python ML Service      → Runs AI models, exposes as API
Docker                 → Runs Java app + Python ML + PostgreSQL
                         together with one command:
                         docker-compose up → entire app running!
LinkedIn API           → Auto fetches applied jobs
Gmail API              → Sends automatic notifications
Spring Scheduler       → Runs daily status checks
```

---

*Started: 2025 | GitHub: github.com/laharireddy09/java-learning-journey*
