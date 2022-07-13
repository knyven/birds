package bird;

import java.util.Arrays;
// Class: Duck
// Creates a bird object Duck with the characteristics of a Duck
// Name is initialized to the String name passed in to the constructor.
//
// Extends WaterBird and has sharedChar with all WaterBirds
// Includes a nameOfWater attribute.
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
public class Duck extends WaterBird{

    public Duck(String name) {
        this.name = name;
        //Specific waterfowl bird type
        this.birdType = BirdType.DUCK;
        //aviary group it belongs too
        this.aviaryTypes = AviaryTypes.WATERFOWL;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.SEEDS};
        this.nameOfWater = "freshwater ponds";
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "nameOfWater='" + this.nameOfWater + '\'' +
                ", sharedChar='" + this.sharedChar + '\'' +
                ", aviaryTypes=" + this.aviaryTypes +
                ", birdType=" + this.birdType +
                ", name='" + this.name + '\'' +
                ", isExtinct=" + this.isExtinct +
                ", wingNum=" + this.wingNum +
                ", favFood=" + Arrays.toString(this.favFood) +
                '}';
    }
}
