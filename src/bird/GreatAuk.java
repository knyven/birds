package bird;

import java.util.Arrays;

public class GreatAuk extends WaterBird{
    public GreatAuk(String name) {
        this.name = name;
        this.birdType = BirdType.GREATAUK;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.FISH, Food.SMALLMAMMALS};
        this.nameOfWater = "North Atlantic coastal water";
    }
    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

    @Override
    public String toString() {
        return "GreatAuk{" +
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
