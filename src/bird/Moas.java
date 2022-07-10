package bird;

public class Moas extends FlightlessBirds{
    //AviaryTypes aviaryGroups;

    //public BirdType birdType;

    public Moas(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.FLIGHTLESS;
        this.birdType = BirdType.MOA;
        this.isExtinct = true;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.FRUIT, Food.SEEDS};
    }
}
