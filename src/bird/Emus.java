package bird;

public class Emus extends FlightlessBirds{

    public Emus(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.FLIGHTLESS;
        this.birdType = BirdType.EMU;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[]{Food.INSECTS, Food.VEGETATION};
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }


}
