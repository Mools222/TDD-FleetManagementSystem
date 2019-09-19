package fleet;

import java.time.LocalDate;
import java.time.Month;

public class ContainerShip {

    public String getName() {
        return "Marco Polo";
    }

    public LocalDate getLaunchDate() {
        return LocalDate.of(2012, Month.NOVEMBER, 6);
    }
}
