package fleet;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TankerTest {
    @Test
    public void testCreateTanker1() {
        Tanker tanker = new Tanker("Seawise Giant", "empty", LocalDate.of(1979, Month.DECEMBER, 4), 564763, Status.DOCKED_AT_HOME, 673380);
        assertEquals("Seawise Giant", tanker.getName());
        assertEquals(LocalDate.of(1979, Month.DECEMBER, 4), tanker.getLaunchDate());
        assertEquals(564763, tanker.getDeadweightTonnage());
        assertEquals(673380, tanker.getTonnageVolume());
        assertEquals("empty", tanker.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, tanker.getStatus());
    }

    @Test
    public void testCreateTanker2() {
        Tanker tanker = new Tanker("Exxon Valdez", "empty", LocalDate.of(1986, Month.OCTOBER, 14), 214861, Status.DOCKED_AT_HOME, 235000);
        assertEquals("Exxon Valdez", tanker.getName());
        assertEquals(LocalDate.of(1986, Month.OCTOBER, 14), tanker.getLaunchDate());
        assertEquals(214861, tanker.getDeadweightTonnage());
        assertEquals(235000, tanker.getTonnageVolume());
        assertEquals("empty", tanker.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, tanker.getStatus());
    }

    public Tanker getExxonValdez() {
        return new Tanker("Exxon Valdez", "empty", LocalDate.of(1986, Month.OCTOBER, 14), 214861, Status.DOCKED_AT_HOME, 235000);
    }

    @Test
    public void testChangeName() {
        Tanker tanker = getExxonValdez();
        tanker.setName("Mediterranean");
        assertEquals("Mediterranean", tanker.getName());
    }

    @Test
    public void testChangeStatus() {
        Tanker tanker = getExxonValdez();

        tanker.setStatus(Status.DOCKED_AWAY);
        assertEquals(Status.DOCKED_AT_HOME, tanker.getStatus());

        tanker.setStatus(Status.ON_VOYAGE);
        assertEquals(Status.ON_VOYAGE, tanker.getStatus());

        tanker.setStatus(Status.DOCKED_AWAY);
        assertEquals(Status.DOCKED_AWAY, tanker.getStatus());

        tanker.setStatus(Status.DOCKED_AT_HOME);
        assertEquals(Status.DOCKED_AWAY, tanker.getStatus());
    }

    @Test
    public void testChangeCargo1() {
        Tanker tanker = getExxonValdez();
        tanker.setCargoDescription("crude oil");
        assertEquals("crude oil", tanker.getCargoDescription());
    }

    @Test
    public void testChangeCargo2() {
        Tanker tanker = getExxonValdez();
        tanker.setStatus(Status.ON_VOYAGE);
        tanker.setCargoDescription("crude oil");
        assertEquals("empty", tanker.getCargoDescription());
    }

    @Test
    public void testChangeCargo3() {
        Tanker tanker = getExxonValdez();
        tanker.setCargoDescription("crude oil");
        assertEquals("crude oil", tanker.getCargoDescription());
        tanker.setStatus(Status.ON_VOYAGE);
        assertEquals(Status.ON_VOYAGE, tanker.getStatus());
        tanker.setStatus(Status.DOCKED_AWAY);
        assertEquals(Status.DOCKED_AWAY, tanker.getStatus());
        tanker.setCargoDescription("empty");
        assertEquals("empty", tanker.getCargoDescription());
    }

    @Test
    public void testReport() {
        Tanker tanker = getExxonValdez();
        assertEquals("Name: Exxon Valdez\nLaunch date: 1986-10-14\nDWT: 214861\nStatus: Docked at home\nCargo: empty\nTonnage volume: 235000", tanker.toString());
    }

}