package fleet;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class FleetTest {
    @Test
    public void testCreateFleet1() {
        Fleet fleet = new Fleet();
        assertEquals(0, fleet.getNumberOfFreighters());
        assertEquals(0, fleet.getTotalDeadweightTonnage());
    }

    @Test
    public void testCreateFleet2() {
        ContainerShip containership = new ContainerShip("Hansa Carrier", "empty", LocalDate.of(1989, Month.FEBRUARY, 1), 26366, Status.DOCKED_AT_HOME, 1799);
        Tanker tanker = new Tanker("Exxon Valdez", "empty", LocalDate.of(1986, Month.OCTOBER, 14), 214861, Status.DOCKED_AT_HOME, 235000);
        Fleet fleet = new Fleet(containership, tanker);

        assertEquals(2, fleet.getNumberOfFreighters());

    }
}