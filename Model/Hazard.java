package Model;
public class Hazard {

    private String hazardType;

    public Hazard(String hazardType) {
        this.hazardType = hazardType;
    }
    public Hazard(){
        
    }

    public String getHazardType() {
        return hazardType;
    }

    public String generateAlert() {
        switch (hazardType.toUpperCase()) {
            case "FLOOD":
                return "Flood Alert";
            case "FIRE":
                return "Fire Emergency";
            case "EARTHQUAKE":
                return "Earthquake Warning";
            case "HEATWAVE":
                return "Heatwave Alert";
            default:
                return "No Hazard";
        }
    }

    public String generateRescuePlan() {
        switch (hazardType.toUpperCase()) {
            case "FLOOD":
                return "Evacuation, Boats";
            case "FIRE":
                return "Fire Brigade";
            case "EARTHQUAKE":
                return "Medical Teams";
            case "HEATWAVE":
                return "Cooling Centers";
            default:
                return "No Action Required";
        }
    }

    public void displayResponse() {
        System.out.println("============================================");
        System.out.println("  HAZARD TYPE  : " + getHazardType());
        System.out.println("  ALERT        : " + generateAlert());
        System.out.println("  RESCUE PLAN  : " + generateRescuePlan());
        System.out.println("============================================+");
    }
}

