package bird;

import java.util.ArrayList;

public class Pigeon extends AbstractBird{
    public AviaryTypes aviaryType;
    public BirdType birdType;
    public String salientChar;

    public Pigeon(String name) {
        this.name = name;
        this.birdType = BirdType.PIGEON;
        this.aviaryType = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.salientChar = "Feed young bird milk";
        this.favFood = new Food[] {Food.SEEDS, Food.INSECTS};
    }


}
