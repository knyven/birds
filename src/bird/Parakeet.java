package bird;

public class Parakeet extends Parrot{
    public AviaryTypes aviaryType;
    public BirdType birdType;

    public Parakeet(String name, int numFavWords, String favWord) {
        this.birdType = BirdType.PARAKEET;
        this.aviaryType = AviaryTypes.OTHER;
        this.name = name;
        this.numFavWords = numFavWords;
        this.favWord = favWord;
        this.salientChar = "rose colored ring";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};
    }

}
