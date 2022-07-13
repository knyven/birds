package bird;

public class Geese extends WaterBird{

    public Geese(String name) {
        this.name = name;
        this.birdType = BirdType.GEESE;
        this.aviaryTypes = AviaryTypes.WATERFOWL;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.SEEDS, Food.NUTS};
        this.nameOfWater = "freshwater ponds";
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }
}
