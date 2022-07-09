package bird;

import java.util.ArrayList;

public class WaterBird extends Bird{
    private String waterType;


    public WaterBird(String type, boolean isExtinct, int wingNum, ArrayList<food> favFood, String waterType) {
        super(type, isExtinct, wingNum, favFood);
        this.waterType = waterType;
    }

    public WaterBird(String type, boolean isExtinct, int wingNum, ArrayList<food> favFood, String name, String waterType) {
        super(type, isExtinct, wingNum, favFood);
        this.waterType = waterType;
        this.name = name;
    }

    public String getWaterType() {
        return this.waterType;
    }

    public String getName() {
        return this.name;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

}
