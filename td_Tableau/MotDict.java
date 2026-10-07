public class MotDict {
    private String mot;
    private String definition;

    public MotDict(String mot, String definition) {
        this.mot = mot;
        this.definition = definition;
    }

    public String getMot() {
        return mot;
    }

    public String getDefinition() {
        return definition;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public boolean synonyme(MotDict dict) {
        return dict != null && this.definition.equalsIgnoreCase(dict.definition);
    }

    @Override
    public String toString() {
        return mot + " : " + definition;
    }
}
