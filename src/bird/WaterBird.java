package bird;

public class WaterBird extends Bird{
    private String waterType;
    private String name;


    public WaterBird(String type, boolean isExtinct, int wingNum, String favFood, String waterType) {
        super(type, isExtinct, wingNum, favFood);
        this.waterType = waterType;
    }

    public WaterBird(String type, boolean isExtinct, int wingNum, String favFood, String name, String waterType) {
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

    public void setName(String name) {
        this.name = name;
    }
}
