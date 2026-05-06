import javax.swing.*;
import java.awt.*;
import Model.Sensor;
import Model.Hazard;
import service.Detectionsensor;
import service.AlertServices;
import service.RescueService;

public class MainGUI extends JFrame {

    private JTextField tempField;
    private JTextField rainField;
    private JTextField vibrationField;
    private JTextArea resultArea;

    public MainGUI() {
        setTitle("Climate Hazard Monitoring System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Temperature:"));
        tempField = new JTextField(10);
        add(tempField);

        add(new JLabel("Rainfall:"));
        rainField = new JTextField(10);
        add(rainField);

        add(new JLabel("Vibration:"));
        vibrationField = new JTextField(10);
        add(vibrationField);

        JButton detectButton = new JButton("Detect Hazard");
        add(detectButton);

        resultArea = new JTextArea(10, 35);
        add(resultArea);

        detectButton.addActionListener(e -> {
            try {
                double temp = Double.parseDouble(tempField.getText());
                double rain = Double.parseDouble(rainField.getText());
                double vibration = Double.parseDouble(vibrationField.getText());

                Sensor sensor = new Sensor(temp, rain, vibration);

                Detectionsensor detector = new Detectionsensor();
                Hazard hazard = detector.detectHazard(sensor);

                String type = hazard.getType();

                // YOUR PART USED HERE ✅
                AlertServices alert = new AlertServices(type);
                RescueService rescue = new RescueService(type);

                String alertMsg = alert.generateAlert();
                String rescueMsg = rescue.generateRescuePlan();

                resultArea.setText(
                        "Hazard Type: " + type +
                        "\nSeverity: " + hazard.getSeverity() +
                        "\n\nAlert: " + alertMsg +
                        "\nRescue Plan: " + rescueMsg
                );

            } catch (Exception ex) {
                resultArea.setText("Invalid input! Please enter numeric values.");
            }
        });
    }

    public static void main(String[] args) {
        new MainGUI().setVisible(true);
    }
}