package service;

public class Solutions {
    private String hazardType;

    public Solutions(String hazardType) {
        this.hazardType = hazardType;

    }

    public String CreateSolutions() {
        if (hazardType.equalsIgnoreCase("flood"))
            return """
                    -Improve drainage Systems.
                    -Plant more and more tress.
                    -Build flood shelters.
                    """;

        else if (hazardType.equalsIgnoreCase("fire"))
            return """
                    -Install fire alarms
                    -Avoid deforestration.
                    -promote Aforestration.
                    """;

        else if (hazardType.equalsIgnoreCase("earthquake"))
            return """
                    -Conduct safety drills.
                    -Construct earthquake-resistant building.
                    -install sesmic monitoring systems.
                    """;
        else if (hazardType.equalsIgnoreCase("heatwave"))
            return """
                    -Create cooling centers.
                    - Reduce carbon emission.
                    -increase green areas.
                    """;

        else
            return "No climate hazard detected";

    }
}
