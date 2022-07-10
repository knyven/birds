package bird;

public class GreyParrot extends Parrot{
    public AviaryTypes aviaryType;
    public BirdType birdType;

    public GreyParrot(String name, int numFavWords, String favWord) {
        this.birdType = BirdType.GREYPARROT;
        this.aviaryType = AviaryTypes.OTHER;
        this.name = name;
        this.numFavWords = numFavWords;
        this.favWord = favWord;
        this.salientChar = "grey parrot";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[]{Food.SEEDS, Food.INSECTS};
    }
}
