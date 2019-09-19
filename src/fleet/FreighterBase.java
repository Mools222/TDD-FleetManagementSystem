package fleet;

import java.time.LocalDate;

public abstract class FreighterBase implements Freighter {
    private String name, cargoDescription;
    private LocalDate launchDate;
    private int deadweightTonnage;
    private Status status;

    public FreighterBase(String name, String cargoDescription, LocalDate launchDate, int deadweightTonnage, Status status) {
        this.name = name;
        this.cargoDescription = cargoDescription;
        this.launchDate = launchDate;
        this.deadweightTonnage = deadweightTonnage;
        this.status = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCargoDescription() {
        return cargoDescription;
    }

    @Override
    public LocalDate getLaunchDate() {
        return launchDate;
    }

    @Override
    public int getDeadweightTonnage() {
        return deadweightTonnage;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setStatus(Status status) {
        if ((status.equals(Status.ON_VOYAGE) && (this.status.equals(Status.DOCKED_AT_HOME) || this.status.equals(Status.DOCKED_AWAY))) ||
                ((status.equals(Status.DOCKED_AT_HOME) || status.equals(Status.DOCKED_AWAY)) && this.status.equals(Status.ON_VOYAGE)))
            this.status = status;
    }

    @Override
    public void setCargoDescription(String cargoDescription) {
        if (!status.equals(Status.ON_VOYAGE))
            this.cargoDescription = cargoDescription;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nLaunch date: " + launchDate + "\nDWT: " + deadweightTonnage + "\nStatus: " + status.getDescription() + "\nCargo: " + cargoDescription;
    }
}
