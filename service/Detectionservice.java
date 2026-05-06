package service;
import Model.Hazard;
import Model.Sensor;

public class Detectionservice {
    private static final double FLOOD_RAINFALL_THRESHOLD = 100.0;
    private static final double FIRE_TEMPERATURE_THRESHOLD = 5.0;
    private static final double EARTHQUAKE_VIBRATION_THRESHOLD = 45.0;
    private static final double HEATWAVE_TEMPERATURE_THRESHOLD = 35.0;

    public Hazard detectHazard(Sensor data) {
        if (data.getRainfall() > FLOOD_RAINFALL_THRESHOLD) {
            String severity = data.getRainfall() > 200.0 ? "CRITICAL" : "HIGH";
            return createHazard("FLOOD", severity);
        }
        if (data.getTemperature() > FIRE_TEMPERATURE_THRESHOLD) {
            String severity = data.getTemperature() > 55.0 ? "CRITICAL" : "HIGH";
            return createHazard("FIRE", severity);
        }
        if (data.getVibration() > EARTHQUAKE_VIBRATION_THRESHOLD) {
            String severity = data.getVibration() > 7.5 ? "CRITICAL" : "HIGH";
            return createHazard("EARTHQUAKE", severity);
        }
        if (data.getTemperature() > HEATWAVE_TEMPERATURE_THRESHOLD) {
            String severity = data.getTemperature() > 42.0 ? "HIGH" : "MODERATE";
            return createHazard("HEATWAVE", severity);
        }
         return createHazard("NONE", "LOW");
    }
    private Hazard createHazard(String type, String severity) {
        Hazard hazard = new Hazard();
        hazard.setType(type);
        hazard.setSeverity(severity);
        return hazard;
    }
}