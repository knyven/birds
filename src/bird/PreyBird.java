package bird;

import java.util.ArrayList;

public class PreyBird extends Bird{


    public PreyBird(String type, boolean isExtinct, int wingNum, ArrayList<food> favFood) {
        super(type,"sharp, hooked beaks with visible nostrils",
                isExtinct, wingNum, favFood);
    }

}
