package bird;

import java.util.Arrays;

//Child class for Duck Bird that extends Water Bird type
public class Duck extends WaterBird{

    public Duck(String name) {
        this.name = name;
        //Specific waterfowl bird type
        this.birdType = BirdType.DUCK;
        //aviary group it belongs too
        this.aviaryTypes = AviaryTypes.WATERFOWL;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.SEEDS};
        this.nameOfWater = "freshwater ponds";
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "nameOfWater='" + this.nameOfWater + '\'' +
                ", sharedChar='" + this.sharedChar + '\'' +
                ", aviaryTypes=" + this.aviaryTypes +
                ", birdType=" + this.birdType +
                ", name='" + this.name + '\'' +
                ", isExtinct=" + this.isExtinct +
                ", wingNum=" + this.wingNum +
                ", favFood=" + Arrays.toString(this.favFood) +
                '}';
    }
}
