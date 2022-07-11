package bird;

import java.util.Arrays;

public class Eagle extends PreyBird {


    public Eagle(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.PREY;
        this.birdType = BirdType.EAGLE;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};
        this.salientChar = "I am an eagle";

    }

    @Override
    public String toString() {
        return "Eagle{" +
                "aviaryType=" + aviaryTypes +
                ", birdType=" + birdType +
                ", name='" + name + '\'' +
                ", type='" + birdType + '\'' +
                ", isExtinct=" + isExtinct +
                ", wingNum=" + wingNum +
                ", favFood=" + Arrays.toString(favFood) +
                '}';
    }


}
