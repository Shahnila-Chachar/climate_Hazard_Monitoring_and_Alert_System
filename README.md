# climate_Hazard_Monitoring_and_Alert_System

📖 Project Overview
This project is a Java-based simulation system that detects climate hazards such as floods, earthquakes, fires, and heatwaves using input data like temperature, rainfall, and ground vibration.
The system analyzes the input, generates alerts, and suggests possible rescue actions. It is designed to demonstrate how real-world disaster monitoring systems can be structured using Object-Oriented Programming.

🎯 Purpose
Simulate climate hazard detection
Generate alerts based on environmental conditions
Suggest rescue actions for each hazard
Apply OOP concepts in a real-life inspired system

🧩 Project Structure & Classes
1. Model Package (Data Layer)
🔹 SensorData.java
Responsibility:
Stores environmental data
Fields:
temperature (double)
rainfall (double)
vibration (double)
🔹 Hazard.java
Responsibility:
Represents detected hazard
Fields:
type (String)
severity (String)
2. Service Package (Logic Layer)
🔹 DetectionService.java
Responsibility:
Analyzes SensorData
Detects hazard based on conditions:
High rainfall → Flood
High temperature → Heatwave/Fire
High vibration → Earthquake
🔹 AlertService.java
Responsibility:
Generates alert messages
Example:
“FLOOD ALERT in affected area”
“EARTHQUAKE WARNING detected”
🔹 RescueService.java
Responsibility:
Suggests rescue actions based on hazard type:
Flood → boats, evacuation, rescue teams
Earthquake → medical aid, shelters
Fire → fire brigade, emergency response
3. Main / UI Layer
🔹 Main.java
Responsibility:
Entry point of the program
Takes user input (console)
Calls all services
Displays final alert and rescue suggestion

🧠 OOP Concepts Used
Encapsulation: Private fields with getters/setters
Separation of Concerns: Each class handles one responsibility
Modularity: System divided into Model, Service, and UI layers
Scalability: Easy to add new hazards or features

👥 Work Distribution (Equal Contribution)
👤 Shahnila
Designed project structure
Created SensorData and Hazard classes
Input validation and data handling

👤 Saniya Ilyas
Implemented DetectionService
Defined hazard detection rules
Handled logic for identifying disasters

👤 Taiba Fatima
Developed AlertService
Developed RescueService
Managed output formatting and console UI


▶️ How to Run the Project
Requirements:
JDK 8 or above
Any Java IDE (VS Code)
Steps:
Compile: javac Main.java

Run: Java Main.java

Or simply run Main.java in IDE.

🌱 Future Improvements
Add GUI using Java Swing
Store data using database
Integrate real-time weather API
Improve prediction accuracy

📌 Final Note
This project is a simple simulation of how climate hazard monitoring systems work. It helps understand how real-world disaster detection and alert systems can be designed using Java and OOP principles.
