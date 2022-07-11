package bird;

import java.util.ArrayList;

abstract class PreyBird extends AbstractBird{

    protected String salientChar;
    static String sharedChar = "sharp hooked beaks and visible nostrils";


    public String getChar(){
        return "The specific traits are: " + salientChar + "\n" +
         "The common traits are: " + sharedChar;
    }

    @Override
    public Food[] getFavFood() {

        return this.favFood;
    }

}
