package bird;

public class Cockatoo extends Parrot {
    public AviaryTypes aviaryType;
    public BirdType birdType;

    public Cockatoo(String name, int numFavWords, String favWord) {
        this.birdType = BirdType.COCKATOO;
        this.aviaryType = AviaryTypes.OTHER;
        this.name = name;
        this.numFavWords = numFavWords;
        this.favWord = favWord;
        this.salientChar = "white cockatoo";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[]{Food.SEEDS, Food.INSECTS};
    }
}