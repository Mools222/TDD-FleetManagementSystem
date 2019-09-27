package fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FleetTest {
    @Test
    public void testCreateFleet1() {
        Fleet fleet = new Fleet();
        assertEquals(0, fleet.getNumberOfFreighters());
        assertEquals(0, fleet.getTotalDeadweightTonnage());

    }
}