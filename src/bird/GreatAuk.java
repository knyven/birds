package bird;

import java.util.Arrays;
// Class: Great-Auk
// Creates a bird object GreatAuk with the characteristics of a Great Auk
// Name is initialized to the String name passed in to the constructor.
//
// Extends WaterBird and has sharedChar with all WaterBirds
//
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
public class GreatAuk extends WaterBird{
    public GreatAuk(String name) {
        this.name = name;
        this.birdType = BirdType.GREATAUK;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.FISH, Food.SMALLMAMMALS};
        this.nameOfWater = "North Atlantic coastal water";
    }

}
