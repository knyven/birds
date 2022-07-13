package bird;

//Child class for AfricanJacana Bird that extends Water Bird type

import java.util.Arrays;

public class AfricanJacana extends WaterBird{
    public AfricanJacana(String name) {
        //name of specific bird
        this.name = name;
        //type of bird
        this.birdType = BirdType.JACANA;
        //aviary group it belongs too
        this.aviaryTypes = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.VEGETATION, Food.FISH, Food.VEGETATION};
        //water where it is normally found
        this.nameOfWater = "Lakes in Sub-Saharan Africa";
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

    @Override
    public String toString() {
        return "AfricanJacana{" +
                "nameOfWater='" + nameOfWater + '\'' +
                ", sharedChar='" + sharedChar + '\'' +
                ", aviaryTypes=" + aviaryTypes +
                ", birdType=" + birdType +
                ", name='" + name + '\'' +
                ", sharedChar='" + sharedChar + '\'' +
                ", isExtinct=" + isExtinct +
                ", wingNum=" + wingNum +
                ", favFood=" + Arrays.toString(favFood) +
                '}';
    }
}
