package bird;

import java.util.Arrays;
// Class: Eagle
// Creates a bird object Eagle with the characteristics of an Eagle.
// Name is initialized to the String name passed in to the constructor.
//
// Extends PreyBird and has sharedChar with all WaterBirds
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
public class Eagle extends PreyBird {


    public Eagle(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.PREY;
        this.birdType = BirdType.EAGLE;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "aviaryTypes=" + this.aviaryTypes +
                ", birdType=" + this.birdType +
                ", name='" + this.name + '\'' +
                ", sharedChar='" + this.sharedChar + '\'' +
                ", isExtinct=" + this.isExtinct +
                ", wingNum=" + this.wingNum +
                ", favFood=" + Arrays.toString(this.favFood) +
                '}';
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }


}
