package bird;

import java.util.ArrayList;

public class PreyBird extends AbstractBird{

    private String salientChar;
    private String sharedChar = "sharp hooked beaks and visible nostrils";



    public String getSalientChar(){
        salientChar = "The common traits are: " + sharedChar;
        return salientChar;
    }

}
