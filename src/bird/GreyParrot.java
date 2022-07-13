package bird;

import java.util.Arrays;

public class GreyParrot extends Parrot{


    public GreyParrot(String name, int numFavWords, String favWord) {
        this.birdType = BirdType.GREYPARROT;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.name = name;
        this.numFavWords = numFavWords;
        this.favWord = favWord;
        this.salientChar = "grey parrot";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[]{Food.SEEDS, Food.INSECTS};
    }


    @Override
    public String toString() {
        return "GreyParrot{" +
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

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }
}
