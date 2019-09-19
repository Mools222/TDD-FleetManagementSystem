package fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusTest {
    @Test
    public void testStatus() {
        Status status1 = Status.DOCKED_AT_HOME;
        assertEquals("Docked at home", status1.getDescription());
        Status status2 = Status.DOCKED_AWAY;
        assertEquals("Docked away", status2.getDescription());
        Status status3 = Status.ON_VOYAGE;
        assertEquals("On voyage...", status3.getDescription());
    }
}