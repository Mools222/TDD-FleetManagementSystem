package fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerShipTest {
    @Test
    public void testCreateContainerShip1() {
        ContainerShip containership = new ContainerShip();
        assertEquals("Marco Polo", containership.getName());
    }

}