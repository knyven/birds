package bird;

import java.util.Arrays;

public class Eagle extends PreyBird {
    public AviaryTypes aviaryType;
    public BirdType birdType;

    public Eagle(String name){
        this.name = name;
        this.aviaryType = AviaryTypes.PREY;
        this.birdType = BirdType.EAGLE;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};

    }

    @Override
    public String toString() {
        return "Eagle{" +
                "aviaryType=" + aviaryType +
                ", birdType=" + birdType +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isExtinct=" + isExtinct +
                ", wingNum=" + wingNum +
                ", favFood=" + Arrays.toString(favFood) +
                '}';
    }
}
