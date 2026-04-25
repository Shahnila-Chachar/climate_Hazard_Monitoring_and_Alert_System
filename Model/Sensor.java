package Model;
public class Sensor {

    private double temperature;
    private double rainfall;
    private double vibration;

    public Sensor(double temperature, double rainfall, double vibration) {
        this.temperature = temperature;
        this.rainfall = rainfall;
        this.vibration = vibration;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getRainfall() {
        return rainfall;
    }

    public double getVibration() {
        return vibration;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public void setVibration(double vibration) {
        this.vibration = vibration;
    }

    @Override
    public String toString() {
        return String.format(
                "Sensor:\n Temperature = %.1f°C, Rainfall = %.1fmm, Vibration = %.2fg",
                temperature, rainfall, vibration);
    }
}
