package fleet;

import java.time.LocalDate;

public class Tanker {
    private String name, cargoDescription;
    private LocalDate launchDate;
    private int deadweightTonnage, tonnageVolume;
    private Status status;

    public Tanker(String name, String cargoDescription, LocalDate launchDate, int deadweightTonnage, int tonnageVolume, Status status) {
        this.name = name;
        this.cargoDescription = cargoDescription;
        this.launchDate = launchDate;
        this.deadweightTonnage = deadweightTonnage;
        this.tonnageVolume = tonnageVolume;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getCargoDescription() {
        return cargoDescription;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public int getDeadweightTonnage() {
        return deadweightTonnage;
    }

    public int getTonnageVolume() {
        return tonnageVolume;
    }

    public Status getStatus() {
        return status;
    }
}
