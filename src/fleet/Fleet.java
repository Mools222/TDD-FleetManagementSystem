package fleet;

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
        return 0;
    }
}
