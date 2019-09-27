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
    public void testCreateAndChangeFleet1() {
        Freighter hansaCarrier = getHansaCarrier();
        Fleet fleet = new Fleet(hansaCarrier, getExxonValdez());
        assertEquals(hansaCarrier, fleet.getFreighterByName("Hansa Carrier"));
        assertNotEquals(getHansaCarrier(), fleet.getFreighterByName("Hansa Carrier"));
        fleet.getFreighterByName("Hansa Carrier").setCargoDescription("Nike shoes");
        assertEquals("Nike shoes", fleet.getFreighterByName("Hansa Carrier").getCargoDescription());
        fleet.getFreighterByName("Hansa Carrier").setStatus(Status.ON_VOYAGE);
        assertEquals(Status.ON_VOYAGE, fleet.getFreighterByName("Hansa Carrier").getStatus());
        assertEquals("Name: Hansa Carrier\nLaunch date: 1989-02-01\nDWT: 26366\nStatus: On voyage...\nCargo: Nike shoes\nContainer count: 1799", fleet.getFreighterByName("Hansa Carrier").toString());
    }

    @Test
    public void testCreateAndChangeFleet2() {
        Freighter exxonValdez = getExxonValdez();
        Fleet fleet = new Fleet(getHansaCarrier(), exxonValdez);
        assertEquals(exxonValdez, fleet.getFreighterByName("Exxon Valdez"));
        fleet.removeFreighterByName("Exxon Valdez");
        assertNull(fleet.getFreighterByName("Exxon Valdez"));
        assertEquals(1, fleet.getNumberOfFreighters());
    }

    @Test
    public void testFleetInfo1() {
        Fleet fleet = new Fleet(getHansaCarrier(), getExxonValdez());
        assertEquals(241227, fleet.getDeadweightTonnageDocketAtHome());
        fleet.getFreighterByName("Hansa Carrier").setStatus(Status.ON_VOYAGE);
        assertEquals(214861, fleet.getDeadweightTonnageDocketAtHome());
    }

    @Test
    public void testFleetInfo2() {
        Fleet fleet = new Fleet(getHansaCarrier(), getExxonValdez());
        assertEquals(0, fleet.getContainerCountOnVoyage());
        fleet.getFreighterByName("Hansa Carrier").setStatus(Status.ON_VOYAGE);
        assertEquals(1799, fleet.getContainerCountOnVoyage());
    }

    @Test
    public void testAddDuplicateFreighter() {
        Fleet fleet = new Fleet(getHansaCarrier());
        assertEquals(1, fleet.getNumberOfFreighters());
        fleet.addFreighter(getExxonValdez());
        assertEquals(2, fleet.getNumberOfFreighters());
        fleet.addFreighter(getHansaCarrier());
        fleet.addFreighter(getExxonValdez());
        assertEquals(2, fleet.getNumberOfFreighters());
    }
}