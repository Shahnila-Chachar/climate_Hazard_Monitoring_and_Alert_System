package service;

public abstract class HazardResponse {

    private String hazardType;

    public HazardResponse(String hazardType) {
        this.hazardType = hazardType.toUpperCase().trim();
    }

    public String getHazardType() {
        return hazardType;
    }

    public abstract String generateAlert();

    public abstract String generateRescuePlan();

    public void displayResponse() {
        String border = "=".repeat(60);
        System.out.println("\n" + border);
        System.out.printf("  %-15s : %s%n", "HAZARD TYPE", getHazardType());
        System.out.printf("  %-15s : %s%n", "ALERT", generateAlert());
        System.out.printf("  %-15s : %s%n", "RESCUE PLAN", generateRescuePlan());
        System.out.println(border + "\n");
    }
}
