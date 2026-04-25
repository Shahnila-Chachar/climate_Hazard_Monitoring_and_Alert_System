package Model;

public class Hazard {

    private String type;
    private String severity;

    public Hazard(String type, String severity) {
        this.type = type;
        this.severity = severity;
    }
    public Hazard(){
        
    }

    public String getType() {
        return type;
    }

    public String getSeverity() {
        return severity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Hazard:\n Type = " + type + " | Severity = " + severity + " ";
    }
}