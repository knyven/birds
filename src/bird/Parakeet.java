package bird;

import java.util.Arrays;

public class Parakeet extends Parrot{


    public Parakeet(String name, int numFavWords, String favWord) {
        this.birdType = BirdType.PARAKEET;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.name = name;
        this.numFavWords = numFavWords;
        this.favWord = favWord;
        this.salientChar = "rose colored ring";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};
    }


    @Override
    public String toString() {
        return "Parakeet{" +
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
