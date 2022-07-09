package bird;
public class Parrot extends Bird {

    private int numFavWords;
    private String favWord;


    public Parrot(String type, boolean isExtinct, int wingNum, String favFood) {
        super(type, isExtinct, wingNum, favFood);
        this.favWord = null;
        this.numFavWords = 0;
    }

    public Parrot(String type, boolean isExtinct, int wingNum, String favFood, int numFavWords, String favWord) {
        super(type, isExtinct, wingNum, favFood);
        this.numFavWords = numFavWords;
        this.favWord = favWord;
    }

    public int getNumFavWords() {
        return this.numFavWords;
    }
    public String getFavWord() {
        return this.favWord;
    }

    public void setNumFavWords(int numFavWords) {
        this.numFavWords = numFavWords;
    }

    public void setFavWord(String favWord) {
        this.favWord = favWord;
    }
}

