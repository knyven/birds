package bird;
// Class: Cockatoo
// Creates a bird object Cockatoo with the characteristics of a Cockatoo.
// Name is initialized to the String name passed in to the constructor.
//
// Extends Parrot and has sharedChar with all Parrots.
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//

import java.util.Arrays;


public class Cockatoo extends Parrot {


    public Cockatoo(String name, int numFavWords, String favWord) {
        //specific parrot type
        this.birdType = BirdType.COCKATOO;
        //aviary group it belongs too
        this.aviaryTypes = AviaryTypes.OTHER;
        this.name = name;
        //number of favorite word and favorite word variables
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

}