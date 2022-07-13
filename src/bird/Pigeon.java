package bird;

import java.util.ArrayList;
import java.util.Arrays;

public class Pigeon extends AbstractBird{

    public Pigeon(String name) {
        this.name = name;
        this.birdType = BirdType.PIGEON;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.sharedChar = "Feed young bird milk";
        this.favFood = new Food[] {Food.SEEDS, Food.INSECTS};
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "aviaryTypes=" + this.aviaryTypes +
                ", birdType=" + this.birdType +
                ", name='" + this.name + '\'' +
                ", sharedChar='" + this.sharedChar + '\'' +
                ", isExtinct=" + this.isExtinct +
                ", wingNum=" + this.wingNum +
                ", favFood=" + Arrays.toString(this.favFood) +
                '}';
    }
}
