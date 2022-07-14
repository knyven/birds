package bird;
// Class: Emu
// Creates a bird object Emu with the characteristics of an Emu.
// Name is initialized to the String name passed in to the constructor.
//
// Extends FlightlesBirds and has sharedChar with all Flightless birds.
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
import java.util.Arrays;

public class Emus extends FlightlessBirds{

    public Emus(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.FLIGHTLESS;
        this.birdType = BirdType.EMU;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[]{Food.INSECTS, Food.VEGETATION};
    }


}
