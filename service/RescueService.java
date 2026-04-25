package service;

<<<<<<< HEAD
public class RescueService extends HazardResponse {

    public RescueService(String hazardType){
=======
class RescueService extends HazardResponse {

    RescueService(String hazardType) {
>>>>>>> 6a0e6484103ea840426510806d811ae4edb51c66
        super(hazardType);
    }

    @Override
<<<<<<< HEAD
    public String generateAlert(){
=======
    public String generateAlert() {
>>>>>>> 6a0e6484103ea840426510806d811ae4edb51c66
        return "Handled by AlertService";
    }

    @Override
<<<<<<< HEAD
    public String generateRescuePlan(){
        String type = getHazardType();

        if(type.equalsIgnoreCase("flood"))
            return "Evacuating the place, use of boats.";
        else if(type.equalsIgnoreCase("fire"))
            return "Inform fire brigade, use water units.";
        else if(type.equalsIgnoreCase("earthquake"))
=======
    public String generateRescuePlan() {
        String type = getHazardType();

        if (type.equalsIgnoreCase("flood"))
            return "Evacuating the place, use of boats.";
        else if (type.equalsIgnoreCase("fire"))
            return "Inform fire brigade, use water units.";
        else if (type.equalsIgnoreCase("earthquake"))
>>>>>>> 6a0e6484103ea840426510806d811ae4edb51c66
            return "Call medical team immediately.";
        else if (type.equalsIgnoreCase("heatwave"))
            return "Cooling systems must be used.";
        else
            return "All is well.";
    }
<<<<<<< HEAD

    public static void display(String hazardType, String alert, String rescue){
        System.out.println("===============================================");
        System.out.println(" CLIMATE HAZARD MONITORING AND ALERT SYSTEM ");
        System.out.println("===============================================");

        System.out.println("\nHazard Type: " + hazardType);
        System.out.println("\nAlert: " + alert);
        System.out.println("\nRecommended Action: " + rescue);

        System.out.println("\n===============================================");
    }
}

=======
}
>>>>>>> 6a0e6484103ea840426510806d811ae4edb51c66
