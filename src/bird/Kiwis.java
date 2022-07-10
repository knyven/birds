package bird;

public class Kiwis extends FlightlessBirds{
    AviaryGroups aviaryGroups;

    public Kiwis(){
        this.aviaryGroups = AviaryGroups.FLIGHTESS;
        this.type = "Kiwis";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.INSECTS};
    }
}
