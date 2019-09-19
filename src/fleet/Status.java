package fleet;

public enum Status {
    DOCKED_AT_HOME("Docked at home"), DOCKED_AWAY("Docked away"), ON_VOYAGE("On voyage...");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
