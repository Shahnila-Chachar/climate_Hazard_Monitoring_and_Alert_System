import java.util.Scanner;
import Model.Hazard;
import Model.Sensor;

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
        String hazardType = scanner.nextLine();

        Sensor sensor = new Sensor(temp, rainfall, vibration);
        Hazard hazard = new Hazard(hazardType, "HIGH");
        RescueService rescueService = new RescueService();

        rescueService.display(
                hazard.getType(),
                alert,
                "Recommended Action: Evacuate immediately!");
        System.out.println(sensor);
        System.out.println(hazard);

    }
}