package bird;

public class AfricanJacana extends WaterBird{
    public AfricanJacana(String name) {
        this.name = name;
        this.birdType = BirdType.JACANA;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.FISH, Food.VEGETATION};
        this.nameOfWater = "Lakes in Sub-Saharan Africa";
    }
}
