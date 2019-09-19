package fleet;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerShipTest {
    @Test
    public void testCreateContainerShip1() {
        ContainerShip containership = new ContainerShip("Marco Polo", LocalDate.of(2012, Month.NOVEMBER, 6), 187625, 16020);
        assertEquals("Marco Polo", containership.getName());
        assertEquals(LocalDate.of(2012, Month.NOVEMBER, 6), containership.getLaunchDate());
        assertEquals(187625, containership.getDeadweightTonnage());
        assertEquals(16020, containership.getContainerCount());
        assertEquals("empty", containership.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, containership.getStatus());
    }

    @Test
    public void testCreateContainerShip2() {
        ContainerShip containership = new ContainerShip("Hansa Carrier", LocalDate.of(1989, Month.FEBRUARY, 1), 26366, 1799);
        assertEquals("Hansa Carrier", containership.getName());
        assertEquals(LocalDate.of(1989, Month.FEBRUARY, 1), containership.getLaunchDate());
        assertEquals(26366, containership.getDeadweightTonnage());
        assertEquals(1799, containership.getContainerCount());
        assertEquals("empty", containership.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, containership.getStatus());
    }

    public void testChangeName() {
        ContainerShip containership = new ContainerShip("Hansa Carrier", LocalDate.of(1989, Month.FEBRUARY, 1), 26366, 1799);
        containership.setName("Ocean Hope");
        assertEquals("Ocean Hope", containership.getName());
    }

}