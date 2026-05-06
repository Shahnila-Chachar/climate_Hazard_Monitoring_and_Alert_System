package service;

class Solutions{
    private String hazardType;

    public Solutions(String hazardType){
        this.hazardType = hazardType;

    }

    public String CreateSolutions(){
        if(hazardType.equalsIgnoreCase("flood"))
        return """
                -Improve drainage Systems.
                -Plant more and more tress.
                -Build flood shelters.
                """;

        else if(hazardType.equalsIgnoreCase("fire"))
            return """
                    -Install fire alarms
                    -Avoid deforestration.
                    -promote Aforestration.
                    """;
        
        else if(hazardType.equalsIgnoreCase("earthquake"))
            return """
                    -Conduct safety drills.
                    -Construct earthquake-resistant building.
                    -install sesmic monitoring systems.
                    """;
        else if(hazardType.equalsIgnoreCase("heatwave"))
            return """
                    -Create cooling centers.
                    - Reduce carbon emission.
                    -increase green areas.
                    """;

        else
            return "No climate hazard detected";
                
    }
}


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

