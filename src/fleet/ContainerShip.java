package fleet;

import java.time.LocalDate;

public class ContainerShip extends FreighterBase {
    private int containerCount;

    public ContainerShip(String name, String cargoDescription, LocalDate launchDate, int deadweightTonnage, Status status, int containerCount) {
        super(name, cargoDescription, launchDate, deadweightTonnage, status);
        this.containerCount = containerCount;
    }

    public int getContainerCount() {
        return containerCount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nContainer count: " + containerCount;
    }
}