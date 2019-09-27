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

    public ContainerShip getHansaCarrier() {
        return new ContainerShip("Hansa Carrier", "empty", LocalDate.of(1989, Month.FEBRUARY, 1), 26366, Status.DOCKED_AT_HOME, 1799);
    }

    public Tanker getExxonValdez() {
        return new Tanker("Exxon Valdez", "empty", LocalDate.of(1986, Month.OCTOBER, 14), 214861, Status.DOCKED_AT_HOME, 235000);
    }

    @Test
    public void testCreateFleet2() {
        Fleet fleet = new Fleet(getHansaCarrier(), getExxonValdez());
        assertEquals(2, fleet.getNumberOfFreighters());
        assertEquals(241227, fleet.getTotalDeadweightTonnage());
    }

    @Test
    public void testCreateFleet3() {
        Fleet fleet = new Fleet();
        assertEquals(0, fleet.getNumberOfFreightersLaunchedAfter(LocalDate.of(1900, Month.JANUARY, 1)));
    }

    @Test
    public void testCreateFleet4() {
        Fleet fleet = new Fleet(getHansaCarrier(), getExxonValdez());
        assertEquals(1, fleet.getNumberOfFreightersLaunchedAfter(LocalDate.of(1987, Month.MAY, 1)));
    }

    @Test
    public void testCreateAndChangeFleet() {
        Freighter hansaCarrier = getHansaCarrier();
        Fleet fleet = new Fleet(hansaCarrier, getExxonValdez());
        assertEquals(hansaCarrier, fleet.getFreighterByName("Hansa Carrier"));
        assertNotEquals(getHansaCarrier(), fleet.getFreighterByName("Hansa Carrier"));
        fleet.getFreighterByName("Hansa Carrier").setCargoDescription("Nike shoes");
        assertEquals("Nike shoes", fleet.getFreighterByName("Hansa Carrier").getCargoDescription());
        fleet.getFreighterByName("Hansa Carrier").setStatus(Status.ON_VOYAGE);
        assertEquals(Status.ON_VOYAGE, fleet.getFreighterByName("Hansa Carrier").getStatus());
    }

}