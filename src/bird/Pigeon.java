package bird;

import java.util.ArrayList;

public class Pigeon extends Bird{
    public Pigeon(String type, boolean isExtinct, int wingNum, ArrayList<food> favFood) {
        super(type,"feeds young bird milk", isExtinct, wingNum, favFood);
    }

    @Override
    public boolean boolFlight() {
        return true;
    }

    @Override
    public boolean boolMammal() {
        return false;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public boolean boolWater() {
        return false;
    }

    @Override
    public String getWaterName() {
        return null;
    }
}
