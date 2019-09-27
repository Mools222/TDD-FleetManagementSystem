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
}
