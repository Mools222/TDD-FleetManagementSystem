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
}