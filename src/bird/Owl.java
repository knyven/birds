package bird;
import java.util.Arrays;

public class Owl extends AbstractBird {

    public Owl(String name) {
        this.name = name;
        this.birdType = BirdType.OWL;
        this.aviaryTypes = AviaryTypes.PREY;
        this.sharedChar = "sharp hooked beaks and visible nostrils";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.OTHERBIRDS, Food.INSECTS};
    }
    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

    @Override
    public String toString() {
        return "Owl{" +
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