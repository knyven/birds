package bird;

import java.util.ArrayList;

public class WaterFowl extends WaterBird{
    private String waterType;

    public WaterFowl(String type, String salientChar, boolean isExtinct, int wingNum, ArrayList<food> favFood, String waterType) {
        super(type,"Live near fresh or salt water", isExtinct, wingNum, favFood, waterType);
    }

    @Override
    public String getWaterName() {
        return this.waterType;
    }
}
