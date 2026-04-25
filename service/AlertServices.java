package service;

<<<<<<< HEAD
    public class AlertServices extends HazardResponse{
	AlertServices(String hazardType){
		super(hazardType);
	}
=======
class AlertServices extends HazardResponse {
    AlertServices(String hazardType) {
        super(hazardType);
    }
>>>>>>> 6a0e6484103ea840426510806d811ae4edb51c66

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
