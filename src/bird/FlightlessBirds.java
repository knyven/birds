package bird;
// Class: Abstract class FlightlessBird
//
//
// Extends AbstractBird and shares its methods.
//
// This object will be used to extend several child classes. AKA all flightlessBirds.
//====================================================================================================================//
public class FlightlessBirds extends AbstractBird{
    protected static String sharedChar = "Lives on the ground and has underdeveloped wings or no wings";


    @Override
    public String getSharedChar() {
        return sharedChar;
    }
}
