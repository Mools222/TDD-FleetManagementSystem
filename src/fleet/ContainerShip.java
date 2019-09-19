package fleet;

import java.time.LocalDate;

public class ContainerShip {
    private String name, cargoDescription;
    private LocalDate launchDate;
    private int deadweightTonnage, containerCount;
    private Status status;

    public ContainerShip(String name, String cargoDescription, LocalDate launchDate, int deadweightTonnage, int containerCount, Status status) {
        this.name = name;
        this.cargoDescription = cargoDescription;
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
        return cargoDescription;
    }

    public Status getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Status status) {
        if ((status.equals(Status.ON_VOYAGE) && (this.status.equals(Status.DOCKED_AT_HOME) || this.status.equals(Status.DOCKED_AWAY))) ||
                ((status.equals(Status.DOCKED_AT_HOME) || status.equals(Status.DOCKED_AWAY)) && this.status.equals(Status.ON_VOYAGE)))
            this.status = status;
    }

    public void setCargoDescription(String cargoDescription) {
        if (!status.equals(Status.ON_VOYAGE))
            this.cargoDescription = cargoDescription;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nLaunch date: " + launchDate + "\nDWT: " + deadweightTonnage + "\nContainer count: " + containerCount + "\nStatus: " + status.getDescription() + "\nCargo: " + cargoDescription;
    }
}
