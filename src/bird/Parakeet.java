package bird;

import java.util.Arrays;
// Class: Parakeet
// Creates a bird object Parakeet with the characteristics of a Parakeet.
// Name is initialized to the String name passed in to the constructor.
//
// Extends Parrot and has sharedChar with all Parrots.
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
public class Parakeet extends Parrot{


    public Parakeet(String name, int numFavWords, String favWord) {
        this.birdType = BirdType.PARAKEET;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.name = name;
        this.numFavWords = numFavWords;
        this.favWord = favWord;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

    @Override
    public String toString() {
        return "Parakeet{" +
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
