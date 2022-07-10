package bird;

import java.util.ArrayList;

abstract class FlightlessBirds extends AbstractBird{
    private static String[] flightlessChar = {"Lives on the ground", "Has no or underdeveloped wings"};

    public String[] getChar(){
        return flightlessChar;
    }

}
