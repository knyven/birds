package bird;

import java.util.Arrays;

public class Osprey extends PreyBird{
    public AviaryTypes aviaryType;
    public BirdType birdType;

    public Osprey(String name){
        this.name = name;
        this.aviaryType = AviaryTypes.PREY;
        this.birdType = BirdType.OSPREY;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};
    }

    @Override
    public String toString() {
        return "Osprey{" +
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
