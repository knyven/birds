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

}
