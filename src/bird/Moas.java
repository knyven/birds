package bird;
// Class: Moas
// Creates a bird object Moas with the characteristics of a Moas.
// Name is initialized to the String name passed in to the constructor.
//
// Extends FlightlesBirds and has sharedChar with all Flightless birds.
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
import java.util.Arrays;

public class Moas extends FlightlessBirds{

    public Moas(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.FLIGHTLESS;
        this.birdType = BirdType.MOA;
        this.isExtinct = true;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.FRUIT, Food.SEEDS};
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

    @Override
    public String toString() {
        return "Moas{" +
                "sharedChar='" + this.sharedChar + '\'' +
                ", aviaryTypes=" + this.aviaryTypes +
                ", birdType=" + this.birdType +
                ", name='" + this.name + '\'' +
                ", isExtinct=" + this.isExtinct +
                ", wingNum=" + this.wingNum +
                ", favFood=" + Arrays.toString(this.favFood) +
                '}';
    }
}
