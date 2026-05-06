# Climate Hazard Monitoring & Alert System

### A Java-based Object-Oriented Programming (OOP) project designed to simulate real-time climate hazard detection, alert generation, and emergency response planning.

# Project Overview
The **Climate Hazard Monitoring & Alert System** is a simulation-based Java application that monitors environmental conditions and detects potential climate hazards such as:

## 1) Floods
## 2) Heatwaves
## 3) Fires
## 4) Earthquakes

The system processes environmental sensor inputs including:

##* Temperature
##* Rainfall
##* Ground Vibration

Based on the analyzed data, the application:

**1. Detects hazards**
**2. Generates warning alerts**
**3. Suggests rescue and emergency response plans**

This project demonstrates how real-world disaster monitoring systems can be developed using **Object-Oriented Programming principles**.


# Project Objectives

**Simulate climate hazard detection systems**
**Monitor environmental sensor data**
**Generate intelligent hazard alerts**
**Provide rescue and emergency recommendations**
**Apply real-world OOP concepts in Java**
**Build a modular and scalable software architecture**

---

# System Architecture
The project follows a layered architecture to ensure modularity and maintainability.

## Project Structure
climate-hazard-monitoring-system/
│
├── model/
│   ├── SensorData.java
│   └── Hazard.java
│
├── service/
│   ├── DetectionService.java
│   ├── AlertService.java
│   └── RescueService.java   
│   ├── DetectionSensors.java
│   ├── AlertService.java
│   └── 
├── abstracts/
│   └── HazardResponse.java
│
└── ui/
    └── ClimateApp.java


# Model Layer (Data Layer)

##  SensorData.java

Stores environmental monitoring data collected from sensors.

### Attributes

| Field       | Type   |
| ----------- | ------ |
| temperature | double |
| rainfall    | double |
| vibration   | double |

### Responsibilities

* Store environmental readings
* Encapsulate sensor information
* Provide controlled data access using getters/setters

---

##  Hazard.java

Represents a detected climate hazard.

### Attributes

| Field    | Type   |
| -------- | ------ |
| type     | String |
| severity | String |

### Responsibilities

* Store detected hazard information
* Manage hazard classification and severity levels

---

# Service Layer (Business Logic)

## DetectionService.java

Analyzes sensor data and identifies possible hazards.

### Detection Rules

| Condition             | Hazard          |
| --------------------- | --------------- |
| High Rainfall         | Flood           |
| High Temperature      | Heatwave / Fire |
| High Ground Vibration | Earthquake      |

### Responsibilities

* Analyze environmental data
* Detect hazard types
* Trigger system responses

---

## AlertService.java

Generates warning alerts based on detected hazards.

### Example Alerts

**FLOOD ALERT detected**
**EARTHQUAKE WARNING issued**
**FIRE EMERGENCY reported**
**HEATWAVE ALERT activated**

---

## RescueService.java

Suggests rescue and emergency response plans.

### Rescue Recommendations

| Hazard     | Suggested Response                  |
| ---------- | ----------------------------------- |
| Flood      | Evacuation boats & rescue teams     |
| Earthquake | Medical camps & shelters            |
| Fire       | Fire brigade & emergency response   |
| Heatwave   | Cooling centers & hydration support |

---

# Abstract Class Design

## HazardResponse.java (Abstract Class)

The system uses abstraction to define a generalized response structure for all hazards.

### Features

### Private Attribute
private String hazardType;


### Abstract Methods

```java
public abstract String generateAlert();
public abstract String generateRescuePlan();
```

### Concrete Method

```java
displayResponse()
```

Displays:

* Hazard type
* Alert message
* Rescue strategy

---

# AlertService extends HazardResponse

Responsible for generating alert messages.

### Supported Hazard Alerts

| Hazard     | Alert              |
| ---------- | ------------------ |
| FLOOD      | Flood Alert        |
| FIRE       | Fire Emergency     |
| EARTHQUAKE | Earthquake Warning |
| HEATWAVE   | Heatwave Alert     |
| NONE       | No Hazard Detected |

---

# RescueService extends HazardResponse

Provides rescue and emergency planning.

### Supported Rescue Actions

| Hazard     | Rescue Action      |
| ---------- | ------------------ |
| FLOOD      | Evacuation & boats |
| FIRE       | Fire brigade       |
| EARTHQUAKE | Medical response   |
| HEATWAVE   | Cooling centers    |
| NONE       | No action required |

---

# Main Application

## Main.java

Acts as the entry point of the application.

### Responsibilities

* Take user input
* Process environmental data
* Call detection services
* Generate alerts
* Display rescue plans

---

# OOP Concepts Implemented

| Concept                | Implementation                                     |
| ---------------------- | -------------------------------------------------- |
| Encapsulation          | Private fields with getters/setters                |
| Abstraction            | HazardResponse abstract class                      |
| Inheritance            | AlertService & RescueService extend HazardResponse |
| Polymorphism           | Method overriding for alert/rescue generation      |
| Modularity             | Layered package structure                          |
| Separation of Concerns | Each class has a single responsibility             |
| Scalability            | Easy to add future hazards/modules                 |


# Team Contributions

| Member       | Responsibilities                                           |
| ------------ | ---------------------------------------------------------- |
| **Shahnila**    | Project structure, SensorData & Hazard classes, validation |
| **Saniya Ilyas** | DetectionService & hazard detection logic                  |
| **Taiba Fatima** | AlertService, RescueService & console UI                   |



# How to Run the Project

## Requirements

* JDK 8 or above
* Java IDE (VS Code, IntelliJ IDEA, Eclipse)


## Compile the Program

```bash
javac ClimateApp.java
```



## Run the Program

```bash
java ClimateApp
```

Or simply run the project using your preferred Java IDE.

---

# Future Enhancements

The project can be extended with:

* GUI using Java Swing or JavaFX
* Real-time weather API integration
* MySQL database connectivity
* Advanced prediction algorithms
* GPS-based disaster tracking
* Mobile notification system
* AI-powered hazard prediction


# 📹 Project Demonstration

> Add your YouTube project demo link here.


Demo Video Link:


# GitHub Repository

> Add your GitHub repository link here.

```text
GitHub Repository Link: https://github.com/Shahnila-Chachar/climate_Hazard_Monitoring_and_Alert_System/tree/main
```

# Conclusion

The **Climate Hazard Monitoring & Alert System** demonstrates how Object-Oriented Programming can be used to simulate real-world environmental monitoring and disaster management systems.

The project provides a strong foundation in:

* Java application design
* OOP architecture
* Abstraction & inheritance
* Modular software development
* Real-world problem solving

It also creates opportunities for future expansion into advanced climate monitoring technologies.

