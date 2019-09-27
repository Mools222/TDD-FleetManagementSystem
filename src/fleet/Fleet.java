package fleet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Fleet {
    private ArrayList<Freighter> freighterList;

    public Fleet(Freighter... freighters) {
        freighterList = new ArrayList<>(Arrays.asList(freighters));
    }

    public int getNumberOfFreighters() {
        return freighterList.size();
    }

    public int getTotalDeadweightTonnage() {
        int total = 0;
        for (Freighter freighter : freighterList) {
            total += freighter.getDeadweightTonnage();
        }
        return total;
    }

    public int getNumberOfFreightersLaunchedAfter(LocalDate date) {
        int number = 0;
        for (Freighter freighter : freighterList) {
            if (freighter.getLaunchDate().compareTo(date) > 0)
                ++number;
        }
        return number;
    }

    public Freighter getFreighterByName(String name) {
        for (Freighter freighter : freighterList) {
            if (freighter.getName().equals(name))
                return freighter;
        }
        return null;
    }

    public void removeFreighterByName(String name) {
        freighterList.removeIf(freighter -> freighter.getName().equals(name));
    }

    public int getDeadweightTonnageDocketAtHome() {
        int total = 0;
        for (Freighter freighter : freighterList) {
            if (freighter.getStatus().equals(Status.DOCKED_AT_HOME))
                total += freighter.getDeadweightTonnage();
        }
        return total;
    }
}
