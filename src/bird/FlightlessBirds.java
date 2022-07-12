package bird;


//Abstract class for Flightless birds type
abstract class FlightlessBirds extends AbstractBird{
    private static String sharedChar = "Lives on the ground and has underdeveloped wings or no wings";

    public String getChar(){
        return sharedChar;
    }

    @Override
    public Food[] getFavFood() {

        return this.favFood;
    }

}
