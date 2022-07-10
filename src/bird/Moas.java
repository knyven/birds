package bird;

public class Moas extends FlightlessBirds{
    AviaryGroups aviaryGroups;

    public Moas(String name){

        this.aviaryGroups = AviaryGroups.FLIGHTESS;
        this.type = "Moas";
        this.isExtinct = true;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.FRUIT, Food.SEEDS};
    }
}
