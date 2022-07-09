package bird;

import java.util.ArrayList;

public class FlightlessBirds extends Bird{

    public FlightlessBirds(String type, boolean isExtinct, int wingNum, ArrayList<food> favFood) {
        super(type, "flightless bird", isExtinct, wingNum, favFood);
    }
}
