package fleet;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class ContainerShipTest {
    @Test
    public void testCreateContainerShip1() {
        ContainerShip containership = new ContainerShip();
        assertEquals("Marco Polo", containership.getName());
        assertEquals(LocalDate.of(2012, Month.NOVEMBER, 6), containership.getLaunchDate());
        assertEquals(187625, containership.getDeadweightTonnage());
        assertEquals(16020, containership.getContainerCount());
        assertEquals("empty", containership.getCargoDescription());
        assertEquals(Status.DOCKED_AT_HOME, containership.getStatus());
    }
}