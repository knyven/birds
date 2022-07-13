package bird;
import java.util.Arrays;
// Class: Owl
// Creates a bird object Owl with the characteristics of an Owl.
// Name is initialized to the String name passed in to the constructor.
//
// Extends AbstractBird and shares its methods.
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
public class Owl extends AbstractBird {

    public Owl(String name) {
        this.name = name;
        this.birdType = BirdType.OWL;
        this.aviaryTypes = AviaryTypes.PREY;
        this.sharedChar = "sharp hooked beaks and visible nostrils";
        this.isExtinct = false;
        this.wingNum = 2;
        this.favFood = new Food[] {Food.SMALLMAMMALS, Food.OTHERBIRDS, Food.INSECTS};
    }

    @Override
    String getSharedChar() {
        return this.sharedChar;
    }

}