package bird;

public class Kiwis extends FlightlessBirds{

    public Kiwis(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.FLIGHTLESS;
        this.birdType = BirdType.KIWI;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.INSECTS, Food.LARVAE};
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }
}
