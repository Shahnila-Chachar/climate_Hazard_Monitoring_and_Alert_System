package service;

public class RescueServices extends HazardResponse {

    public RescueServices(String hazardType) {
        super(hazardType);
    }

    @Override
    public String generateAlert() {
        return "Handled by AlertService";
    }

    @Override
    public String generateRescuePlan() {
        String type = getHazardType();

        if (type.equalsIgnoreCase("flood"))
            return "Evacuating the place, use of boats.";
        else if (type.equalsIgnoreCase("fire"))
            return "Inform fire brigade, use water units.";
        else if (type.equalsIgnoreCase("earthquake"))
            return "Call medical team immediately.";
        else if (type.equalsIgnoreCase("heatwave"))
            return "Cooling systems must be used.";
        else
            return "All is well.";
    }
}