package fleet;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerShipTest {
    @Test
    public void testCreateContainerShip1() {
        ContainerShip containership = new ContainerShip("Marco Polo", "empty", LocalDate.of(2012, Month.NOVEMBER, 6), 187625, Status.DOCKED_AT_HOME, 16020);
        assertEquals("Marco Polo", containership.getName());
        assertEquals(LocalDate.of(2012, Month.NOVEMBER, 6), containership.getLaunchDate());
        assertEquals(187625, containership.getDeadweightTonnage());
        assertEquals(16020, containership.getContainerCount());
        assertEquals("empty", containership.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, containership.getStatus());
    }

    @Test
    public void testCreateContainerShip2() {
        ContainerShip containership = new ContainerShip("Hansa Carrier", "empty", LocalDate.of(1989, Month.FEBRUARY, 1), 26366, Status.DOCKED_AT_HOME, 1799);
        assertEquals("Hansa Carrier", containership.getName());
        assertEquals(LocalDate.of(1989, Month.FEBRUARY, 1), containership.getLaunchDate());
        assertEquals(26366, containership.getDeadweightTonnage());
        assertEquals(1799, containership.getContainerCount());
        assertEquals("empty", containership.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, containership.getStatus());
    }

    public ContainerShip getHansaCarrier() {
        return new ContainerShip("Hansa Carrier", "empty", LocalDate.of(1989, Month.FEBRUARY, 1), 26366, Status.DOCKED_AT_HOME, 1799);
    }

    @Test
    public void testChangeName() {
        ContainerShip containership = getHansaCarrier();
        containership.setName("Ocean Hope");
        assertEquals("Ocean Hope", containership.getName());
    }

    @Test
    public void testChangeStatus() {
        ContainerShip containership = getHansaCarrier();

        containership.setStatus(Status.DOCKED_AWAY);
        assertEquals(Status.DOCKED_AT_HOME, containership.getStatus());

        containership.setStatus(Status.ON_VOYAGE);
        assertEquals(Status.ON_VOYAGE, containership.getStatus());

        containership.setStatus(Status.DOCKED_AWAY);
        assertEquals(Status.DOCKED_AWAY, containership.getStatus());

        containership.setStatus(Status.DOCKED_AT_HOME);
        assertEquals(Status.DOCKED_AWAY, containership.getStatus());
    }

    @Test
    public void testChangeCargo1() {
        ContainerShip containership = getHansaCarrier();
        containership.setCargoDescription("Nike shoes");
        assertEquals("Nike shoes", containership.getCargoDescription());
    }

    @Test
    public void testChangeCargo2() {
        ContainerShip containership = getHansaCarrier();
        containership.setStatus(Status.ON_VOYAGE);
        containership.setCargoDescription("Nike shoes");
        assertEquals("empty", containership.getCargoDescription());
    }

    @Test
    public void testChangeCargo3() {
        ContainerShip containership = getHansaCarrier();
        containership.setCargoDescription("Nike shoes");
        assertEquals("Nike shoes", containership.getCargoDescription());
        containership.setStatus(Status.ON_VOYAGE);
        assertEquals(Status.ON_VOYAGE, containership.getStatus());
        containership.setStatus(Status.DOCKED_AWAY);
        assertEquals(Status.DOCKED_AWAY, containership.getStatus());
        containership.setCargoDescription("empty");
        assertEquals("empty", containership.getCargoDescription());
    }

    @Test
    public void testReport() {
        ContainerShip containership = getHansaCarrier();
        assertEquals("Name: Hansa Carrier\nLaunch date: 1989-02-01\nDWT: 26366\nStatus: Docked at home\nCargo: empty\nContainer count: 1799", containership.toString());
    }


}