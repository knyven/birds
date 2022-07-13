package bird;

import java.util.Arrays;
// Class: GreyParrot
// Creates a bird object GreyParrot with the characteristics of a GreyParrot.
// Name is initialized to the String name passed in to the constructor.
//
// Extends Parrot and has sharedChar with all Parrots.
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
public class GreyParrot extends Parrot{


    public GreyParrot(String name, int numFavWords, String favWord) {
        this.birdType = BirdType.GREYPARROT;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.name = name;
        this.numFavWords = numFavWords;
        this.favWord = favWord;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[]{Food.SEEDS, Food.INSECTS};
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

    @Override
    public String toString() {
        return "GreyParrot{" +
                "numFavWords=" + this.numFavWords +
                ", favWord='" + this.favWord + '\'' +
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
