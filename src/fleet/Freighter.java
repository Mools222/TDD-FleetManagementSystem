package fleet;

import java.time.LocalDate;

public interface Freighter {
    public String getName();

    public String getCargoDescription();

    public LocalDate getLaunchDate();

    public int getDeadweightTonnage();

    public Status getStatus();

    public void setName(String name);

    public void setStatus(Status status);

    public void setCargoDescription(String cargoDescription);
}
