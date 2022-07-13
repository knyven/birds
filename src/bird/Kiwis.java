package bird;
// Class: Kiwi
// Creates a bird object Kiwi with the characteristics of a Kiwi.
// Name is initialized to the String name passed in to the constructor.
//
// Extends FlightlesBirds and has sharedChar with all Flightless birds.
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
import java.util.Arrays;

public class Kiwis extends FlightlessBirds{

    public Kiwis(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.FLIGHTLESS;
        this.birdType = BirdType.KIWI;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.INSECTS, Food.LARVAE};
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

}
