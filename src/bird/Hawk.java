package bird;

import java.util.Arrays;

public class Hawk extends PreyBird{

    public AviaryTypes aviaryType;
    public BirdType birdType;


    public Hawk(String name){
        this.name = name;
        this.aviaryType = AviaryTypes.PREY;
        this.birdType = BirdType.HAWK;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};
    }

    @Override
    public String toString() {
        return "Hawk{" +
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
