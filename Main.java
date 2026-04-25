import Model.Hazard;
import Model.Sensor;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor(25.5, 10.2, 0.8);
        Hazard hazard = new Hazard("FLOOD");

        System.out.println(sensor);
        hazard.displayResponse();
    }
}