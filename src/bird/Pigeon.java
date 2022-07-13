package bird;

import java.util.ArrayList;

public class Pigeon extends AbstractBird{

    public String salientChar;

    public Pigeon(String name) {
        this.name = name;
        this.birdType = BirdType.PIGEON;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.salientChar = "Feed young bird milk";
        this.favFood = new Food[] {Food.SEEDS, Food.INSECTS};
    }

    public String getChar(){
        return "The specific traits are: " + salientChar;
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

}
