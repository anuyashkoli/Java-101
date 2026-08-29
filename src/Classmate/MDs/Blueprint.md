# Classmate: My College / Academics Manager

## Architectural Blueprint & System Design

This design document serves as a complete, code-free architectural blueprint for building **Classmate: My College /
Academics Manager** in Java. It is custom-tailored to represent the actual academic structure, course schema, and
examination rules of the **University of Mumbai B.E. (Internet of Things and Cyber Security including Blockchain
Technology)** curriculum (REV-2019 'C' Scheme).

---

## 1. Architectural Patterns & System Components

To practice professional software design, the application is divided using the **Model-View-Controller (MVC)** design
pattern. This enforces high cohesion and loose coupling.

```
                  +-----------------------+
                  |      Main Entry       |
                  +-----------+-----------+
                              |
                              v
                  +-----------------------+
                  |      Controller       |
                  +------+---------+------+
                         |         |
           +-------------+         +-------------+
           |                                     |
           v                                     v
+-----------------------+             +-----------------------+
|         View          |             |         Model         |
|  (CLI Menus / Inputs) |             |  (Data Objects / State|
+-----------------------+             +-----------+-----------+
                                                  |
                                                  v
                                      +-----------------------+
                                      |   Persistence Layer   |
                                      |   (File Read/Write)   |
                                      +-----------------------+
```

### Directory & Package Structure

Organise your Java source files (`.java`) inside the following package structure under `src/main/java/`:

* `com.classmate.app`: Contains the main entry point class.
* `com.classmate.model`: Contains the core data classes representing academic entities (Student, Course, Assessment,
  Semester).
* `com.classmate.controller`: Houses classes handling user business logic, GPA calculations, and curriculum management.
* `com.classmate.view`: Contains classes responsible for console rendering, user text prompts, and formatted tables.
* `com.classmate.persistence`: Contains classes responsible for saving and loading the user's progress.

---

## 2. Object-Oriented Domain Models (UML Specifications)

Below are the text-based UML specifications for the core domain model classes. These define the attributes,
relationships, and signatures of methods without any code syntax.

### Class: `Student`

Represents the user of the system.

* **Attributes:**
    * `name`: Text string
    * `rollNumber`: Text string / identifier
    * `currentSemester`: Integer (e.g., 7 or 8)
    * `academicHistory`: Collection of `Semester` objects
* **Operations:**
    * `enrollInCourse(courseCode: String)` -> Status code or boolean
    * `calculateCumulativeGpa()` -> Double decimal value
    * `getSemesterRecord(semesterId: int)` -> `Semester` object

### Class: `Course` (Base Class)

Abstract base representation of an academic subject.

* **Attributes:**
    * `courseCode`: Text string (e.g., `IoTCSBCC701`)
    * `courseName`: Text string (e.g., `Machine Learning & Blockchain`)
    * `credits`: Integer (e.g., 3)
    * `courseType`: Enum / Type (Core, DeptElective, InstElective, Lab, MajorProject)
    * `assessment`: `Assessment` object
* **Operations (Abstract):**
    * `isPassed()` -> Boolean
    * `calculateTotalMarks()` -> Double
    * `getGradePoints()` -> Integer (0 to 10 scale)

### Class: `Assessment` (Data Structure)

Handles the modular components of a subject's examination scheme.

* **Attributes:**
    * `internalAssessment1`: Double (Max 20)
    * `internalAssessment2`: Double (Max 20)
    * `endSemExam`: Double (Max 80)
    * `termWork`: Double (Max 25 or 50)
    * `practicalOral`: Double (Max 25 or 50)
* **Operations:**
    * `getInternalAssessmentAverage()` -> Double `((IA1 + IA2) / 2)`
    * `getTheoryTotal()` -> Double `(IA_Average + EndSemExam)`
    * `getPracticalTotal()` -> Double `(TermWork + PracticalOral)`

---

## 3. Core Academic Rules & Calculation Logic

Your application must enforce the specific rules outlined by the University of Mumbai engineering scheme to calculate
grades and verify academic progression.

### A. Grade Point & Pointer System

University of Mumbai uses a **10-point scale** based on the final total percentage secured in a subject. Map your total
calculated score to grade points according to this logic:

| Final Percentage Range     | Letter Grade | Grade Point ($GP$) | Performance Classification |
|:---------------------------|:------------:|:------------------:|:---------------------------|
| $\ge 80\%$                 |      O       |         10         | Outstanding                |
| $75\% \text{ to } 79.99\%$ |      A       |         9          | Excellent                  |
| $70\% \text{ to } 74.99\%$ |      B       |         8          | Very Good                  |
| $60\% \text{ to } 69.99\%$ |      C       |         7          | Good                       |
| $50\% \text{ to } 59.99\%$ |      D       |         6          | Fair                       |
| $45\% \text{ to } 49.99\%$ |      E       |         5          | Average                    |
| $40\% \text{ to } 44.99\%$ |      P       |         4          | Pass                       |
| $< 40\%$                   |      F       |         0          | Fail                       |

### B. Passing Criteria & Checks

A student is declared to have "passed" a course only if they satisfy separate passing thresholds (40% minimum score) on
both core examination tracks:

1. **Theory Track:** $\text{Theory Total} \ge 40\%$ (where theory total is the average of Internal Assessment 1 and 2
   plus the End Semester Examination).
2. **Practical/Term Work Track:** $\text{Practical Total} \ge 40\%$ (where practical total is the sum of Term Work and
   the Practical/Oral exam).

If either track falls below 40%, the final course grade is automatically **F** with 0 Grade Points.

### C. GPA Calculations (SGPI & CGPI)

* **SGPI (Semester Grade Performance Index):** Calculated for a single semester as a credit-weighted average:
  $$\text{SGPI} = \frac{\sum (\text{Course Credits} \times \text{Course Grade Points})}{\sum \text{Course Credits}}$$
* **CGPI (Cumulative Grade Performance Index):** Calculated across multiple semesters:
  $$\text{CGPI} = \frac{\sum (\text{SGPI}_i \times \text{Total Semester Credits}_i)}{\sum \text{Total Semester Credits}_i}$$

---

## 4. Academic Curriculum & Course Seed Data

To make "Classmate" highly functional out of the box, you should hardcode or seed the application with the actual course
curriculum metadata for the final-year semesters.

### Semester VII Schema

* **Core Theory Courses:**
    * `IoTCSBCC701`: Machine Learning & Blockchain [Credits: 3]
    * `IoTCSBCC702`: Edge / Fog Computing [Credits: 3]
* **Department Optional Course 3 (User picks one, Credits: 3):**
    * `IoTCSBCDO7011`: Advance Cloud Computing Security
    * `IoTCSBCDO7012`: Software Testing & Quality Assurance (STQA)
    * `IoTCSBCDO7013`: IoT for Smart Cities
    * `IoTCSBCDO7014`: Supervisory Control and Data acquisition (SCADA) Security
* **Department Optional Course 4 (User picks one, Credits: 3):**
    * `IoTCSBCDO7021`: Design a Blockchain Application Architecture
    * `IoTCSBCDO7022`: Usability & Security in UID
    * `IoTCSBCDO7023`: Enterprise IoT Cyber Security
    * `IoTCSBCDO7024`: Software Engineering & Testing Methodology for IoT
* **Institute Optional Course 1 (User picks one, Credits: 3):**
    * `ILO7011` to `ILO7019` (e.g., reliability engineering, cyber laws, operation research, etc.)
* **Skill Labs (Practical, Credits: 1 each):**
    * `IoTCSBCL701`: ML & BC Lab
    * `IoTCSBCL702`: Edge / Fog Computing Lab
    * `IoTCSBCL703`: DevSecOps Lab
    * `IoTCSBCL704`: Open-Source Intelligence (OSINT) Lab
* **Project (Credits: 3):**
    * `IoTCSBCP701`: Major Project I

### Semester VIII Schema

* **Core Theory Courses:**
    * `IoTCSBCC801`: NFT & DeFi (Decentralized Finance) [Credits: 3]
* **Department Optional Course 5 (User picks one, Credits: 3):**
    * `IoTCSBCDO8011` to `IoTCSBCDO8014` (e.g., emerging blockchain applications, IR systems, forensic, etc.)
* **Department Optional Course 6 (User picks one, Credits: 3):**
    * `IoTCSBCDO8021` to `IoTCSBCDO8024` (e.g., smart grids, metaverse, green IT, legal laws)
* **Institute Optional Course 2 (User picks one, Credits: 3):**
    * `ILO8011` to `ILO8019` (e.g., project management, finance management, professional ethics)
* **Skill Labs (Practical, Credits: 1 each):**
    * `IoTCSBCL801`: Capstone Lab
    * `IoTCSBCL802`: IoT Automation Lab
* **Project (Credits: 6):**
    * `IoTCSBCP801`: Major Project II

---

## 5. Persistence Strategy (Data Storage Scheme)

Since this is a CLI tool, using a simple flat file like **JSON** or **CSV** is highly recommended to save and reload
student records.

### Recommended JSON Format Structure

```json
{
  "student": {
    "name": "Jane Doe",
    "rollNumber": "MU-2023-XYZ",
    "currentSemester": 7,
    "semesters": [
      {
        "semesterNumber": 7,
        "enrolledCourses": [
          {
            "code": "IoTCSBCC701",
            "name": "Machine Learning & Blockchain",
            "type": "Core",
            "credits": 3,
            "marks": {
              "ia1": 18.0,
              "ia2": 19.5,
              "endSem": 65.0,
              "termWork": 0.0,
              "oral": 0.0
            }
          },
          {
            "code": "IoTCSBCL701",
            "name": "ML & BC Lab",
            "type": "Lab",
            "credits": 1,
            "marks": {
              "ia1": 0.0,
              "ia2": 0.0,
              "endSem": 0.0,
              "termWork": 22.0,
              "oral": 21.0
            }
          }
        ]
      }
    ]
  }
}
```

---

## 6. CLI Menus & Navigation Flow

The view layer should run in an infinite loop inside the console, driving interaction using clear, textual choices.

### A. Main Welcome Menu

```
====================================================
           CLASSMATE: ACADEMICS MANAGER
====================================================
[1] Register New Student Profile
[2] Load Saved Profile
[3] Select Semester Electives
[4] Enter/Update Subject Marks
[5] View Academic Performance Dashboard
[6] Export Grade Card Report
[7] Exit Application
====================================================
Enter your choice: _
```

### B. Core Navigation States

```
       [Main Entry]
            |
            v
   +--------+--------+
   |  Profile Loader | <----+ (If no file exists, force Registration)
   +--------+--------+
            |
            v
   +--------+--------+
   |    Main Menu    | <------------------------+
   +--------+--------+                          |
            |                                   |
            +---> [1] Register Student          |
            |                                   |
            +---> [2] Load Profile              |
            |                                   |
            +---> [3] Select Electives --------> (Pick Dept/Inst Optionals)
            |                                   |
            +---> [4] Enter Marks -------------> (Input IA1, IA2, EndSem, TW)
            |                                   |
            +---> [5] View Dashboard ----------> (Outputs SGPI, CGPI, Passing status)
            |                                   |
            +---> [6] Export Report ------------(Writes clean text report file)
            |
            v
        [Exit App]
```

---

## 7. Java Exercises & OOP Practice Tracker

Building this application provides a perfect playground to master core Java and Object-Oriented Programming (OOP)
concepts. Map your learning to the features below:

1. **Encapsulation:** Ensure all class fields in the `model` package are `private`. Use custom getters/setters that
   contain **validation rules** (for example, throwing an `IllegalArgumentException` if someone tries to input End Sem
   marks greater than 80, or IA marks greater than 20).
2. **Inheritance & Polymorphism:** Create an abstract class `Course` and let concrete classes like `TheoryCourse`,
   `LabCourse`, and `ProjectCourse` extend it. Override methods like `calculateTotalMarks()` and `getGradePoints()` so
   they implement different calculations based on their course types.
3. **Collections Framework:** Use `ArrayList` to manage the collection of courses and semesters. Use `HashMap` if you
   want to store course lookups with the course code as the key.
4. **Exception Handling:** Build custom exceptions (e.g., `InvalidMarksException`, `CourseNotEnrolledException`) and
   handle them gracefully in your controllers to prevent the CLI from crashing.
5. **File I/O:** Practice using Java's `BufferedReader`/`BufferedWriter` or a standard JSON library (such as Jackson or
   Gson) to persist and parse data cleanly.
