package bird;
// Class: AfricanJacana
// Creates a bird object AfricanJacana with the characteristics of an African Jacana.
// Name is initialized to the String name passed in to the constructor.
//
// Extends WaterBird and has sharedChar with all WaterBirds
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
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



}
