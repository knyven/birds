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
                "aviaryTypes=" + this.aviaryTypes +
                ", birdType=" + this.birdType +
                ", name='" + this.name + '\'' +
                ", sharedChar='" + this.sharedChar + '\'' +
                ", isExtinct=" + this.isExtinct +
                ", wingNum=" + this.wingNum +
                ", favFood=" + Arrays.toString(this.favFood) +
                '}';
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }
}
