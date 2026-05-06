package service;

public class AlertServices extends HazardResponse {
    public AlertServices(String hazardType) {
        super(hazardType);
    }

    @Override
    public String generateAlert() {

        String type = getHazardType();
        if (type.equalsIgnoreCase("flood"))
            return "Alert: Flood Risk Detected!";
        else if (type.equalsIgnoreCase("fire"))
            return "Alert: Fire Emergency";
        else if (type.equalsIgnoreCase("	EarthQuake"))
            return "Alert: EarthQuake";
        else if (type.equalsIgnoreCase("Heatwave"))
            return "Alert: Heatwave Risk";
        else
            return "No hazard detected";
    }

    @Override
    public String generateRescuePlan() {
        return "Handled by the rescue service team";
    }

}
