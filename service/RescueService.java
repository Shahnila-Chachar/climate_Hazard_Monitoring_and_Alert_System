package service;

public class RescueService extends HazardResponse {

    public RescueService(String hazardType) {
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

    public static void display(String hazardType, String alert, String rescue) {

        Solutions s1 = new Solutions(hazardType);
        System.out.println("===============================================");
        System.out.println(" CLIMATE HAZARD MONITORING AND ALERT SYSTEM ");
        System.out.println("===============================================");

        System.out.println("\nHazard Type: " + hazardType);
        System.out.println("\nAlert: " + alert);
        System.out.println("\nRecommended Action: " + rescue);
        System.out.println("\nGenerate solution: " + s1.CreateSolutions());

        System.out.println("\n===============================================");
    }
}
