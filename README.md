# climate_Hazard_Monitoring_and_Alert_System

🌍 Climate Hazard Monitoring and Alert System
📖 Project Overview

This project is a Java-based simulation system that detects climate hazards such as floods, earthquakes, fires, and heatwaves using environmental input data like temperature, rainfall, and ground vibration.

The system analyzes the input, generates alerts, and suggests appropriate rescue actions. It demonstrates how real-world disaster monitoring systems can be structured using Object-Oriented Programming (OOP).

🎯 Purpose

Simulate climate hazard detection
Generate alerts based on environmental conditions
Suggest rescue actions for each hazard
Apply OOP concepts in a real-life inspired system
🧩 Project Structure
🔹 Model Package (Data Layer)

SensorData.java

Responsibility: Stores environmental data
Fields:
temperature (double)
rainfall (double)
vibration (double)

Hazard.java

Responsibility: Represents detected hazard
Fields:
type (String)
severity (String)
🔹 Service Package (Logic Layer)

DetectionService.java

Responsibility: Analyzes SensorData
Detection Rules:
High rainfall → Flood
High temperature → Heatwave / Fire
High vibration → Earthquake

AlertService.java

Responsibility: Generates alert messages
Examples:
“FLOOD ALERT in affected area”
“EARTHQUAKE WARNING detected”

RescueService.java

Responsibility: Suggests rescue actions based on hazard type
Examples:
Flood → Boats, evacuation, rescue teams
Earthquake → Medical aid, shelters
Fire → Fire brigade, emergency response
🔹 Main / UI Layer

Main.java

Responsibility: Entry point of the program
Takes user input from console
Calls all services
Displays final alert and rescue suggestions
🧠 OOP Concepts Used
Encapsulation: Private fields with getters/setters
Separation of Concerns: Each class has a single responsibility
Modularity: Divided into Model, Service, and UI layers
Scalability: Easy to add new hazards or features
👥 Work Distribution

👤 Shahnila

Designed project structure
Created SensorData and Hazard classes
Handled input validation and data handling

👤 Saniya Ilyas

Implemented DetectionService
Defined hazard detection rules
Managed disaster identification logic

👤 Taiba Fatima

Developed AlertService
Developed RescueService
Managed output formatting and console UI


▶️ How to Run the Project
✅ Requirements
JDK 8 or above
Any Java IDE (e.g., VS Code, IntelliJ, Eclipse)
🚀 Steps

1. Compile:

javac Main.java

2. Run:

java Main

Or simply run Main.java using your IDE.

🌱 Future Improvements 
Add GUI using Java Swing
Store data using a database (MySQL)
Integrate real-time weather APIs
Improve prediction accuracy
📌 Final Note

This project is a basic simulation of how climate hazard monitoring systems work. It provides a strong understanding of how real-world disaster detection and alert systems can be designed using Java and OOP principles.


Class Design (Your Project Skeleton)
🔷 1. Abstract Class: HazardResponse
📌 Purpose:

Represents a general response to any hazard.
It defines a structure for alerts and rescue actions, but does not implement them.

📋 Requirements:
Private attribute:
hazardType (String)
Constructor:
HazardResponse(String hazardType) — initializes hazard type
Getter:
getHazardType()
Abstract methods:
public abstract String generateAlert();
public abstract String generateRescuePlan();
Concrete method:
displayResponse()
Prints:
Hazard type
Alert message
Rescue plan
Calls abstract methods internally
🟥 2. Concrete Class: AlertService extends HazardResponse
📌 Purpose:

Handles alert message generation based on hazard type.

📋 Requirements:
Constructor:
AlertService(String hazardType)
First line: super(hazardType);
Override method:
generateAlert()
Returns alert message depending on hazard:
FLOOD → Flood Alert
FIRE → Fire Emergency
EARTHQUAKE → Earthquake Warning
HEATWAVE → Heatwave Alert
NONE → No Hazard
Note:
This class focuses only on alerts
🟦 3. Concrete Class: RescueService extends HazardResponse
📌 Purpose:

Provides rescue and emergency action suggestions.

📋 Requirements:
Constructor:
RescueService(String hazardType)
First line: super(hazardType);
Override method:
generateRescuePlan()
Returns actions:
FLOOD → evacuation, boats
FIRE → fire brigade
EARTHQUAKE → medical teams
HEATWAVE → cooling centers
NONE → no action
Note:
This class focuses only on response actions
🟩 4. Main Class: ClimateApp
📌 Purpose:

Controls program execution and connects all modules.

📋 Requirements:
In main method:
Get hazard type (from detection module or input)
Create objects:
AlertService
RescueService
Call:
alert generation
rescue generation
Display output in formatted style
Important Note:
You cannot directly instantiate HazardResponse (abstract class)