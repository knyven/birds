package bird;
// Class: Abstract class FlightlessBird
//
//
// Extends AbstractBird and shares its methods.
//
// This object will be used to extend several child classes. AKA all flightlessBirds.
//====================================================================================================================//
abstract class FlightlessBirds extends AbstractBird{
    protected String sharedChar = "Lives on the ground and has underdeveloped wings or no wings";

    public String getChar(){
        return sharedChar;
    }

    @Override
    public Food[] getFavFood() {

        return this.favFood;
    }

    abstract String getSharedChar();

}
