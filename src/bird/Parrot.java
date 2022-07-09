package bird;

import java.util.ArrayList;

public class Parrot extends Bird {

    private int numFavWords;
    private String favWord;


    public Parrot(String type, String salientChar, boolean isExtinct, int wingNum, ArrayList<food> favFood) {
        super(type, "Inteligence and ability to mimic sounds", isExtinct, wingNum, favFood);
        this.favWord = null;
        this.numFavWords = 0;
    }

    public Parrot(String type, String salientChar, boolean isExtinct, int wingNum, ArrayList<food> favFood, String favWord, int numFavWords) {
        super(type, "Inteligence and ability to mimic sounds", isExtinct, wingNum, favFood);
        this.favWord = null;
        this.numFavWords = 0;
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

