package bird;

import java.util.ArrayList;

public class ShoreBirds extends WaterBird {

    private String waterType;
    public ShoreBirds(String type, String salientChar, boolean isExtinct, int wingNum, ArrayList<food> favFood, String waterType) {
        super(type, salientChar, isExtinct, wingNum, favFood);
        this.waterType = waterType;
    }

    public String getWaterType(){
        return this.waterType;
    }
}
