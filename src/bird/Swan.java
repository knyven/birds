package bird;

public class Swan extends WaterBird {
    public Swan(String name) {
        this.name = name;
        this.birdType = BirdType.SWAN;
        this.aviaryTypes = AviaryTypes.WATERFOWL;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.FRUIT, Food.INSECTS};
        this.nameOfWater = "freshwater ponds";
    }

    @Override

}
