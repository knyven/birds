package bird;

import java.util.Arrays;
// Class: Swan
// Creates a bird object HornedPuffin with the characteristics of a HornedPuffin.
// Name is initialized to the String name passed in to the constructor.
//
// Extends WaterBird and has sharedChar with all WaterBirds
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
public class HornedPuffin extends WaterBird{
    public HornedPuffin(String name) {
        this.name = name;
        this.birdType = BirdType.PUFFIN;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.FISH, Food.SMALLMAMMALS};
        this.nameOfWater = "North Pacific coastal water";
    }


}
