package fleet;

import java.time.LocalDate;

public class ContainerShip {
    private String name;
    private LocalDate launchDate;
    private int deadweightTonnage, containerCount;
    private Status status;

    public ContainerShip(String name, LocalDate launchDate, int deadweightTonnage, int containerCount, Status status) {
        this.name = name;
        this.launchDate = launchDate;
        this.deadweightTonnage = deadweightTonnage;
        this.containerCount = containerCount;
        this.status = status;
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
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
