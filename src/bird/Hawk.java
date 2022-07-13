package bird;

import java.util.Arrays;

public class Hawk extends PreyBird{

    public Hawk(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.PREY;
        this.birdType = BirdType.HAWK;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};

    }


    @Override
    public String toString() {
        return "Hawk{" +
                "salientChar='" + salientChar + '\'' +
                ", aviaryTypes=" + aviaryTypes +
                ", birdType=" + birdType +
                ", name='" + name + '\'' +
                ", isExtinct=" + isExtinct +
                ", wingNum=" + wingNum +
                ", favFood=" + Arrays.toString(favFood) +
                '}';
    }


    @Override
    String getSharedChar() {
        return this.sharedChar;
    }
}
