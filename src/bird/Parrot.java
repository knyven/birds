package bird;

import java.util.ArrayList;

public class Parrot extends AbstractBird {

    protected int numFavWords;
    protected String favWord;
    protected String salientChar;
    private String sharedChar = "intelligent and mimic sounds and short, curved beak";

    public String getSalientChar(){
        salientChar = "The common traits are: " + sharedChar;
        return salientChar;
    }

    int getNumFavWords(){
        return this.numFavWords;
    }

    String getFavWord(){
        return this.favWord;
    }


}

