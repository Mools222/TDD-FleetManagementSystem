package fleet;

import java.time.LocalDate;

public class ContainerShip {
    private String name, cargo;
    private LocalDate launchDate;
    private int deadweightTonnage, containerCount;
    private Status status;

    public ContainerShip(String name, String cargo, LocalDate launchDate, int deadweightTonnage, int containerCount, Status status) {
        this.name = name;
        this.cargo = cargo;
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
        return cargo;
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

    public void setCargo(String cargo) {
        if (status.equals(Status.DOCKED_AT_HOME))
            this.cargo = cargo;
    }
}
