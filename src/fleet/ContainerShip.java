package fleet;

import java.time.LocalDate;

public class ContainerShip {
    private String name;
    private LocalDate launchDate;
    private int deadweightTonnage, containerCount;

    public ContainerShip(String name, LocalDate launchDate, int deadweightTonnage, int containerCount) {
        this.name = name;
        this.launchDate = launchDate;
        this.deadweightTonnage = deadweightTonnage;
        this.containerCount = containerCount;
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
        return containerCount;
    }

    public String getCargoDescription() {
        return "empty";
    }

    public Status getStatus() {
        return Status.DOCKED_AT_HOME;
    }
}
