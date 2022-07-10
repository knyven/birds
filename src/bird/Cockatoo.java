package bird;

import java.util.Arrays;

public class Cockatoo extends Parrot {


    public Cockatoo(String name, int numFavWords, String favWord) {
        this.birdType = BirdType.COCKATOO;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.name = name;
        this.numFavWords = numFavWords;
        this.favWord = favWord;
        this.salientChar = "white cockatoo";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[]{Food.SEEDS, Food.INSECTS};
    }


    @Override
    public String toString() {
        return "Cockatoo{" +
                "numFavWords=" + numFavWords +
                ", favWord='" + favWord + '\'' +
                ", salientChar='" + salientChar + '\'' +
                ", aviaryTypes=" + aviaryTypes +
                ", birdType=" + birdType +
                ", name='" + name + '\'' +
                ", isExtinct=" + isExtinct +
                ", wingNum=" + wingNum +
                ", favFood=" + Arrays.toString(favFood) +
                '}';
    }
}