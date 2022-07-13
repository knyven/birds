package bird;

import java.util.Arrays;

//Child class Cockatoo Bird that extends Parrot type
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
    @Override
    public String toString() {
        return "Cockatoo{" +
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