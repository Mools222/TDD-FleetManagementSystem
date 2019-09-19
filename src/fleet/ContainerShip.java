package fleet;

import java.time.LocalDate;
import java.time.Month;

public class ContainerShip {
    private String name;

    public ContainerShip(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLaunchDate() {
        return LocalDate.of(2012, Month.NOVEMBER, 6);
    }

    public int getDeadweightTonnage() {
        return 187625;
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
