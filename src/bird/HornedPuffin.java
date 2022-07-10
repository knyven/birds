package bird;

public class HornedPuffin extends WaterBird{
    public HornedPuffin(String name) {
        this.name = name;
        this.birdType = BirdType.PUFFIN;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.FISH, Food.SMALLMAMMALS};
        this.nameOfWater = "North Pacific coastal water";
    }
}
