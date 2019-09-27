package fleet;

import java.time.LocalDate;

public interface Freighter {
    String getName();

    String getCargoDescription();

    LocalDate getLaunchDate();

    int getDeadweightTonnage();

    Status getStatus();

    void setName(String name);

    void setStatus(Status status);

    void setCargoDescription(String cargoDescription);
}
