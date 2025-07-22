package pilasColas.pacientes;

public enum Gravity {
    MINOR("Minor", 1),
    MODERATE("Moderate", 2),
    SEVERE("Severe", 3),
    VERY_SEVERE("Very Severe", 4);

    private String description;
    private int level;


    private Gravity(String description, int level) {
        this.description = description;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
