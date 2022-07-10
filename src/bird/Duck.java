package bird;

public class Duck extends WaterBird{

    public Duck(String name) {
        this.name = name;
        this.birdType = BirdType.DUCK;
        this.aviaryTypes = AviaryTypes.WATERFOWL;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.SEEDS};
        this.nameOfWater = "freshwater ponds";
    }



}
