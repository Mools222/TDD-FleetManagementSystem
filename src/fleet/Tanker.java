package fleet;

import java.time.LocalDate;

public class Tanker extends FreighterBase {
    private int tonnageVolume;

    public Tanker(String name, String cargoDescription, LocalDate launchDate, int deadweightTonnage, Status status, int tonnageVolume) {
        super(name, cargoDescription, launchDate, deadweightTonnage, status);
        this.tonnageVolume = tonnageVolume;
    }

    public int getTonnageVolume() {
        return tonnageVolume;
    }
}
