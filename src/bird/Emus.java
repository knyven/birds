package bird;

public class Emus extends FlightlessBirds{
    AviaryGroups aviaryGroups;

    public Emus(){
        this.aviaryGroups = AviaryGroups.FLIGHTESS;
        this.type = "Emus";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[]{Food.INSECTS, Food.VEGETATION};
    }
}
