package bird;
import java.util.ArrayList;

public class Owl extends AbstractBird {
    private String[] owlChar;
    public Owl(String name) {
        this.name = name;
        this.birdType = BirdType.OWL;
        this.aviaryTypes = AviaryTypes.PREY;
        this.owlChar = new String[] {"Distinguished facial disks from other birds"};
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.OTHERBIRDS, Food.INSECTS};
    }

}