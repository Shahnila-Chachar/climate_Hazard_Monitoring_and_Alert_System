import java.util.Scanner;
import Model.Hazard;
import Model.Sensor;
import service.HazardResponse;
import service.Detectionsensor;
import service.RescueService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Temperature:");
        double temp = scanner.nextDouble();

        System.out.println("Enter Rainfall:");
        double rainfall = scanner.nextDouble();

        System.out.println("Enter Vibration:");
        double vibration = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter Hazard Type:");
        String hazardType = scanner.nextLine();   // (still here, but not really needed)

        Sensor sensor = new Sensor(temp, rainfall, vibration);
        Hazard hazard = new Hazard(hazardType, "HIGH");

        Detectionsensor detect = new Detectionsensor();
        hazard = detect.detectHazard(sensor);

        System.out.println(sensor);
        System.out.println(hazard);

        // ✅ FIXED PART
        String type = hazard.getType();
        HazardResponse response = new RescueService(type);

        response.displayResponse();

        scanner.close();
    }
}