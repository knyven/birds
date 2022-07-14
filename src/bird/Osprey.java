package bird;

import java.util.Arrays;
// Class: Osprey
// Creates a bird object Osprey with the characteristics of an Osprey.
// Name is initialized to the String name passed in to the constructor.
//
// Extends PreyBird and has sharedChar with all WaterBirds
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
public class Osprey extends PreyBird{


    public Osprey(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.PREY;
        this.birdType = BirdType.OSPREY;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};
    }

}
