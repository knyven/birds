package bird;

import java.util.Arrays;
//Child class for Eagle Bird that extends Prey Bird type
public class Eagle extends PreyBird {


    public Eagle(String name){
        this.name = name;
        this.aviaryTypes = AviaryTypes.PREY;
        this.birdType = BirdType.EAGLE;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.INSECTS};
    }

    @Override
    public String toString() {
        return "Eagle{" +
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
