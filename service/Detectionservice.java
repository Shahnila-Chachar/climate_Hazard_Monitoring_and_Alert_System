
/**
 * Detectionservice.java
 * Analyzes SensorData and determines the type and severity of climate hazard.
 *
 * Detection Thresholds:
 *   Rainfall  > 100mm     → FLOOD
 *   Vibration > 5.0g      → EARTHQUAKE
 *   Temperature > 45°C    → FIRE
 *   Temperature > 35°C    → HEATWAVE
 *   Otherwise             → NONE
 */     
package service;
import Model.Hazard;
import Model.Sensor;

public class Detectionservice {

    // Detection thresholds (easy to adjust for future tuning)
    private static final double FLOOD_RAINFALL_THRESHOLD       = 100.0;
    private static final double EARTHQUAKE_VIBRATION_THRESHOLD = 5.0;
    private static final double FIRE_TEMP_THRESHOLD            = 45.0;
    private static final double HEATWAVE_TEMP_THRESHOLD        = 35.0;
//
    public Hazard detectHazard(Sensor data) {

        // Earthquake — ground vibration check (highest priority)
        if (data.getVibration() > EARTHQUAKE_VIBRATION_THRESHOLD) {
            String severity = data.getVibration() > 7.5 ? "CRITICAL" : "HIGH";
            return createHazard("EARTHQUAKE", severity);
        }

        // Flood — heavy rainfall check
        if (data.getRainfall() > FLOOD_RAINFALL_THRESHOLD) {
            String severity = data.getRainfall() > 200.0 ? "CRITICAL" : "HIGH";
            return createHazard("FLOOD", severity);
        }

        // Fire — extreme temperature check
        if (data.getTemperature() > FIRE_TEMP_THRESHOLD) {
            String severity = data.getTemperature() > 55.0 ? "CRITICAL" : "HIGH";
            return createHazard("FIRE", severity);
        }

        // Heatwave — elevated temperature check
        if (data.getTemperature() > HEATWAVE_TEMP_THRESHOLD) {
            String severity = data.getTemperature() > 42.0 ? "HIGH" : "MODERATE";
            return createHazard("HEATWAVE", severity);
        }

        // No hazard detected
        return createHazard("NONE", "LOW");
    }

    private Hazard createHazard(String type, String severity) {
        Hazard hazard = new Hazard();
        hazard.setType(type);
        hazard.setSeverity(severity);
        return hazard;
    }
}
