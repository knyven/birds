package bird;

import java.util.Arrays;
// Class: Geese
// Creates a bird object Geese with the characteristics of a Geese.
// Name is initialized to the String name passed in to the constructor.
//
// Extends WaterBird and has sharedChar with all WaterBirds
//
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//

public class Geese extends WaterBird{

    public Geese(String name) {
        this.name = name;
        this.birdType = BirdType.GEESE;
        this.aviaryTypes = AviaryTypes.WATERFOWL;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.SEEDS, Food.NUTS};
        this.nameOfWater = "freshwater ponds";
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

}
