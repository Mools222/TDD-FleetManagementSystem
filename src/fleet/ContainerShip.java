package fleet;

import java.time.LocalDate;
import java.time.Month;

public class ContainerShip {
    private String name;
    private LocalDate launchDate;
    private int deadweightTonnage;

    public ContainerShip(String name, LocalDate launchDate, int deadweightTonnage) {
        this.name = name;
        this.launchDate = launchDate;
        this.deadweightTonnage = deadweightTonnage;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public int getDeadweightTonnage() {
        return deadweightTonnage;
    }

    public int getContainerCount() {
        return 16020;
    }

    public String getCargoDescription() {
        return "empty";
    }

    public Status getStatus() {
        return Status.DOCKED_AT_HOME;
    }
}
